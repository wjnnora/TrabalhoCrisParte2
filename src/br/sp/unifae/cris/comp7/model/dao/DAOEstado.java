package br.sp.unifae.cris.comp7.model.dao;

import br.sp.unifae.cris.comp7.model.Estado;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author Nora
 */
public class DAOEstado {
    
    public void armazenar(Estado estado) {
 

        Session session = DAOHibernateUtil.getSession();
 
        try {
 
            session.beginTransaction(); // Abre-se uma transação
            session.save(estado);      // Acumula a operação de gravação do objeto produto no BD, na transação
            session.getTransaction().commit();   // Realiza definitivamente todas as operações pendentes na transação
            JOptionPane.showMessageDialog(null, "Estado armazenado com sucesso");
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
 
        }
    }
    
    public void alterar(Estado estado) {
 
        Session session = DAOHibernateUtil.getSession();
 
        try {
 
            session.beginTransaction(); // Abre-se uma transação
            session.merge(estado);      // Acumula a operação de alteração do objeto produto no BD, na transação
            session.getTransaction().commit();   // Realiza definitivamente todas as operações pendentes na transação
            JOptionPane.showMessageDialog(null, "Estado alterado com sucesso");
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
 
        }
    }
    
    public void excluir(Estado estado) {
 
        Session session = DAOHibernateUtil.getSession();
 
        try {
 
            session.beginTransaction(); // Abre-se uma transação
            session.delete(estado);    // Acumula a operação de exclusão do objeto produto no BD, na transação
            session.getTransaction().commit();   // Realiza definitivamente todas as operações pendentes na transação
            JOptionPane.showMessageDialog(null, "Estado excluído com sucesso");
 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
 
        }
    }
    
    public List listar() {
        Session session = DAOHibernateUtil.getSession();
        List listaEstado = null;
        try {
            session.beginTransaction();           
            listaEstado = session.createQuery("From Estado").list();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally{
            session.close();
            return listaEstado;
        }
    }
}
