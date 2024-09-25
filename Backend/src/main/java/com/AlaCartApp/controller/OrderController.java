package com.AlaCartApp.controller;

import com.AlaCartApp.models.entity.Order;
import com.AlaCartApp.models.request.OrderDto;
import com.AlaCartApp.service.abstraction.OrderService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderDto> createOrderWithDetails(@RequestBody OrderDto orderDto) {
        return ResponseEntity.ok(orderService.create(orderDto));
    }

    @GetMapping
    public ResponseEntity<List<OrderDto>> ListOrder() {
        return ResponseEntity.ok(orderService.findAll());
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<OrderDto> updateOrder(@PathVariable Long id, @RequestBody OrderDto orderDto) {
        return ResponseEntity.ok(orderService.update(id, orderDto));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> deleteOrder(@PathVariable Long id) {
        orderService.delete(id);
        return ResponseEntity.noContent().build();

    }

    @GetMapping("/{id}")
    @Transactional
    public ResponseEntity<OrderDto> returnOrder(@PathVariable Long id){
        return ResponseEntity.ok(orderService.find(id));
    }
}
