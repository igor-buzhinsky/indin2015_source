<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE AdapterType SYSTEM "http://www.holobloc.com/xml/LibraryElement.dtd" >
<AdapterType Name="PICKER_SI" Comment="Adapter Interface for Picker module" >
  <Identification Standard="61499-1" />
  <VersionInfo Organization="Rockwell Automation" Version="0.2" Author="JHC" Date="2003-12-05" Remarks="Changed name from NEWADAPTER" />
  <VersionInfo Organization="Rockwell Automation" Version="0.1" Author="JHC" Date="2002-01-08" Remarks="Added IND/RSP, renamed data, added sequences." />
  <VersionInfo Organization="Rockwell Automation" Version="0.0" Author="JHC" Date="2000-05-27" />
  <CompilerInfo header="package fb.rt.pnp;" >
  </CompilerInfo>
  <InterfaceList>
    <EventInputs>
      <Event Name="CNF" Comment="Confirmation from Plug" >
        <With Var="S11" />
        <With Var="S12" />
        <With Var="S13" />
        <With Var="S14" />
        <With Var="vchome" />
        <With Var="vcend" />
        <With Var="wp12" />
        <With Var="wp13" />
        <With Var="wp14" />
        <With Var="wp11" />
        <With Var="wp_sucked_in" />
      </Event>
    </EventInputs>
    <EventOutputs>
      <Event Name="REQ" Comment="Request from Socket" >
        <With Var="add1" />
        <With Var="add2" />
        <With Var="add3" />
      </Event>
    </EventOutputs>
    <InputVars>
      <VarDeclaration Name="S11" Type="BOOL" />
      <VarDeclaration Name="S12" Type="BOOL" />
      <VarDeclaration Name="S13" Type="BOOL" />
      <VarDeclaration Name="S14" Type="BOOL" />
      <VarDeclaration Name="vchome" Type="BOOL" />
      <VarDeclaration Name="vcend" Type="BOOL" />
      <VarDeclaration Name="wp12" Type="BOOL" />
      <VarDeclaration Name="wp13" Type="BOOL" />
      <VarDeclaration Name="wp14" Type="BOOL" />
      <VarDeclaration Name="wp11" Type="BOOL" />
      <VarDeclaration Name="wp_sucked_in" Type="BOOL" />
    </InputVars>
    <OutputVars>
      <VarDeclaration Name="add1" Type="BOOL" />
      <VarDeclaration Name="add2" Type="BOOL" />
      <VarDeclaration Name="add3" Type="BOOL" />
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
