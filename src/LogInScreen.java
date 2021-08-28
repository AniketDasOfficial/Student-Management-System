import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LogInScreen {

    Font font1 = new Font(Font.MONOSPACED,Font.BOLD,30);
    Font font2 = new Font(Font.DIALOG, Font.PLAIN,15);
    Font font3 = new Font(Font.DIALOG_INPUT,Font.BOLD,13);

    JFrame frame1 = new JFrame();
    private JLabel titleLabel, userNameLabel, passwordLabel;
    private JTextField userNameTF;
    private JPasswordField passwordTF;
    private JButton registerButton, logInButton;

    LogInScreen(){

        frame1.setLayout(null);


        titleLabel = new JLabel("Log In");
        userNameLabel = new JLabel("User Name : ");
        passwordLabel = new JLabel("Password : ");
        userNameTF = new JTextField();
        passwordTF = new JPasswordField();
        registerButton = new JButton("Register Now");
        logInButton = new JButton("Log In");

        titleLabel.setFont(font1);
        userNameLabel.setFont(font2);
        userNameTF.setFont(font2);
        passwordLabel.setFont(font2);
        passwordTF.setFont(font2);
        logInButton.setFont(font3);
        registerButton.setFont(font3);

        titleLabel.setForeground(new Color(250,250,250));
        userNameLabel.setForeground(new Color(250,250,250));
        passwordLabel.setForeground(new Color(250,250,250));


        titleLabel.setBounds(60,50,200,100);
        userNameLabel.setBounds(60,130,150,30);
        userNameTF.setBounds(160,130,250,30);
        passwordLabel.setBounds(60,170,150,30);
        passwordTF.setBounds(160,170,250,30);
        registerButton.setBounds(90,220,130,30);
        logInButton.setBounds(180, 220, 130,30);

        frame1.add(titleLabel);
        frame1.add(userNameLabel);
        frame1.add(passwordLabel);
        frame1.add(userNameTF);
        frame1.add(passwordTF);
        frame1.add(logInButton);
        frame1.getContentPane().setBackground(new Color(100,00,250));
        frame1.setSize(500,400);//400 width and 500 height
        frame1.setLayout(null);//using no layout managers
        frame1.setVisible(true);//making the frame visible
        frame1.setResizable(false);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verification(userNameTF.getText(), String.valueOf(passwordTF.getPassword()));
            }
        });

    }

    public static void main(String[] args) {
        new LogInScreen();
    }

    protected void verification(String name, String password){

        DBConnector db = new DBConnector();
        Connection con = db.connect();

        String sql = "SELECT * FROM adminlog WHERE adminPassword = '"+ password +"' AND adminName = '"+name + "'";

        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()){
                frame1.dispose();
                new MenuFrame(String.valueOf(userNameTF.getText()));

            }else {
                JOptionPane.showMessageDialog(null,"not verified");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
