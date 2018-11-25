package com.tutorialspot.demo.hr.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.TimeZone;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import com.businessobjects.rebean.wi.DataProviders;
import com.businessobjects.rebean.wi.DocumentInstance;
import com.businessobjects.rebean.wi.ReportEngine;
import com.businessobjects.rebean.wi.ReportEngines;
import com.businessobjects.rebean.wi.ReportEngines.ReportEngineType;
//import com.crystaldecisions.enterprise.ocaframework.IProperty;
//import com.businessobjects.mds.universe.business.Attribute;
//import com.businessobjects.connectionserver.Measure;
import com.crystaldecisions.sdk.exception.SDKException;
import com.crystaldecisions.sdk.framework.CrystalEnterprise;
import com.crystaldecisions.sdk.framework.IEnterpriseSession;
import com.crystaldecisions.sdk.occa.infostore.IInfoObject;
import com.crystaldecisions.sdk.occa.infostore.IInfoObjects;
import com.crystaldecisions.sdk.occa.infostore.IInfoStore;
import com.crystaldecisions.sdk.plugin.desktop.folder.IFolder;
import com.crystaldecisions.sdk.properties.IProperties;
import com.crystaldecisions.sdk.properties.IProperty;
import com.sap.sl.sdk.authoring.businesslayer.Attribute;
import com.sap.sl.sdk.authoring.businesslayer.BlItem;
import com.sap.sl.sdk.authoring.businesslayer.BusinessLayer;
import com.sap.sl.sdk.authoring.businesslayer.BusinessLayerService;
import com.sap.sl.sdk.authoring.businesslayer.Dimension;
import com.sap.sl.sdk.authoring.businesslayer.Filter;
import com.sap.sl.sdk.authoring.businesslayer.Folder;
import com.sap.sl.sdk.authoring.businesslayer.Measure;
import com.sap.sl.sdk.authoring.businesslayer.NativeRelationalFilter;
import com.sap.sl.sdk.authoring.businesslayer.RelationalBinding;
import com.sap.sl.sdk.authoring.businesslayer.RelationalBusinessLayer;
import com.sap.sl.sdk.authoring.businesslayer.RootFolder;
import com.sap.sl.sdk.authoring.cms.CmsResourceService;
import com.sap.sl.sdk.authoring.commons.SlResource;
import com.sap.sl.sdk.authoring.connection.DatabaseConnection;
import com.sap.sl.sdk.authoring.connection.RelationalConnection;
import com.sap.sl.sdk.authoring.datafoundation.MonoSourceDataFoundation;
import com.sap.sl.sdk.authoring.datafoundation.Table;
import com.sap.sl.sdk.authoring.local.LocalResourceService;
import com.sap.sl.sdk.authoring.samples.util.AuthenticationMode;
import com.sap.sl.sdk.authoring.samples.util.SamplesUtilities;
import com.sap.sl.sdk.framework.SlContext;
import com.sap.sl.sdk.framework.cms.CmsSessionService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.sql.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
















//import com.crystaldecisions.enterprise.ocaframework.IProperty;
//import com.businessobjects.mds.universe.business.Attribute;
//import com.businessobjects.connectionserver.Measure;
import com.crystaldecisions.sdk.exception.SDKException;
import com.crystaldecisions.sdk.framework.CrystalEnterprise;
import com.crystaldecisions.sdk.framework.IEnterpriseSession;
import com.crystaldecisions.sdk.occa.infostore.IInfoObject;
import com.crystaldecisions.sdk.occa.infostore.IInfoObjects;
import com.crystaldecisions.sdk.occa.infostore.IInfoStore;
import com.crystaldecisions.sdk.properties.IProperties;
import com.crystaldecisions.sdk.properties.IProperty;
import com.sap.sl.sdk.authoring.samples.util.AuthenticationMode;
import com.sap.sl.sdk.framework.SlContext;
import com.sap.sl.sdk.framework.cms.CmsSessionService;

public class BOBJReportRefreshDetails extends Thread {
	private final String USER_AGENT = "Mozilla/5.0";

	/** User name used to log in to the CMS */
	//private static final String CMS_LOG_USER = "powermeadm";

	/** User Password */
   // private static final String CMS_LOG_PASS = "Adm!n123";

	/** Authentication mode used to log in to the CMS. Here: Enterprise */
    private static final String CMS_AUTH_MODE = AuthenticationMode.ENTERPRISE;
    
