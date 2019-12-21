package com.elvis.springapp.ordermanager.repository;

import com.elvis.springapp.ordermanager.domain.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository extends InMemoryRepository<Order> {

    protected void updateIfExists(Order original, Order desired) {
        original.setDescription(desired.getDescription());
        original.setCostInCents(desired.getCostInCents());
        original.setComplete(desired.isComplete());
    }
}
