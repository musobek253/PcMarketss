package uz.market.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.market.pcmarket.entity.Comments;
import uz.market.pcmarket.entity.Users;



@Projection(types = Comments.class)
public interface CommentsCustom {

    Integer getId();

    String getBody();

    Integer getNumberStars();

    Users getUsers();

}
