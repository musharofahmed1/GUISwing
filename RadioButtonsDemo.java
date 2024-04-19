import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;

public class RadioButtonsDemo extends JFrame implements ActionListener{
    //JRadioButton = One or more buttons in a grouping in which only 1
    // may be selected per group
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;
    RadioButtonsDemo(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon =  new ImageIcon("png");//can add image
        hamburgerIcon =  new ImageIcon(".png");//can add image
        hotdogIcon =  new ImageIcon(".png");//can add image

        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("HamBurger");
        hotdogButton = new JRadioButton("HotDog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);  
    }  


    public void actionPerformed(ActionEvent e){
        if(e.getSource()==pizzaButton){
            System.out.println("You Ordered pizza");
        }
        else if(e.getSource()==hamburgerButton){
            System.out.println("You Ordered HamBurger");
        }
        else if(e.getSource()==hotdogButton){
            System.out.println("You Ordered Hot Dog");
        }
}       
        public static void main(String[] args) {
        new RadioButtonsDemo();
    }
}
