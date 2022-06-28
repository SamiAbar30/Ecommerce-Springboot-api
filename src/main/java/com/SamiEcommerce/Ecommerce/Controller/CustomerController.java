
package com.SamiEcommerce.Ecommerce.Controller;


import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.SamiEcommerce.Ecommerce.Model.Customer;
import com.SamiEcommerce.Ecommerce.Service.Customerservice;

@RestController
@RequestMapping("Customer")
public class CustomerController  {
	 private Customerservice Customerservice;

	    public CustomerController(Customerservice Customerservice) {
	        this.Customerservice = Customerservice;
	    }

	    @GetMapping("")
	    public ResponseEntity<List<Customer>> getClients() {
	        return new ResponseEntity<>(Customerservice.findAll(), HttpStatus.OK);
	    }

	    @PostMapping("")
	    public ResponseEntity<Customer> save( @RequestBody() Customer Customer) {
	        Customer customer = Customerservice.save(Customer);
	        return new ResponseEntity<>(customer, HttpStatus.CREATED);
	    }

	    @GetMapping("/id/{id}")
	    public ResponseEntity<Customer> findById(@PathVariable("id") Integer id) {
	        Customer Customer = Customerservice.findById(id);
	        return ResponseEntity.ok(Customer);
	    }

	  

	    @DeleteMapping("/id/{id}")
	    public ResponseEntity<?> delete(@PathVariable() Integer id) {
	        Customerservice.delete(id);
	        return ResponseEntity.noContent().build();
	    }

	    @PutMapping("/id/{id}")
	    public ResponseEntity<Customer> update( @RequestBody() Customer Customer, @PathVariable() Integer id) throws NotFoundException {
	        Customer customer = Customerservice.update(Customer, id);
	        return ResponseEntity.accepted().body(customer);
	    }
}
