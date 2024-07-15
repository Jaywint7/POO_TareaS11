import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bio extends JFrame{
    private JButton btnHobbie;
    private JPanel JPanel_bio;
    private JLabel lblusu;
    private JLabel lblcontra;
    private JButton verMisCredencialesButton;
    private JButton ocultarCredencialesButton;
    private JButton cerrarSesionButton;

    public Bio(){
        super("Biografia");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPanel_bio);

        btnHobbie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hobie hobie = new Hobie();
                hobie.setVisible(true);
                dispose();
            }
        });

        verMisCredencialesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblusu.setText("Jair@ver.com");
                lblcontra.setText("12345");
            }
        });

        ocultarCredencialesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblusu.setText("");
                lblcontra.setText("");
            }
        });
        cerrarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                login.setVisible(true);
                dispose();
            }
        });
    }
}
