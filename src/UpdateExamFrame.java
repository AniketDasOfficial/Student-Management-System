import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExamFrame {
    Font font1 = new Font(Font.MONOSPACED,Font.BOLD,25);
    Font font2 = new Font(Font.SANS_SERIF,Font.BOLD,18);
    Font font3 = new Font(Font.DIALOG_INPUT,Font.BOLD,15);
    JFrame frame3 = new JFrame();
    private JLabel updateExamDate, dateLabel,departmentLabel;
    private JTextField dateField;
    private JComboBox departmentBox;
    private JButton submit,returnMenu;
    String[] Option = {"Select","CE","CSE","EE","ECE","IT","ME"};
    JLabel showAdmin;
    String name,department,edate;
    public UpdateExamFrame(String adminName) {
        showAdmin = new JLabel("YOU LOGGED IN AS : " + adminName);
        name = adminName;
        updateExamDate = new JLabel("Update Exam Date");
        departmentLabel = new JLabel("Department Name :");
        departmentBox = new JComboBox(Option);
        dateLabel = new JLabel("Exam Date :");
        dateField = new JTextField();
        submit = new JButton("UPDATE");
        returnMenu = new JButton("HOME");
        showAdmin.setFont(font1);
        showAdmin.setForeground(Color.yellow);
        showAdmin.setBounds(10,10,700,40);
        frame3.add(showAdmin);
        frame3.add(updateExamDate);
        frame3.add(departmentLabel);
        frame3.add(departmentBox);
        frame3.add(dateLabel);
        frame3.add(dateField);
        frame3.add(submit);
        frame3.add(returnMenu);
        updateExamDate.setBounds(60,50,200,100);
        departmentLabel.setBounds(60,130,150,30);
        departmentBox.setBounds(230,130,150,30);
        dateLabel.setBounds(60,170,150,30);
        dateField.setBounds(230,170,150,30);
        submit.setBounds(50,230,150,30);
        returnMenu.setBounds(250,230,150,30);
        updateExamDate.setForeground(new Color(250,250,250));
        departmentLabel.setForeground(new Color(250,250,250));
        dateLabel.setForeground(new Color(250,250,250));
        departmentBox.setBackground(new Color(220, 220, 250));
        updateExamDate.setFont(font2);
        departmentLabel.setFont(font3);
        dateLabel.setFont(font3);
        returnMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame3.dispose();
                new MenuFrame(adminName);
            }
        });
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
			    department = String.valueOf(departmentBox.getItemAt(departmentBox.getSelectedIndex()));
     		    edate = String.valueOf(dateField.getText());
	    		insertion();
                new MenuFrame(adminName);
            }
        });
        frame3.setSize(500,350); //400 width and 500 height
        frame3.getContentPane().setBackground(new Color(100,00,250));
        frame3.setLayout(null); //using no layout managers
        frame3.setVisible(true); //making the frame visible
        frame3.setResizable(false);
        frame3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    protected void insertion() {
        DBConnector con = new DBConnector();
        Connection cc = con.connect();
        String sql = "UPDATE `examination` SET `DateOfExamination`= ? WHERE `DepartmentID`= ?";
        PreparedStatement ps;
        try {
            ps = cc.prepareStatement(sql);
            ps.setString(1, edate);
            ps.setString(2, department);
            int rs = ps.executeUpdate();
            if(rs >0) {
                JOptionPane.showMessageDialog(null, "Exam Date Updated");
                frame3.dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "Try again");
            }
        }
        catch (SQLException e) { e.printStackTrace(); }
    }
}