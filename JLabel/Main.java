package JLabel;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
public class Main {
    public static void main(String[] args) {
        //JLabel = a GUI display are for a String of text,an image or both

        ImageIcon image = new ImageIcon("images.jpeg");
        Border border = BorderFactory.createLineBorder(Color.green,10);
        JLabel label =new JLabel(); //create a label
        label.setText("Bro Do You Even Code"); //set text of a label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text positon
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green);
        label.setFont(new Font("Arial",Font.PLAIN,20));
        label.setIconTextGap(20);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon and text 
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100, 110, 250, 250); // this will set x and y dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();//adjust with content


    }
}
