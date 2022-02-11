/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifma.views;

import java.awt.BorderLayout;

public class MenuFrame extends javax.swing.JFrame {

    public MenuFrame() {
        initComponents();
        this.setSize(500,500);
        this.setResizable(false);
           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        contane = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");

        contane.setAutoscrolls(true);
        contane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contane.setPreferredSize(new java.awt.Dimension(600, 350));
        contane.setRequestFocusEnabled(false);

        javax.swing.GroupLayout contaneLayout = new javax.swing.GroupLayout(contane);
        contane.setLayout(contaneLayout);
        contaneLayout.setHorizontalGroup(
            contaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        contaneLayout.setVerticalGroup(
            contaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(64, 75));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 30));

        jMenu2.setText("Produtos");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem2.setText("Cadastrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem3.setText("Atualizar");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Estoque");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Funcionario");
        jMenu5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu5);

        jMenu4.setText("Sobre");
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu4);

        jMenu6.setText("Finalizar");
        jMenu6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastrarPanel panel = new CadastrarPanel();
        panel.setSize(485, 352);
        panel.setLocation(0, 0);
        contane.removeAll();
        contane.add(panel, BorderLayout.CENTER);
        contane.revalidate();
        contane.repaint();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables


}
