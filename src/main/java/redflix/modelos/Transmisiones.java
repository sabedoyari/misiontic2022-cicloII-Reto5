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
@Table (name = "Transmisiones")
public class Transmisiones {
    @Id
    @Column(name="idTransmisiones")
    Long idtransmi;
    
    @Column(name = "AliasUsuarios")
    String aliasusuarios;
    
    @Column(name = "Contenido")
    String cont;
    
    @Column(name = "FechaTransmision")
    String transdate;

    public Transmisiones(Long idtransmi, String aliasusuarios, String cont, String transdate) {
        this.idtransmi = idtransmi;
        this.aliasusuarios = aliasusuarios;
        this.cont = cont;
        this.transdate = transdate;
    }
    
}
