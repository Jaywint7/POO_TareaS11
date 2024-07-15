import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Image;


public class Hobie extends JFrame{
    private JComboBox combo1;
    private JLabel lblimagen;
    private JPanel JPanel_hb;
    private JButton regresarButton;

    public Hobie() {
        super("Hobbie");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPanel_hb);
        combo1.addItem("");
        hob_Usuario();

        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bio bio = new Bio();
                bio.setVisible(true);
                dispose();
            }
        });
        combo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarImg();
            }
        });
    }

    public void hob_Usuario(){
        String[] elementos = {"Jugar Futbol", "Escuchar Musica", "Leer", "Programar"};
        for (String elemento : elementos) {
            combo1.addItem(elemento);
        }
    }

    public void mostrarImg(){
        String itemSelec = combo1.getSelectedItem().toString();
        if ("Jugar Futbol".equals(itemSelec)) {
            ImageIcon icon = new ImageIcon("src/img/Futbol.jpeg");
            Image img = icon.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
            lblimagen.setIcon(new ImageIcon(img));
        } else if ("Programar".equals(itemSelec)) {
            ImageIcon icon = new ImageIcon("src/img/prog.jpg");
            Image img = icon.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
            lblimagen.setIcon(new ImageIcon(img));
        } else if ("".equals(itemSelec)) {
            ImageIcon icon = new ImageIcon("");
            Image img = icon.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
            lblimagen.setIcon(new ImageIcon(img));
        } else if ("Leer".equals(itemSelec)){
            ImageIcon icon = new ImageIcon("src/img/leer.jpg");
            Image img = icon.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
            lblimagen.setIcon(new ImageIcon(img));
        } else if ("Escuchar Musica".equals(itemSelec)){
            ImageIcon icon = new ImageIcon("src/img/musica.jpg");
            Image img = icon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
            lblimagen.setIcon(new ImageIcon(img));
        } else{
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

}
