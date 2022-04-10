package uz.market.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.market.pcmarket.entity.Article;
import uz.market.pcmarket.projection.ArticleCustom;


@RepositoryRestResource(path = "article",collectionResourceRel = "list",excerptProjection = ArticleCustom.class)
public interface ArticleRepository extends JpaRepository<Article, Integer> {


}
