package uz.market.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.market.pcmarket.entity.Category;
import uz.market.pcmarket.projection.CategoryCustom;


import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "category",collectionResourceRel = "list",excerptProjection = CategoryCustom.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
