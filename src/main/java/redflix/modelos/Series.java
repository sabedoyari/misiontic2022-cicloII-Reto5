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
// Determina o define un objeto dentro de spring
@Entity
@Table(name = "Series")
public class Series {
    @Id
    @Column(name="idSeries")
    Long idSeries;
    
    @Column(name = "Tituloserie")
    String tituloserie;
    
    @Column(name = "Numtemporadas")
    String numtemp;
    
    @Column(name = "NumEpisodios")
    String numep;

    public Series(Long idSeries, String tituloserie, String numtemp, String numep) {
        this.idSeries = idSeries;
        this.tituloserie = tituloserie;
        this.numtemp = numtemp;
        this.numep = numep;
    }
// NO OLVIDAR COLOCAR LO DEL RETOOOOOO!!!!!!
    @Override
    public String toString() {
        return "idSeries: " + idSeries 
               + "tituloserie: " + tituloserie 
               + "numtemp: " + numtemp 
               + "numep: " + numep;
    }
    
    
    
    
}
