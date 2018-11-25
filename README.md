This project is to get the refresh the BOBJ report for monitoring purposes from SAP BOBJ CMC Server. The Java Project uses SAP BOBJ REST API's and connects to CMC Server and pull the users and groups created in the BOBJ Server. We need to do some initial setup to run this Java project.

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

The users and groups are loaded into a SAP HANA database. Any database can be used to stored the data. We need to use the respective jdbc JAR files for the program to work.

The java program can be executed by running the shell script from the config files folder (BOBJReportRefresh.sh). Please modify the shell sript to add the path of the JAR files and BOBJReportRefreshDetails.properties properties file.

The SAP BOBJ CMC URL , username and  password needs to be provided in the BOBJReportRefreshDetails.properties folder. The authentication it uses is Enterprise.







