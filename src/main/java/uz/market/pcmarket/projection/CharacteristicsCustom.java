package uz.market.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.market.pcmarket.entity.Characteristics;
import uz.market.pcmarket.entity.Details;
import uz.market.pcmarket.entity.Product;


@Projection(types = Characteristics.class)
public interface CharacteristicsCustom {

    Integer getId();

    String getValue();

    Details getDetails();

    Product getProduct();
}