    /** Full path of the connection in the CMS repository */
    //private static final String CNX_PATH = CmsResourceService.CONNECTIONS_ROOT + "/BO to Greenplum (JDBC)";
    
    /** Full path of the connection in the CMS repository */
    //private static final String UNX_PATH = CmsResourceService.UNIVERSES_ROOT + "/Backup/ByWeek";
    
    /** Universe name */
    private static final String UNX_NAME = "Campaign Influence.unx";
    
    static String dbName = "BINRTUT2";
    
    
    static Connection connection = null;
    
    List<Object> listFolder = new ArrayList<Object>();
    List<Object> listDimension = new ArrayList<Object>();
    List<Object> listAttribute = new ArrayList<Object>();
    List<Object> listMeasure = new ArrayList<Object>();
    List<Object> listFilter = new ArrayList<Object>();
	
	/** Local folder used to save all resources locally */
    //private static final String LOCAL_FOLDER = System.getProperty("java.io.tmpdir");
    private static final String LOCAL_FOLDER = "D://Soukath Folder//BO Shared Folder//SL SDK Project Test";
    
    String Universe_Name = UNX_NAME;
	/** New user name to set in the connection */
 

	/** New password to set in the connection */
 

    private static SlContext context;
    
    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    static Date date = new Date();
    static String current_Date_parameter = sdf.format(date);
    static Properties prop=null;
    //private IEnterpriseSession enterpriseSession;
    static String trace_properties_dp;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("Sample Hello World");
		// TODO Auto-generated method stub
				 //System.out.println("LOCAL_FOLDER : " + LOCAL_FOLDER);
					// Connects to the CMS and creates a session
			    	//System.out.println("@ Before Execution");
		ArrayList<String> al_list =new ArrayList<String>(); 
					prop = new Properties();
					prop.load(new FileInputStream(args[0]));
			        context = SlContext.create();
			        Date date1 = new Date();
			        DateFormat pstFormat = new SimpleDateFormat();
			        DateFormat gmtFormat = new SimpleDateFormat();
			        TimeZone gmtTime = TimeZone.getTimeZone("GMT");
			        TimeZone pstTime = TimeZone.getTimeZone("PST");
			        pstFormat.setTimeZone(gmtTime);
			        gmtFormat.setTimeZone(pstTime);
			        System.out.println("GMT Time: " + pstFormat.format(date1));
			        System.out.println("PST Time: " + gmtFormat.format(date1));
			        
			        System.out.println("the Current DateTime is " + current_Date_parameter);
			        //System.out.println("@ Before Execution - Context Creation");
			        
			       // String to = "mohammedsoukat@vmware.com,nsing@vmware.com,jacobd@vmware.com";
			        
			        String to = prop.getProperty("to_list");
			        
			        String to_alert_high = prop.getProperty("to_list_high");

			        // Sender's email ID needs to be mentioned
			        String from = "XXXXXXX";

			        // Assuming you are sending email from localhost
			        String host = "XXXXXXXX";

			        // Get system properties
			        Properties properties = System.getProperties();

			        // Setup mail server
			        properties.setProperty("mail.smtp.host", host);

			        // Get the default Session object.
			        Session session = Session.getDefaultInstance(properties);
			    	
			    
			     Connection connection = null;
			     String final_text_message="  ";
			     
			     Statement stmt = null;
			     String SQL_INSERT_BOBJ_USERS = "INSERT INTO VCORE.BOBJ_USERS" + " VALUES(?, ?, ?,?,?,?)";
			     String SQL_INSERT_BOBJ_ROLES = "INSERT INTO VCORE.BOBJ_ROLES" + " VALUES(?, ?, ?,?,?)";
			     String SQL_INSERT_BOBJ_USER_ROLES = "INSERT INTO VCORE.BOBJ_USER_ROLES" + " VALUES(?, ?,?,?)";
			     String SQL_DELETE_BOBJ_USERS = "DELETE FROM VCORE.BOBJ_USERS";
			     String SQL_DELETE_BOBJ_ROLES = "DELETE FROM VCORE.BOBJ_ROLES";
			     String SQL_DELETE_BOBJ_USER_ROLES = "DELETE FROM VCORE.BOBJ_USER_ROLES";
			     
