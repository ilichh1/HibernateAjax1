/*
 * Licencia pendiente, para cambiar la licencia ir a -> Tools | Templates
 */

package org.generation.dao;

import org.generation.hibernate.HibernateUtil;
import org.generation.pojo.TipoUsuario;
import org.generation.pojo.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ilich Arredondo
 */
public class UsuarioDAO {
    Session session;
    
    public UsuarioDAO() {
        this.session = HibernateUtil.getLocalSession();
    }
    
    /**
     * @author ilichh1
     * @param id
     * @return la persona encontrada
     */
    public  Usuario getPersonaById(int id) {
        return (Usuario) session.load(Usuario.class, id);
    }
    
    public TipoUsuario getTipoUsuario(int id) {
        return (TipoUsuario) this.session.load(TipoUsuario.class, id);
    }
    
    /**
     * @author ilichh1
     * @param usuario El usuario que se guardaŕa en la base de datos
     * @return true si se pudo realizar la operacion con exito o false en caso de fallo
     */
    public boolean guardarUsuario(Usuario usuario) {
        try {
            Transaction transaction = this.session.beginTransaction();
            session.save(usuario);
            transaction.commit();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}