package Music_Player;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login{
    public static void main(String[] args) {
        submitFrame frame = new submitFrame();
    }
}
class submitFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JLabel emailLabel = new JLabel("EMAIL-ID");
    JTextField userTextField = new JTextField();
    JTextField emailTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton submitButton = new JButton("SUBMIT");
    JButton resetButton = new JButton("RESET");
    //JCheckBox showPassword = new JCheckBox("Show Password");
    //JButton emailButton = new JButton("EMAIL-ID");


    public submitFrame(){
        ImageIcon img = new ImageIcon("C:\\Users\\Admin\\Desktop\\Dev-Cpp\\New folder\\Music Player\\Sangeetic(2).jpg");
        this.setIconImage(img.getImage());
        this.setTitle("Sangeetic");
        this.setVisible(true);
        this.setBounds(10,10,370,600);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(140,100,255,255));
        //Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        //Setting location and Size of each components using setBounds() method.
        userLabel.setBounds(50, 150, 100, 30);
        userLabel.setForeground(Color.white);
        userLabel.setFont(new FontUIResource("Algerian",Font.ITALIC,15));
        passwordLabel.setBounds(50, 220, 100, 30);
        passwordLabel.setForeground(Color.white);
        passwordLabel.setFont(new FontUIResource("Algerian",Font.ITALIC,15));
        emailLabel.setBounds(50, 290, 100, 30);
        emailLabel.setForeground(Color.white);
        emailLabel.setFont(new FontUIResource("Algerian",Font.ITALIC,15));
        userTextField.setBounds(150, 150, 150, 30);
        userTextField.setFont(new FontUIResource("Times_New_Roman",Font.BOLD,15));
        passwordField.setBounds(150, 220, 150, 30);
        passwordField.setFont(new FontUIResource("Times_New_Roman",Font.BOLD,15));
        emailTextField.setBounds(150, 290, 150, 30);
        submitButton.setBounds(80, 350, 200, 35);
        submitButton.setFont(new FontUIResource("Serif",Font.BOLD,14));
        submitButton.addActionListener(this);
        submitButton.setBackground(new Color(0,0,0));
        submitButton.setForeground(new Color(255,255,255));
        resetButton.setBounds(80, 400, 200, 35);
        resetButton.setFont(new FontUIResource("Serif",Font.BOLD,15));
        resetButton.addActionListener(this);
        resetButton.setBackground(new Color(0,0,0));
        resetButton.setForeground(new Color(255,255,255));
        //emailButton.setBounds(80, 450, 200, 35);
    }

    public void addComponentsToContainer() {
        //Adding each components to the Container
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(emailLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(emailTextField);
        //container.add(showPassword);
        container.add(submitButton);
        container.add(resetButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetButton){
            new LaunchPage();
        }
    }
}


