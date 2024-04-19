import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;

public class CheckBoxesDemo extends JFrame implements ActionListener{
    JButton button;
    JCheckBox checkBox ;
    CheckBoxesDemo(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    button = new JButton();
    button.setText("submit");
    button.addActionListener(this);

    checkBox = new JCheckBox();
    checkBox.setText("I am not Robot");
    checkBox.setFocusable(false);
    checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
    this.add(button);
    this.add(checkBox);
    this.pack();
    this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }
    }
    public static void main(String[] args) {
        CheckBoxesDemo checkBoxesDemo = new CheckBoxesDemo();
    }
}
