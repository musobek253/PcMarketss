package uz.market.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.market.pcmarket.entity.Details;

@Projection(types = Details.class)
public interface DetailsCustom {

    Integer getId();

    String getName();

}
