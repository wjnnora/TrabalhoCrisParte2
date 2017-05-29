/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.unifae.cris.comp7.view;

import br.sp.unifae.cris.comp7.utils.Generica;
import br.sp.unifae.cris.comp7.utils.interfaces.IMetodosBasicosTemplate;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author iury
 */
public class Template extends javax.swing.JFrame implements IMetodosBasicosTemplate{

    private Object classe = null;
    public static Object id = null;
    public boolean isNovo = false;

    public void setClasse(Object classe) {
        this.classe = classe;
    }

    /**
     * Creates new form Template
     */
    public Template() {
        initComponents();
        Personalizar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonIncluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jPaneCampos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel.setToolTipText("");

        jButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sp/unifae/cris/comp7/utils/imagens/icons/1492797966_flat-style-circle-add.png"))); // NOI18N
        jButtonIncluir.setToolTipText("[F2] - Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonIncluir);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sp/unifae/cris/comp7/utils/imagens/icons/1493073460_flat-style-circle-save.png"))); // NOI18N
        jButtonSalvar.setToolTipText("[F4] - Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSalvar);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sp/unifae/cris/comp7/utils/imagens/icons/1492798125_flat-style-circle-undo.png"))); // NOI18N
        jButtonCancelar.setToolTipText("[F5] - Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancelar);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sp/unifae/cris/comp7/utils/imagens/icons/1492798109_flat-style-circle-delete-trash.png"))); // NOI18N
        jButtonExcluir.setToolTipText("[F8] - Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonExcluir);

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sp/unifae/cris/comp7/utils/imagens/icons/1492798187_circle-edit-search.png"))); // NOI18N
        jButtonPesquisar.setToolTipText("[F6] - Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPesquisar);
        jButtonPesquisar.getAccessibleContext().setAccessibleName("Pesquisar");
        jButtonPesquisar.getAccessibleContext().setAccessibleDescription("Pesquisar registros");

        javax.swing.GroupLayout jPaneCamposLayout = new javax.swing.GroupLayout(jPaneCampos);
        jPaneCampos.setLayout(jPaneCamposLayout);
        jPaneCamposLayout.setHorizontalGroup(
            jPaneCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );
        jPaneCamposLayout.setVerticalGroup(
            jPaneCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPaneCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(jPaneCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        incluir();
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        salvar();
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Template.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Template.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Template.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Template.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Template().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonCancelar;
    public javax.swing.JButton jButtonExcluir;
    public javax.swing.JButton jButtonIncluir;
    public javax.swing.JButton jButtonPesquisar;
    public javax.swing.JButton jButtonSalvar;
    public javax.swing.JPanel jPaneCampos;
    public javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object pesquisar() {
        Template.id = null;
        controlaBotoesAIncluir();
        
        Pesquisa janela = new Pesquisa(classe);
        janela.setModal(true);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        isNovo = false;
        
        if(Template.id != null)
            controlaBotoesEmAlteracao();
        else
            controlaBotoesAIncluir();
            
        return Template.id;
    }

    @Override
    public void cancelar() {
        Generica.Limpar_Campos_Tela(jPaneCampos,true);
        isNovo = false;
        
        controlaBotoesAIncluir();
    }

    @Override
    public void excluir() {
        isNovo = false;
        PopularListaDeRegistros();
        Generica.Limpar_Campos_Tela(jPaneCampos,true);
        
        controlaBotoesAIncluir();
    }

    @Override
    public void salvar() {
        isNovo = false;
        PopularListaDeRegistros();
        
        Generica.Limpar_Campos_Tela(jPaneCampos,true);
        controlaBotoesAIncluir();
    }

    @Override
    public void incluir() {
        Generica.Limpar_Campos_Tela(jPaneCampos,false);
        isNovo = true;
        
        controlaBotoesEmInclusao();
    }
    
    public void PopularListaDeRegistros(){
        
    }

    private void Personalizar() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager()
        .addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
              teclaPressionada(e);
              return false;
            }
      });
    }
    
    public void teclaPressionada(java.awt.event.KeyEvent evt){
        
        if(evt.getKeyCode() == KeyEvent.VK_F4){
            if(!jButtonSalvar.isVisible())
                return;
            salvar();
        }
        if(evt.getKeyCode() == KeyEvent.VK_F2){
            if(!jButtonIncluir.isVisible())
                return;
            incluir();
        }
        if(evt.getKeyCode() == KeyEvent.VK_F5){
            if(!jButtonCancelar.isVisible())
                return;
            cancelar();
        }
        if(evt.getKeyCode() == KeyEvent.VK_F8){
            if(!jButtonExcluir.isVisible())
                return;
            excluir();
        }
        if(evt.getKeyCode() == KeyEvent.VK_F6){
            if(!jButtonPesquisar.isVisible())
                return;
            pesquisar();
        }
    }

    private void controlaBotoesAIncluir() {
        jButtonIncluir.setVisible(true);
        jButtonPesquisar.setVisible(true);
        
        jButtonCancelar.setVisible(false);
        jButtonSalvar.setVisible(false);
        jButtonExcluir.setVisible(false);
    }
    
    private void controlaBotoesEmInclusao(){
        jButtonCancelar.setVisible(true);
        jButtonSalvar.setVisible(true);
        
        jButtonIncluir.setVisible(false);
        jButtonPesquisar.setVisible(false);
        jButtonExcluir.setVisible(false);
    }
    
    private void controlaBotoesEmAlteracao(){
        jButtonCancelar.setVisible(true);
        jButtonSalvar.setVisible(true);
        jButtonExcluir.setVisible(true);
        
        jButtonIncluir.setVisible(false);
        jButtonPesquisar.setVisible(false);
    }
}
