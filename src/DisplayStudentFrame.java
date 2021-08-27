import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DisplayStudentFrame {

    Font font1 = new Font(Font.MONOSPACED,Font.BOLD,20);
    Font font2 = new Font(Font.SANS_SERIF,Font.BOLD,18);
    Font font3 = new Font(Font.DIALOG_INPUT,Font.BOLD,50);
    Font font4 = new Font(Font.SANS_SERIF,Font.BOLD,9);

    JFrame frame6 = new JFrame();

    JTable table;
    private JComboBox departmentBox;
    private JButton ok,homeButton;
    private JLabel departmentLabel;

    JLabel showAdmin;
    String name;

    String[] Option = {"Select","CE","CSE","EE","ECE","IT","ME"};

    public DisplayStudentFrame(String adminName){

        showAdmin = new JLabel("YOU LOGGED IN AS : " + adminName);
        name = adminName;

        departmentLabel = new JLabel("Department Name :");
        departmentBox = new JComboBox(Option);
        ok = new JButton("SUBMIT");
        homeButton = new JButton("HOME");

        showAdmin.setFont(font1);
        showAdmin.setForeground(Color.yellow);
        showAdmin.setBounds(10,10,700,40);

        frame6.add(showAdmin);
        frame6.add(departmentLabel);
        frame6.add(departmentBox);
        frame6.add(ok);
        frame6.add(homeButton);

        departmentLabel.setForeground(new Color(255, 255, 255));
        departmentLabel.setFont(font2);

        departmentLabel.setBounds(60,120,200,50);
        departmentBox.setBounds(265,130,150,30);
        ok.setBounds(60,230,150,30);
        homeButton.setBounds(265,230,150,30);

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

        JLabel frameLabel_1 = new JLabel("STUDENT LIST");
        JLabel frameLabel_2 = new JLabel("STUDENT LIST");

        frameLabel_1.setFont(font3);
        frameLabel_2.setFont(font3);

        frameLabel_1.setForeground(new Color(255, 166, 0));
        frameLabel_2.setForeground(new Color(248, 238, 31));

        frameLabel_1.setBounds(550,0,500,145);
        frameLabel_2.setBounds(552,2,500,145);

        frame7.add(frameLabel_1);
        frame7.add(frameLabel_2);

        table = new JTable();

        table.setBounds(1, 150, 1550, 2000);

        table.setBackground(Color.cyan);
        
        table.setFont(font4);

        frame7.add(table);

        frame7.setSize(1590,500); //400 width and 500 height
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

    }

//	public static void main(String[] args) {
//
//	}
//
}