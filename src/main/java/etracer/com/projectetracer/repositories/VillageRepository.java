/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etracer.com.projectetracer.repositories;

import etracer.com.projectetracer.entities.Village;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Relion31
 */
@Repository
public interface VillageRepository extends CrudRepository<Village, String>{
    
}
