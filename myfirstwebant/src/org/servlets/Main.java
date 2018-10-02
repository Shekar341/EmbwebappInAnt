package org.servlets;

import java.io.File;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;


public class Main {


    public static void main(String[] args) throws ServletException, LifecycleException {
        Tomcat tomcat = new Tomcat();
tomcat.setBaseDir("temp");
        tomcat.setPort(8080);
         
        String contextPath = "/Bookstore";     
        String warFilePath = "dist/myfirstwebant.war";
        File f = new File(warFilePath);    
        System.out.println(f.getAbsolutePath());
        tomcat.getHost().setAppBase(".");
         
        tomcat.addWebapp(contextPath, f.getAbsolutePath());
         
        tomcat.start();
        tomcat.getServer().await();
    }

}