import javax.swing.*;
import java.awt.*;

class MyGraphics {
    private static JFrame jFrame = new JFrame();

    public static void draw(){
        jFrame.getContentPane().setBackground(Color.blue);
        jFrame.setBounds(800, 200, 300,150);
        jFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        jFrame.setVisible(true);
    }
    //jPanel.setBounds(800, 200, 100,150);

    private void drawButtons(){
        JPanel jPanel = new JPanel();
        jPanel.setBounds(800, 200, 100,150);

    }
}
