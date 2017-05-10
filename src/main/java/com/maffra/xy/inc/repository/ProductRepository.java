/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maffra.xy.inc.repository;

import com.maffra.xy.inc.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author heitor
 */
@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
