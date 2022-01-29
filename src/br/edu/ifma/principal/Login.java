package br.edu.ifma.principal;

import br.edu.ifma.views.LoginFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author lucas
 */
public class Login{
    public static void main(String[] a) {
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
