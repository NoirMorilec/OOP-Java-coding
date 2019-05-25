import javax.swing.*;
public class SwingDemo {
    public SwingDemo(String str){
        JFrame frame = new JFrame("Flex");
        frame.setSize(550,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel image = new JLabel(new ImageIcon(str));

        frame.add(image);
        frame.setVisible(true);
    }
}