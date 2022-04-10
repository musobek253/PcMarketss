package uz.market.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.market.pcmarket.entity.Product;
import uz.market.pcmarket.projection.ArticleCustom;


import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = ArticleCustom.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {


}
