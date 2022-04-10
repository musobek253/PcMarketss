package uz.market.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.market.pcmarket.entity.OutputProduct;





@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "list",excerptProjection = uz.pdp.pcmarket.projection.OutputProductCustom.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {


}
