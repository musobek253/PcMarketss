package uz.market.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.market.pcmarket.entity.UserBasket;
import uz.market.pcmarket.projection.ArticleCustom;


@RepositoryRestResource(path = "userBasket",collectionResourceRel = "list",excerptProjection = ArticleCustom.class)
public interface UserBasketRepository extends JpaRepository<UserBasket, Integer> {

}
