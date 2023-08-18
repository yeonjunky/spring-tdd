package com.orderservice.orderservice.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
interface OrderRepository extends JpaRepository<Order, Long> {
}
