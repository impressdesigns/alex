package com.impressdesigns.alex.repositories;

import com.impressdesigns.alex.objects.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Query("FROM Order WHERE status_invoiced=0")
    Iterable<Order> notInvoiced();
}
