package uz.market.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import uz.market.pcmarket.entity.Order;
import uz.market.pcmarket.projection.OrderCustom;


@RepositoryRestResource(path = "order",collectionResourceRel = "list",excerptProjection = OrderCustom.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
