package uz.market.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.market.pcmarket.entity.MyTeam;
import uz.market.pcmarket.projection.MyTeamCustom;


import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "myTeam",collectionResourceRel = "list",excerptProjection = MyTeamCustom.class)
public interface MyTeamRepository extends JpaRepository<MyTeam, Integer> {


}
