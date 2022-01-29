/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifma.views;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
public final class FormFrame extends JFrame implements ActionListener{
    Container container = getContentPane();
    JLabel nomLabel = new JLabel("NOME");
    JLabel tipLabel = new JLabel("TIPO");
    JLabel desLabel = new JLabel("DESCRIÇÃO");
    JLabel valLabel = new JLabel("VALOR");
    JTextField nomTextField = new JTextField();
    JTextField tipTextField = new JTextField();
    JTextField desTextField = new JTextField();
    JTextField valTextField = new JTextField();
    JButton cadButton = new JButton("CADASTRAR");
    
    public FormFrame() {
        setLayoutManager();
        addComponentsToContainer();
        addActionEvent();
    }
    
    public void setLayoutManager() {
        container.setLayout(null);  
    }
    
    public void setLocationAndSize() {
        setTitle("Cadastrar produto");
        setSize(850, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        nomLabel.setBounds(50, 150, 100, 30);
        tipLabel.setBounds(50, 150, 100, 30);
    }
    
    public void addActionEvent() {
        cadButton.addActionListener(this);
    }
    
    public final void addComponentsToContainer(){
        container.add(nomLabel);
        container.add(tipLabel);
        container.add(desLabel);
        container.add(valLabel);
        container.add(cadButton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cadButton) {
            String nom, tip, des, val;
            
        }
    }
}
