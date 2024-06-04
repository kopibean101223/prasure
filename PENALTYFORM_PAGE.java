import java.awt.event.*;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;



public class PENALTYFORM_PAGE {
	public static String nmr;
	public static JComboBox<String> comboBox = new JComboBox<>();
	public static String selectedItem;
	public static long daysBetween;
public static void main (String[] args) {
	Font fontop = new Font("BAHNSCHRIFT", Font.BOLD, 24);	
JFrame f=new JFrame("TMC'S LIBRARY MANAGEMENT SYSTEM");
f. getContentPane(). setLayout(null);
Font txtbox = new Font("BAHNSCHRIFT", Font.BOLD, 20);
Font txtlbl = new Font("BAHNSCHRIFT", Font.BOLD, 14);
String[] items = {null};
comboBox = new JComboBox<>(items);
comboBox.setOpaque(true);
comboBox.setVisible(true);
comboBox.setBounds(350, 485,300, 30);
comboBox.setFont(txtbox);
f.add(comboBox);

//HEADER{
JLabel label1 = new JLabel(" WELCOME TO TMC'S LIBRARY MANAGEMENT SYSTEM");
JLabel label2 = new JLabel("");
f.add(label1);
f.add(label2);
label2.setBounds(0, 0,1440, 169);
label1.setBounds(100, 0,1440, 169);

Font fonttitle = new Font("BAHNSCHRIFT", Font.BOLD, 48);
label1.setFont(fonttitle);
label1.setOpaque(true);
Color customColor = new Color(255, 204, 51);
label1.setForeground(customColor);
Color customColor2 = new Color(16, 28, 78);
label2.setBackground(customColor2);
label1.setBackground(customColor2);
label2.setOpaque(true);
//}

//FORM
JLabel label3 = new JLabel("PAY PENALTY FORM");
f.add(label3);
label3.setBounds(500, 200,800, 169);
label3.setFont(fonttitle);
label3.setBackground(Color.BLACK);
//FORM

//LINE
JLabel label4 = new JLabel("");
f.add(label4);
label4.setBounds(350, 320,950, 1);
label4.setFont(fonttitle);
label4.setOpaque(true);
label4.setBackground(Color.BLACK);
//LINE

JTextField idchecker;

JLabel idchkerlbl =new JLabel ("ID");
idchecker=new JTextField(15);
idchkerlbl.setBounds(350, 290,300, 30);
idchecker.setBounds(350, 320,950, 30);
f.add(idchkerlbl);
f.add(idchecker);
idchecker.setFont(txtbox);

JLabel brdtlbl = new JLabel("DATE BORROWED : ");
f.add(brdtlbl);
brdtlbl.setBounds(675, 455,300, 30);
brdtlbl.setFont(txtlbl);

JLabel dtdulbl = new JLabel("DUE DATE : ");
	f.add(dtdulbl);
	dtdulbl.setBounds(1000, 455,300, 30);
	dtdulbl.setFont(txtlbl);

	         JLabel lbl6=new JLabel ("BORROWED BOOK : ");
	         lbl6.setBounds(350, 455,300, 30);
	         f.add(lbl6);
	         f.add(lbl6);
	         lbl6.setFont(txtlbl);
	         
	         JLabel ttllbl = new JLabel("AMOUNT PAYABLE: ");
	         f.add(ttllbl);
	         ttllbl.setBounds(675, 560,300, 30);
	         ttllbl.setFont(txtlbl);
	         
	         JLabel sttslbl = new JLabel("");
	         f.add(sttslbl);
	         sttslbl.setBounds(1000, 560,300, 30);
	         

	         JLabel lbl8=new JLabel ("PAYMENT STATUS: ");
	         lbl8.setBounds(350, 560,300, 30);
	         f.add(lbl8);
	         lbl8.setFont(txtlbl);

	                  
	Color customColor3 = new Color(224, 228, 230);

	
 	JTextField brdt =new JTextField ();
	f.add(brdt);
	brdt.setBounds(675, 485,300, 30);
	brdt.setOpaque(true);
	brdt.setEditable(false);
	brdt.setBackground(customColor3);
	brdt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
	brdt.setForeground(Color.BLACK);
	brdt.setFont(fontop);
	
	JTextField dtdu =new JTextField ();
 	f.add(dtdu);
 	dtdu.setBounds(1000, 485,300, 30);
 	dtdu.setOpaque(true);
 	dtdu.setEditable(false);
 	dtdu.setBackground(customColor3);
 	dtdu.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
 	dtdu.setForeground(Color.BLACK);
 	dtdu.setFont(fontop);
 	
 	JTextField pymt =new JTextField ();
 	f.add(pymt);
 	pymt.setBounds(350, 590,300, 30);
 	pymt.setOpaque(true);
 	pymt.setEditable(false);
 	pymt.setBackground(customColor3);
 	pymt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
 	pymt.setForeground(Color.BLACK);
 	pymt.setFont(fontop);

JTextField pnlty =new JTextField ();
	f.add(pnlty);
	pnlty.setBounds(675, 590,300, 30);
	pnlty.setOpaque(true);
	pnlty.setEditable(false);
	pnlty.setBackground(customColor3);
	pnlty.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
	pnlty.setForeground(Color.BLACK);
	pnlty.setFont(fontop);
 	
 	JTextField inptamt =new JTextField (10);
 	f.add(inptamt);
 	inptamt.setBounds(350, 695,300, 30);
 	inptamt.setOpaque(true);
 	inptamt.setBackground(customColor3);
 	inptamt.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
 	inptamt.setForeground(Color.BLACK);
 	inptamt.setFont(fontop);
 	
 	JLabel inptamtlbl = new JLabel("INPUT AMOUNT: ");
 	f.add(inptamtlbl);
 	inptamtlbl.setBounds(350, 665,300, 30);
 	inptamtlbl.setFont(txtlbl);
 	inptamtlbl.setBackground(Color.WHITE);
 	
 	

 	
 	

 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	comboBox.addItemListener(new ItemListener() {
	        @Override
	        public void itemStateChanged(ItemEvent ex) {
	            if (ex.getStateChange() == ItemEvent.SELECTED) {
	               selectedItem = (String) ex.getItem();
	                nmr = selectedItem;

	                System.out.println("Selected item: " + selectedItem);
	                try {// Load the MySQL driver
             	    Class.forName("com.mysql.cj.jdbc.Driver");

             	    // Set up the connection URL
             	  String  url = "jdbc:mysql://localhost:3306/comprog";

             	
				 	

             	    // Connect to the database
             	   Connection conn = DriverManager.getConnection(url, "root", "");
             	  Statement statement = conn.createStatement();
             	    
                 	    
                 	   ResultSet resultSet4 = statement.executeQuery("SELECT BORROWED_DATE, DATE_DUE,PAYMENT FROM BOOK_DETAILS WHERE TITLE = " + "'" + selectedItem+ "';");
                	    while (resultSet4.next()) {
                	    	brdt.setText(resultSet4.getString(1));
                	    	dtdu.setText(resultSet4.getString(2));
                	    	
                	    	
                	    	LocalDate duedatez = resultSet4.getDate(2).toLocalDate();
                	    	LocalDate today = LocalDate.now();
                	    	daysBetween = java.time.temporal.ChronoUnit.DAYS.between(duedatez, today);
                    	    // Assuming you want to set this value to another text field
                	    	System.out.println(daysBetween);
                	    	long total = daysBetween * 20;
                	    	
                	    	if (daysBetween <= 0) {
                	    	    pymt.setText("NOT OVERDUE");
                	    	    pnlty.setText("0.00");
                	    	    return;
                	    	} else if ("PAID".equals(resultSet4.getString(3))) {
                	    		pymt.setText("PAID");
                	    	    // Convert the total to a String and set it
                	    	    pnlty.setText("0.00");
                	    	} else {
                	    	    pymt.setText("NOT YET PAID");
                	    	    // Convert the total to a String and set it
                	    	    pnlty.setText(Long.toString(total));
                	    	}
                	    	}
                	    
                	    
                 	    

                 	    statement.close();
                 	    } catch (ClassNotFoundException e) {
                 	        System.out.print("");
                 	        e.printStackTrace();
                 	    } catch (SQLException e) {
                 	        System.out.print("");
                 	        e.printStackTrace();
                 	        JOptionPane.showMessageDialog(f, "Error!"); 
                 	   }
	                
	            }
	            
	        }
	    });
 	
 	
 	
 	
 	
 	
 	
JButton chckbtn=new JButton("Check For Record");
chckbtn.setBounds (602, 370,450, 40);
chckbtn.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
	String values = idchecker.getText().trim();
    if (values.isEmpty()) {
        JOptionPane.showMessageDialog(f, "Please enter a value in the text field.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
   
   
										try {// Load the MySQL driver
									 	    Class.forName("com.mysql.cj.jdbc.Driver");
									
									 	    // Set up the connection URL
									 	    String url = "jdbc:mysql://localhost:3306/comprog";
									
									
									 	    // Connect to the database
									 	    Connection conn = DriverManager.getConnection(url, "root", "");
									 	    Statement statement = conn.createStatement();
									 	    
									 	 //COMBO BOX AND DISPLAY 	    
									 	   comboBox.removeAllItems();
									 	  comboBox.addItem(null);
									 	 
									 	 
									 	 ResultSet resultSetss = statement.executeQuery("SELECT TYPE FROM BORROWER_TABLE WHERE ID = '" + idchecker.getText() + "';");
									 	if (resultSetss.next()) {
									 	    if ("TEACHER".equals(resultSetss.getString("TYPE"))) {
									 	        JOptionPane.showMessageDialog(f, "TEACHERS CAN'T GET A PENALTY!");
									 	        return; // Exit the method if the borrower is a teacher
									 	    } else {
									 	        ResultSet resultSet = statement.executeQuery("SELECT TITLE FROM BOOK_DETAILS WHERE BORROWER_ID = '" + idchecker.getText() + "';");
									 	        comboBox.removeAllItems(); // Clear existing items from the combo box
									 	        while (resultSet.next()) {
									 	            String value = resultSet.getString(1);
									 	            comboBox.addItem(value);
									 	        }
									 	        // Clear the text fields
									 	        brdt.setText("");
									 	        dtdu.setText("");
									 	       pymt.setText("");
									 	      pnlty.setText("");
									 	        comboBox.setSelectedItem(null);
									 	    }
									 	} else {
									 	    JOptionPane.showMessageDialog(f, "The ID you entered does not exist!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
									 	}
 	    
 	    resultSetss.close();
 	    statement.close();
 	    } catch (ClassNotFoundException ef) {
 	        System.out.print("ha");
 	        ef.printStackTrace();
 	    } catch (SQLException ef) {
 	        System.out.print("ha");
 	        ef.printStackTrace();
 	   }
}
});


f.add(chckbtn);
 


         
         //BORROWER TYPE WITH TEXTBOX

         
         //BORROWER TYPE WITH TEXTBOX
         
         
         //BORROWER TYPE WITH TEXTBOX


         


         //BORROWER TYPE WITH TEXTBOX
         

         
         
         
         
         
         
     
         
// HOME BUTTON
JButton subton=new JButton("PAY PENALTY ");
subton. setBounds (350, 800,950, 50);
subton.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
	String values = inptamt.getText().trim();

	
    if (values.isEmpty()) {
        JOptionPane.showMessageDialog(f, "Please enter a value in the text field.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (selectedItem == null) {
    	JOptionPane.showMessageDialog(f, "Please Choose from the combobox.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
    } 
    
    String input = inptamt.getText();
    try {
        // Attempt to parse the input as an integer
        int number = Integer.parseInt(input);
        System.out.print(number);
        // Display the parsed number (for demonstration purposes)
    } catch (NumberFormatException ex) {
        // Display an error message if input is not a valid integer
        JOptionPane.showMessageDialog(f, "Invalid input. Please enter an integer.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
   

    if ("PAID".equals(pymt.getText())) {
    	JOptionPane.showMessageDialog(f, "You Do not neet to pay\n"+"You have no unpaid balance,Good Job!");
    	return;
    }
    if ("NOT OVERDUE".equals(pymt.getText())) {
    	JOptionPane.showMessageDialog(f, "You Do not neet to pay\n"+"You have no unpaid balance,Good Job!");
    	return;
    }
    	
    	
    	double amtinput = Double.parseDouble(inptamt.getText()); 
    	double pnltydbl = Double.parseDouble(pnlty.getText()); 
					double chnge= amtinput  - pnltydbl;

					if (pnltydbl==0) {JOptionPane.showMessageDialog(f, "You Do not neet to pay\n"+"You have no unpaid balance,Good Job!");

				}
				else if (pnltydbl>amtinput) {JOptionPane.showMessageDialog(f, "Insufficient Amount Inputted!\n"+"Enter Another Amount!");
				}
				else if (amtinput>=pnltydbl) {JOptionPane.showMessageDialog(f, "Thank You!,\n Your Change is PHP " + chnge);
				pnltydbl=0;}
				else {JOptionPane.showMessageDialog(f, "Invalid Input!");
				}
				
				
				
				
				if (pnltydbl==0) {
					String url = "jdbc:mysql://localhost:3306/comprog";
				    String user = "root";
				    String password = "";

				    try {
				        Connection conn = DriverManager.getConnection(url, user, password);
				        Statement statement = conn.createStatement();
				        
				        
				        
				        
				        
				   String query = ("UPDATE BOOK_DETAILS SET PAYMENT = 'PAID' WHERE TITLE = "+ "'"+nmr+"';") ;
				   				statement.executeUpdate(query);
				   				brdt.setText("");
					 	        dtdu.setText("");
					 	       pymt.setText("");
					 	      pnlty.setText("");
					 	     inptamt.setText("");
					 	        comboBox.setSelectedItem(null);

				        System.out.println("Deleted successfully!");
				    } catch (SQLException ex) {
				        System.out.println("Error: " + ex.getMessage());
				    }
				}
					
				
				
				
				
        

    
    
    
    
    
    
    
    
    
    
    
    
    
	
    

}
}) ;
// HOME BUTTON     
         
         
// BACK BUTTON
JButton c=new JButton("Back ");
c. setBounds (50, 280,180, 50);
c.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
HOMEPAGE.main(null);
f.dispose();
}
}) ;
// BACK BUTTON

// HOME BUTTON
JButton home=new JButton("Home");
home. setBounds (50, 220,180, 50);
home.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
HOMEPAGE.main(null);
f.dispose();
}
}) ;
// HOME BUTTON


//CUSTOMIZE BUTTONS
Font fontbutton = new Font("ARIAL",Font.BOLD, 20);
home.setFont(fontbutton);
c.setFont(fontbutton);
subton.setFont(fontbutton);
chckbtn.setFont(fontbutton);
subton.setBackground(customColor2);
subton.setForeground(Color.WHITE);
f.add(home);
f.add(c);
f.add(subton);
c.setForeground(Color.WHITE);
c.setBackground(customColor2);
home.setForeground(Color.WHITE);
home.setBackground(customColor2);
chckbtn.setBackground(customColor2);
chckbtn.setForeground(Color.WHITE);

//CUSTOMIZE BUTTONS

JLabel bg = new JLabel("");
f.add(bg);
bg.setBounds(300, 220,1050, 700);

bg.setBackground(Color.WHITE);
bg.setOpaque(true);

// CUSTOMIZE FRAME}
f.setSize(1440,1024);
f.setVisible(true);
f.setResizable(false);
// CUSTOMIZE FRAME}

}
}