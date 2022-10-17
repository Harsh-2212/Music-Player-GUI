package Music_Player;

import Music_Player.LaunchPage;

public class Frame {
        public static void main(String[] args) {

              /*  JFrame frame = new JFrame();
                JLabel label = new JLabel();
                JButton button = new JButton("Login");
                Border border = BorderFactory.createLineBorder(Color.darkGray, 3);
                ImageIcon img = new ImageIcon("C:\\Users\\Admin\\Desktop\\Dev-Cpp\\New folder\\Music Player\\Sangeetic(2).jpg");
                frame.setSize(720, 1080);
                frame.setVisible(false);
                frame.setTitle("Sangeetic");
                frame.getContentPane().setBackground(new Color(0, 0, 0, 255));
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setIconImage(img.getImage());
                frame.setLayout(null);
                label.setIcon(img);
                label.setBounds(170, 50, 400, 420);
                //label.setBackground(new Color(0, 0, 0, 255));
                //label.setOpaque(true);
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setVerticalAlignment(JLabel.CENTER);
                label.setBorder(border);
                frame.add(label);

                /*frame.add(button);
                button.setVisible(true);
                button.setBounds(240, 500, 270, 30);
                button.setForeground(new Color(0, 0, 0));
                button.setBackground(new Color(255, 255, 255));
                button.setFont(new FontUIResource("Times New Roman", Font.BOLD, 20));
                button.setBorder(border);

                {

                        //class RollOverButtonTest extends JFrame {
                        //private JButton button;
                        // public RollOverButtonTest() {
                        //       setTitle("RollOverButton Test");
                        //    button = new JButton("Rollover Button");
                        button.addMouseListener(new MouseAdapter() {
                                Color color = button.getBackground();

                                public void mouseEntered(MouseEvent me) {
                                        color = button.getBackground();
                                        button.setBackground(Color.black); // change the color to green when mouse over a button
                                }

                                public void mouseExited(MouseEvent me) {
                                        button.setBackground(color);
                                }
                        });
                        button.addMouseListener(new MouseAdapter() {
                                Color color = button.getForeground();

                                public void mouseEntered(MouseEvent me) {
                                        color = button.getForeground();
                                        button.setForeground(Color.white); // change the color to green when mouse over a button
                                }

                                public void mouseExited(MouseEvent me) {
                                        button.setForeground(color);
                                }
                        });

            /*JButton button2 = new JButton("Sign Up");
            frame.add(button2);
            button2.setVisible(true);
            button2.setBounds(420,500,150,30);
            button2.setForeground(new Color(0,0,0));
            button2.setBackground(new Color(255,255,255));
            button2.setFont(new FontUIResource("Arial",Font.BOLD,20));*/
                        LaunchPage launch = new LaunchPage();
                }
        }


