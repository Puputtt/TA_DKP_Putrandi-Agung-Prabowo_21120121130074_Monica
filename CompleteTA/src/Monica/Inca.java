package Monica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Inca {
    private JTextField NomText;
    private JTextField BngText;
    private JTextField BlnText;
    private JButton Hitung;
    private JButton clearButton;
    private JTextArea HasilText;
    private JButton closeButton;
    public JPanel Panel3;
    private JButton backButton;
    float hsl;
    boolean a;

    public Inca() {
        JFrame frame = new JFrame("Inca");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.add(Panel3);

        frame.setSize(500, 300);
        frame.setResizable(false);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NomText.setText("");
                BngText.setText("");
                BlnText.setText("");
                HasilText.setText("");
            }
        });
        Hitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomip = NomText.getText();
                String bngip = BngText.getText();
                String blnip = BlnText.getText();

                float nom = Integer.parseInt(nomip);
                float bng = Integer.parseInt(bngip);
                float bln = Integer.parseInt(blnip);

                Hitung(nom, bng, bln);
                if(bln < 0 || nom < 0 || bng < 0){
                    a = false;
                }
                else{
                    a = true;
                }
                if (a == true){
                    HasilText.setText("Rp. " + Integer.toString(Math.round(hsl)));
                }
                else{
                    HasilText.setText("Masukan Salah (tidak boleh negatif)");
                }
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
                JFrame frame = new JFrame("Inca");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.add(Panel3);

                frame.setSize(500, 300);
                frame.setResizable(false);
                frame.dispose();
                new Utama();
            }
        });

    }

    public static void main(String[] args) {

    }

    public void Hitung(float nom, float bng, float bln){
        float temp;
        if(bln == 0){
            temp = nom;
            hsl = temp;
        }
        else if(bln > 0) {
            for (int i = 0; i < bln; i++) {
                temp = nom * (bng / 100);
                nom = nom + temp;
                hsl = nom;
            }
        }
        else{
            System.out.println("Masukan salah");
        }
    }
}
