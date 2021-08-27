
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// import java.util.Arrays;
// import java.util.ArrayList;
import java.sql.PreparedStatement;

// public class UpdateStudentFrame {

// ArrayList<Integer> arrl;
// ArrayList<Integer> arrl = new ArrayList<Integer>();

// Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 30);
// Font font2 = new Font(Font.DIALOG, Font.PLAIN, 15);
// Font font3 = new Font(Font.DIALOG_INPUT, Font.BOLD, 13);

// JFrame frame1 = new JFrame();
// private JLabel titleLabel, userNameLabel, passwordLabel;
// private JTextField userNameTF;
// private JPasswordField passwordTF;
// private JButton registerButton, logInButton;

// UpdateStudentFrame() {

// verification();

// frame1 = new JFrame();
// frame1.setLayout(null);

// titleLabel = new JLabel("Log In");
// userNameLabel = new JLabel("User Name : ");
// passwordLabel = new JLabel("Password : ");
// userNameTF = new JTextField();
// passwordTF = new JPasswordField();
// registerButton = new JButton("Register Now");
// logInButton = new JButton("Log In");

// titleLabel.setFont(font1);
// userNameLabel.setFont(font2);
// userNameTF.setFont(font2);
// passwordLabel.setFont(font2);
// passwordTF.setFont(font2);
// logInButton.setFont(font3);
// registerButton.setFont(font3);

// titleLabel.setForeground(new Color(250, 250, 250));
// userNameLabel.setForeground(new Color(250, 250, 250));
// passwordLabel.setForeground(new Color(250, 250, 250));
// // logInButton.setBackground(new Color(100, 220, 250));

// titleLabel.setBounds(60, 50, 200, 100);
// userNameLabel.setBounds(60, 130, 150, 30);
// userNameTF.setBounds(160, 130, 250, 30);
// passwordLabel.setBounds(60, 170, 150, 30);
// passwordTF.setBounds(160, 170, 250, 30);
// registerButton.setBounds(90, 220, 130, 30);
// logInButton.setBounds(180, 220, 130, 30);

// frame1.add(titleLabel);
// frame1.add(userNameLabel);
// frame1.add(passwordLabel);
// frame1.add(userNameTF);
// frame1.add(passwordTF);
// // frame1.add(registerButton);
// frame1.add(logInButton);
// // frame1.add();
// frame1.getContentPane().setBackground(new Color(100, 00, 250));
// frame1.setSize(500, 400);// 400 width and 500 height
// frame1.setLayout(null);// using no layout managers
// frame1.setVisible(true);// making the frame visible
// frame1.setResizable(false);
// frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

// logInButton.addActionListener(new ActionListener() {
// @Override
// public void actionPerformed(ActionEvent e) {
// verification(userNameTF.getText(), String.valueOf(passwordTF.getPassword()));
// }
// });

// }

// public static void main(String[] args) {
// new UpdateStudentFrame();
// }

// protected void verification(String name, String password) {
// protected void verification() {

// DBConnector db = new DBConnector();
// Connection con = db.connect();

// // String sql = "SELECT * FROM adminlog WHERE adminPassword = '" + password +
// "' AND adminName = '" + name + "'";

// String sql = "SELECT StudentName FROM `student` WHERE StudentID = 1";

// try {
// Statement st = con.createStatement();
// ResultSet rs = st.executeQuery(sql);
// if (rs.next()) {
// // JOptionPane.showMessageDialog(null,"verified");
// System.out.println("Student's Name : " + rs.getString("StudentName"));
// // frame1.dispose();
// // new MenuFrame(String.valueOf(userNameTF.getText()));

// }
// // else {
// // JOptionPane.showMessageDialog(null, "not verified");
// // }
// } catch (SQLException e) {
// e.printStackTrace();
// }

// }

// protected void verification() {
// if(arrl.size()>1){
// arrl.clear();
// }

// DBConnector db = new DBConnector();
// Connection con = db.connect();

// // String sql = "SELECT * FROM adminlog WHERE adminPassword = '" + password +
// "'
// // AND adminName = '" + name + "'";

// String sql = "SELECT MAX(StudentID) FROM `student`";

// try {
// Statement st = con.createStatement();
// ResultSet rs = st.executeQuery(sql);
// if (rs.next()) {
// // JOptionPane.showMessageDialog(null,"verified");
// System.out.println("Maximum Student's ID : " + rs.getInt("MAX(StudentID)"));
// // frame1.dispose();
// // new MenuFrame(String.valueOf(userNameTF.getText()));
// /* ArrayList<Integer arrl = new ArrayList<Integer>();> */
// // arrl = new ArrayList<Integer>();
// for(int i = 1; i <= rs.getInt("MAX(StudentID)"); i++){
// arrl.add(i);
// }
// System.out.println(arrl);
// Object arr[] = arrl.toArray();

// }
// // else {
// // JOptionPane.showMessageDialog(null, "not verified");
// // }
// } catch (SQLException e) {
// e.printStackTrace();
// }

// }

//     public class UpdateStudentFrame {

//     protected int verification() {

//         int l = 0;

//         // if (arrl.size() > 1) {
//         //     arrl.clear();
//         // }

//         DBConnector db = new DBConnector();
//         Connection con = db.connect();

//         // String sql = "SELECT * FROM adminlog WHERE adminPassword = '" + password + "'
//         // AND adminName = '" + name + "'";

//         String sql = "SELECT MAX(StudentID) FROM `student`";

//         try {
//             Statement st = con.createStatement();
//             ResultSet rs = st.executeQuery(sql);
//             if (rs.next()) {
//                 // JOptionPane.showMessageDialog(null,"verified");
//                 System.out.println("Maximum Student's ID : " + rs.getInt("MAX(StudentID)"));
//                 // l = rs.getInt("MAX(StudentID)");
//                 // frame1.dispose();
//                 // new MenuFrame(String.valueOf(userNameTF.getText()));
//                 /* ArrayList<Integer arrl = new ArrayList<Integer>();> */
//                 // arrl = new ArrayList<Integer>();

//                 // for (int i = 1; i <= rs.getInt("MAX(StudentID)"); i++) {
//                 //     arrl.add(i);
//                 // }
//                 // System.out.println(arrl);
//                 // Object arr[] = arrl.toArray();

