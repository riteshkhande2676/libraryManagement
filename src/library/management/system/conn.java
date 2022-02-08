package library.management.system;


import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
       Class.forName("com.mysql.cj.jdbc.Driver");  
      //      Class.forName("C:\\Program Files\\mysql-connector-java-8.0.28.jar"); 
            
            c =DriverManager.getConnection("jdbc:mysql:///Library_Management","root","");    
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
