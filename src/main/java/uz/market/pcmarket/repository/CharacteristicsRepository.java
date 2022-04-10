package uz.market.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.market.pcmarket.entity.Characteristics;
import uz.market.pcmarket.projection.CharacteristicsCustom;


import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "characteristics",collectionResourceRel = "list",excerptProjection = CharacteristicsCustom.class)
public interface CharacteristicsRepository extends JpaRepository<Characteristics, Integer> {


}
