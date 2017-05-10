package com.maffra.xy.inc.repository;

import com.maffra.xy.inc.domain.PurchaseOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author heitor
 */
@RepositoryRestResource
public interface PurchaseOrderRepository extends CrudRepository<PurchaseOrder, Long> {

}
