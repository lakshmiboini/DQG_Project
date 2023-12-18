package com.utilspage;

public class Constants {
	private String propertyFilePath=System.getProperty("user.dir")+"/src/test/resources/config.properties";
	private String excellFilePath=System.getProperty("user.dir")+"/src/test/resources/AddCustomerInfo.xlsx";
	
	 public String getPropertyFilePath() {
		  return propertyFilePath;
	   }
	 public String getExcellFilePath() {
		 return excellFilePath;
	 }
}
