import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SwingDemo implements ActionListener {
    public JLabel last_scorer = new JLabel("Последний лучший результат: ");
    public JLabel result = new JLabel("Результат: ");
    public JLabel winner = new JLabel("Победитель: ");
    public JLabel crutch = new JLabel("        ");

    public JButton first_club = new JButton("AC Milan");
    public JButton second_club = new JButton("Real Madrid");
    public int real_count;
    public int milan_count;
    public SwingDemo() {
        JFrame mainwindow = new JFrame("Футбол");
        mainwindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainwindow.setLayout(new GridLayout(4, 4));
        first_club.addActionListener(this);
        second_club.addActionListener(this);

        mainwindow.add(last_scorer);
        mainwindow.add(result);
        mainwindow.add(winner);
        mainwindow.add(crutch);
        mainwindow.add(first_club);
        mainwindow.add(second_club);
        mainwindow.setSize(500, 400);
        mainwindow.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("AC Milan")){
            last_scorer.setText("Последний лидирующий - AC Milan");
            milan_count++;
            result.setText(milan_count + " X " + real_count);
            if (milan_count > real_count){
                winner.setText("Победитель - AC Milan");
            }
        }
        else if(e.getActionCommand().equals("Real Madrid")) {
            last_scorer.setText("Последний лидирующий - Real Madrid");
            real_count++;
            result.setText(milan_count + " X " + real_count);
            if (milan_count < real_count){
                winner.setText("Победитель - Real Madrid");
            }
        }
    }
}
