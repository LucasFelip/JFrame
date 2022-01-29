package br.edu.ifma.views;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public final class Menu extends JFrame implements ActionListener{
    
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
    
    JMenuBar menubar = new JMenuBar();
    JMenu prod = new JMenu("PRODUTOS");
    JMenuItem Cprod = new JMenuItem("CADASTRAR");
    JMenuItem Aprod = new JMenuItem("ATUALIZAR");
    JMenuItem Eprod = new JMenuItem("EXCLUIR");
    JMenu est = new JMenu("ESTOQUE");
    JMenuItem Vest = new JMenuItem("VISUALIZAR");
    JMenuItem Lest = new JMenuItem("LIMPAR");
    JMenu Exit = new JMenu("FECHAR");
    
    public Menu() {
        addComponentsToMenu();
        addActionEvent();
        setLocationAndSize();
    }
    
    public void setLayoutManager() {
        container.setLayout(null);  
    }
    
    public void setLocationAndSize() {
        setTitle("Sistema de Vendas");
        setSize(850, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    public final void addComponentsToMenu() {
        prod.add(Cprod);
        prod.add(Aprod);
        prod.add(Eprod);
        est.add(Vest);
        est.add(Lest);
        menubar.add(prod);
        menubar.add(est);
        menubar.add(Exit);
        setJMenuBar(menubar);
    }
    
    public final void addComponentsToContainer(){
        container.add(nomLabel);
        container.add(tipLabel);
        container.add(desLabel);
        container.add(valLabel);
        container.add(this);
        container.add(cadButton);
    }
    
    public void addActionEvent() {
        Exit.addActionListener(this);
        Cprod.addActionListener(this);
        Aprod.addActionListener(this);
        Eprod.addActionListener(this);
        Vest.addActionListener(this);
        Lest.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Exit) {
            System.exit(0);
        }
        if(e.getSource() == Cprod) {
            setLayoutManager();
        }
        if(e.getSource() == Aprod) {
            
        }
        if(e.getSource() == Eprod) {
            
        }
        if(e.getSource() == Vest) {
            
        }
        if(e.getSource() == Lest) {
            
        }
    }
}
