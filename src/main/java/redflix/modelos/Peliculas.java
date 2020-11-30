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
public class Peliculas {
    @Id
    @Column(name="idPeliculas")
    Long idPel;
    
    @Column(name = "Titulo")
    String titulo;
    
    @Column(name = "Resumen")
    String resumen;
    
    @Column(name = "AnioPelicula")
    String yearfilm;
    
    @Column(name = "Director")
    String director;
    
    public Peliculas(Long idPel, String titulo, String resumen, String yearfilm,String director) {
        this.idPel = idPel;
        this.titulo = titulo;
        this.resumen = resumen;
        this.yearfilm = yearfilm;
        this.director = director;
    }
    
    @Override
    public String toString() {
        return "Peliculas" + super.toString() 
               + "idPel: " + idPel 
               + "titulo: " + titulo 
               + "resumen: " + resumen 
               + "yearfilm: " + yearfilm;        
    }
}
