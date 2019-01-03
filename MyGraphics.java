import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyGraphics {
    private static JFrame jFrame = new JFrame();

    public static void draw(){
        jFrame.getContentPane().setBackground(Color.blue);
        jFrame.setBounds(800, 200, 300,150);
        jFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        jFrame.setVisible(true);
        JPanel  buttonPanel = drawButtons();
        jFrame.setLayout(null);
        jFrame.add(buttonPanel);
        jFrame.setVisible(true);
        jFrame.repaint();

    }
    //jPanel.setBounds(800, 200, 100,150);

    private static JPanel drawButtons(){
        JPanel jPanel = new JPanel();
        jPanel.setBounds(0, 80, 300,30);
        jPanel.setBackground(Color.gray);
        jPanel.setVisible(true);
        JButton button1 = new JButton("+");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JButton button2 = new JButton("-");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JButton button3 = new JButton("*");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JButton button4 = new JButton("/");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jPanel.add(button1);
        jPanel.add(button2);
        jPanel.add(button3);
        jPanel.add(button4);

        return jPanel;
    }
}
