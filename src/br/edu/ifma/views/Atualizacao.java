/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifma.views;


import java.awt.Container;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author wesle
 */
public class Atualizacao extends JFrame{
    
    private JLabel label = new JLabel();
    private String[] colunas ={"Nome","Descrição","Preço","Quantidade"};
    private JButton button = new JButton("Salvar alteração");
    private JTable table;
    public Atualizacao(){
        this.setSize(850,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Estoque");
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());
        Produto[] produtos2 = new Produto[10];
        DefaultTableModel model = new DefaultTableModel();
        for(int i = 0; i < colunas.length;i++){
              model.addColumn(colunas[i]);
        }
        button.setBounds(750,500,100,30);
        table = new JTable(model);
        for(int i = 0; i < produtos2.length; i++){
             produtos2[i] = new Produto("Caneta",2.50,10,"Serve para escrever");
             String dados[] = {produtos2[i].getNome(),produtos2[i].getDescricao(),produtos2[i]
                     .getPreco().toString(),produtos2[i].getQtdEstoque().toString()};
             model.insertRow(i,dados);
        }
        
        this.add(new JScrollPane(table));
        this.add(button);
        /*JList listProduto = new JList(produtos2);
        listProduto.setVisibleRowCount(10);
        JScrollPane jsp = new JScrollPane(listProduto);
        container.add(jsp);
        container.add(label);*/
    }
}
