import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student {

    Student(String n){

        JFrame jFrame = new JFrame();

        DefaultTableModel tableModel = new DefaultTableModel();
        JTable jTable = new JTable(tableModel);

        tableModel.addColumn( "Student ID" );
        tableModel.addColumn( "Student Name" );
        tableModel.addColumn( "Gender" );
        tableModel.addColumn( "Blood Grp" );
        tableModel.addColumn( "Department" );
        tableModel.addColumn( "Study Standard" );
        tableModel.addColumn( "Date of Birth" );
        tableModel.addColumn( "Guardian Name" );
        tableModel.addColumn( "Phone Number" );
        tableModel.addColumn( "Postal Address" );
        tableModel.addColumn( "Email Address" );
        tableModel.addColumn( "Religion" );
        tableModel.addColumn( "Date of Admission" );
        tableModel.addColumn( "Year of Passout" );

        JScrollPane jScrollPane = new JScrollPane(jTable);

        jFrame.add(jScrollPane);
        jFrame.setVisible(true);
        jFrame.setSize(1590,500);


        jTable.getColumnModel().getColumn(1).setPreferredWidth(8);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(5);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(1);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(1);
        jTable.getColumnModel().getColumn(5).setPreferredWidth(1);
        jTable.getColumnModel().getColumn(7).setPreferredWidth(8);
        jTable.getColumnModel().getColumn(11).setPreferredWidth(1);
        jTable.getColumnModel().getColumn(12).setPreferredWidth(1);
        jTable.getColumnModel().getColumn(13).setPreferredWidth(1);
        jTable.getColumnModel().getColumn(6).setPreferredWidth(4);
        jTable.getColumnModel().getColumn(8).setPreferredWidth(4);

        DBConnector con = new DBConnector();
        Connection cc = con.connect();
        String str = "select * from student ";
        PreparedStatement ps;
        try {


            ps = cc.prepareStatement(str);
            ResultSet rs =ps.executeQuery(str);
            System.out.println(rs);
            jTable.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ignored) {}

    }
    public static void main(String[] args) {
        new DisplayExamFrame ("Hitick");
    }

}
