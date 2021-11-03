package connection;

	
import  java.sql.Connection;		
import  java.sql.Statement;
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;		

public class  SQLConnector {				
    	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
				//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
                
    		      String dbUrl = "jdbc:mysql://localhost:3306/dbemployee";

				//Database Username		
				String username = "root";	
                
				//Database Password		
				String password = "sayan123";				

				//Query to Execute		
				//String query = "SELECT * FROM members;";
				String query = "SELECT * FROM employee;";
                
         	    //Load mysql jdbc driver		
           	    Class.forName("com.mysql.jdbc.Driver");			
           
           		//Create Connection to DB		
            	Connection con = DriverManager.getConnection(dbUrl,username,password);
          
          		//Create Statement Object		
        	   Statement stmt = con.createStatement();					
       
       			// Execute the SQL Query. Store results in ResultSet		
         		ResultSet rs= stmt.executeQuery(query);							
         
         		// While Loop to iterate through all data and print results		
				while (rs.next()){
			        		//String mem_number = rs.getString(1);
					          String id = rs.getString(1);  
                            //String fullName = rs.getString(2);
					          String Name = rs.getString(2);
					          String Designation = rs.getString(3);
					          String Role = rs.getString(4);
                            //String DOB = rs.getString(4);
                            //System. out.println(mem_number+"  "+fullName+"  "+ DOB);
					          System.out.println(id+"  "+Name+" "+Designation+" "+Role);
                    }		
      			 // closing DB Connection	
				
				
				
				
      			con.close();			
		}
}