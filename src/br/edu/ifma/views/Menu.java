package br.edu.ifma.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public final class Menu extends JFrame implements ActionListener{
    
    JMenuBar menubar = new JMenuBar();
    JMenu prod = new JMenu("PRODUTOS");
    JMenuItem Cprod = new JMenuItem("CADASTRAR");
    JMenuItem Aprod = new JMenuItem("ALTERAR");
    JMenuItem Eprod = new JMenuItem("EXCLUIR");
    JMenu est = new JMenu("ESTOQUE");
    JMenuItem Vest = new JMenuItem("VISUALIZAR");
    JMenuItem Lest = new JMenuItem("ATUALIZAR");
    JMenu Exit = new JMenu("FECHAR");
    
    public Menu() {
        addComponentsToMenu();
        addActionEvent();
        setLocationAndSize();
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
        est.add(Eprod);
        est.add(Vest);
        est.add(Lest);
        menubar.add(prod);
        menubar.add(est);
        menubar.add(Exit);
        setJMenuBar(menubar);
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
            LoginFrame frame = new LoginFrame();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        if(e.getSource() == Cprod) {
            NewJFrame f = new NewJFrame();
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
