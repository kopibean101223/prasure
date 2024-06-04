import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.awt.*;


public class TEACHERBORROW_PAGE {
	public static String nmr;
	public static JComboBox<String> comboBox = new JComboBox<>();
public static void main (String[] args) {

JFrame f=new JFrame("TMC'S LIBRARY MANAGEMENT SYSTEM");
f. getContentPane(). setLayout(null);





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
JLabel label3 = new JLabel("REGISTRATION FORM");
f.add(label3);
label3.setBounds(575, 200,800, 169);
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









			//BORROWER TYPE WITH TEXTBOX
			String[] items = {"Teacher"};
			JComboBox<String> teachtype = new JComboBox<String>(items);
         JLabel lbl=new JLabel ("BORROWER'S TYPE: ");
         lbl.setBounds(350, 350,950, 30);
         f.add(lbl);
         f.add(lbl);
         f.add(teachtype);
         teachtype.setBounds(350, 380,950, 40);
         //BORROWER TYPE WITH TEXTBOX
         
         
         
         //BORROWER TYPE WITH TEXTBOX

         JTextField teachlname;
         
         JLabel teachlblname=new JLabel ("Last Name");
         teachlname=new JTextField(15);
         teachlblname.setBounds(350, 450,300, 30);
         teachlname.setBounds(350, 480,300, 30);
         f.add(teachlblname);
         f.add(teachlname);


         //BORROWER TYPE WITH TEXTBOX
         
          //BORROWER TYPE WITH TEXTBOX

         JTextField teachfname;
         
         JLabel teachlblfname=new JLabel ("First Name");
         teachfname=new JTextField(1);
         teachlblfname.setBounds(675, 450,300, 30);
         teachfname.setBounds(675, 480,300, 30);
         f.add(teachlblfname);
         f.add(teachfname);

         
         //BORROWER TYPE WITH TEXTBOX
         
          //BORROWER TYPE WITH TEXTBOX

         JTextField teachmname;
         
         JLabel lblmname=new JLabel ("Middle Name");
         teachmname=new JTextField(15);
         lblmname.setBounds(1000, 450,300, 30);
         teachmname.setBounds(1000, 480,300, 30);
         f.add(lblmname);
         f.add(teachmname);

         
         //BORROWER TYPE WITH TEXTBOX
         
                   //BORROWER TYPE WITH TEXTBOX

         JTextField employeeid;
         
         JLabel lblempid=new JLabel ("EMPLOYEE ID:");
         employeeid=new JTextField(15);
         lblempid.setBounds(350, 530,300, 30);
         employeeid.setBounds(350, 560,470, 30);
         f.add(lblempid);
         f.add(employeeid);

         
         //BORROWER TYPE WITH TEXTBOX
         
         
         //BORROWER TYPE WITH TEXTBOX
         
         String[] cllg = {"CHK", "CCIS", "CBFS","CTHM" };
         JComboBox<String> department = new JComboBox<String>(cllg);
         JLabel lbl6=new JLabel ("DEPARTMENT: ");
         lbl6.setBounds(830, 530,300, 30);
         f.add(lbl6);
         f.add(lbl6);
         f.add(department);
         department.setBounds(830, 560,470, 30);
         Object selectedItem = department.getSelectedItem();
         String teachchoice = selectedItem.toString();
         JTextField teachdepartment = new JTextField(teachchoice) ;
         //BORROWER TYPE WITH TEXTBOX
         
         
         
         
         
         
         
     
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
// HOME BUTTON
JButton subton=new JButton("REGISTER");
subton. setBounds (350, 800,950, 50);
subton.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
	
	String lnamevalue = teachlname.getText().trim();
    if (lnamevalue.isEmpty()) {
        JOptionPane.showMessageDialog(f, "Please enter a value in the LASTNAME TEXTFIELD.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String fnamevalue = teachfname.getText().trim();
    if (fnamevalue.isEmpty()) {
        JOptionPane.showMessageDialog(f, "Please enter a value in the FIRSTNAME TEXTFIELD.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String mnamevalue = teachmname.getText().trim();
    if (mnamevalue.isEmpty()) {
        JOptionPane.showMessageDialog(f, "Please enter a value in the MIDDLENAME TEXTFIELD.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String employeeidvalue = employeeid.getText().trim();
    if (employeeidvalue.isEmpty()) {
        JOptionPane.showMessageDialog(f, "Please enter a value in the ID TEXTFIELD.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    

	String url = "jdbc:mysql://localhost:3306/comprog";
    String user = "root";
    String password = "";

    try {
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement statement = conn.createStatement();
        
        
        
        
        
   String query = ("INSERT INTO BORROWER_TABLE(TYPE, LASTNAME, FIRSTNAME, INITIAL, ID, DEPARTMENT)")
   		+ "VALUES ('TEACHER','"+teachlname.getText()+"', '"+teachfname.getText()+"', '"+teachmname.getText()+"', '"+employeeid.getText()+"', '"+teachdepartment.getText()+"');";  
   				
   			  

 				statement.executeUpdate(query);
 				JOptionPane.showMessageDialog(f, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
 				employeeid.setText("");
 				teachmname.setText("");
 				teachfname.setText("");
 				teachlname.setText("");
    
    } catch (SQLException ex) {
    	JOptionPane.showMessageDialog(f, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
}) ;
// HOME BUTTON     
         
         
// BACK BUTTON
JButton c=new JButton("Back ");
c. setBounds (50, 280,180, 50);
c.addActionListener(new ActionListener(){
public void actionPerformed (ActionEvent e){
BORROWERSELECTION_PAGE.main(null);
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
subton.setBackground(customColor2);
subton.setForeground(Color.WHITE);
f.add(home);
f.add(c);
f.add(subton);
c.setForeground(Color.WHITE);
c.setBackground(customColor2);
home.setForeground(Color.WHITE);
home.setBackground(customColor2);
teachtype.setBackground(Color.WHITE);
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