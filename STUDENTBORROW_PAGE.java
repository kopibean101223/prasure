import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.awt.*;



public class STUDENTBORROW_PAGE {
	public static String nmr,nmrtype;
	public static JComboBox<String> comboBox = new JComboBox<>();
public static void main (String[] args) {

JFrame f=new JFrame("TMC'S LIBRARY MANAGEMENT SYSTEM");
f. getContentPane(). setLayout(null);

Font txtbox = new Font("BAHNSCHRIFT", Font.BOLD, 20);
Font txtlbl = new Font("BAHNSCHRIFT", Font.BOLD, 14);
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
         JLabel lbl=new JLabel ("BORROWER'S TYPE: ");
         lbl.setBounds(350, 350,950, 30);
         f.add(lbl);
         String[] type = {"STUDENT"};
         JComboBox<String> studtype = new JComboBox<String>(type);
         f.add(lbl);
         f.add(studtype);
         studtype.setFont(txtbox);
         studtype.setBounds(350, 380,950, 40);
         //BORROWER TYPE WITH TEXTBOX
         
         lbl.setFont(txtlbl);
         
         //BORROWER TYPE WITH TEXTBOX

 
         
         JLabel lbl2=new JLabel ("LAST NAME :");
         JTextField lname=new JTextField(30);
         lbl2.setBounds(350, 450,200, 30);
         lname.setBounds(350, 480,250, 30);
         f.add(lbl2);
         f.add(lname);
         lbl2.setFont(txtlbl);
         lname.setFont(txtbox);
         //BORROWER TYPE WITH TEXTBOX
         
          //BORROWER TYPE WITH TEXTBOX

         JTextField fname;
         
         JLabel lblfname=new JLabel ("FIRST NAME :");
         fname=new JTextField(15);
         lblfname.setBounds(625, 450,250, 30);
         fname.setBounds(625, 480,250, 30);
         f.add(lblfname);
         f.add(fname);
         lblfname.setFont(txtlbl);
         fname.setFont(txtbox);

         
         //BORROWER TYPE WITH TEXTBOX
         
          //BORROWER TYPE WITH TEXTBOX

         JTextField mname;
         
         JLabel lblmname=new JLabel ("MIDDLE INITIAL :");
         mname=new JTextField(1);
         lblmname.setBounds(900, 450,250, 30);
         mname.setBounds(900, 480,250, 30);
         f.add(lblmname);
         f.add(mname);
         lblmname.setFont(txtlbl);
         mname.setFont(txtbox);

         
         //BORROWER TYPE WITH TEXTBOX
         
                   //BORROWER TYPE WITH TEXTBOX

         JTextField studid;
         
         JLabel lblstudid=new JLabel ("STUDENT ID :");
         studid=new JTextField(15);
         lblstudid.setBounds(350, 530,250, 30);
         studid.setBounds(350, 560,300, 30);
         f.add(lblstudid);
         f.add(studid);
         lblstudid.setFont(txtlbl);
         studid.setFont(txtbox);
         
         

         
         //BORROWER TYPE WITH TEXTBOX
         
         
         //BORROWER TYPE WITH TEXTBOX
         
         String[] yearlevel = {"1", "2", "3","4"};
         JComboBox<String> yrlvl = new JComboBox<String>(yearlevel);
         JLabel lblyrlvl=new JLabel ("YEAR LEVEL : ");
         lblyrlvl.setFont(txtlbl);
         lblyrlvl.setBounds(1175, 450,125, 30);
         f.add(lblyrlvl);
         f.add(yrlvl);
         yrlvl.setBounds(1175, 480,125, 30);
         Object selectedItem = yrlvl.getSelectedItem();
         String choice = selectedItem.toString();
         JTextField yrlvlchoice = new JTextField(choice) ;
         
         //BORROWER TYPE WITH TEXTBOX
         
         
         
         
         
         
         
         
         
         
         
       //BORROWER TYPE WITH TEXTBOX

         JTextField course;
         
         JLabel lblcrs=new JLabel ("COURSE :");
         course=new JTextField(15);
         lblcrs.setBounds(1000, 530,300, 30);
         course.setBounds(1000, 560,300, 30);
         f.add(lblcrs);
         f.add(course);
         course.setFont(txtlbl);
         course.setFont(txtbox);
         //BORROWER TYPE WITH TEXTBOX
         
         
         
         
         
         //BORROWER TYPE WITH TEXTBOX

         JTextField sect;
         
         JLabel lblsect=new JLabel ("SECTION :");
         sect=new JTextField(15);
         lblsect.setBounds(675, 530,300, 30);
         sect.setBounds(675, 560,300, 30);
         f.add(lblsect);
         f.add(sect);
         lblsect.setFont(txtlbl);
         sect.setFont(txtbox);
         
         //BORROWER TYPE WITH TEXTBOX

         
         
         
         
         
         
         	
// BORROW BUTTON
         JButton subton = new JButton("REGISTER");
         subton.setBounds(350, 800, 950, 50);
         subton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
            		

            		
                 String lnamevalue = lname.getText().trim();
                 if (lnamevalue.isEmpty()) {
                     JOptionPane.showMessageDialog(f, "Please enter a value in the LASTNAME TEXTFIELD.", "Error", JOptionPane.ERROR_MESSAGE);
                     return;
                 }
                 String fnamevalue = fname.getText().trim();
                 if (fnamevalue.isEmpty()) {
                     JOptionPane.showMessageDialog(f, "Please enter a value in the FIRSTNAME TEXTFIELD.", "Error", JOptionPane.ERROR_MESSAGE);
                     return;
                 }
                 String mnamevalue = mname.getText().trim();
                 if (mnamevalue.isEmpty()) {
                     JOptionPane.showMessageDialog(f, "Please enter a value in the MIDDLENAME TEXTFIELD.", "Error", JOptionPane.ERROR_MESSAGE);
                     return;
                 }
                 String studidvalue = studid.getText().trim();
                 if (studidvalue.isEmpty()) {
                     JOptionPane.showMessageDialog(f, "Please enter a value in the ID TEXTFIELD.", "Error", JOptionPane.ERROR_MESSAGE);
                     return;
                 }
                 String sectvalue = sect.getText().trim();
                 if (sectvalue.isEmpty()) {
                     JOptionPane.showMessageDialog(f, "Please enter a value in the SECTION TEXTFIELD.", "Error", JOptionPane.ERROR_MESSAGE);
                     return;
                 }
                 String coursevalue = course.getText().trim();
                 if (coursevalue.isEmpty()) {
                     JOptionPane.showMessageDialog(f, "Please enter a value in the COURSE TEXTFIELD.", "Error", JOptionPane.ERROR_MESSAGE);
                     return;
                 }
                 mname.setText("");
         		fname.setText("");
         		lname.setText("");
         		studid.setText("");
         		course.setText("");
         		sect.setText("");
                 String url = "jdbc:mysql://localhost:3306/comprog";
                 String user = "root";
                 String password = "";

                 Connection conn = null;
                 Statement statement = null;
                 
                 try {
                     conn = DriverManager.getConnection(url, user, password);
                     statement = conn.createStatement();
                     
                     String query = "INSERT INTO BORROWER_TABLE(TYPE, LASTNAME, FIRSTNAME, INITIAL, COURSE, ID, YEARLVL, SECTION, PENALTY) "
                                  + "VALUES ('STUDENT', '" + lnamevalue + "', '" + fnamevalue + "', '" + mnamevalue + "', '" + coursevalue + "', '" 
                                  + studidvalue + "', '" + yrlvlchoice.getText().trim() + "', '" + sectvalue + "', '0');";
                     
                     statement.executeUpdate(query);
                     JOptionPane.showMessageDialog(f, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);

                 } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(f, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                 } finally {
                     try {
                         if (statement != null) statement.close();
                         if (conn != null) conn.close();
                     } catch (SQLException ex) {
                         JOptionPane.showMessageDialog(f, "Error closing connection: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                     }
                 }
             }
         });
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
home.setBounds (50, 220,180, 50);
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
studtype.setBackground(Color.WHITE);
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