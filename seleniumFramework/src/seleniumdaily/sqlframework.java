package seleniumdaily;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlframework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     String dburl ="jdbc:mysql://localhost:3036/emp";
     
     String username ="root" ;
     String password ="password";
     String query ="select * from employee";
     class.forname("com.mysql.jdbc.Driver");
     connection conn =drivermanager.getConnection(dbURL, username, password);
     Statement stmt =conn.createStraement();
     ResultSet rs =stmt. executeQuery(query);
     while(rs.next())
     {
    	 
    	 String myname=rs.getString(1);
    	 String Age =rs.getString(2);
    	 
    	 System.out.println(myname + "" +myage);
     }

	}

}
