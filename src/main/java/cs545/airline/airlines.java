package cs545.airline;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class airlines {
   
   public airlines() {
      System.out.println("HelloWorld started!");
   }
	
   public String getMessage() {
      return "Hello World!";
   }
}