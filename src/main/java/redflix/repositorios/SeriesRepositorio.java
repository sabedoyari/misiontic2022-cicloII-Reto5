/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redflix.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import redflix.modelos.Series;

/**
 *
 * @author Tania
 */

@Repository
//Ese Long hace referencia al tipo de  dato de la llave primaria
public interface SeriesRepositorio extends JpaRepository<Series, Long>{
    
}

