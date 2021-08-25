import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DisplayStudentFrame {

    Font font1 = new Font(Font.MONOSPACED,Font.BOLD,25);
    Font font2 = new Font(Font.SANS_SERIF,Font.BOLD,18);
    Font font3 = new Font(Font.DIALOG_INPUT,Font.BOLD,15);

    JFrame frame6 = new JFrame();

    JTable table;
    private JComboBox departmentBox;
    private JButton ok;
    private JLabel departmentLabel;

    JLabel showAdmin;
    String name;

    String[] Option = {"Select","CE","CSE","EE","ECE","IT","ME"};

    public DisplayStudentFrame(String adminName){

        showAdmin = new JLabel("YOU LOGGED IN AS : " + adminName);
        name = adminName;

        departmentLabel = new JLabel("Department Name :");
        departmentBox = new JComboBox(Option);
        ok = new JButton("OK");

        showAdmin.setFont(font1);
        showAdmin.setForeground(Color.yellow);
        showAdmin.setBounds(10,10,700,40);

        frame6.add(showAdmin);
        frame6.add(departmentLabel);
        frame6.add(departmentBox);
        frame6.add(ok);

        departmentLabel.setBounds(50,120,200,50);
        departmentLabel.setForeground(new Color(255, 255, 255));
        departmentLabel.setFont(font2);
        departmentBox.setBounds(230,130,150,30);
        ok.setBounds(165,230,150,30);

        ok.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                String deptName =  String.valueOf(departmentBox.getItemAt( departmentBox.getSelectedIndex()));
                DisplayTable(deptName);

            }
        });

        frame6.setSize(500,350); //400 width and 500 height
        frame6.getContentPane().setBackground(new Color(100,00,250));
        frame6.setLayout(null); //using no layout managers
        frame6.setVisible(true); //making the frame visible
        frame6.setResizable(false);
        frame6.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void DisplayTable(String deptName)
    {
        JFrame frame7 = new JFrame();

        table = new JTable();

        table.setBounds(10, 100, 1500, 130);



        frame7.add(table);

        frame7.setSize(1530,400); //400 width and 500 height
        frame7.getContentPane().setBackground(new Color(107, 0, 255));
        frame7.setLayout(null); //using no layout managers
        frame7.setVisible(true); //making the frame visible
        frame7.setResizable(true);
        frame7.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        DBConnector con = new DBConnector();
        Connection cc = con.connect();

        String str = "select * from student where DepartmentId = '"+deptName+"'";
        PreparedStatement ps;

        try {
            ps = cc.prepareStatement(str);
            ResultSet rs =ps.executeQuery(str);
            System.out.println(rs);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch( Exception e) {
            e.printStackTrace();
        }
        table.getColumnModel().getColumn(0).setPreferredWidth(1);
        table.getColumnModel().getColumn(1).setPreferredWidth(8);
         table.getColumnModel().getColumn(2).setPreferredWidth(5);
         table.getColumnModel().getColumn(3).setPreferredWidth(1);
         table.getColumnModel().getColumn(4).setPreferredWidth(1);
         table.getColumnModel().getColumn(5).setPreferredWidth(1);
         table.getColumnModel().getColumn(7).setPreferredWidth(8);
         table.getColumnModel().getColumn(11).setPreferredWidth(1);
         table.getColumnModel().getColumn(12).setPreferredWidth(1);
         table.getColumnModel().getColumn(13).setPreferredWidth(1);
         table.getColumnModel().getColumn(6).setPreferredWidth(4);
         table.getColumnModel().getColumn(8).setPreferredWidth(4);
//         table.getColumnModel().getColumn(0).setPreferredWidth(5);

    }

//	public static void main(String[] args) {
//
//	}
//
}