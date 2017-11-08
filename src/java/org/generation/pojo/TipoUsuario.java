/*
 * Licencia pendiente, para cambiar la licencia ir a -> Tools | Templates
 */

package org.generation.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Ilich Arredondo
 */
@Entity
@Table(name="cTipoUsuario", catalog="usuarios")
public class TipoUsuario {
    
    @Id @GeneratedValue
    @Column(name="idTipoUsuario")
    private int idTipoUsuario;
    
    @Column(name="TipoUsuario")
    private String TipoUsuario;
    
    public TipoUsuario() {
    }
    /**
     * @return the idTipoUsuario
     */
    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    /**
     * @param idTipoUsuario the idTipoUsuario to set
     */
    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    /**
     * @return the TipoUsuario
     */
    public String getTipoUsuario() {
        return TipoUsuario;
    }

    /**
     * @param TipoUsuario the TipoUsuario to set
     */
    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }
}