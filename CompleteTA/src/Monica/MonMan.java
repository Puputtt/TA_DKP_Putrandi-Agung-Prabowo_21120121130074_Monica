package Monica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonMan {
    private JTextField NomText;
    private JComboBox TipeList;
    private JButton clearButton;
    private JTextArea HasilText;
    private JButton proceedButton;
    private JButton closeButton;
    public JPanel Panel2;
    private JButton backButton;
    int [] mng = new int[3];

    public MonMan() {
        JFrame frame = new JFrame("MonMan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.add(Panel2);

        frame.setSize(2000, 1000);
        frame.setResizable(false);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NomText.setText("");
                HasilText.setText("");
            }
        });
        proceedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomip = NomText.getText();
                int nom = Integer.parseInt(nomip);

                Proceed(nom);
                HasilText.setText("Berikut adalah rekomendasi dari pembagian uang anda \n" +
                        "1. Tabungan : Rp. " + mng[0] + "\n" +
                        "2. Harian : Rp. " + mng [1] + "\n" +
                        "3. Lain-lain Rp. : " + mng [2]
                );
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("MonMan");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.add(Panel2);

                frame.setSize(2000, 1000);
                frame.setResizable(false);
                new Utama();
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {

    }

    public void Proceed(int nom){
        int tbg,hrn,dll;
        String pil_ip = TipeList.getSelectedItem().toString();
        if(pil_ip.equalsIgnoreCase("Low")){
            tbg = nom * 20 / 100;
            hrn = nom * 50 / 100;
            dll = nom * 30 / 100;
            mng [0] = tbg;
            mng [1] = hrn;
            mng [2] = dll;
        }
        else if(pil_ip.equalsIgnoreCase("Intermediate")){
            tbg = nom * 30 / 100;
            hrn = nom * 45 / 100;
            dll = nom * 25 / 100;
            mng[0] = tbg;
            mng[1] = hrn;
            mng[2] = dll;
        }
        else {
            tbg = nom * 40 / 100;
            hrn = nom * 35 / 100;
            dll = nom * 25 / 100;
            mng[0]= tbg;
            mng[1]= hrn;
            mng[2]= dll;
        }
    }
}
