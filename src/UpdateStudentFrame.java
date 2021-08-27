
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class UpdateStudentFrame {

    JFrame f0, f1;
    private JLabel ll0, ll1, ll2, ll3, l, l0, l00, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;
    private JTextField tf1, tf2, tf3, tf4, tf7, tf8, tf9, tf10, tf11, tf12, tf13, tf14;
    private JComboBox c0, c1, c2, c3, cd4, cm4, cy4, c5, c6, cd7, cm7, cy7, c8;
    private JButton b0, b1, b2;
    private TextArea ta1;
    int n;

    UpdateStudentFrame(String adminName) {

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
        tf1.setBackground(new Color(163, 160, 160, 255));
        tf1.setBounds(290, 130, 310, 35);
        tf1.setEditable(false);

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
        c5.setBackground(new Color(220, 220, 250));
        c5.setBounds(900, 195, 310, 35);

        l5 = new JLabel("Department Name : ");
        l5.setForeground(new Color(153, 255, 255));
        l5.setFont(h1);
        l5.setBounds(38, 275, 350, 35);
        String country1[] = { "Choose your Department", "CE", "CSE", "EE", "ECE", "IT", "ME" };
        c2 = new JComboBox(country1);
        c2.setFont(h2);
        c2.setBackground(new Color(220, 220, 250));
        c2.setBounds(290, 275, 310, 35);

        l6 = new JLabel("Gender : ");
        l6.setForeground(new Color(153, 255, 255));
        l6.setFont(h1);
        l6.setBounds(160, 345, 350, 35);
        String country[] = { "Choose Gender", "Male", "Female", "Others" };
        c1 = new JComboBox(country);
        c1.setFont(h2);
        c1.setBackground(new Color(220, 220, 250));
        c1.setBounds(290, 345, 310, 35);

        l7 = new JLabel("Studing Standard : ");
        l7.setForeground(new Color(153, 255, 255));
        l7.setFont(h1);
        l7.setBounds(660, 268, 350, 35);
        String country2[] = { "Choose your Year", "1st", "2nd", "3rd", "4th" };
        c3 = new JComboBox(country2);
        c3.setFont(h2);
        c3.setBackground(new Color(220, 220, 250));
        c3.setBounds(900, 268, 310, 35);

        l8 = new JLabel("Date Of Birth : ");
        l8.setForeground(new Color(153, 255, 255));
        l8.setFont(h1);
        l8.setBounds(710, 340, 350, 35);
        String country3[] = { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        cd4 = new JComboBox(country3);
        cd4.setFont(h2);
        cd4.setBackground(new Color(220, 220, 250));
        cd4.setBounds(900, 340, 90, 35);
        String country4[] = { "MM", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
                "Dec" };
        cm4 = new JComboBox(country4);
        cm4.setBackground(new Color(220, 220, 250));
        cm4.setFont(h2);
        cm4.setBounds(990, 340, 100, 35);
        String country5[] = { "YYYY", "1995", "1996", "1097", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
                "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
                "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029",
                "2030" };
        cy4 = new JComboBox(country5);
        cy4.setFont(h2);
        cy4.setBackground(new Color(220, 220, 250));
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
        String[] country7 = { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        cd7 = new JComboBox(country7);
        cd7.setFont(h2);
        cd7.setBackground(new Color(220, 220, 250));
        cd7.setBounds(290, 615, 90, 35);
        String[] country8 = { "MM", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
                "Dec" };
        cm7 = new JComboBox(country8);
        cm7.setFont(h2);
        cm7.setBackground(new Color(220, 220, 250));
        cm7.setBounds(380, 615, 100, 35);
        String[] country9 = { "YYYY", "1995", "1996", "1097", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
                "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
                "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029",
                "2030" };
        cy7 = new JComboBox(country9);
        cy7.setFont(h2);
        cy7.setBackground(new Color(220, 220, 250));
        cy7.setBounds(480, 615, 120, 35);

        l13 = new JLabel("Year of Passout : ");
        l13.setForeground(new Color(153, 255, 255));
        l13.setFont(h1);
        l13.setBounds(675, 485, 350, 35);
        String[] country10 = { "YYYY", "1995", "1996", "1097", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
                "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
                "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029",
                "2030" };
        c6 = new JComboBox(country10);
        c6.setFont(h2);
        c6.setBackground(new Color(220, 220, 250));
        c6.setBounds(900, 485, 310, 35);

        l14 = new JLabel("Religion : ");
        l14.setForeground(new Color(153, 255, 255));
        l14.setFont(h1);
        l14.setBounds(770, 560, 350, 35);
        String[] country11 = { "Choose Your Religion", "Hinduism", "Islam", "Christianity", "Buddhism", "Others" };
        c8 = new JComboBox(country11);
        c8.setFont(h2);
        c8.setBackground(new Color(220, 220, 250));
        c8.setBounds(900, 560, 310, 35);

        b1 = new JButton("UPDATE ");
        b1.setBounds(900, 640, 100, 35);

        b2 = new JButton("HOME");
        b2.setBounds(1113, 640, 100, 35);

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

                    n = Integer.parseInt(String.valueOf(c0.getSelectedItem()));
                    System.out.println(n);
                    f0.setVisible(false);
                    Updation(n);
                    f1.setVisible(true);

            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {

                    submitUpdatedDetails(n);
                    f1.dispose();
                    f0.setVisible(true);

            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                new MenuFrame(adminName);
            }
        });

    }

    protected void Updation(int n) {
        System.out.println("==================================================================");

        DBConnector db = new DBConnector();
        Connection con = db.connect();

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
                String str = rs4.getString("DOB");
                String as[] = str.split("/");

                cd4.setSelectedItem(String.valueOf(as[0]));
                cm4.setSelectedItem(String.valueOf(as[1]));
                cy4.setSelectedItem(String.valueOf(as[2]));

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


                c6.setSelectedItem(String.valueOf(rs12.getInt("YearOfPassOut")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void submitUpdatedDetails(int n) {

        DBConnector con = new DBConnector();
        Connection cc = con.connect();

        String SQL = "UPDATE `student` SET `StudentName`='" + String.valueOf(tf2.getText()) + "',`StudentGender`='" + String.valueOf(c1.getItemAt(c1.getSelectedIndex())) + "',`BloodGrp`='" + String.valueOf(c5.getItemAt(c5.getSelectedIndex())) + "',`DepartmentID`='" + String.valueOf(c2.getItemAt(c2.getSelectedIndex())) + "',`StudyStandard`='" + String.valueOf(c3.getItemAt(c3.getSelectedIndex())) + "',`DOB`='" + String.valueOf(cd4.getSelectedItem() + "/" + cm4.getSelectedItem() + "/" + cy4.getSelectedItem()) + "',`GuardianName`='" + String.valueOf(tf3.getText()) + "',`PhoneNumber`='" + Long.parseLong(tf9.getText()) + "',`PostalAddress`='" + String.valueOf(ta1.getText()) + "',`EmailAddress`='" + String.valueOf(tf8.getText()) + "',`Religion`='" + String.valueOf(c8.getItemAt(c8.getSelectedIndex())) + "',`DateOfAdmission`='" + String.valueOf(cd7.getSelectedItem() + "/" + cm7.getSelectedItem() + "/" + cy7.getSelectedItem()) + "',`YearOfPassOut`= " + Integer.parseInt(String.valueOf(c6.getItemAt(c6.getSelectedIndex()))) + " WHERE `StudentID` = " + n ;

        System.out.println(SQL);

        PreparedStatement ps;
        try {

            ps = cc.prepareStatement(SQL);

            int rs = ps.executeUpdate();


            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Student has been Updated");

            } else {
                JOptionPane.showMessageDialog(null, "Something went wrong, try again");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
