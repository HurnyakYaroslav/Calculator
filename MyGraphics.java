import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyGraphics {
    private static JFrame jFrame = new JFrame();
    private static JTextField jTextField1 = new JTextField();
    private static JTextField jTextField2 = new JTextField();
    private static JTextField jTextField3 = new JTextField();
    public static void draw(){
        jFrame.getContentPane().setBackground(Color.gray);
        jFrame.setBounds(800, 200, 300,150);
        jFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        jFrame.setVisible(true);
        JPanel  buttonPanel = drawButtons();
        jFrame.setLayout(null);
        jFrame.add(buttonPanel);
        jFrame.setVisible(true);
        jFrame.repaint();
        JPanel textPanel = textButtons();
        jFrame.add(textPanel);
        jFrame.repaint();


    }
    //jPanel.setBounds(800, 200, 100,150);


    private static   JPanel textButtons(){
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.darkGray);
        jPanel.setBounds(20,20,240,70);
       // jPanel.setBounds();
       // JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(10,10,100,20);
       // JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(120,10,100,20);
//        JTextField jTextField3 = new JTextField();
        jTextField3.setBounds(70,35,100,20);
        jPanel.add(jTextField1);
        jPanel.add(jTextField2);
        jPanel.add(jTextField3);
        jPanel.setVisible(true);
     return jPanel;
    }

    private static JPanel drawButtons(){
        JPanel jPanel = new JPanel();
        jPanel.setBounds(0, 80, 300,30);
        jPanel.setBackground(Color.gray);
        jPanel.setVisible(true);
        JButton button1 = new JButton("+");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double d1 =  Double.parseDouble(jTextField1.getText());
                Double d2 =  Double.parseDouble(jTextField2.getText());
                Double d3=d1+d2;
                jTextField3.setText(d3.toString());
            }
        });
        JButton button2 = new JButton("-");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double d1 =  Double.parseDouble(jTextField1.getText());
                Double d2 =  Double.parseDouble(jTextField2.getText());
                Double d3=d1-d2;
                jTextField3.setText(d3.toString());
            }
        });
        JButton button3 = new JButton("*");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double d1 =  Double.parseDouble(jTextField1.getText());
                Double d2 =  Double.parseDouble(jTextField2.getText());
                Double d3=d1*d2;
                jTextField3.setText(d3.toString());
            }
        });
        JButton button4 = new JButton("/");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double d1 =  Double.parseDouble(jTextField1.getText());
                Double d2 =  Double.parseDouble(jTextField2.getText());
                Double d3=d1/d2;
                jTextField3.setText(d3.toString());
            }
        });
        jPanel.add(button1);
        jPanel.add(button2);
        jPanel.add(button3);
        jPanel.add(button4);

        return jPanel;
    }

}
