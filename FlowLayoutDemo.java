import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class FlowLayoutDemo {
    public static void main(String[] args) {
        //Layout Manager = Defines the natural Layout for components within a container

        //Flow Layout = Palaces components in a row, sized at their preferred size.
        //              If the horizontal space in the container is too small 
        //              The FlowLayout classes uses the next available row.
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
        
        JPanel panel =new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());
        //JButton button1 = new JButton();
        //frame.add(button1);
        //-----------------------another way----------------------

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));


        frame.add(panel);
        frame.setVisible(true);

    }
}
