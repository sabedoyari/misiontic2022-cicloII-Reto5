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
@Table(name = "directores")
public class Director {
    /*id_dir int PK 
nombre_dir char(20) 
apellido_dir char(20) 
nacionalidad_dir char(40)*/
    @Id
    @Column(name="idDirectores")
    Long idDir;
    
    @Column(name = "Nombres")
    String nombreDir;
    
    @Column(name = "Apellidos")
    String apellidoDir;
    
    @Column(name = "Nacionalidad")
    String nacionalidadDir;

    public Long getIdDir() {
        return idDir;
    }

    public String getNombreDir() {
        return nombreDir;
    }

    public String getApellidoDir() {
        return apellidoDir;
    }

    public String getNacionalidadDir() {
        return nacionalidadDir;
    }

    public void setIdDir(Long idDir) {
        this.idDir = idDir;
    }

    public void setNombreDir(String nombreDir) {
        this.nombreDir = nombreDir;
    }

    public void setApellidoDir(String apellidoDir) {
        this.apellidoDir = apellidoDir;
    }

    public void setNacionalidadDir(String nacionalidadDir) {
        this.nacionalidadDir = nacionalidadDir;
    }

    @Override
    public String toString() {
        return "Directores{" + "idDir=" + idDir + 
                ", nombreDir=" + nombreDir + 
                ", apellidoDir=" + apellidoDir + 
                ", nacionalidadDir=" + nacionalidadDir + '}';
    }
}
