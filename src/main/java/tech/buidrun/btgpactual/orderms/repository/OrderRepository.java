package tech.buidrun.btgpactual.orderms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.buidrun.btgpactual.orderms.entity.OrderEntity;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {


}
