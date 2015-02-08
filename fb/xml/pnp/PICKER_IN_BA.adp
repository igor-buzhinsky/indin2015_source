<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE AdapterType SYSTEM "http://www.holobloc.com/xml/LibraryElement.dtd" >
<AdapterType Name="PICKER_IN_BA" Comment="Adapter Interface for Picker module" >
  <Identification Standard="61499-1" />
  <VersionInfo Organization="Rockwell Automation" Version="0.2" Author="JHC" Date="2003-12-05" Remarks="Changed name from NEWADAPTER" />
  <VersionInfo Organization="Rockwell Automation" Version="0.1" Author="JHC" Date="2002-01-08" Remarks="Added IND/RSP, renamed data, added sequences." />
  <VersionInfo Organization="Rockwell Automation" Version="0.0" Author="JHC" Date="2000-05-27" />
  <CompilerInfo header="package fb.rt.pnp;" >
  </CompilerInfo>
  <InterfaceList>
    <EventInputs>
      <Event Name="CNF" Comment="Confirmation from Plug" >
      </Event>
    </EventInputs>
    <EventOutputs>
      <Event Name="REQ" Comment="Request from Socket" >
        <With Var="add1" />
        <With Var="add2" />
        <With Var="add3" />
        <With Var="add4" />
      </Event>
    </EventOutputs>
    <OutputVars>
      <VarDeclaration Name="add1" Type="BOOL" />
      <VarDeclaration Name="add2" Type="BOOL" />
      <VarDeclaration Name="add3" Type="BOOL" />
      <VarDeclaration Name="add4" Type="BOOL" />
    </OutputVars>
  </InterfaceList>
  <Service RightInterface="PLUG" LeftInterface="SOCKET" >
    <ServiceSequence Name="request_confirm" >
      <ServiceTransaction >
        <InputPrimitive Interface="SOCKET" Event="REQ" Parameters="REQD" />
        <OutputPrimitive Interface="PLUG" Event="REQ" Parameters="REQD" />
      </ServiceTransaction>
      <ServiceTransaction >
        <InputPrimitive Interface="PLUG" Event="CNF" Parameters="CNFD" />
        <OutputPrimitive Interface="SOCKET" Event="CNF" Parameters="CNFD" />
      </ServiceTransaction>
    </ServiceSequence>
    <ServiceSequence Name="indication_response" >
      <ServiceTransaction >
        <InputPrimitive Interface="PLUG" Event="IND" Parameters="INDD" />
        <OutputPrimitive Interface="SOCKET" Event="IND" Parameters="INDD" />
      </ServiceTransaction>
      <ServiceTransaction >
        <InputPrimitive Interface="SOCKET" Event="RSP" Parameters="RSPD" />
        <OutputPrimitive Interface="PLUG" Event="RSP" Parameters="RSPD" />
      </ServiceTransaction>
    </ServiceSequence>
  </Service>
</AdapterType>
