package uz.market.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.market.pcmarket.entity.OutputProduct;
import uz.market.pcmarket.entity.UserBasket;
import uz.market.pcmarket.entity.Users;


@Projection(types = UserBasket.class)
public interface UserBasketCustom {

    Integer getId();

    String getAllSum();

    Users getUsers();

    OutputProduct getProduct();

}
