<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE AdapterType SYSTEM "http://www.holobloc.com/xml/LibraryElement.dtd" >
<AdapterType Name="PICKER_STATE" Comment="Adapter Interface for Model -> View" >
  <Identification Standard="61499-1" />
  <VersionInfo Organization="Rockwell Automation" Version="0.2" Author="JHC" Date="2003-12-05" Remarks="Changed name from NEWADAPTER" />
  <VersionInfo Organization="Rockwell Automation" Version="0.1" Author="JHC" Date="2002-01-08" Remarks="Added IND/RSP, renamed data, added sequences." />
  <VersionInfo Organization="Rockwell Automation" Version="0.0" Author="JHC" Date="2000-05-27" />
  <CompilerInfo header="package fb.rt.pnp;" >
  </CompilerInfo>
  <InterfaceList>
    <EventInputs>
      <Event Name="INIT" >
        <With Var="BASE_X" />
        <With Var="BASE_Y" />
        <With Var="CYL1_Y" />
        <With Var="CYL2_Y" />
        <With Var="CYL1_X" />
        <With Var="CYL2_X" />
        <With Var="VCYL_X" />
        <With Var="VCYL_Y" />
        <With Var="WP1_X" />
        <With Var="WP1_Y" />
        <With Var="VACUUM_ON" />
        <With Var="WP2_X" />
        <With Var="WP2_Y" />
        <With Var="WP3_X" />
        <With Var="WP3_Y" />
      </Event>
      <Event Name="CHG" Comment="Change of state" >
        <With Var="CYL1_X" />
        <With Var="CYL2_X" />
        <With Var="VCYL_X" />
        <With Var="VCYL_Y" />
        <With Var="WP1_X" />
        <With Var="WP1_Y" />
        <With Var="VACUUM_ON" />
        <With Var="WP2_X" />
        <With Var="WP2_Y" />
        <With Var="WP3_X" />
        <With Var="WP3_Y" />
      </Event>
    </EventInputs>
    <InputVars>
      <VarDeclaration Name="BASE_X" Type="UINT" Comment="Request Data from Socket" />
      <VarDeclaration Name="BASE_Y" Type="UINT" Comment="Request Data from Socket" />
      <VarDeclaration Name="CYL1_X" Type="UINT" Comment="Request Data from Socket" />
      <VarDeclaration Name="CYL1_Y" Type="UINT" Comment="Request Data from Socket" />
      <VarDeclaration Name="CYL2_X" Type="UINT" Comment="Response Data from Socket" />
      <VarDeclaration Name="CYL2_Y" Type="UINT" Comment="Request Data from Socket" />
      <VarDeclaration Name="VCYL_X" Type="UINT" Comment="Response Data from Socket" />
      <VarDeclaration Name="VCYL_Y" Type="UINT" Comment="Response Data from Socket" />
      <VarDeclaration Name="WP1_X" Type="UINT" Comment="Response Data from Socket" />
      <VarDeclaration Name="WP1_Y" Type="UINT" Comment="Response Data from Socket" />
      <VarDeclaration Name="WP2_X" Type="UINT" />
      <VarDeclaration Name="WP2_Y" Type="UINT" />
      <VarDeclaration Name="WP3_X" Type="UINT" />
      <VarDeclaration Name="WP3_Y" Type="UINT" />
      <VarDeclaration Name="VACUUM_ON" Type="BOOL" Comment="Response Data from Socket" />
    </InputVars>
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
