/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redflix.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import redflix.modelos.Director;

/**
 *
 * @author Tania
 */

@Repository
public interface PeliculasRepositorio extends JpaRepository<Director, Long>{
    
}

