/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EasyCode.BlocosOperadores;

import EasyCode.Pais.Bloco;
import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author CCE
 */
public class BOpIgual extends Bloco {

private final Dimension dimensoes = new Dimension(282,24);
    /**
     * Creates new form BOpSoma
     */
    public BOpIgual() {
        super("Igual","Operador Igual");
        initComponents();
        setSize(dimensoes);
    }
    public BOpIgual(String condicao1,String condicao2) {
        super("Igual","Operador Igual");
        initComponents();
        N1.setText(condicao1);
        N2.setText(condicao2);
        setSize(dimensoes);
    }
 public Dimension getDimensoes() {
        return dimensoes;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        N1 = new javax.swing.JTextField();
        N2 = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("=");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 0, 40, 20);
        jPanel1.add(N1);
        N1.setBounds(10, 0, 110, 23);
        jPanel1.add(N2);
        N2.setBounds(160, 0, 110, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public String getN1 (){
         return N1.getText();
     }
     
     public String getN2 (){
         return N2.getText();
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField N1;
    private javax.swing.JTextField N2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
