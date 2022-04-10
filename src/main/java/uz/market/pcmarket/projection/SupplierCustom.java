package uz.market.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.market.pcmarket.entity.Supplier;


@Projection(types = Supplier.class)
public interface SupplierCustom {

    Integer getId();

    String getFullName();

    String getEmail();

    String getPhoneNumber();

    String getMessageBody();

}
