/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.unifae.cris.comp7.view;

import br.sp.unifae.cris.comp7.model.Cliente;
import br.sp.unifae.cris.comp7.model.Entrada;
import br.sp.unifae.cris.comp7.model.Fornecedor;
import br.sp.unifae.cris.comp7.model.Produto;
import br.sp.unifae.cris.comp7.model.dao.DAOGenerica;
import br.sp.unifae.cris.comp7.utils.Generica;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author iury
 */
public class Pesquisa extends javax.swing.JDialog {

    /**
     * Creates new form Pesquisa
     * @param classe
     */
    JTable table = null;
    public Pesquisa(Object classe) {
        initComponents();
        personalizar(classe);
    }

    private Pesquisa() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void personalizar(Object classe) {
        
        List lista = null;
        String[] columns = new String[]{"Código", "Nome"};
        Object[][] data = null;
        if (classe instanceof Produto){
            lista = ((Produto)classe).listar();
            data = new Object[lista.size()][2];
            int i =0;
            for (Iterator it = lista.iterator(); it.hasNext();) {
                Produto produto = (Produto) it.next();
                data[i][0] = produto.getId();
                data[i][1] = produto.getNome();
                i++;
            }
        }
        else if (classe instanceof Cliente){
            lista = ((Cliente)classe).listar();
            data = new Object[lista.size()][2];
            int i =0;
            for (Iterator it = lista.iterator(); it.hasNext();) {
                Cliente cliente = (Cliente) it.next();
                data[i][0] = cliente.getId();
                data[i][1] = cliente.getNome();
                i++;
            }
        }
        else if(classe instanceof Fornecedor){
            lista = ((Fornecedor)classe).listar();
            data = new Object[lista.size()][2];
            int i =0;
            for (Iterator it = lista.iterator(); it.hasNext();) {
                Fornecedor fornecedor = (Fornecedor) it.next();
                data[i][0] = fornecedor.getId();
                data[i][1] = fornecedor.getNome();
                i++;
            }
        }
        else if(classe instanceof Entrada)
        {
            lista = new DAOGenerica().listar(
                    "SELECT 	E.Id, Concat(F.Id,' - ',F.Nome) as 'Fornecedor' " +
                    "FROM 	entrada E " +
                    "		Inner Join Fornecedor F on E.fornecedor = F.Id");
            data = new Object[lista.size()][2];
            int i =0;
            for (Iterator it = lista.iterator(); it.hasNext();) {
                Object[] obj = (Object[]) it.next();
                data[i][0] = obj[0];
                data[i][1] = obj[1];
                i++;
            }
        }
        if (lista.size() <= 0 || lista == null) 
            Pesquisa.this.dispose();
        final Class[] columnClass = new Class[]{Integer.class, String.class};
        //create table model with data
        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnClass[columnIndex];
            }
        };

        table = new JTable(model);
        table.setBounds(10, 10, 422, 422);
        
        //Evento de doubleClick na Tabela
        table.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                    }
                    @Override
                    public void mousePressed(MouseEvent e) {
                        int row = table.rowAtPoint(e.getPoint());
                        int col = table.columnAtPoint(e.getPoint());
                        if (row < 0 || col < 0) return;
                        if (e.getClickCount() == 2) {
                            Generica.globalRetornoPesquisa = table.getModel().getValueAt(row,0);
                            Generica.globalRetornoPesquisaAuxiliar = table.getModel().getValueAt(row,1);
                            Pesquisa.this.dispose();
                        }
                    }
                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                    }
                });
        
        
        //add the table to the frame
        jPanel1.add(new JScrollPane(table));
        this.setSize(400, 400);
       // this.setVisible(true);
    }
}
