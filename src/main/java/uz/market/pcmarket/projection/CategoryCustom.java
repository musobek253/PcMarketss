package uz.market.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.market.pcmarket.entity.Category;


@Projection(types = Category.class)
public interface CategoryCustom {

    Integer getId();

    String getName();

    Category getParentCategoryId();

}
