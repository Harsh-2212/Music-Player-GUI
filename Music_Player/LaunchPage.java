package Music_Player;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.PlainDocument;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static javax.swing.text.StyleConstants.Bold;

public class LaunchPage extends Frame implements ActionListener{
    JFrame frame = new JFrame();
    JButton button = new JButton("Login");
    LaunchPage() {

        JLabel label = new JLabel();
        JPanel panel = new JPanel();
        Border border = BorderFactory.createLineBorder(Color.darkGray, 3);
        ImageIcon img = new ImageIcon("C:\\Users\\Admin\\Desktop\\Dev-Cpp\\New folder\\Music Player\\Sangeetic(2).jpg");
        frame.setBounds(10,10,480,640);
        frame.setVisible(true);
        frame.setTitle("Sangeetic");
        frame.getContentPane().setBackground(new Color(128, 0, 255, 255));
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setIconImage(img.getImage());
        frame.getContentPane().setLayout(null);

        panel.add(button);
        frame.add(panel);

        label.setIcon(img);
        label.setBounds(30, 60, 400, 400);
        //label.setBackground(new Color(0, 0, 0, 255));
        //label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBorder(border);

        frame.add(label);
        frame.add(button);



        button.setVisible(true);
        button.setBounds(110, 480, 240, 30);
        button.setForeground(new Color(0, 0, 0));
        button.setBackground(new Color(255, 255, 255));
        button.setFont(new FontUIResource("Times New Roman", Font.BOLD, 20));
        button.setBorder(border);
        button.setFocusable(false);
        button.addActionListener(this);


        button.addMouseListener(new MouseAdapter() {
            Color color = button.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = button.getBackground();
                button.setBackground(new Color(0,128,128,255)); // change the color to green when mouse over a button
            }

            public void mouseExited(MouseEvent me) {
                button.setBackground(color);
            }
        });
        button.addMouseListener(new MouseAdapter() {
            Color color = button.getForeground();
            public void mouseEntered(MouseEvent me) {
                color = button.getForeground();
                button.setForeground(new Color(128,255,128)); // change the color to green when mouse over a button
            }

            public void mouseExited(MouseEvent me) {
                button.setForeground(color);
            }
        });
    }


        @Override
        public void actionPerformed (ActionEvent e) {

            if (e.getSource() == button) {
                frame.dispose();
                submitFrame login =new submitFrame();
            }
    }
}

