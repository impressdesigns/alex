package com.impressdesigns.alex.orders;

import io.sentry.Sentry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping(path = "/orders")
public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping(path = "/{order_id}")
    public @ResponseBody Optional<Order> getOrder(@PathVariable String order_id) {
        final Optional<Order>[] result = new Optional[1];
        Sentry.metrics().timing("load_order", () -> {
            result[0] = orderRepository.findById(Integer.valueOf(order_id));
        });
        return result[0];
    }
}
