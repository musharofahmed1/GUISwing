import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class JOptionPaneDemo {
    public static void main(String[] args) {
        //JOptionPane = ppp up a standard dialog box that prompts users for a
        //              value or informs them of something

        //JOptionPane.showMessageDialog(null, "user text", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "info text", "info", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "question text", "question", JOptionPane.QUESTION_MESSAGE);
        //while(true){
           //  JOptionPane.showMessageDialog(null, "warning text", "warning", JOptionPane.WARNING_MESSAGE);
        //}
       
        //JOptionPane.showMessageDialog(null, "error text", "error", JOptionPane.ERROR_MESSAGE);
        //System.err.println(JOptionPane.showConfirmDialog(null, "ConfirmDialog Test", "Are You Ok", JOptionPane.YES_NO_CANCEL_OPTION));
        //int answer = JOptionPane.showConfirmDialog(null, "ConfirmDialog Test", "Are You Ok", JOptionPane.YES_NO_CANCEL_OPTION);
        String[] response = {"No,you're awesome,","Thank you","*blush*"};
        //String name = JOptionPane.showInputDialog("What is your name: ");
        ImageIcon icon = new ImageIcon("smile.png");
        JOptionPane.showOptionDialog(null, "You are awesome", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, response, 0);
    }
}
