import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DisplayExamFrame {

    Font font1 = new Font(Font.MONOSPACED,Font.BOLD,30);
    Font font2 = new Font(Font.DIALOG_INPUT, Font.BOLD,15);

    JFrame frame4 = new JFrame();

    JTable table;
    private JComboBox departmentBox;
    private JButton homeButton;

    String[] Option = {"Select","CE","CSE","EE","ECE","IT","ME"};

    public DisplayExamFrame(String adminName) {


        JLabel frameLabel_1 = new JLabel("EXAM DATE LIST");
        JLabel frameLabel_2 = new JLabel("EXAM DATE LIST");
        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.addColumn("Department");
        tableModel.addColumn("Exam Date");

        homeButton = new JButton("Home");
        table = new JTable(tableModel);

        JScrollPane jScrollPane = new JScrollPane(table);

        frameLabel_1.setFont(font1);
        frameLabel_2.setFont(font1);
        table.setFont(font2);

        frameLabel_1.setForeground(new Color(255, 166, 0));
        frameLabel_2.setForeground(new Color(248, 238, 31));
        table.setBackground(Color.cyan);

        frameLabel_1.setBounds(118,1,300,50);
        frameLabel_2.setBounds(120,3,300,50);
        jScrollPane.setBounds(1, 60, 500, 122);
        homeButton.setBounds(150,200,150,30);

        frame4.add(frameLabel_1);
        frame4.add(frameLabel_2);
        frame4.add(jScrollPane);
        frame4.add(homeButton);

        frame4.setSize(500,300); //400 width and 500 height
        frame4.getContentPane().setBackground(new Color(100,0,250));
        frame4.setLayout(null); //using no layout managers
        frame4.setVisible(true); //making the frame visible
        frame4.setResizable(false);
        frame4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               new MenuFrame(adminName);
               frame4.dispose();

            }
        });

        DBConnector con = new DBConnector();
        Connection cc = con.connect();
        String str = "select d.departmentName as Department, e.DateOfExamination as 'Exam Date' from examination e, department d where d.departmentID = e.departmentID order by d.departmentName";
        PreparedStatement ps;
        try {

            ps = cc.prepareStatement(str);
            ResultSet rs =ps.executeQuery(str);
            System.out.println(rs);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            table.getColumnModel().getColumn(0).setPreferredWidth(250);

        }catch(Exception ignored) {}

    }
}


