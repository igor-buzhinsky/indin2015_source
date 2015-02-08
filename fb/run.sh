#!/bin/bash
# Run EvoSuite on a single function block Java code

package_name=$1
class_name=$2
time_budget=$3
transition_coverage=$4 # true or false

mkdir -p "evosuite-tests/$package_name"

rm -rf target && mkdir target
cd lib
for name in *.jar; do
    cp "$name" ../target
    cd ../target
    unzip -u "$name" > /dev/null
    rm -rf META-INF
    rm "$name"
    cd ../lib
done
cd ..
cp -a ../fb_tools/bin/* bin/* target
rm -f target/JEditor.class

classpath=target
jv=/usr/lib/jvm/jdk1.8.0_25/bin/java

filename="$package_name/$class_name.java"
classname="${filename/.java/}"
classname="${classname//\//.}"
echo "*** $classname"

# simple or transition coverage?
if [[ $transition_coverage == true ]]; then
    coverage_suffix="-D target_method_prefix=transition_"
    filename_suffix=_Tr_ESTest
else 
    coverage_suffix=""
    filename_suffix=_ESTest
fi

"$jv" -jar evosuite*.jar -class "$classname" -projectCP "$classpath" -D assertions=false -D search_budget=$time_budget -D coverage_matrix=true $coverage_suffix

suite_destination="src/$package_name/$class_name$filename_suffix.java"
cp "evosuite-tests/$package_name/${class_name}_ESTest.java" tmp.java
sed -e "s/^@RunWith.*$//; s/ ${class_name}_ESTest extends .* {/ $class_name$filename_suffix {/;" < tmp.java > "$suite_destination"
rm -f tmp.java
