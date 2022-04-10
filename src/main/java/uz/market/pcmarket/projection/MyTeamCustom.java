package uz.market.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.market.pcmarket.entity.Attachment;
import uz.market.pcmarket.entity.MyTeam;
import uz.market.pcmarket.entity.Position;


@Projection(types = MyTeam.class)
public interface MyTeamCustom {

    Integer getId();

    String getFullName();

    Position getPosition();

    Attachment getAttachment();

}
