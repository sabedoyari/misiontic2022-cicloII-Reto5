/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redflix.modelos;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Tania
 */
@Entity
@Table (name="Usuarios")
public class Usuarios {
    @Id
    @Column(name="alias")
    Long alias;
    
    @Column(name = "Nombres")
    String name;
    
    @Column(name = "Apellidos")
    String lastname;
    
    @Column(name = "email")
    String email; 
    
    @Column(name = "Celular")
    String phone; 
    
    @Column(name = "contrasena")
    String password; 
     
    @Column(name = "FecNacimiento")
    String birthday; 

    public Usuarios(Long alias, String name, String lastname, String email, String phone, String password, String birthday) {
        this.alias = alias;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.birthday = birthday;
    }
    
}