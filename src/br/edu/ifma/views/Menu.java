package br.edu.ifma.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public final class Menu extends JFrame implements ActionListener{
    
    JMenuBar menubar = new JMenuBar();
    JMenu prod = new JMenu("PRODUTOS");
    JMenuItem Cprod = new JMenuItem("CADASTRAR");
    JMenuItem Aprod = new JMenuItem("ALTERAR");
    JMenu est = new JMenu("ESTOQUE");
    JMenuItem Vest = new JMenuItem("VISUALIZAR");
    JMenuItem Lest = new JMenuItem("ATUALIZAR");
    JMenuItem Eest = new JMenuItem("EXCLUIR");
    JMenu Exit = new JMenu("FECHAR");
    JMenuItem Vexit = new JMenuItem("VOLTAR");
    JMenuItem Fexit = new JMenuItem("ENCERRAR");
    
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
        est.add(Vest);
        est.add(Lest);
        est.add(Eest);
        Exit.add(Vexit);
        Exit.add(Fexit);
        menubar.add(prod);
        menubar.add(est);
        menubar.add(Exit);
        setJMenuBar(menubar);
    }
    
    public void addActionEvent() {
        Cprod.addActionListener(this);
        Aprod.addActionListener(this);
        Eest.addActionListener(this);
        Vest.addActionListener(this);
        Lest.addActionListener(this);
        Vexit.addActionListener(this);
        Fexit.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Vexit) {
            LoginFrame frame = new LoginFrame();
            setVisible(false);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        if(e.getSource() == Fexit){
            System.exit(0);
        }
        if(e.getSource() == Cprod) {
            NewJFrame f = new NewJFrame();
        }
        if(e.getSource() == Aprod) {    
        }
        if(e.getSource() == Eest) { 
            JOptionPane.showMessageDialog(this, "Estoque excluido");
        }
        if(e.getSource() == Vest) {
        }
        if(e.getSource() == Lest) {  
            JOptionPane.showMessageDialog(this, "Estoque atualizado");
        }
    }
}
