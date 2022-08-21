package db_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		IDGenerator res_id = new IDGenerator();
		String reservationID = res_id.generateID("R");
		
		IDGenerator b_id = new IDGenerator();
		String billID = b_id.generateID("B");
		
		System.out.println(reservationID + " " + billID);
		/*
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
            //Creating Connection Object
            Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
            //Prepared Statement
            Statement smt = connection.createStatement();
            ResultSet result = smt.executeQuery("SELECT * FROM DRIVER");
            while(result.next()) {
            	System.out.println(result.getString(1));
            	System.out.println(result.getString(2));
            	System.out.println(result.getString(3));
            	System.out.println(result.getString(4));
            	System.out.println(result.getString(5));
            	
            }
            
            
            
           
        } catch (Exception e1) {
            e1.printStackTrace();
        }
	
		Home welcomeWindow = new Home();
        welcomeWindow.setVisible(true);                //frame will only be visible with set "true"
		welcomeWindow.setLocationRelativeTo(null);     //for opening in center
        welcomeWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		DBSignUp d = new DBSignUp("Aiman123", "12102-4729337-4");
		boolean j = d.checkPasswordAdmin();
		System.out.println(j);
		
		DBSignUp f = new DBSignUp("Adil123", "32312-4284995-2");
		boolean r = f.checkPasswordDriver();
		System.out.println(r);
		*/
	}

}

