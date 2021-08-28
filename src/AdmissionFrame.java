import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdmissionFrame {


    JFrame f1 = new JFrame();
    private JLabel l, l0, l00, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;
    private JTextField tf1, tf2, tf3, tf8, tf9;
    private JComboBox c1, c2, c3, cd4, cm4, cy4, c5, c6, cd7, cm7, cy7, c8;
    private JButton b1;
    private TextArea ta1;
    int no2;




    AdmissionFrame(String adminName) {

        l = new JLabel("You are Logged in as : " + adminName);
        Font h = new Font(Font.DIALOG_INPUT, Font.BOLD, 30);
        l.setBounds(30, -225, 600, 500);
        l.setFont(h);
        l.setForeground(Color.yellow);

        l0 = new JLabel("ENTER STUDENT DETAILS");
        l0.setForeground(new Color(0, 191, 255));
        Font h0 = new Font(Font.SANS_SERIF, Font.BOLD, 40);
        l0.setFont(h0);
        l0.setBounds(420, -180, 600, 500);

        l00 = new JLabel("ENTER STUDENT DETAILS");
        l00.setForeground(new Color(0, 255, 255));
        l00.setFont(h0);
        l00.setBounds(423, -178, 600, 500);

        l1 = new JLabel("Student ID : ");
        l1.setForeground(new Color(153, 255, 255));
        Font h1 = new Font(Font.SANS_SERIF, Font.BOLD, 25);
        l1.setFont(h1);
        l1.setBounds(125, 129, 350, 35);
        tf1 = new JTextField();
        Font h2 = new Font(Font.SERIF, Font.HANGING_BASELINE, 25);
        tf1.setFont(h2);
        tf1.setBackground(new Color(220, 220, 250));
        tf1.setBounds(290, 130, 310, 35);

        tf1.setText(String.valueOf(new LastEnteredStudentID().verification() + 1));
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
        c5.setBounds(900, 195, 310, 35);

        l5 = new JLabel("Department ID : ");
        l5.setForeground(new Color(153, 255, 255));
        l5.setFont(h1);
        l5.setBounds(75, 275, 350, 35);
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
        String country2[] = { "Choose your Year", "1 st", "2nd", "3rd", "4th" };
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
        String country5[] = { "YYYY", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
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
        String country9[] = { "YYYY", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022",
                "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" };
        cy7 = new JComboBox(country9);
        cy7.setFont(h2);
        cy7.setBounds(480, 615, 120, 35);

        l13 = new JLabel("Year of Passout : ");
        l13.setForeground(new Color(153, 255, 255));
        l13.setFont(h1);
        l13.setBounds(675, 485, 350, 35);
        String country10[] = { "YYYY", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025",
                "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034" };
        c6 = new JComboBox(country10);
        c6.setFont(h2);
        c6.setBounds(900, 485, 310, 35);

        l14 = new JLabel("Religion : ");
        l14.setForeground(new Color(153, 255, 255));
        l14.setFont(h1);
        l14.setBounds(770, 560, 350, 35);
        // tf13 = new JTextField();
        // tf13.setBackground(new Color(220, 220, 250));
        // tf13.setFont(h2);
        // tf13.setBounds(900, 560, 310, 35);
        String country11[] = { "Choose Your Religion", "Hinduism", "Islam", "Cristianity", "Buddhism", "Others" };
        c8 = new JComboBox(country11);
        c8.setFont(h2);
        c8.setBounds(900, 560, 310, 35);

        b1 = new JButton("SUBMIT");
        b1.setBounds(1000, 640, 100, 35);

        f1.setLayout(null);

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
        // f1.add(tf13);
        f1.add(c8);
        f1.add(b1);

        f1.getContentPane().setBackground(new Color(100, 00, 250));
        f1.setSize(1365, 770);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1) {
                    new MenuFrame(adminName);
                    f1.dispose();
                    insertion();
                }
            }
        });

    }

    protected void insertion() {

        DBConnector con = new DBConnector();
        Connection cc = con.connect();

        no2 = Integer.parseInt(String.valueOf(c6.getItemAt(c6.getSelectedIndex())));


        String sql = " INSERT INTO `student`(`StudentID`, `StudentName`, `StudentGender`, `BloodGrp`, `DepartmentID`, `StudyStandard`, `DOB`," +
                " `GuardianName`, `PhoneNumber`, `PostalAddress`, `EmailAddress`, `Religion`, `DateOfAdmission`, `YearOfPassOut`) VALUES ("
                + Integer.parseInt(tf1.getText()) + ", '" + String.valueOf(tf2.getText()) + "', '"
                + String.valueOf(c1.getItemAt(c1.getSelectedIndex())) + "', '"
                + String.valueOf(c5.getItemAt(c5.getSelectedIndex())) + "', '"
                + String.valueOf(c2.getItemAt(c2.getSelectedIndex())) + "', '"
                + String.valueOf(c3.getItemAt(c3.getSelectedIndex())) + "', '"
                + String.valueOf(cd4.getSelectedItem() + "/" + cm4.getSelectedItem() + "/" + cy4.getSelectedItem())
                + "', '" + String.valueOf(tf3.getText()) + "', " + Long.parseLong(tf9.getText()) + ", '"
                + String.valueOf(ta1.getText()) + "', '" + String.valueOf(tf8.getText()) + "', '"
                + String.valueOf(c8.getItemAt(c8.getSelectedIndex())) + "', '"
                + String.valueOf(cd7.getSelectedItem() + "/" + cm7.getSelectedItem() + "/" + cy7.getSelectedItem())
                + "', " + no2 + ")";
        System.out.println(sql);

        PreparedStatement ps;
        try {

            ps = cc.prepareStatement(sql);

            int rs = ps.executeUpdate();


            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Student has been registered");

            } else {
                JOptionPane.showMessageDialog(null, "Something went wrong, try again");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
