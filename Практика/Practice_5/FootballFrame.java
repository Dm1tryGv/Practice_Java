package Practice.Practice_5;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballFrame extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;

    public int milan = 0;
    public int madrid = 0;

    public FootballFrame(){
        super("Football");
        CreateGUI();
    }

    private void CreateGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();

        label1 = new JLabel("AC Milan  " + milan + " : " + madrid + "  Real Madrid", JLabel.CENTER);
        panel1.add(label1);

        getContentPane().add(BorderLayout.NORTH, panel1);


        JPanel panel2 = new JPanel();

        JButton button1 = new JButton("AC Milan");
        panel2.add(button1);

        JButton button2 = new JButton("Real Madrid");
        panel2.add(button2);

        getContentPane().add(panel2);

        JPanel panel3 = new JPanel();

        label2 = new JLabel("Last Scorer: N/A");

        label4 = new JLabel("     ");

        label3 = new JLabel("Winner: DRAW");

        panel3.add(label2);
        panel3.add(label4);
        panel3.add(label3);

        getContentPane().add(BorderLayout.SOUTH, panel3);


        ActionListener actionListener1 = new Milan();
        ActionListener actionListener2 = new Madrid();

        button1.addActionListener(actionListener1);
        button2.addActionListener(actionListener2);
    }

    public class Milan implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            milan += 1;
            label1.setText("AC Milan  " + milan + " : " + madrid + "  Real Madrid");
            label2.setText("Last Scorer: AC Milan");
            if (milan > madrid){
                label3.setText("Winner: AC Milan");
            } else if (milan < madrid) {
                label3.setText("Winner: Real Madrid");
            } else {
                label3.setText("Winner: DRAW");
            }
        }
    }

    public class Madrid implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            madrid += 1;
            label1.setText("AC Milan  " + milan + " : " + madrid + "  Real Madrid");
            label2.setText("Last Scorer: Real Madrid");
            if (milan > madrid){
                label3.setText("Winner: AC Milan");
            } else if (milan < madrid) {
                label3.setText("Winner: Real Madrid");
            } else {
                label3.setText("Winner: DRAW");
            }
        }
    }

    public static void main(String[] args) {
        FootballFrame frame = new FootballFrame();
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
