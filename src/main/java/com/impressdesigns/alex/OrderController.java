package com.impressdesigns.alex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping(path = "/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping(path = "/{order_id}")
    public @ResponseBody Optional<Order> getOrder(@PathVariable String order_id) {
        return orderRepository.findById(Integer.valueOf(order_id));
    }
}
