package com.maffra.xy.inc.repository;

import com.maffra.xy.inc.domain.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author heitor
 */
@RepositoryRestResource
public interface ClientRepository extends CrudRepository<Client, Long> {
    
}
