package db_project;

import java.sql.*;

public class DBSignUp {

	private String password;
	private String cnic;
	
	// no argument constructor
	public DBSignUp(){
		this.password = null;
		this.cnic = null;
	}
	
	// constructor with arguments
	public DBSignUp(String password, String cnic) {
		this.password = password;
		this.cnic = cnic;
	}
	
	// email = null
	public boolean checkPasswordAdmin() {
        String passwordcheck = null;
		boolean validated = false;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
            //Creating Connection Object
            Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
            //Prepared Statement
            Statement smt = connection.createStatement();
            ResultSet result = smt.executeQuery("SELECT ADMIN.password FROM ADMIN WHERE ADMIN.cnic = '" + cnic + "' ");
            while (result.next()) {
            	passwordcheck = result.getString(1);
            	System.out.println(passwordcheck);
            }
            if (this.password.contains(passwordcheck)) {
            	validated = true;
            }
            
            
           
        } catch (Exception e1) {
            e1.printStackTrace();
        }
		return validated;
	}
	
	// username = null
	public boolean checkPasswordDriver() {
        String passwordcheck = null;
		boolean validated = false;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
            //Creating Connection Object
            Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
            //Prepared Statement
            Statement smt = connection.createStatement();
            ResultSet result = smt.executeQuery("SELECT DRIVER.cd_password FROM DRIVER WHERE DRIVER.cd_cnic = '" + cnic + "' ");
            while (result.next()) {
            	passwordcheck = result.getString(1);
            	System.out.println(passwordcheck);
            }
            if (this.password.contains(passwordcheck)) {
            	validated = true;
            }
            
           
        } catch (Exception e1) {
            e1.printStackTrace();
        }
		return validated;
	}
	
	public boolean checkCNICAdmin() {
		boolean validated = false;
		String checkCNIC = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
            //Creating Connection Object
            Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
            //Prepared Statement
            Statement smt = connection.createStatement();
            ResultSet result = smt.executeQuery("SELECT Admin.cnic FROM ADMIN WHERE ADMIN.cnic = '" + cnic + "' ");
            if (result.next()==false) {
            	System.out.println("CNIC not found");
            }
            
            else {
            	validated = true;
            }
            
            
           
        } catch (Exception e1) {
            e1.printStackTrace();
        }
		return validated;
	}
	
	public boolean checkCNICDriver() {
		boolean validated = false;
		String checkCNIC = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
            //Creating Connection Object
            Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
            //Prepared Statement
            Statement smt = connection.createStatement();
            ResultSet result = smt.executeQuery("SELECT Admin.cnic FROM ADMIN WHERE ADMIN.cnic = '" + cnic + "' ");
            if (result.next()==false) {
            	System.out.println("CNIC not found");
            }
            
            else {
            	validated = true;
            }
            
            
           
        } catch (Exception e1) {
            e1.printStackTrace();
        }
		return validated;
	}
	
}

