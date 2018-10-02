package org.ceptes.server;

import java.io.File;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class MyTomcatWar {
	 public static void main(String[] args) throws ServletException, LifecycleException {
	        Tomcat tomcat = new Tomcat();
	tomcat.setBaseDir("temp");
	        tomcat.setPort(8080);
	         
	        String contextPath = "/myapp";     
	        String warFilePath = "D:\\MyFirstWebApp.war";
	         
	        tomcat.getHost().setAppBase(".");
	         
	        tomcat.addWebapp(contextPath, warFilePath);
	         
	        tomcat.start();
	        tomcat.getServer().await();
	    }

}