//             }
//             // else {
//             // JOptionPane.showMessageDialog(null, "not verified");
//             // }
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }

//         return l;

//     }

// }

public class UpdateStudentFrame {

    JFrame f0, f1;
    private JLabel ll0, ll1, ll2, ll3, l, l0, l00, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;
    private JTextField tf1, tf2, tf3, tf4, tf7, tf8, tf9, tf10, tf11, tf12, tf13, tf14;
    private JComboBox c0, c1, c2, c3, cd4, cm4, cy4, c5, c6, cd7, cm7, cy7, c8;
    private JButton b0, b1, b2;
    private TextArea ta1;
    int n/*, no1*/;

    UpdateStudentFrame(String adminName) {
        // System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        f0 = new JFrame();

        ll0 = new JLabel("You are Logged in as : " + adminName);
        Font h = new Font(Font.DIALOG_INPUT, Font.BOLD, 30);
        ll0.setForeground(new Color(255, 215, 0));
        ll0.setBounds(30, -225, 600, 500);
        ll0.setFont(h);

        ll1 = new JLabel("UPDATE STUDENT DETAILS");
        ll1.setForeground(new Color(0, 191, 255));
        Font h0 = new Font(Font.SANS_SERIF, Font.BOLD, 40);
        ll1.setFont(h0);
        ll1.setBounds(420, -165, 600, 500);

        ll2 = new JLabel("UPDATE STUDENT DETAILS");
        ll2.setForeground(new Color(0, 255, 255));
        ll2.setFont(h0);
        ll2.setBounds(423, -163, 600, 500);

        ll3 = new JLabel("Enter Student's ID : ");
        ll3.setForeground(new Color(153, 255, 255));
        Font h1 = new Font(Font.SANS_SERIF, Font.BOLD, 25);
        ll3.setFont(h1);
        ll3.setBounds(350, 180, 350, 35);
        // String country0[] = { "Choose Student's ID", "01", "02", "03", "04", "05",
        // "06", "07", "08", "09", "10" };
        String country0[] = new String[new LastEnteredStudentID().verification() + 1];
        country0[0] = "Choose Student's ID";
        for (int i = 1; i <= new LastEnteredStudentID().verification(); i++) {
            country0[i] = String.valueOf(i);
        }
        c0 = new JComboBox(country0);
        c0.setFont(h1);
        c0.setBounds(605, 180, 340, 35);

        b0 = new JButton("UPDATE STUDENT");
        b0.setBounds(570, 500, 200, 40);

        f0.add(ll0);
        f0.add(ll1);
        f0.add(ll2);
        f0.add(ll3);
        f0.add(c0);
        f0.add(b0);

        f0.getContentPane().setBackground(new Color(100, 00, 250));
        f0.setSize(1365, 770);
        f0.setLayout(null);
        f0.setVisible(true);
        f0.setResizable(false);
        f0.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        f1 = new JFrame();

        l = new JLabel("You are Logged in as : " + adminName);
        // Font h3 = new Font(Font.DIALOG_INPUT, Font.BOLD, 30);
        l.setForeground(new Color(255, 215, 0));
        l.setBounds(30, -225, 600, 500);
        // l.setFont(h3);
        l.setFont(h);

        l0 = new JLabel("ENTER STUDENT DETAILS");
        l0.setForeground(new Color(0, 191, 255));
        // Font h0 = new Font(Font.SANS_SERIF, Font.BOLD, 40);
        l0.setFont(h0);
        l0.setBounds(420, -170, 600, 500);

        l00 = new JLabel("ENTER STUDENT DETAILS");
        l00.setForeground(new Color(0, 255, 255));
        l00.setFont(h0);
        l00.setBounds(423, -168, 600, 500);

        l1 = new JLabel("Student ID : ");
        l1.setForeground(new Color(153, 255, 255));
        // Font h1 = new Font(Font.SANS_SERIF, Font.BOLD, 25);
        l1.setFont(h1);
        l1.setBounds(125, 129, 350, 35);
        tf1 = new JTextField();
        Font h2 = new Font(Font.SERIF, Font.HANGING_BASELINE, 25);
        tf1.setFont(h2);
        tf1.setBackground(new Color(220, 220, 250));
        tf1.setBounds(290, 130, 310, 35);

        l2 = new JLabel("Student Name : ");
        l2.setForeground(new Color(153, 255, 255));
        l2.setFont(h1);
        l2.setBounds(700, 126, 350, 35);
        tf2 = new JTextField();
        tf2.setBackground(new Color(220, 220, 250));
        tf2.setFont(h2);
        tf2.setBounds(900, 128, 310, 35);

        l3 = new JLabel("Guardians Name : ");
        l3.setForeground(new Color(153, 255, 255));
        l3.setFont(h1);
        l3.setBounds(50, 200, 350, 35);
        tf3 = new JTextField();
        tf3.setBackground(new Color(220, 220, 250));
        tf3.setFont(h2);
        tf3.setBounds(290, 200, 310, 35);

        l4 = new JLabel("Blood Group : ");
        l4.setForeground(new Color(153, 255, 255));
        l4.setFont(h1);
        l4.setBounds(715, 195, 350, 35);
        String country6[] = { "Choose your Blood Group", "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" };
        c5 = new JComboBox(country6);
        c5.setFont(h2);
        c5.setBounds(900, 195, 310, 35);

        l5 = new JLabel("Department Name : ");
        l5.setForeground(new Color(153, 255, 255));
        l5.setFont(h1);
        l5.setBounds(38, 275, 350, 35);
        String country1[] = { "Choose your Department", "CE", "CSE", "EE", "ECE", "IT", "ME" };
        c2 = new JComboBox(country1);
        c2.setFont(h2);
        c2.setBounds(290, 275, 310, 35);

        l6 = new JLabel("Gender : ");
        l6.setForeground(new Color(153, 255, 255));
        l6.setFont(h1);
        l6.setBounds(160, 345, 350, 35);
        String country[] = { "Choose Gender", "Male", "Female", "Others" };
        c1 = new JComboBox(country);
        c1.setFont(h2);
        c1.setBounds(290, 345, 310, 35);

        l7 = new JLabel("Studing Standard : ");
        l7.setForeground(new Color(153, 255, 255));
        l7.setFont(h1);
        l7.setBounds(660, 268, 350, 35);
        String country2[] = { "Choose your Year", "1st", "2nd", "3rd", "4th" };
        c3 = new JComboBox(country2);
        c3.setFont(h2);
        c3.setBounds(900, 268, 310, 35);

        l8 = new JLabel("Date Of Birth : ");
        l8.setForeground(new Color(153, 255, 255));
        l8.setFont(h1);
        l8.setBounds(710, 340, 350, 35);
        String country3[] = { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        cd4 = new JComboBox(country3);
        cd4.setFont(h2);
        cd4.setBounds(900, 340, 90, 35);
        String country4[] = { "MM", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
                "Dec" };
        cm4 = new JComboBox(country4);
        cm4.setFont(h2);
        cm4.setBounds(990, 340, 100, 35);
        String country5[] = { "YYYY", "1995", "1996", "1097", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
                "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
                "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029",
                "2030" };
        cy4 = new JComboBox(country5);
        cy4.setFont(h2);
        cy4.setBounds(1090, 340, 120, 35);

        l9 = new JLabel("Email ID : ");
        l9.setForeground(new Color(153, 255, 255));
        l9.setFont(h1);
        l9.setBounds(765, 410, 350, 35);
        tf8 = new JTextField();
        tf8.setBackground(new Color(220, 220, 250));
        tf8.setFont(h2);
        tf8.setBounds(900, 410, 310, 35);

        l10 = new JLabel("Phone Number : ");
        l10.setForeground(new Color(153, 255, 255));
        l10.setFont(h1);
        l10.setBounds(70, 410, 350, 35);
        tf9 = new JTextField();
        tf9.setBackground(new Color(220, 220, 250));
        tf9.setFont(h2);
        tf9.setBounds(290, 410, 310, 35);

        l11 = new JLabel("Postal Address : ");
        l11.setForeground(new Color(153, 255, 255));
        l11.setFont(h1);
        l11.setBounds(70, 505, 210, 35);
        ta1 = new TextArea();
        ta1.setBackground(new Color(220, 220, 250));
        ta1.setFont(h2);
        ta1.setBounds(290, 480, 310, 100);

        l12 = new JLabel("Date of Addmission : ");
        l12.setForeground(new Color(153, 255, 255));
        l12.setFont(h1);
        l12.setBounds(25, 615, 350, 35);
        String country7[] = { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        cd7 = new JComboBox(country7);
        cd7.setFont(h2);
        cd7.setBounds(290, 615, 90, 35);
        String country8[] = { "MM", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
                "Dec" };
        cm7 = new JComboBox(country8);
        cm7.setFont(h2);
        cm7.setBounds(380, 615, 100, 35);
        String country9[] = { "YYYY", "1995", "1996", "1097", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
                "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
                "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029",
                "2030" };
        cy7 = new JComboBox(country9);
        cy7.setFont(h2);
        cy7.setBounds(480, 615, 120, 35);

        l13 = new JLabel("Year of Passout : ");
        l13.setForeground(new Color(153, 255, 255));
        l13.setFont(h1);
        l13.setBounds(675, 485, 350, 35);
        String country10[] = { "YYYY", "1995", "1996", "1097", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
                "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
                "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029",
                "2030" };
        c6 = new JComboBox(country10);
        c6.setFont(h2);
        c6.setBounds(900, 485, 310, 35);

        l14 = new JLabel("Religion : ");
        l14.setForeground(new Color(153, 255, 255));
        l14.setFont(h1);
        l14.setBounds(770, 560, 350, 35);
        String country11[] = { "Choose Your Religion", "Hinduism", "Islam", "Cristianity", "Buddhism", "Others" };
        c8 = new JComboBox(country11);
        c8.setFont(h2);
        c8.setBounds(900, 560, 310, 35);

        b1 = new JButton("SUBMIT UPDATED DETAILS");
        b1.setBounds(720, 640, 210, 35);

        b2 = new JButton("DELETE STUDENT DETAILS");
        b2.setBounds(1000, 640, 200, 35);

        // f1.setLayout(null);

        f1.add(l);
        f1.add(l0);
        f1.add(l00);
        f1.add(l1);
        f1.add(tf1);
        f1.add(l2);
        f1.add(tf2);
        f1.add(l3);
        f1.add(tf3);
        f1.add(l4);
        f1.add(c5);
        f1.add(l5);
        f1.add(c2);
        f1.add(c1);
        f1.add(l6);
        f1.add(c1);
        f1.add(l7);
        f1.add(c3);
        f1.add(l8);
        f1.add(cd4);
        f1.add(cm4);
        f1.add(cy4);
        f1.add(l9);
        f1.add(tf8);
        f1.add(l10);
        f1.add(tf9);
        f1.add(l11);
        f1.add(ta1);
        f1.add(l12);
        f1.add(cd7);
        f1.add(cm7);
        f1.add(cy7);
        f1.add(l13);
        f1.add(c6);
        f1.add(l14);
        f1.add(c8);
        f1.add(b1);
        f1.add(b2);

        f1.getContentPane().setBackground(new Color(100, 00, 250));
        f1.setSize(1365, 770);
        f1.setLayout(null);
        f1.setVisible(false);
        f1.setResizable(false);
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e0) {

                if (e0.getSource() == b0) {
                    n = Integer.parseInt(String.valueOf(c0.getSelectedItem()));
                    System.out.println(n);
                    f0.setVisible(false);
                    Updation(n);
                    // c1.setSelectedItem("Male");
                    f1.setVisible(true);
                }
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {

                if (e1.getSource() == b1) {
                    // c3.setSelectedItem("3rd");
                    // Updation(n);
                    submitUpdatedDetails(n);
                    f1.dispose();
                    new MenuFrame(adminName);
                    // System.out.println("==================================================================");
                    // Updation(n);
                }
            }
        });

    }

