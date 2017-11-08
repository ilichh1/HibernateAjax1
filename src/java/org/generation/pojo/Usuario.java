/*
 * Licencia pendiente, para cambiar la licencia ir a -> Tools | Templates
 */

package org.generation.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Ilich Arredondo
 */
@Entity
@Table(name="Usuario",catalog="usuarios")
public class Usuario {
    
    @Id @GeneratedValue
    @Column(name="idUsuario")
    private int id;
    
    @Column(name="Nickname")
    private String nickname;
    
    @Column(name="Nombre")
    private String nombre;
    
    @Column(name="Paterno")
    private String paterno;
    
    @Column(name="Materno",nullable=true)
    private String materno;
    
    @Column(name="Email")
    private String email;
    
    @Column(name="Telefono",nullable=true)
    private String telefono;
    
    @Column(name="Password")
    private String password;
    
    @ManyToOne
    @JoinColumn(name="TipoUsuario")
    private TipoUsuario tipoUsuario;
    
    public Usuario() {
        super();
    }
    
    public Usuario(
            String nick,
            String name,
            String pat,
            String mat,
            String email,
            String tel,
            String pass, 
            TipoUsuario type) {
        
        this.nickname = nick;
        this.nombre = name;
        this.paterno = pat;
        this.materno = mat;
        this.email = email;
        this.telefono = tel;
        this.password = pass;
        this.tipoUsuario = type;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the paterno
     */
    public String getPaterno() {
        return paterno;
    }

    /**
     * @param paterno the paterno to set
     */
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    /**
     * @return the materno
     */
    public String getMaterno() {
        return materno;
    }

    /**
     * @param materno the materno to set
     */
    public void setMaterno(String materno) {
        this.materno = materno;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.password = Password;
    }

    /**
     * @return the tipoUsuario
     */
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    

}