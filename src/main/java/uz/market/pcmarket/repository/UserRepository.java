package uz.market.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.market.pcmarket.entity.Users;
import uz.market.pcmarket.projection.UsersCustom;


@RepositoryRestResource(path = "users",collectionResourceRel = "list",excerptProjection = UsersCustom.class)
public interface UserRepository extends JpaRepository<Users, Integer> {


}
