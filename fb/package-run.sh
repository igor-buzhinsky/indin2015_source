#!/bin/bash
# Run EvoSuite on multiple function block Java sources in several packages

package_names=$1 # space-separated
transition_coverage=$2 # true or false
budget_basic=$3 # seconds
budget_composite=$4 # seconds
rm -f evosuite-report/statistics.csv

for package_name in $package_names; do
    for filename in src/$package_name/*.java; do
        if [[ $filename != *ESTest.java ]]; then
            cat "$filename" | grep "// FIXME [A-Z]\\+ IMPLEMENTATION IS MISSING" > /dev/null
            if [[ $? != 1 ]]; then
                continue
                # requires non-implemented services or adapters
            fi
            name=${filename#src/$package_name/}
            name=${name%.java}
            if [[ $name == *__Basic ]]; then
                budget=$budget_basic
            else
                budget=$budget_composite
            fi
            if [[ $budget == 0 ]]; then
                continue
            fi
            ./run.sh "$package_name" "$name" "$budget" "$transition_coverage"
        fi
    done
done

stat_filename=statistics-`date +%s`.csv
cp evosuite-report/statistics.csv "$stat_filename"
echo "*** Statistics ***"
cat "$stat_filename"
