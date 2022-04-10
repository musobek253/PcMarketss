package uz.market.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.market.pcmarket.entity.Order;
import uz.market.pcmarket.entity.UserBasket;



import java.util.Date;

@Projection(types = Order.class)
public interface OrderCustom {

    Integer getId();

   Date getDate();

   String getDetails();

   UserBasket getUserBasket();

}
