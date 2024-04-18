import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
public class MyButton extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyButton() {
        ImageIcon originalIcon = new ImageIcon("OIP.jpeg");
        // Scale the image to a smaller size
        Image scaledImage = originalIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        ImageIcon icon2 = new ImageIcon("thumb.png");
        
        
        label= new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,200,300,200);
        label.setVisible(false);
        button = new JButton();
        button.setBounds(200, 100, 200, 100);
        button.addActionListener(this);
        button.setText("Click");
        button.setFocusable(false);
        button.setIcon(scaledIcon); // Set the scaled icon
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-10);
        button.setForeground(Color.yellow);
        button.setBackground(Color.green);
        button.setBorder(BorderFactory.createEtchedBorder());
        //
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            //System.out.println("It Works");
            //button.setEnabled(false);
            label.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyButton();
    }
}
