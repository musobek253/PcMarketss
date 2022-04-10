package uz.market.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.market.pcmarket.entity.Attachment;
import uz.market.pcmarket.entity.Users;


@Projection(types = Users.class)
public interface UsersCustom {

    Integer getId();

    String getFullName();

    String getEmail();

    String getPassword();

    Attachment getAttachment();

}
