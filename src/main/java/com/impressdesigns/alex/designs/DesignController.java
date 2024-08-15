package com.impressdesigns.alex.designs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping(path = "/designs")
public class DesignController {
    private final DesignRepository designRepository;

    public DesignController(DesignRepository orderRepository) {
        this.designRepository = orderRepository;
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Design> getAllOrders() {
        return designRepository.findAll();
    }

    @GetMapping(path = "/{design_id}")
    public @ResponseBody Optional<Design> getDesign(@PathVariable String design_id) {
        return designRepository.findById(Integer.valueOf(design_id));
    }
}
