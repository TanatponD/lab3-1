import javax.swing.*;

public class Main {
    public static void main(String[] Args) {
        String input = JOptionPane.showInputDialog("Insert Number : ", 0);
        JOptionPane.showMessageDialog(null, input, "title", JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null, "Do you love me ?"
                , "Answer me 1"
                , JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,"Jub Jub ");
        }else
        {
            JOptionPane.showMessageDialog(null,"I'm so sad :(");
        }
    }
}
