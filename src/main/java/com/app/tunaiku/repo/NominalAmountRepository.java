/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.tunaiku.repo;

import com.app.tunaiku.model.NominalAmount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author <Dhimas Surya G>
 */
@Repository
public interface NominalAmountRepository extends CrudRepository<NominalAmount, Long>{
    
}
