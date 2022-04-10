package uz.market.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.market.pcmarket.entity.Attachment;
import uz.market.pcmarket.entity.Category;
import uz.market.pcmarket.entity.Product;

@Projection(types = Product.class)
public interface ProductCustom {

    Integer getId();

    String getModel();

    Double getPrice();

    boolean getActive();

    Category getCategory();

    Attachment getAttachment();

}
