
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setTitle("JFrame title is here");//set title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent this from resized
        this.setSize(420,420); //sets the X-dimension and Y-dimension of this
        this.setVisible(true); //make this visible

        ImageIcon image = new ImageIcon("Image.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of this
        this.getContentPane().setBackground(new Color(123,50,250));// change background
    }
}
