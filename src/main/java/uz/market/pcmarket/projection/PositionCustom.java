package uz.market.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.market.pcmarket.entity.Position;


@Projection(types = Position.class)
public interface PositionCustom {

    Integer getId();

    String getName();

}
