import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxDemo extends JFrame implements ActionListener {
    JComboBox comboBox;
    ComboBoxDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals ={"Dog","Cat","Angry Bird"};
       // Integer [] animals = {1,2,3}; //Double

        comboBox = new JComboBox(animals);

        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("Horse");
        //comboBox.insertItemAt("pig", 0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("Cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true); 

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem()); //can use getSelectedIndex()
            //System.out.println(comboBox.getSelectedIndex());
        }
    } 
    public static void main(String[] args) {
        new ComboBoxDemo();
    }
}
