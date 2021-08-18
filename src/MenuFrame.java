import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame implements ActionListener {

    Font font1 = new Font(Font.MONOSPACED,Font.BOLD,25);
    Font font2 = new Font(Font.SANS_SERIF,Font.BOLD,17);
    Font font3 = new Font(Font.DIALOG_INPUT,Font.BOLD,13);

    JFrame frame2 = new JFrame();

    private JLabel showAdmin;
    private JButton admissionBtn,  updateStudentBtn, examDateUpdateBtn, showStudentBtn, showExamDateBtn,logOutBtn;
    private  String name;

    MenuFrame(String adminName){

        showAdmin = new JLabel("YOU LOGGED IN AS : " + adminName);
        name = adminName;

        admissionBtn = new JButton("Admission");
//        passOutUpdateBtn = new Button("Pass-Out Update");
        updateStudentBtn = new JButton("Update Student");
        examDateUpdateBtn = new JButton("Update Exam Date");
        showStudentBtn = new JButton("Display Student");
        showExamDateBtn = new JButton("Display Exam List");
        logOutBtn = new JButton("Log Out");

        showAdmin.setFont(font1);
        admissionBtn.setFont(font2);
//        passOutUpdateBtn.setFont(font2);
        updateStudentBtn.setFont(font2);
        examDateUpdateBtn.setFont(font2);
        showStudentBtn.setFont(font2);
        showExamDateBtn.setFont(font2);
        logOutBtn.setFont(font2);

        admissionBtn.setBackground(Color.yellow);
        updateStudentBtn.setBackground(Color.yellow);
        examDateUpdateBtn.setBackground(Color.yellow);
        showStudentBtn.setBackground(Color.yellow);
        showExamDateBtn.setBackground(Color.yellow);
        logOutBtn.setBackground(Color.cyan);

        showAdmin.setForeground(Color.yellow);
        admissionBtn.setForeground(Color.RED);
//        passOutUpdateBtn.setForeground(Color.RED);
        updateStudentBtn.setForeground(Color.RED);
        examDateUpdateBtn.setForeground(Color.RED);
        showStudentBtn.setForeground(Color.RED);
        showExamDateBtn.setForeground(Color.RED);
        logOutBtn.setForeground(Color.RED);

        showAdmin.setBounds(10,10,700,40);
        admissionBtn.setBounds(15,100,160,60);
        updateStudentBtn.setBounds(215,100,160,60);
        examDateUpdateBtn.setBounds(415,100,160,60);
//        passOutUpdateBtn.setBounds(10,60,120,60);
        showStudentBtn.setBounds(80,210,170,60);
        showExamDateBtn.setBounds(290,210,170,60);
        logOutBtn.setBounds(400,300,70,50);

        admissionBtn.addActionListener(this);
        updateStudentBtn.addActionListener(this);
        examDateUpdateBtn.addActionListener(this);
        showStudentBtn.addActionListener(this);
        showExamDateBtn.addActionListener(this);

        frame2.add(showAdmin);
        frame2.add(admissionBtn);
        frame2.add(showStudentBtn);
        frame2.add(updateStudentBtn);
        frame2.add(examDateUpdateBtn);
        frame2.add(showExamDateBtn);
        frame2.add(logOutBtn);

        frame2.setSize(600,400); //400 width and 500 height
        frame2.getContentPane().setBackground(new Color(100,00,250));
        frame2.setLayout(null);//using no layout managers
        frame2.setVisible(true);//making the frame visible
        frame2.setResizable(false);
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == admissionBtn){
            new AdmissionFrame(name);
            frame2.dispose();
        } else if ( e.getSource() == showStudentBtn ){
            new DisplayStudentFrame(name);
            frame2.dispose();
        } else if ( e.getSource() == updateStudentBtn ){
            new UpdateStudentFrame(name);
            frame2.dispose();
        } else if ( e.getSource() == examDateUpdateBtn ){
            new UpdateExamFrame(name);
            frame2.dispose();
        } else if ( e.getSource() == showExamDateBtn ) {
            new DisplayExamFrame(name);
            frame2.dispose();

        }

    }
}
