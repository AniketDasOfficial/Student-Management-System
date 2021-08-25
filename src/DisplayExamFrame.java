import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DisplayExamFrame {

    Font font1 = new Font(Font.MONOSPACED,Font.BOLD,25);
    Font font2 = new Font(Font.SANS_SERIF,Font.BOLD,18);
    Font font3 = new Font(Font.DIALOG_INPUT,Font.BOLD,15);

    JFrame frame4 = new JFrame();

    JTable table;
    private JComboBox departmentBox;
    private JButton ok;
    private JLabel departmentLabel;
    JLabel showAdmin;
    String name;

    String[] Option = {"Select","CE","CSE","EE","ECE","IT","ME"};

    public DisplayExamFrame(String adminName) {

        showAdmin = new JLabel("YOU LOGGED IN AS : " + adminName);
        name = adminName;

//        departmentLabel = new JLabel("Department Name :");
//        departmentBox = new JComboBox(Option);
        ok = new JButton("Home");

        showAdmin.setFont(font1);
        showAdmin.setForeground(Color.yellow);
        showAdmin.setBounds(10,10,700,40);
        table = new JTable();

        table.setBounds(10, 60, 460, 95);
        frame4.add(showAdmin);
        frame4.add(table);
//        frame4.add(departmentLabel);
//        frame4.add(departmentBox);
        frame4.add(ok);
//
//        departmentLabel.setBounds(60,130,150,30);
//        departmentBox.setBounds(230,130,150,30);
        ok.setBounds(150,200,150,30);

        ok.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {

               new MenuFrame(adminName);
               frame4.dispose();

            }
        });
        DBConnector con = new DBConnector();
        Connection cc = con.connect();
        String str = "select * from examination ";
        PreparedStatement ps;
        try {


            ps = cc.prepareStatement(str);
            ResultSet rs =ps.executeQuery(str);
            System.out.println(rs);
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ignored) {}


        frame4.setSize(500,300); //400 width and 500 height
        frame4.getContentPane().setBackground(new Color(100,00,250));
        frame4.setLayout(null); //using no layout managers
        frame4.setVisible(true); //making the frame visible
        frame4.setResizable(false);
        frame4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void DisplayTable(String deptName)
    {
        JFrame frame5 = new JFrame();

        table = new JTable();

        table.setBounds(10, 10, 460, 20);
        frame5.add(table);

        frame5.setSize(500,80); //400 width and 500 height
        frame5.getContentPane().setBackground(new Color(100,00,250));
        frame5.setLayout(null); //using no layout managers
        frame5.setVisible(true); //making the frame visible
        frame5.setResizable(false);
        frame5.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        DBConnector con = new DBConnector();
        Connection cc = con.connect();
        String str = "select * from examination where DepartmentId = '"+deptName+"'";
        PreparedStatement ps;
        try {


            ps = cc.prepareStatement(str);
            ResultSet rs =ps.executeQuery(str);
            System.out.println(rs);
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ignored) {}

    }


//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		new DisplayExamFrame("anirban");
//
//		new DisplayExamFrame("bdbed");
//	}

}

//import javax.swing.*;
//import java.awt.*;
//
//public class DisplayExamFrame {
//
//    Font font1 = new Font(Font.MONOSPACED,Font.BOLD,25);
//    Font font2 = new Font(Font.SANS_SERIF,Font.BOLD,18);
//    Font font3 = new Font(Font.DIALOG_INPUT,Font.BOLD,15);
//
//    JFrame frame4 = new JFrame();
//
//    JTable table;
//    JLabel showAdmin;
//    String name;
//
//    public DisplayExamFrame(String adminName) {
//
//
//
//
//
//
//            showAdmin = new JLabel("YOU LOGGED IN AS : " + adminName);
//            name = adminName;
//
//            showAdmin.setFont(font1);
//            showAdmin.setForeground(Color.yellow);
//            showAdmin.setBounds(10,10,700,40);
//
//            table = new JTable();
//            table.setBounds(38, 350, 770, 130);
//            frame4.add(table);
//
//            frame4.add(showAdmin);
//
//            frame4.setSize(500,350); //400 width and 500 height
//            frame4.getContentPane().setBackground(new Color(100,00,250));
//            frame4.setLayout(null); //using no layout managers
//            frame4.setVisible(true); //making the frame visible
//            frame4.setResizable(false);
//            frame4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//
//        }
//}
