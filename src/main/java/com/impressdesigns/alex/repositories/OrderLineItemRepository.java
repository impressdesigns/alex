package com.impressdesigns.alex.repositories;

import com.impressdesigns.alex.objects.OrderLineItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineItemRepository extends JpaRepository<OrderLineItem, Integer> {
}
