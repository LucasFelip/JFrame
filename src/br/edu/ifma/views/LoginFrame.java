package br.edu.ifma.views;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
public final class LoginFrame extends JFrame implements ActionListener {
    Menu ex = new Menu();
    
    Container container = getContentPane();
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
        setBounds(10, 10, 370, 600);
        setResizable(false);
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
    }
 
    public void addComponentsToContainer() {
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
                ex.setVisible(true);
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

