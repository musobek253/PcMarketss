package uz.market.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.market.pcmarket.entity.Details;
import uz.market.pcmarket.projection.DetailsCustom;



@RepositoryRestResource(path = "details", collectionResourceRel = "list", excerptProjection = DetailsCustom.class)
public interface DetailsRepository extends JpaRepository<Details, Integer> {


}
