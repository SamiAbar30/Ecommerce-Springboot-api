
package com.SamiEcommerce.Ecommerce.Controller;


import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.SamiEcommerce.Ecommerce.Model.Administrator;
import com.SamiEcommerce.Ecommerce.Service.Administratorservice;

@RestController
@RequestMapping("Administrator")
public class AdministratorController  {
	 private Administratorservice Administratorservice;

	    public AdministratorController(Administratorservice Administratorservice) {
	        this.Administratorservice = Administratorservice;
	    }

	    @GetMapping("")
	    public ResponseEntity<List<Administrator>> getClients() {
	        return new ResponseEntity<>(Administratorservice.findAll(), HttpStatus.OK);
	    }

	    @PostMapping("")
	    public ResponseEntity<Administrator> save( @RequestBody() Administrator Administrator) {
	        Administrator administrator = Administratorservice.save(Administrator);
	        return new ResponseEntity<>(administrator, HttpStatus.CREATED);
	    }

	    @GetMapping("/id/{id}")
	    public ResponseEntity<Administrator> findById(@PathVariable("id") Integer id) {
	        Administrator Administrator = Administratorservice.findById(id);
	        return ResponseEntity.ok(Administrator);
	    }

	  

	    @DeleteMapping("/id/{id}")
	    public ResponseEntity<?> delete(@PathVariable() Integer id) {
	        Administratorservice.delete(id);
	        return ResponseEntity.noContent().build();
	    }

	    @PutMapping("/id/{id}")
	    public ResponseEntity<Administrator> update( @RequestBody() Administrator Administrator, @PathVariable() Integer id) throws NotFoundException {
	        Administrator administrator = Administratorservice.update(Administrator, id);
	        return ResponseEntity.accepted().body(administrator);
	    }
}