			     String SQL_INSERT_WEBI_REPORTS = "INSERT INTO VCORE.BOBJ_RPT_DETAILS" + " VALUES(?, ?, ?,?,?,?,?,?,?)";
			     
			     String SQL_DELETE_WEBI_REPORTS = "DELETE FROM VCORE.BOBJ_RPT_DETAILS";
			     
			     String SQL_SELECT_BOBJ_RPT_MONITOR = "SELECT a.REPORT_ID,PROMPT_TYPE,b.full_report_path as report_name from VCORE.bobj_rpt_monitoring a, vcore.bobj_rpt_details  b where a.report_id = b.report_id";
			     
			     //String CMServerURL = prop.getProperty("CMServerURL");
			     String userName =prop.getProperty("userName");
			     
			     String password =prop.getProperty("password");
			     String HANA_DB = prop.getProperty("HANA_DB");	     
			     String BOBJ_URL = prop.getProperty("BOBJ_URL");	
			     String MONITOR_QTR_END = prop.getProperty("MONITOR_QTR_END");
			     String HANA_DB_URL = prop.getProperty("HANA_DB_URL");
			     String BOBJ_ENV = prop.getProperty("BOBJ_ENV");
			     String oracle_dbName = prop.getProperty("oracle_dbName");
			     String oracle_userName= prop.getProperty("oracle_userName");
				 String	oracle_password=prop.getProperty("oracle_password");
			     try {
			    	 
			    	 connection = DriverManager.getConnection(
			    			 HANA_DB,userName,password);
		 		         System.out.println("SAP HANA DB Connected Successfully");
						//System.out.println("Connected :" + connection.getSchema() );

					} catch (SQLException e) {

						e.printStackTrace();
					}
			  
