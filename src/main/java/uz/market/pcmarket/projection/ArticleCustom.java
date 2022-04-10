package uz.market.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.market.pcmarket.entity.Article;
import uz.market.pcmarket.entity.Attachment;


@Projection(types = Article.class)
public interface ArticleCustom {

    Integer getId();

    String getTitle();

    String getDescription();

    String getUrl_link();

    Attachment getAttachment();

}
