package com.SamiEcommerce.Ecommerce.Controller;


import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.SamiEcommerce.Ecommerce.Model.Order;
import com.SamiEcommerce.Ecommerce.Service.Orderservice;

@RestController
@RequestMapping("order")
public class OrderController  {
	 private Orderservice orderservice;

	    public OrderController(Orderservice orderservice) {
	        this.orderservice = orderservice;
	    }

	    @GetMapping("")
	    public ResponseEntity<List<Order>> getClients() {
	        return new ResponseEntity<>(orderservice.findAll(), HttpStatus.OK);
	    }

	    @PostMapping("")
	    public ResponseEntity<Order> save( @RequestBody() Order Order) {
	        Order order = orderservice.save(Order);
	        return new ResponseEntity<>(order, HttpStatus.CREATED);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Order> findById(@PathVariable("id") Integer id) {
	        Order Order = orderservice.findById(id);
	        return ResponseEntity.ok(Order);
	    }

	  

	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> delete(@PathVariable() Integer id) {
	        orderservice.delete(id);
	        return ResponseEntity.noContent().build();
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Order> update( @RequestBody() Order Order, @PathVariable() Integer id) throws NotFoundException {
	        Order order = orderservice.update(Order, id);
	        return ResponseEntity.accepted().body(order);
	    }
}
