/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package db_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;

/**
 *
 * @author fatim
 */
public class CustomerBookingDetailsUI extends javax.swing.JFrame {
	private String resID;
	public float getTotalAmount() {
		return totalAmount;
	}
	public String getCarRegNo() {
		return carRegNo;
	}
	

	private String pickUpTime;
	private String dropOffTime;
	private String date;
	private boolean wantDriver;
	private boolean isOneDay;
	private float totalAmount;
	private String carRegNo;
	private float rate;
    
    public CustomerBookingDetailsUI(String dropOffTime, String date, boolean wantDriver, boolean isOneDay, String carRegNo, String pickUpTime, float rate) {
    	
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cnicTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phoneNoTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        licenseNoTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        confirmBookBtn = new javax.swing.JButton();
        
        // getting the values of class attributes
        this.pickUpTime = pickUpTime;
    	this.dropOffTime = dropOffTime;
    	this.date = date;
    	this.wantDriver = wantDriver;
    	this.isOneDay = isOneDay;
        this.carRegNo = carRegNo;
        this.rate = rate;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Project\\DB_Project\\assets\\120x120T - Wheel deal.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ENTER CUSTOMER DETAILS");

        backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        //back button handling

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(213, 231, 235));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        jLabel1.setText("Name");

       
        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        jLabel2.setText("CNIC");

        jLabel3.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        jLabel4.setText("Phone no.");

        jLabel6.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        jLabel6.setText("License Number");

        confirmBookBtn.setBackground(new java.awt.Color(0, 102, 102));
        confirmBookBtn.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        confirmBookBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmBookBtn.setText("Confirm Booking");
        confirmBookBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        confirmBookBtn.addActionListener(new ActionListener() {
                	@Override
                    public void actionPerformed(ActionEvent e) {
                		String name = nameTF.getText();
                		String cnic = cnicTF.getText();
                		String email = emailTF.getText();
                		String licenseNo = licenseNoTF.getText();
                		String phoneNo = phoneNoTF.getText();
                		addCustomerDetailsToDB(licenseNo, cnic, name, phoneNo,email);
                		addReservationDetailsToDB(name, cnic, licenseNo, email, phoneNo);
                		float paidAmount = getTotalAmount();    
                		if (getWantDriver()) {
                			SelectDriverForReservationUI newDriver = new SelectDriverForReservationUI(getResID());
                			newDriver.setVisible(true);
                			newDriver.setLocationRelativeTo(null);
                    		dispose();

                		}
                		RentInvoice newScreen  = new RentInvoice(getResID(), paidAmount, cnic);
                		newScreen.setVisible(true);
                		newScreen.setLocationRelativeTo(null);
                		newScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            			dispose();
                	}
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cnicTF, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(licenseNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cnicTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phoneNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(licenseNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirmBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerBookingDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerBookingDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerBookingDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerBookingDetailsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerBookingDetailsUI(null, null, false, false, null, null, 0.0f).setVisible(true);
            }
        });
    }
    
    public void addReservationDetailsToDB(String name, String cnic, String licenseNo, String email, String phoneNo) {
    	try {
    		IDGenerator res_id = new IDGenerator();
    		String reservationID = res_id.generateID("R");
    		setResID(reservationID);
    		/*while(!validateReservationID(reservationID)) {
    			reservationID = res_id.generateID("R");
    		}
    		*/
    		IDGenerator b_id = new IDGenerator();
    		String billID = b_id.generateID("B");
    		/*while(!validateBillID(billID)) {
    			billID = b_id.generateID("B");
    		}
    		*/
    		
    		this.totalAmount = calculateTotalAmount();
    		System.out.println(reservationID + " " + billID + " " + this.totalAmount + "  " + cnic);
    		
			Class.forName("oracle.jdbc.driver.OracleDriver");
            //Creating Connection Object
            Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
            //Prepared Statement
            Statement smt = connection.createStatement();
            smt.executeQuery("INSERT INTO \"HR\".\"RESERVATIONS\" (\"Date\", STATUS, BOOK_TIME, RETURN_TIME, RES_ID, CUSTOMER_CD_CNIC, REG_NO, BILL_ID, TOTAL_AMOUNT, DISCOUNT) VALUES ('"+ this.date +"', 'y', '"+this.pickUpTime+"', '"+this.dropOffTime+"', '"+reservationID+"', '"+cnic+"', '"+this.carRegNo+"', '"+billID+"', '"+this.totalAmount+"', '0')");
            smt.close();
            
            
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
    
    public void addCustomerDetailsToDB(String licenseNo, String cnic, String name, String contactNo, String email) {
    	try {
    		
			Class.forName("oracle.jdbc.driver.OracleDriver");
            //Creating Connection Object
            Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
            //Prepared Statement
            Statement smt = connection.createStatement();
            
            smt.executeQuery("INSERT INTO \"HR\".\"APP_USER\" (CD_EMAIL, CD_NAME, CD_CNIC, CD_CONTACT, APP_USER_TYPE) VALUES ('"+email+"', '"+name+"', '"+cnic+"', '"+contactNo+"', 'Customer')");
            smt.executeQuery("INSERT INTO \"HR\".\"CUSTOMER\" (CUSTOMER_LICENSE_NUMBER, CD_CNIC) VALUES ('"+licenseNo+"', '"+cnic+"')");
            smt.close();
            
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
    
    public boolean validateBillID(String billID) {
		boolean found = false;
		String checkBillID = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
            //Creating Connection Object
            Connection connection1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
            //Prepared Statement
            Statement smt2 = connection1.createStatement();
            ResultSet result = smt2.executeQuery("SELECT RESERVATIONS.bill_id from RESERVATIONS where RESERVATIONS.bill_id = '" + billID + "' ");
            
            if (!result.next()) {
            	found = false;
            }
            
            else {
            	found = true;
            }
            smt2.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
		
		return found;
	}
    
    public boolean validateReservationID(String reservationID) {
		boolean found = false;
		String checkResID = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
            //Creating Connection Object
            Connection connection2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
            //Prepared Statement
            Statement smt1 = connection2.createStatement();
            ResultSet result = smt1.executeQuery("SELECT RESERVATIONS.res_id from RESERVATIONS where RESERVATIONS.res_id = '" + reservationID + "' ");
            if (!result.next()) {
            	found = false;
            }
            
            else {
            	found = true;
            }         
            smt1.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
		return found;
	}
    
    public float calculateTotalAmount() {
    	float carRate = getRate();
    	int totalHours = 0;
    	if (!this.isOneDay) {
    		totalHours+=24;
    	}
    	int drop = Integer.parseInt(this.dropOffTime)/100;
    	int pick = Integer.parseInt(this.pickUpTime)/100;
    	int hours = drop - pick;
    	totalHours += hours;
    	return (totalHours*carRate);
    	
    }
    
    public float getRate() {
    	return this.rate;
    }
    
    public String getResID() {
    	return this.resID;
    }
    
    public void setResID(String resID) {
    	this.resID = resID;
    }
    
    public boolean getWantDriver() {
    	return this.wantDriver;
	}

	
// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cnicTF;
    private javax.swing.JButton confirmBookBtn;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField licenseNoTF;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField phoneNoTF;
    // End of variables declaration//GEN-END:variables
}