    protected void Updation(int n) {
        System.out.println("==================================================================");

        DBConnector db = new DBConnector();
        Connection con = db.connect();
        // String sql = "SELECT StudentName FROM `student` WHERE StudentID = " + n;

        String sql0 = "SELECT StudentName FROM `student` WHERE StudentID = " + n;

        try {
            Statement st0 = con.createStatement();
            ResultSet rs0 = st0.executeQuery(sql0);
            if (rs0.next()) {
                System.out.println("Student Name : " + rs0.getString("StudentName"));

                tf1.setText(String.valueOf(n));
                tf2.setText(rs0.getString("StudentName"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql1 = "SELECT StudentGender FROM `student` WHERE StudentID = " + n;

        try {
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery(sql1);
            if (rs1.next()) {
                System.out.println("Student Gender : " + rs1.getString("StudentGender"));

                // tf1.setText(String.valueOf(n));
                // c1.setActionCommand(rs1.getString("StudentGender"));
                // c1.setActionCommand("Male");
                // c1.setSelectedItem("Male");
                c1.setSelectedItem(rs1.getString("StudentGender"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql2 = "SELECT BloodGrp FROM `student` WHERE StudentID = " + n;

        try {
            Statement st2 = con.createStatement();
            ResultSet rs2 = st2.executeQuery(sql2);
            if (rs2.next()) {
                System.out.println("Student Blood Group : " + rs2.getString("BloodGrp"));

                // tf1.setText(String.valueOf(n));
                // c1.setActionCommand(rs1.getString("StudentGender"));
                // c1.setActionCommand("Male");
                // c1.setSelectedItem("Male");
                c5.setSelectedItem(rs2.getString("BloodGrp"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql3 = "SELECT DepartmentId FROM `student` WHERE StudentID = " + n;

        try {
            Statement st3 = con.createStatement();
            ResultSet rs3 = st3.executeQuery(sql3);
            if (rs3.next()) {
                System.out.println("Student Department Id : " + rs3.getString("DepartmentId"));

                // tf1.setText(String.valueOf(n));
                // c1.setActionCommand(rs1.getString("StudentGender"));
                // c1.setActionCommand("Male");
                // c1.setSelectedItem("Male");
                c2.setSelectedItem(rs3.getString("DepartmentId"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql4 = "SELECT DOB FROM `student` WHERE StudentID = " + n;

        try {
            Statement st4 = con.createStatement();
            ResultSet rs4 = st4.executeQuery(sql4);
            if (rs4.next()) {
                System.out.println("Student Date Of Birth : " + rs4.getString("DOB"));

                // tf1.setText(String.valueOf(n));
                // c1.setActionCommand(rs1.getString("StudentGender"));
                // c1.setActionCommand("Male");
                // c1.setSelectedItem("Male");
                String str = rs4.getString("DOB");
                String as[] = str.split("/");

                cd4.setSelectedItem(String.valueOf(as[0]));
                cm4.setSelectedItem(String.valueOf(as[1]));
                cy4.setSelectedItem(String.valueOf(as[2]));

                // c5.setSelectedItem(rs4.getString("DOB"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql5 = "SELECT StudyStandard FROM `student` WHERE StudentID = " + n;

        try {
            Statement st5 = con.createStatement();
            ResultSet rs5 = st5.executeQuery(sql5);
            if (rs5.next()) {
                System.out.println("Student Study Standard : " + rs5.getString("StudyStandard"));

                // tf1.setText(String.valueOf(n));
                // c1.setActionCommand(rs1.getString("StudentGender"));
                // c1.setActionCommand("Male");
                // c1.setSelectedItem("Male");
                // String str = rs5.getString("StudyStandard");
                // String as[] = str.split("/");

                // cd4.setSelectedItem(String.valueOf(as[0]));
                // cm4.setSelectedItem(String.valueOf(as[1]));
                // cy4.setSelectedItem(String.valueOf(as[2]));

                // c5.setSelectedItem(rs4.getString("DOB"));

                c3.setSelectedItem(rs5.getString("StudyStandard"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql6 = "SELECT GuardianName FROM `student` WHERE StudentID = " + n;

        try {
            Statement st6 = con.createStatement();
            ResultSet rs6 = st6.executeQuery(sql6);
            if (rs6.next()) {
                System.out.println("Guardian's Name : " + rs6.getString("GuardianName"));

                // tf1.setText(String.valueOf(n));
                // c1.setActionCommand(rs1.getString("StudentGender"));
                // c1.setActionCommand("Male");
                // c1.setSelectedItem("Male");
                // String str = rs5.getString("StudyStandard");
                // String as[] = str.split("/");

                // cd4.setSelectedItem(String.valueOf(as[0]));
                // cm4.setSelectedItem(String.valueOf(as[1]));
                // cy4.setSelectedItem(String.valueOf(as[2]));

                // c5.setSelectedItem(rs4.getString("DOB"));

                // c3.setSelectedItem(rs6.getString("GuardianName"));
                tf3.setText(rs6.getString("GuardianName"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql7 = "SELECT PhoneNumber FROM `student` WHERE StudentID = " + n;

        try {
            Statement st7 = con.createStatement();
            ResultSet rs7 = st7.executeQuery(sql7);
            if (rs7.next()) {
                System.out.println("Student's Phone Number : " + rs7.getString("PhoneNumber"));

                // tf1.setText(String.valueOf(n));
                // c1.setActionCommand(rs1.getString("StudentGender"));
                // c1.setActionCommand("Male");
                // c1.setSelectedItem("Male");
                // String str = rs5.getString("StudyStandard");
                // String as[] = str.split("/");

                // cd4.setSelectedItem(String.valueOf(as[0]));
                // cm4.setSelectedItem(String.valueOf(as[1]));
                // cy4.setSelectedItem(String.valueOf(as[2]));

                // c5.setSelectedItem(rs4.getString("DOB"));

                // c3.setSelectedItem(rs6.getString("GuardianName"));
                tf9.setText(rs7.getString("PhoneNumber"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql8 = "SELECT Religion FROM `student` WHERE StudentID = " + n;

        try {
            Statement st8 = con.createStatement();
            ResultSet rs8 = st8.executeQuery(sql8);
            if (rs8.next()) {
                System.out.println("Student's Religion : " + rs8.getString("Religion"));

                // tf1.setText(String.valueOf(n));
                // c1.setActionCommand(rs1.getString("StudentGender"));
                // c1.setActionCommand("Male");
                // c1.setSelectedItem("Male");
                // String str = rs5.getString("StudyStandard");
                // String as[] = str.split("/");

                // cd4.setSelectedItem(String.valueOf(as[0]));
                // cm4.setSelectedItem(String.valueOf(as[1]));
                // cy4.setSelectedItem(String.valueOf(as[2]));

                // c5.setSelectedItem(rs4.getString("DOB"));

                // c3.setSelectedItem(rs6.getString("GuardianName"));
                // tf9.setText(rs8.getString("Religion"));

                c8.setSelectedItem(rs8.getString("Religion"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql9 = "SELECT PostalAddress FROM `student` WHERE StudentID = " + n;

        try {
            Statement st9 = con.createStatement();
            ResultSet rs9 = st9.executeQuery(sql9);
            if (rs9.next()) {
                System.out.println("Student's Postal Address : " + rs9.getString("PostalAddress"));

                // tf1.setText(String.valueOf(n));
                // c1.setActionCommand(rs1.getString("StudentGender"));
                // c1.setActionCommand("Male");
                // c1.setSelectedItem("Male");
                // String str = rs5.getString("StudyStandard");
                // String as[] = str.split("/");

                // cd4.setSelectedItem(String.valueOf(as[0]));
                // cm4.setSelectedItem(String.valueOf(as[1]));
                // cy4.setSelectedItem(String.valueOf(as[2]));

                // c5.setSelectedItem(rs4.getString("DOB"));

                // c3.setSelectedItem(rs6.getString("GuardianName"));
                // tf9.setText(rs8.getString("Religion"));

                // c8.setSelectedItem(rs9.getString("PostalAddress"));

                ta1.setText(rs9.getString("PostalAddress"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql10 = "SELECT EmailAddress FROM `student` WHERE StudentID = " + n;

        try {
            Statement st10 = con.createStatement();
            ResultSet rs10 = st10.executeQuery(sql10);
            if (rs10.next()) {
                System.out.println("Student's Email Address : " + rs10.getString("EmailAddress"));

                // tf1.setText(String.valueOf(n));
                // c1.setActionCommand(rs1.getString("StudentGender"));
                // c1.setActionCommand("Male");
                // c1.setSelectedItem("Male");
                // String str = rs5.getString("StudyStandard");
                // String as[] = str.split("/");

                // cd4.setSelectedItem(String.valueOf(as[0]));
                // cm4.setSelectedItem(String.valueOf(as[1]));
                // cy4.setSelectedItem(String.valueOf(as[2]));

                // c5.setSelectedItem(rs4.getString("DOB"));

                // c3.setSelectedItem(rs6.getString("GuardianName"));
                // tf9.setText(rs8.getString("Religion"));

                // c8.setSelectedItem(rs9.getString("PostalAddress"));

                // ta1.setText(rs10.getString("EmailAddress"));

                tf8.setText(rs10.getString("EmailAddress"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql11 = "SELECT DateOfAdmission FROM `student` WHERE StudentID = " + n;

        try {
            Statement st11 = con.createStatement();
            ResultSet rs11 = st11.executeQuery(sql11);
            if (rs11.next()) {
                System.out.println("Student's Date Of Admission : " + rs11.getString("DateOfAdmission"));

                // tf1.setText(String.valueOf(n));
                // c1.setActionCommand(rs1.getString("StudentGender"));
                // c1.setActionCommand("Male");
                // c1.setSelectedItem("Male");
                // String str = rs5.getString("StudyStandard");
                // String as[] = str.split("/");

                // cd4.setSelectedItem(String.valueOf(as[0]));
                // cm4.setSelectedItem(String.valueOf(as[1]));
                // cy4.setSelectedItem(String.valueOf(as[2]));

                // c5.setSelectedItem(rs4.getString("DOB"));

                // c3.setSelectedItem(rs6.getString("GuardianName"));
                // tf9.setText(rs8.getString("Religion"));

                // c8.setSelectedItem(rs9.getString("PostalAddress"));

                // ta1.setText(rs10.getString("EmailAddress"));

                // tf8.setText(rs10.getString("EmailAddress"));

                String str1 = rs11.getString("DateOfAdmission");
                String as1[] = str1.split("/");

                cd7.setSelectedItem(String.valueOf(as1[0]));
                cm7.setSelectedItem(String.valueOf(as1[1]));
                cy7.setSelectedItem(String.valueOf(as1[2]));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql12 = "SELECT YearOfPassOut FROM `student` WHERE StudentID = " + n;

        try {
            Statement st12 = con.createStatement();
            ResultSet rs12 = st12.executeQuery(sql12);
            if (rs12.next()) {
                System.out.println("Student's Year Of PassOut : " + rs12.getString("YearOfPassOut"));

                // tf1.setText(String.valueOf(n));
                // c1.setActionCommand(rs1.getString("StudentGender"));
                // c1.setActionCommand("Male");
                // c1.setSelectedItem("Male");
                // String str = rs5.getString("StudyStandard");
                // String as[] = str.split("/");

                // cd4.setSelectedItem(String.valueOf(as[0]));
                // cm4.setSelectedItem(String.valueOf(as[1]));
                // cy4.setSelectedItem(String.valueOf(as[2]));

                // c5.setSelectedItem(rs4.getString("DOB"));

                // c3.setSelectedItem(rs6.getString("GuardianName"));
                // tf9.setText(rs8.getString("Religion"));

                // c8.setSelectedItem(rs9.getString("PostalAddress"));

                // ta1.setText(rs10.getString("EmailAddress"));

                // tf8.setText(rs10.getString("EmailAddress"));

                // String str1 = rs11.getString("DateOfAdmission");
                // String as1[] = str1.split("/");

                // cd7.setSelectedItem(String.valueOf(as1[0]));
                // cm7.setSelectedItem(String.valueOf(as1[1]));
                // cy7.setSelectedItem(String.valueOf(as1[2]));

                c6.setSelectedItem(String.valueOf(rs12.getInt("YearOfPassOut")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void submitUpdatedDetails(int n) {

        DBConnector con = new DBConnector();
        Connection cc = con.connect();

        // DBConnector db = new DBConnector();
        // Connection con = db.connect();

        // no1 = Integer.parseInt(String.valueOf(c3.getItemAt(c3.getSelectedIndex())));
        // no2 = Integer.parseInt(String.valueOf(c6.getItemAt(c6.getSelectedIndex())));
        // String uId = d;
        // String sql = " INSERT INTO `student`(`StudentID`, `StudentName`,
        // `StudentGender`, `BloodGrp`, `DepartmentName`, `StudyStandard`, `DOB`,
        // `GuardianName`, `PhoneNumber`, `PostalAddress`, `EmailAddress`, `Religion`,
        // `DateOfAdmission`, `YearOfPassOut`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)\n";
        // String sql = " INSERT INTO `student`(`StudentID`, `StudentName`,
        // `StudentGender`, `BloodGrp`, `DepartmentID`, `StudyStandard`, `DOB`,
        // `GuardianName`, `PhoneNumber`, `PostalAddress`, `EmailAddress`, `Religion`,
        // `DateOfAdmission`, `YearOfPassOut`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,
        // ?, ?, ?)";
        // String sql = " INSERT INTO `student`(`StudentID`, `StudentName`,
        // `StudentGender`, `BloodGrp`, `DepartmentID`, `StudyStandard`, `DOB`,
        // `GuardianName`, `PhoneNumber`, `PostalAddress`, `EmailAddress`, `Religion`,
        // `DateOfAdmission`, `YearOfPassOut`) VALUES (1, 'Hritick Nayak', 'Male', 'O+',
        // 'EE', 2, '09/05/2000', 'Manas Kumar Nayak', 1234567895, '9/99-E, Haldia',
        // 'hritick@gmail.com', 'Hindu', '09/20/2018', 2021)";
        // String sql = " INSERT INTO `student`(`StudentID`, `StudentName`,
        // `StudentGender`, `BloodGrp`, `DepartmentID`, `StudyStandard`, `DOB`,
        // `GuardianName`, `PhoneNumber`, `PostalAddress`, `EmailAddress`, `Religion`,
        // `DateOfAdmission`, `YearOfPassOut`) VALUES
        // ("+Integer.parseInt(tf1.getText())+", 'Hritick Nayak', 'Male', 'O+', 'EE', "
        // + 2 i.e no1 + ", '09/05/2000', 'Manas Kumar Nayak', " +
        // Integer.parseInt(tf1.getText()) + ", '9/99-E', 'Haldia', 'hritick@gmail.com',
        // 'Hindu', '09/20/2018', " + no2 + ")";

        // String sql = " INSERT INTO `student`(`StudentID`, `StudentName`,
        // `StudentGender`, `BloodGrp`, `DepartmentID`, `StudyStandard`, `DOB`,
        // `GuardianName`, `PhoneNumber`, `PostalAddress`, `EmailAddress`, `Religion`,
        // `DateOfAdmission`, `YearOfPassOut`) VALUES
        // ("+Integer.parseInt(tf1.getText())+", ?, ?, ?, ?, " + no1 + ", ?, ?, " +
        // Integer.parseInt(tf9.getText()) + ", ?, ?, ?, ?, " + no2 + ")";

        // String sql = " INSERT INTO `student`(`StudentID`, `StudentName`,
        // `StudentGender`, `BloodGrp`, `DepartmentID`, `StudyStandard`, `DOB`,
        // `GuardianName`, `PhoneNumber`, `PostalAddress`, `EmailAddress`, `Religion`,
        // `DateOfAdmission`, `YearOfPassOut`) VALUES
        // ("+Integer.parseInt(tf1.getText())+", ?, ?, ?, ?, ?, ?, ?, " +
        // Integer.parseInt(tf9.getText()) + ", ?, ?, ?, ?, " + no2 + ")/n";
        // System.out.println(sql);

        // String sql = " INSERT INTO `student`(`StudentID`, `StudentName`,
        // `StudentGender`, `BloodGrp`, `DepartmentID`, `StudyStandard`, `DOB`,
        // `GuardianName`, `PhoneNumber`, `PostalAddress`, `EmailAddress`, `Religion`,
        // `DateOfAdmission`, `YearOfPassOut`) VALUES (" +
        // Integer.parseInt(tf1.getText())+", '" + String.valueOf(tf2.getText()) + "',
        // '" + String.valueOf(c1.getItemAt(c1.getSelectedIndex())) + "', '" +
        // String.valueOf(c5.getItemAt(c5.getSelectedIndex())) + "', '" +
        // String.valueOf(c2.getItemAt(c2.getSelectedIndex())) + "', '" +
        // String.valueOf(c2.getItemAt(c2.getSelectedIndex())) + "', '" +
        // String.valueOf(c3.getItemAt(c3.getSelectedIndex())) + "', '" +
        // String.valueOf(cd4.getSelectedItem() + " / " + cm4.getSelectedItem() + " / "
        // + cy4.getSelectedItem()) + "', '" + String.valueOf(tf3.getText()) + "', " +
        // Integer.parseInt(tf9.getText()) + ", '" + String.valueOf(ta1.getText()) + "',
        // '" + String.valueOf(tf8.getText()) + "', '" +
        // String.valueOf(c8.getItemAt(c8.getSelectedIndex())) + "', '" +
        // String.valueOf(cd7.getSelectedItem() + " / " + cm7.getSelectedItem() + " / "
        // + cy7.getSelectedItem()) + "', " + no2 + ")/n";

        // String sql = " INSERT INTO `student`(`StudentID`, `StudentName`,
        // `StudentGender`, `BloodGrp`, `DepartmentID`, `StudyStandard`, `DOB`,
        // `GuardianName`, `PhoneNumber`, `PostalAddress`, `EmailAddress`, `Religion`,
        // `DateOfAdmission`, `YearOfPassOut`) VALUES (" +
        // Integer.parseInt(tf1.getText())+", '" + String.valueOf(tf2.getText()) + "',
        // '" + String.valueOf(c1.getItemAt(c1.getSelectedIndex())) + "', '" +
        // String.valueOf(c5.getItemAt(c5.getSelectedIndex())) + "', '" +
        // String.valueOf(c2.getItemAt(c2.getSelectedIndex())) + "', '" +
        // String.valueOf(c3.getItemAt(c3.getSelectedIndex())) + "', '" +
        // String.valueOf(cd4.getSelectedItem() + " / " + cm4.getSelectedItem() + " / "
        // + cy4.getSelectedItem()) + "', '" + String.valueOf(tf3.getText()) + "', " +
        // Long.parseLong(tf9.getText()) + ", '" + String.valueOf(ta1.getText()) + "',
        // '" + String.valueOf(tf8.getText()) + "', '" +
        // String.valueOf(c8.getItemAt(c8.getSelectedIndex())) + "', '" +
        // String.valueOf(cd7.getSelectedItem() + " / " + cm7.getSelectedItem() + " / "
        // + cy7.getSelectedItem()) + "', " + no2 + ")";

        // String sql = " INSERT INTO `student`(`StudentID`, `StudentName`,
        // `StudentGender`, `BloodGrp`, `DepartmentID`, `StudyStandard`, `DOB`,
        // `GuardianName`, `PhoneNumber`, `PostalAddress`, `EmailAddress`, `Religion`,
        // `DateOfAdmission`, `YearOfPassOut`) VALUES (12, 'fdfb', 'Male', 'O+', 'EE',
        // '2nd', 'DD / MM / YYYY', 'gngfn', 1234567897, 'ytjuty', 'ryghrtyhrtjtyjtyj',
        // 'Choose Your Religion', 'DD / MM / YYYY', 2000)";

        // String sql = " INSERT INTO `student`(`StudentID`, `StudentName`,
        // `StudentGender`, `BloodGrp`, `DepartmentID`, `StudyStandard`, `DOB`,
        // `GuardianName`, `PhoneNumber`, `PostalAddress`, `EmailAddress`, `Religion`,
        // `DateOfAdmission`, `YearOfPassOut`) VALUES (1, 'Hritick Nayak', 'Male', 'O+',
        // 'EE', '2', '09/05/2000', 'Manas Kumar Nayak', 1234567895, '9/99-E, Haldia',
        // 'hritick@gmail.com', 'Hindu', '09/20/2018', 2021)";
        // System.out.println(sql);

        // String sql = " INSERT INTO `student`(`StudentID`, `StudentName`,
        // `StudentGender`, `BloodGrp`, `DepartmentID`, `StudyStandard`, `DOB`,
        // `GuardianName`, `PhoneNumber`, `PostalAddress`, `EmailAddress`, `Religion`,
        // `DateOfAdmission`, `YearOfPassOut`) VALUES ("
        // + Integer.parseInt(tf1.getText()) + ", '" + String.valueOf(tf2.getText()) +
        // "', '"
        // + String.valueOf(c1.getItemAt(c1.getSelectedIndex())) + "', '"
        // + String.valueOf(c5.getItemAt(c5.getSelectedIndex())) + "', '"
        // + String.valueOf(c2.getItemAt(c2.getSelectedIndex())) + "', '"
        // + String.valueOf(c3.getItemAt(c3.getSelectedIndex())) + "', '"
        // + String.valueOf(cd4.getSelectedItem() + "/" + cm4.getSelectedItem() + "/" +
        // cy4.getSelectedItem())
        // + "', '" + String.valueOf(tf3.getText()) + "', " +
        // Long.parseLong(tf9.getText()) + ", '"
        // + String.valueOf(ta1.getText()) + "', '" + String.valueOf(tf8.getText()) +
        // "', '"
        // + String.valueOf(c8.getItemAt(c8.getSelectedIndex())) + "', '"
        // + String.valueOf(cd7.getSelectedItem() + "/" + cm7.getSelectedItem() + "/" +
        // cy7.getSelectedItem())
        // + "', " + no2 + ")";

        // String sql = "UPDATE `student` SET
        // `StudentID`='[value-1]',`StudentName`='[value-2]',`StudentGender`='[value-3]',`BloodGrp`='[value-4]',`DepartmentID`='[value-5]',`StudyStandard`='[value-6]',`DOB`='[value-7]',`GuardianName`='[value-8]',`PhoneNumber`='[value-9]',`PostalAddress`='[value-10]',`EmailAddress`='[value-11]',`Religion`='[value-12]',`DateOfAdmission`='[value-13]',`YearOfPassOut`='[value-14]'
        // WHERE 1";

        // String s = "(" + Integer.parseInt(tf1.getText()) + ", '" + String.valueOf(tf2.getText()) + "', '" + String.valueOf(c1.getItemAt(c1.getSelectedIndex())) + "', '" + String.valueOf(c5.getItemAt(c5.getSelectedIndex())) + "', '" + String.valueOf(c2.getItemAt(c2.getSelectedIndex())) + "', '" + String.valueOf(c3.getItemAt(c3.getSelectedIndex())) + "', '" + String.valueOf(cd4.getSelectedItem() + "/" + cm4.getSelectedItem() + "/" + cy4.getSelectedItem()) + "', '" + String.valueOf(tf3.getText()) + "', " + Long.parseLong(tf9.getText()) + ", '" + String.valueOf(ta1.getText()) + "', '" + String.valueOf(tf8.getText()) + "', '" + String.valueOf(c8.getItemAt(c8.getSelectedIndex())) + "', '" + String.valueOf(cd7.getSelectedItem() + "/" + cm7.getSelectedItem() + "/" + cy7.getSelectedItem()) + "', " + Integer.parseInt(String.valueOf(c6.getItemAt(c6.getSelectedIndex()))) + ")";


        // String s = "(" + Integer.parseInt(tf1.getText()) + ", '" + String.valueOf(tf2.getText()) + "', '" + String.valueOf(c1.getItemAt(c1.getSelectedIndex())) + "', '" + String.valueOf(c5.getItemAt(c5.getSelectedIndex())) + "', '" + String.valueOf(c2.getItemAt(c2.getSelectedIndex())) + "', '" + String.valueOf(c3.getItemAt(c3.getSelectedIndex())) + "', '" + String.valueOf(cd4.getSelectedItem() + "/" + cm4.getSelectedItem() + "/" + cy4.getSelectedItem()) + "', '" + String.valueOf(tf3.getText()) + "', " + Long.parseLong(tf9.getText()) + ", '" + String.valueOf(ta1.getText()) + "', '" + String.valueOf(tf8.getText()) + "', '" + String.valueOf(c8.getItemAt(c8.getSelectedIndex())) + "', '" + String.valueOf(cd7.getSelectedItem() + "/" + cm7.getSelectedItem() + "/" + cy7.getSelectedItem()) + "', " + Integer.parseInt(String.valueOf(c6.getItemAt(c6.getSelectedIndex()))) + ")";



        // String s = "(" + Integer.parseInt(tf1.getText()) + ", '" + String.valueOf(tf2.getText()) + "', '" + String.valueOf(c1.getItemAt(c1.getSelectedIndex())) + "', '" + String.valueOf(c5.getItemAt(c5.getSelectedIndex())) + "', '" + String.valueOf(c2.getItemAt(c2.getSelectedIndex())) + "', '" + String.valueOf(c3.getItemAt(c3.getSelectedIndex())) + "', '" + String.valueOf(cd4.getSelectedItem() + "/" + cm4.getSelectedItem() + "/" + cy4.getSelectedItem()) + "', '" + String.valueOf(tf3.getText()) + "', " + Long.parseLong(tf9.getText()) + ", '" + String.valueOf(ta1.getText()) + "', '" + String.valueOf(tf8.getText()) + "', '" + String.valueOf(c8.getItemAt(c8.getSelectedIndex())) + "', '" + String.valueOf(cd7.getSelectedItem() + "/" + cm7.getSelectedItem() + "/" + cy7.getSelectedItem()) + "', " + Integer.parseInt(String.valueOf(c6.getItemAt(c6.getSelectedIndex()))) + ")";


        String SQL = "UPDATE `student` SET `StudentName`='" + String.valueOf(tf2.getText()) + "',`StudentGender`='" + String.valueOf(c1.getItemAt(c1.getSelectedIndex())) + "',`BloodGrp`='" + String.valueOf(c5.getItemAt(c5.getSelectedIndex())) + "',`DepartmentID`='" + String.valueOf(c2.getItemAt(c2.getSelectedIndex())) + "',`StudyStandard`='" + String.valueOf(c3.getItemAt(c3.getSelectedIndex())) + "',`DOB`='" + String.valueOf(cd4.getSelectedItem() + "/" + cm4.getSelectedItem() + "/" + cy4.getSelectedItem()) + "',`GuardianName`='" + String.valueOf(tf3.getText()) + "',`PhoneNumber`='" + Long.parseLong(tf9.getText()) + "',`PostalAddress`='" + String.valueOf(ta1.getText()) + "',`EmailAddress`='" + String.valueOf(tf8.getText()) + "',`Religion`='" + String.valueOf(c8.getItemAt(c8.getSelectedIndex())) + "',`DateOfAdmission`='" + String.valueOf(cd7.getSelectedItem() + "/" + cm7.getSelectedItem() + "/" + cy7.getSelectedItem()) + "',`YearOfPassOut`= " + Integer.parseInt(String.valueOf(c6.getItemAt(c6.getSelectedIndex()))) + " WHERE `StudentID` = " + n ;

        System.out.println(SQL);

        PreparedStatement ps;
        try {

            ps = cc.prepareStatement(SQL);

            int rs = ps.executeUpdate();

            // Statement st = con.createStatement();

            // ResultSet rs = st.executeQuery(sql);

            // Statement st = cc.createStatement();

            // ResultSet rss = st.executeQuery(sql);

            // ResultSet rss = ps.executeQuery(sql);

            /*
             * ps = cc.prepareStatement(sql);
             *
             * // ps.setString(1, String.valueOf(tf1.getText())); ps.setString(1,
             * String.valueOf(tf2.getText())); ps.setString(2,
             * String.valueOf(c1.getItemAt(c1.getSelectedIndex()))); ps.setString(3,
             * String.valueOf(c5.getItemAt(c5.getSelectedIndex()))); ps.setString(4,
             * String.valueOf(c2.getItemAt(c2.getSelectedIndex()))); ps.setString(5,
             * String.valueOf(c3.getItemAt(c3.getSelectedIndex()))); // ps.setString(7,
             * String.valueOf(c4)); ps.setString(6, String.valueOf(cd4.getSelectedItem() +
             * " / " + cm4.getSelectedItem() + " / " + cy4.getSelectedItem()));
             * ps.setString(7, String.valueOf(tf3.getText())); // ps.setString(9,
             * String.valueOf(tf9.getText())); ps.setString(8,
             * String.valueOf(ta1.getText())); ps.setString(9,
             * String.valueOf(tf8.getText())); ps.setString(10,
             * String.valueOf(c8.getItemAt(c8.getSelectedIndex()))); // ps.setString(13,
             * String.valueOf(c7)); ps.setString(11, String.valueOf(cd7.getSelectedItem() +
             * " / " + cm7.getSelectedItem() + " / " + cy7.getSelectedItem())); //
             * ps.setString(14, String.valueOf(c6.getItemAt(c6.getSelectedIndex())));
             *
             * // Initial Phase ----> // ps.setString(1, String.valueOf(tf1.getText()));
             * ps.setString(2, String.valueOf(tf2.getText())); ps.setString(3,
             * String.valueOf(c1.getItemAt(c1.getSelectedIndex()))); ps.setString(4,
             * String.valueOf(c5.getItemAt(c5.getSelectedIndex()))); ps.setString(5,
             * String.valueOf(c2.getItemAt(c2.getSelectedIndex()))); // ps.setString(6,
             * String.valueOf(c3.getItemAt(c3.getSelectedIndex()))); // ps.setString(7,
             * String.valueOf(c4)); ps.setString(7, String.valueOf(cd4.getSelectedItem() +
             * " / " + cm4.getSelectedItem() + " / " + cy4.getSelectedItem()));
             * ps.setString(8, String.valueOf(tf3.getText())); // ps.setString(9,
             * String.valueOf(tf9.getText())); ps.setString(10,
             * String.valueOf(ta1.getText())); ps.setString(11,
             * String.valueOf(tf8.getText())); ps.setString(12,
             * String.valueOf(c8.getItemAt(c8.getSelectedIndex()))); // ps.setString(13,
             * String.valueOf(c7)); ps.setString(13, String.valueOf(cd7.getSelectedItem() +
             * " / " + cm7.getSelectedItem() + " / " + cy7.getSelectedItem())); //
             * ps.setString(14, String.valueOf(c6.getItemAt(c6.getSelectedIndex())));
             *
             * int rs = ps.executeUpdate();
             */

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Student has been Updated");

            } else {
                JOptionPane.showMessageDialog(null, "Something went wrong, try again");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]) {

        new UpdateStudentFrame("Hritick");

    }

}
