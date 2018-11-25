This project is to get the refresh the BOBJ report for monitoring purposes from SAP BOBJ CMC Server. The Java Project uses SAP BOBJ REST API's and connects to CMC Server and logs into the BOBJ server and refreshes the report.This project was created mainly to monitor the reprots every half an hour to make sure there are no errors or performance issues in the database or in the BOBJ server. The backend database for the reports uses SAP HANA. We need to do some initial setup to run this Java project.

Please read the following REST API documents to refresh the reports with prompts and without prompts

https://help.sap.com/viewer/58f583a7643e48cf944cf554eb961f5b/4.2/en-US/7da0fc626f701014aaab767bb0e91070.html

https://help.sap.com/viewer/58f583a7643e48cf944cf554eb961f5b/4.2/en-US/07a0889d23294a449050b2c11420376d.html

If we need to refresh the reprot with prompts, we need to provide the prompt values in a XML file which the java program takes as input. The sample XML files are available in the config_files folder. The condif_files folder stores the logon_request.xml & logon_response.xml files that gets generated from REST API. The path of the config folder needs to be updated in the BOBJReportRefreshDetails.properties properties file (resourcesFolderField=/path/to/BOBJRefreshDetails)

Follow the configurations as mentioned in the URL in Eclipse.

To Deploy the BI Semantic Layer Java SDK in a Non-OSGI Eclipse Configuration

https://help.sap.com/viewer/4359a0ef221e4a1098bae432bdd982c1/4.2.3/en-US/45f1ee226e041014910aba7db0e91070.html

Create the project folder by following the steps in the above mentioned URL

The main file to run is BOBJUsersAndGroupsMain.java under src\com\tutorialspot\demo\hr\model folder.

Please follow the below steps to export the project into executable JAR files. This is tested successfully in linux environment.
1. Right Click on the project folder in Eclipse -> Export
2. Java-> Runnable JAR File
3. Select the main class file BOBJUsersAndGroupsMain under Launch Configuration
4. Export Destination - Provide the path of the file and name to save this JAR file prefrebbly in the output_files_jars folder
5. Under Library Handling - Copy the required files into a sub-folder next to the generated JAR
6. Click Next and Finish.

All the complied JAVA files will be avaiable in the bin folder that gets generated.

The program connects to SAP HANA database which get the list of report Id's that needs to be refreshed for monitoring purposes.
create a table as below script in SAP HANA database.

create table bobj_rpt_monitoring
(
report_id string,
prompt_type string,
prompt_type_text
)

The report id can be obtained from CMC.The prompt type string should be either 1 or 2. 1 indicates No Prompt and 2 indicates One prompt.

Sample Output from the file
==============================
REPORT_ID;PROMPT_TYPE;PROMPT_TYPE_TEXT
4434085;1;No Prompt
7735086;1;No Prompt
4545033;1;No Prompt
4776843;2;One Prompt
4776978;1;No Prompt
6840881;1;No Prompt
6841078;1;No Prompt
4434207;1;No Prompt
4434092;2;One Prompt
4333160;1;No Prompt
4433930;2;One Prompt

The java program can be executed by running the shell script from the config files folder (BOBJReportRefresh.sh). Please modify the shell sript to add the path of the JAR files and BOBJReportRefreshDetails.properties properties file.

The SAP BOBJ CMC URL , username and  password needs to be provided in the BOBJReportRefreshDetails.properties folder. The authentication it uses is Enterprise.







