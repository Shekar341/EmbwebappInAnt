package code2;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class WarTomcat {
	public static void main(String[] args) throws ServletException, LifecycleException {
		 Tomcat tomcat = new Tomcat();
		 tomcat.setBaseDir("temp");
		         tomcat.setPort(8080);
		          
		         String contextPath = "/Bookstore";     
		         String warFilePath = "D:\\MyFirstWebApp.war";
		          
		         tomcat.getHost().setAppBase(".");
		          
		         tomcat.addWebapp(contextPath, warFilePath);
		          
		         tomcat.start();
		         tomcat.getServer().await();
	}

}
