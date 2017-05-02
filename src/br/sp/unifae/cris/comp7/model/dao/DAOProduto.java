/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.unifae.cris.comp7.model.dao;

import br.sp.unifae.cris.comp7.model.Produto;
import java.util.List;
import java.util.Iterator;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author iury
 */
public class DAOProduto {
    
    public void armazenar(Produto produto) {
 
        // AGORA É PRECISO ENVIAR O cliente PARA o BD
        // ASSIM, CRIA-SE UMA SESSÃO PARA ISTO
        Session session = DAOHibernateUtil.getSessionFactory().getCurrentSession();
 
        try {
 
            session.beginTransaction(); // Abre-se uma transação
            session.save(produto);      // Acumula a operação de gravação do objeto cliente no BD, na transação
            session.getTransaction().commit();   // Realiza definitivamente todas as operações pendentes na transação
            JOptionPane.showMessageDialog(null, "Produto armazenado com sucesso");
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
 
        }
    }
 
    public void alterar(Produto produto) {
 
        // VAMOS ATUALIZAR O cliente PARA o BD
        // ASSIM, CRIA-SE UMA SESSÃO PARA ISTO
        Session session = DAOHibernateUtil.getSessionFactory().getCurrentSession();
 
        try {
 
            session.beginTransaction(); // Abre-se uma transação
            session.merge(produto);      // Acumula a operação de alteração do objeto cliente no BD, na transação
            session.getTransaction().commit();   // Realiza definitivamente todas as operações pendentes na transação
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
 
        }
    }
 
    public void excluir(Produto produto) {
 
        // VAMOS EXCLUIR O cliente do BD
        // ASSIM, CRIA-SE UMA SESSÃO PARA ISTO
        Session session = DAOHibernateUtil.getSessionFactory().getCurrentSession();
 
        try {
 
            session.beginTransaction(); // Abre-se uma transação
            session.delete(produto);    // Acumula a operação de exclusão do objeto cliente no BD, na transação
            session.getTransaction().commit();   // Realiza definitivamente todas as operações pendentes na transação
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
 
        }
    }
 
    public List listar() {
        Session session = DAOHibernateUtil.getSessionFactory().getCurrentSession();
        List listaProdutos = null;
        try {
 
            session.beginTransaction();           
            listaProdutos = session.createQuery("From Cliente").list();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally{
            return listaProdutos;
        }
    }
    
}