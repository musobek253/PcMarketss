package uz.market.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.market.pcmarket.entity.Position;
import uz.market.pcmarket.projection.PositionCustom;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "position",collectionResourceRel = "list",excerptProjection = PositionCustom.class)
public interface PositionRepository extends JpaRepository<Position,Integer> {

}
