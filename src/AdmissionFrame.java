import javax.swing.*;
import javax.swing.text.StyledEditorKit.BoldAction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdmissionFrame {
    JFrame f1 = new JFrame();
    private JLabel l, l0, l00, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;
    private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12, tf13, tf14;
    private JComboBox c1;
    private JButton b1;
    private String admin;

    AdmissionFrame(String adminName) {

        l = new JLabel("You are Logged in as : " + admin);
        Font h = new Font(Font.DIALOG_INPUT, Font.BOLD, 30);
        l.setBounds(30, -225, 600, 500);
        l.setFont(h);

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
        l1.setBounds(100, 129, 350, 35);
        tf1 = new JTextField();
        Font h2 = new Font(Font.SERIF, Font.HANGING_BASELINE, 25);
        tf1.setFont(h2);
        tf1.setBackground(new Color(220, 220, 250));
        tf1.setBounds(250, 130, 310, 35);

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
        l3.setBounds(25, 200, 350, 35);
        tf3 = new JTextField();
        tf3.setBackground(new Color(220, 220, 250));
        tf3.setFont(h2);
        tf3.setBounds(250, 200, 310, 35);

        l4 = new JLabel("Blood Group : ");
        l4.setForeground(new Color(153, 255, 255));
        l4.setFont(h1);
        l4.setBounds(715, 195, 350, 35);
        tf4 = new JTextField();
        tf4.setBackground(new Color(220, 220, 250));
        tf4.setFont(h2);
        tf4.setBounds(900, 195, 310, 35);

        l5 = new JLabel("Department Name : ");
        l5.setForeground(new Color(153, 255, 255));
        l5.setFont(h1);
        l5.setBounds(13, 275, 350, 35);
        tf5 = new JTextField();
        tf5.setBackground(new Color(220, 220, 250));
        tf5.setFont(h2);
        tf5.setBounds(250, 275, 310, 35);

        l6 = new JLabel("Gender : ");
        l6.setForeground(new Color(153, 255, 255));
        l6.setFont(h1);
        l6.setBounds(135, 345, 350, 35);
        String country[] = { "Choose Gender", "Male", "Female", "Others" };
        c1 = new JComboBox(country);
        c1.setFont(h2);
        c1.setBounds(250, 345, 310, 35);

        l7 = new JLabel("Studing Standerd : ");
        l7.setForeground(new Color(153, 255, 255));
        l7.setFont(h1);
        l7.setBounds(660, 268, 350, 35);
        tf6 = new JTextField();
        tf6.setBackground(new Color(220, 220, 250));
        tf6.setFont(h2);
        tf6.setBounds(900, 268, 310, 35);

        l8 = new JLabel("Date Of Birth : ");
        l8.setForeground(new Color(153, 255, 255));
        l8.setFont(h1);
        l8.setBounds(710, 340, 350, 35);
        tf7 = new JTextField();
        tf7.setBackground(new Color(220, 220, 250));
        tf7.setFont(h2);
        tf7.setBounds(900, 340, 310, 35);

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
        l10.setBounds(45, 410, 350, 35);
        tf9 = new JTextField();
        tf9.setBackground(new Color(220, 220, 250));
        tf9.setFont(h2);
        tf9.setBounds(250, 410, 310, 35);

        l11 = new JLabel("Postal Address : ");
        l11.setForeground(new Color(153, 255, 255));
        l11.setFont(h1);
        l11.setBounds(45, 480, 350, 35);
        tf10 = new JTextField();
        tf10.setBackground(new Color(220, 220, 250));
        tf10.setFont(h2);
        tf10.setBounds(250, 480, 960, 35);

        l12 = new JLabel("Date of Addmission : ");
        l12.setForeground(new Color(153, 255, 255));
        l12.setFont(h1);
        l12.setBounds(15, 550, 350, 35);
        tf11 = new JTextField();
        tf11.setBackground(new Color(220, 220, 250));
        tf11.setFont(h2);
        tf11.setBounds(270, 550, 310, 35);

        l13 = new JLabel("Year of Passout : ");
        l13.setForeground(new Color(153, 255, 255));
        l13.setFont(h1);
        l13.setBounds(675, 550, 350, 35);
        tf12 = new JTextField();
        tf12.setBackground(new Color(220, 220, 250));
        tf12.setFont(h2);
        tf12.setBounds(900, 550, 310, 35);

        l14 = new JLabel("Religion : ");
        l14.setForeground(new Color(153, 255, 255));
        l14.setFont(h1);
        l14.setBounds(450, 610, 350, 35);
        tf13 = new JTextField();
        tf13.setBackground(new Color(220, 220, 250));
        tf13.setFont(h2);
        tf13.setBounds(590, 610, 310, 35);

        b1 = new JButton("SUBMIT");
        b1.setBounds(1090, 660, 100, 35);


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
        f1.add(tf4);
        f1.add(l5);
        f1.add(tf5);
        f1.add(c1);
        f1.add(l6);
        f1.add(c1);
        f1.add(l7);
        f1.add(tf6);
        f1.add(l8);
        f1.add(tf7);
        f1.add(l9);
        f1.add(tf8);
        f1.add(l10);
        f1.add(tf9);
        f1.add(l11);
        f1.add(tf10);
        f1.add(l12);
        f1.add(tf11);
        f1.add(l13);
        f1.add(tf12);
        f1.add(l14);
        f1.add(tf13);
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
                if(e.getSource()==b1){

                }
            }
        });

    }

//    public static void main(String[] args) {
//        new AdmissionFrame("Zorbec");
//    }
}