			  if (connection != null) {
						System.out.println("nSuccessfullly connected to HANA DB");
						stmt = connection.createStatement();
						
					} else {
						System.out.println("nFailed to connect to HANA DB");
						 MimeMessage message1 = new MimeMessage(session);

				            // Set From: header field of the header.
				            message1.setFrom(new InternetAddress(from));

				            // Set To: header field of the header.
				            //message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
				            
				            message1.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to_alert_high));
				            
				            //message.AddHeaderField("X-Priority","1");
				            
				            message1.setHeader("X-Priority", "1");

				            // Set Subject: header field
				            message1.setSubject("Alert : HANA Production System is down " + HANA_DB_URL );

				            // Send the actual HTML message, as big as you like
				            message1.setContent("<h3>" + "Failed to connect to HANA DB. Please check the same. HANA DB - " + HANA_DB_URL  + "</h3>", "text/html");

				            // Send message
				            Transport.send(message1);
					}
			  	
			  	String bipURL = prop.getProperty("bipURL"); 
			  	//System.out.println(bipURL);
			   
				String CMServerURL = prop.getProperty("CMServerURL");
			    String documentId = "190149";
			    String CMSUser = prop.getProperty("CMSUser");
			    String CMSPassword = prop.getProperty("CMSPassword");
			    String CMS_LOG_HOST = prop.getProperty("CMS_LOG_HOST");
			    String CMSAuthType =CMS_AUTH_MODE;// "secEnterprise";
			    
			    //System.exit(0);
			   // IEnterpriseSession enterpriseSession = CrystalEnterprise.getSessionMgr().logon(CMS_LOG_USER, CMS_LOG_PASS, CMServerURL, CMS_AUTH_MODE);
			    String Report_Type_Public = "Public";
			    String Report_Type_My_Favourites = "My Favourites";
			    String Report_Type_Inbox = "Inbox";
			    String timeout_threshold1 = prop.getProperty("timeout_threshold");
			    String timeout_threshold_upper_limit1 = prop.getProperty("timeout_threshold_upper_limit");
			   long   timeout_threshold_upper_limit = Long.parseLong(timeout_threshold_upper_limit1);
			   final long timeout_threshold = Long.parseLong(timeout_threshold1);
			    //long timeout_threshold =  Long.parseLong(timeout_threshold1);
			    
			    try {
			         //timeout_threshold = Long.parseLong(timeout_threshold1);
			         System.out.println("long l = " + timeout_threshold);
			      } catch (NumberFormatException nfe) {
			         System.out.println("NumberFormatException: " + nfe.getMessage());
			         //timeout_threshold =Long.parseLong("120");
			      }
			    
			    
			    
			    ResultSet resultset_bobj = stmt.executeQuery(SQL_SELECT_BOBJ_RPT_MONITOR);
			    
			   // System.out.println(CMServerURL);
			    //System.out.println(CMSUser);
			    //System.out.println(CMSPassword);
			    //System.out.println(CMSAuthType);
				Authentication authentication = new Authentication();
				WorkWithPropertiesFlows workWithPropertiesFlows = new WorkWithPropertiesFlows();
				authentication.setCMSServerURL(CMServerURL);
				authentication.setCMSUser(CMSUser);
				authentication.setCMSPassword(CMSPassword);
				authentication.setCMSAuthType(CMSAuthType);
				String trace;
				//String resourcesFolderField = "D:\\Soukath Folder\\SDK Jars";
				String resourcesFolderField = prop.getProperty("resourcesFolderField");
				//System.out.println(resourcesFolderField);
				trace = authentication.logonCreateXMLs(resourcesFolderField);
				workWithPropertiesFlows.setAuthentication(authentication);
			    String lovInfo ="false";
			    //String bodyType ="1 -";
			  long finalelapsedTime=0;
			    while (resultset_bobj.next())
			    {
			    //String bodyType = prop.getProperty("bodyType");
			    	String bodyType = resultset_bobj.getString("PROMPT_TYPE");
			    
			   // String webi_report_id ="4326027";
			    //String webi_report_id = prop.getProperty("webi_report_id");
			    String webi_report_id = resultset_bobj.getString("REPORT_ID");
			    String report_name = resultset_bobj.getString("REPORT_NAME");
			   //Uncomment this Section to get the entire dataprovider details
			   // Thread thread1 = new Thread();
			    
			    //thread1.wait();
			    
			  //  String getparametersrefresh_properties = workWithPropertiesFlows.getRefreshParameters(webi_report_id,lovInfo, resourcesFolderField);
			    
			    final ExecutorService service = Executors.newSingleThreadExecutor();
			    try {
		            final Future<Object> f = service.submit(() -> {
		                // Do you long running calculation here
		            	 long startTime = System.currentTimeMillis();
		            	 long startTimeseconds = startTime /1000;
		            	trace_properties_dp = workWithPropertiesFlows.refreshDocument(webi_report_id,lovInfo,bodyType, resourcesFolderField,report_name);
		            	long stopTime = System.currentTimeMillis();
		            	 long stopTimeseconds = stopTime /1000;
		            	 long elapsedTime = stopTimeseconds - startTimeseconds;
		            	 if (elapsedTime >= timeout_threshold && elapsedTime <= timeout_threshold_upper_limit)
		 		            trace_properties_dp = "<font size=\"3\" color=\"red\">" + "The Report with Id : " + webi_report_id + " and Report Name : " +   report_name + "  took more than the threshold time to execute. The Execution time is " + elapsedTime  + " Seconds" + "</font>";
		            	 else 
		            	 {
		            		 if (trace_properties_dp.contains("Error Message"))
		            				 {
		            	 trace_properties_dp = trace_properties_dp;
		            				 }
		            		 else
		            			 trace_properties_dp = trace_properties_dp + ". The Execution time is " + elapsedTime + " Seconds";
		            	 }
		            	 //finalelapsedTime = elapsedTime;
		               // Thread.sleep(10000); // Simulate some delay
		                return elapsedTime;
		            });
		            finalelapsedTime = (long) f.get(timeout_threshold_upper_limit, TimeUnit.SECONDS);
		            System.out.println("The Elapsed Time for the report to Execute is: " + finalelapsedTime);
		        } catch (final TimeoutException e) {
		            System.err.println("Calculation took to long");
		           trace_properties_dp = "<font size=\"3\" color=\"red\">" + "The Report with Id : " + webi_report_id + " and Report Name : " +   report_name + "  took more than the threshold time to execute." + "</font>";
		        } catch (final Exception e) {
		            throw new RuntimeException(e);
		        } finally {
		            service.shutdown();
		        }
			    
			    System.out.println("trace_properties_dp  :" +  trace_properties_dp);
			    al_list.add(trace_properties_dp);
			    
			   //String trace_properties_dp = workWithPropertiesFlows.refreshDocument(webi_report_id,lovInfo,bodyType, resourcesFolderField);
			  // String trace_properties_rpt_sh_elmt = workWithPropertiesFlows.getDocumentSharedElements(webi_report_id, resourcesFolderField,statement_webi_rpt_sh_elmt,connection,current_Date_parameter,CMServerURL);
			   //System.out.println("getparametersrefresh_properties:" + getparametersrefresh_properties.toString());
			   //System.out.println("trace_properties_dp:" + trace_properties_dp.toString());
			    }
			    connection.commit();
			    	//System.out.println("@ After Execution");
					// Closes the CMS session
			        context.close();
			        //System.out.println("@ After Execution -  Context Close and Program Ended Successfully");
			        //enterpriseSession.logoff();
			        
			        final_text_message = "Hi All," + "<br>" + "<br>"+ " Please find the status of the below reports in BOBJ." + "<br>"  + "<br>"+ "BOBJ URL : " + BOBJ_URL + "<br>" + "<br>";
			        
			        for(String s:al_list){  
			        	 System.out.println(s); 
			        	final_text_message = final_text_message + s + "<br>" +"<br>" ;
			        	}    
			        
			        System.out.println("Monitor Quarter End : " + MONITOR_QTR_END);
			        
			        if (MONITOR_QTR_END.equalsIgnoreCase("YES"))
			        	{
			        	System.out.println("Monitor Quarter End : " + MONITOR_QTR_END);
			        	try {
			        	
			        	
			        	if (final_text_message.contains("Error Message") || final_text_message.contains("took more than the threshold time to execute") )
			        	{
			        	
			            // Create a default MimeMessage object.
			            MimeMessage message = new MimeMessage(session);

			            // Set From: header field of the header.
			            message.setFrom(new InternetAddress(from));

			            // Set To: header field of the header.
			            //message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			            
			            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to_alert_high));
			            
			            //message.AddHeaderField("X-Priority","1");
			            
			            message.setHeader("X-Priority", "1");

			            // Set Subject: header field
			            message.setSubject("Alert :" + BOBJ_ENV +  " - BOBJ Report Monitoring Details Update -   " +  BOBJ_URL);

			            // Send the actual HTML message, as big as you like
			            message.setContent("<h3>" + final_text_message + "</h3>", "text/html");

			            // Send message
			            Transport.send(message);
			         //   System.out.println("Sent message successfully....");
			        	}
			        	else
			        	{
			        		 MimeMessage message = new MimeMessage(session);

					            // Set From: header field of the header.
					            message.setFrom(new InternetAddress(from));

					            // Set To: header field of the header.
					            //message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
					            
					            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
					            
					            //message.AddHeaderField("X-Priority","1");
					            
					           // message.setHeader("X-Priority", "1");

					            // Set Subject: header field
					            message.setSubject(BOBJ_ENV + " - BOBJ Report Monitoring Details Update -  " +  BOBJ_URL);

					            // Send the actual HTML message, as big as you like
					            message.setContent("<h3>" + final_text_message + "</h3>", "text/html");

					            // Send message
					            Transport.send(message);
					         //   System.out.println("Sent message successfully....");
			        	}
			        	
			         }catch (Exception mex) {
			            mex.printStackTrace();
			         }
			        	}
			        else
			        {
			        	try {
				        	
				        	
				        	if (final_text_message.contains("Error Message") || final_text_message.contains("took more than the threshold time to execute") )
				        	{
				        	
				            // Create a default MimeMessage object.
				            MimeMessage message = new MimeMessage(session);

				            // Set From: header field of the header.
				            message.setFrom(new InternetAddress(from));

				            // Set To: header field of the header.
				            //message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
				            
				            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to_alert_high));
				            
				            //message.AddHeaderField("X-Priority","1");
				            
				            message.setHeader("X-Priority", "1");

				            // Set Subject: header field
				            message.setSubject("Alert :" + BOBJ_ENV +  " - BOBJ Report Monitoring Details Update -   " +  BOBJ_URL);

				            // Send the actual HTML message, as big as you like
				            message.setContent("<h3>" + final_text_message + "</h3>", "text/html");

				            // Send message
				            Transport.send(message);
				         //   System.out.println("Sent message successfully....");
				        	}
				        	
				        	
				         }catch (Exception mex) {
				            mex.printStackTrace();
				         }
			        }
			        
			        String auth_log_off = authentication.logoff();
			        
			        System.out.println("Authentication Log Off: " + auth_log_off);
			        
	
	}
	
	

}

