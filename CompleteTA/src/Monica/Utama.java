package Monica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Utama {
    private JButton moneyManagementButton;
    private JButton investCalculatorButton;
    private JButton closeButton;
    public JPanel Panel1;


    public Utama() {
        JFrame frame = new JFrame("Monica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.add(Panel1);
        frame.setVisible(true);
        frame.setSize(1100, 600);
        frame.setResizable(false);

        moneyManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame dua = new JFrame("Money Managemet");
                dua.setContentPane(new MonMan().Panel2);
                dua.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dua.setLocationRelativeTo(null);
                dua.setSize(1200,500);
                dua.pack();
                dua.setVisible(true);
                frame.dispose();
            }
        });
        investCalculatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame tiga = new JFrame("Invest Calculator");
                tiga.setContentPane(new Inca().Panel3);
                tiga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                tiga.setLocationRelativeTo(null);
                tiga.setSize(500,450);
                tiga.pack();
                tiga.setVisible(true);
                frame.dispose();
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new Utama();
    }
}
