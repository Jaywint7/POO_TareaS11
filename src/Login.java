import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JButton btnIngresar;
    private JTextField txtcontra;
    private JTextField txtusu;
    private JPanel JPanel_login;

    public Login(){
        super("Inicio Sesión");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JPanel_login);

        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Credencial();
            }
        });
    }

    public void Credencial(){
        String user = txtusu.getText();
        String contra = txtcontra.getText();
        if(user.equals("Jair@ver.com")  &&  contra.equals("12345")){
            JOptionPane.showMessageDialog(null, "Bienvenido Usuario");
            Bio bio = new Bio();
            bio.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Credenciales Incorrectas");
            txtusu.setText("");
            txtcontra.setText("");
        }
    }
}
