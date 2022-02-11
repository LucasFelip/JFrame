package Views;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginFrame extends JFrame implements ActionListener {
    
    Container container = getContentPane();
    JLabel label = new JLabel(new javax.swing.ImageIcon(getClass().getResource("/image/sale.png")));
    JLabel userLabel = new JLabel("USUARIO");
    JLabel passwordLabel = new JLabel("SENHA");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("ENTRAR");
    JButton resetButton = new JButton("LIMPAR");
    JCheckBox showPassword = new JCheckBox("Mostrar senha");
    
    public LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
    
    public void setLayoutManager() {
        container.setLayout(null);  
    }
 
    public void setLocationAndSize() {
        setSize(370, 750);
        setResizable(false);
        label.setBounds(130, 50, 120, 120);
        userLabel.setBounds(50, 230, 100, 30);
        passwordLabel.setBounds(50, 300, 100, 30);
        userTextField.setBounds(150, 230, 150, 30);
        passwordField.setBounds(150, 300, 150, 30);
        showPassword.setBounds(150, 330, 150, 30);
        loginButton.setBounds(50, 380, 100, 30);
        resetButton.setBounds(200, 380, 100, 30);
    }
 
    public void addComponentsToContainer() {
        container.add(label);
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }
 
    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText, pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("") && pwdText.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Login com sucesso!!");
                setVisible(false);
                new MenuFrame().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Usuário ou senha inválido");
            }
        }
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
    }
}
