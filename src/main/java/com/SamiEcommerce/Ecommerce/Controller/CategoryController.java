
package com.SamiEcommerce.Ecommerce.Controller;


import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.SamiEcommerce.Ecommerce.Model.Category;
import com.SamiEcommerce.Ecommerce.Service.Categoryservice;

@RestController
@RequestMapping("Category")
public class CategoryController  {
	 private Categoryservice Categoryservice;

	    public CategoryController(Categoryservice Categoryservice) {
	        this.Categoryservice = Categoryservice;
	    }

	    @GetMapping("")
	    public ResponseEntity<List<Category>> getClients() {
	        return new ResponseEntity<>(Categoryservice.findAll(), HttpStatus.OK);
	    }

	    @PostMapping("")
	    public ResponseEntity<Category> save( @RequestBody() Category Category) {
	        Category category = Categoryservice.save(Category);
	        return new ResponseEntity<>(category, HttpStatus.CREATED);
	    }

	    @GetMapping("/id/{id}")
	    public ResponseEntity<Category> findById(@PathVariable("id") Integer id) {
	        Category Category = Categoryservice.findById(id);
	        return ResponseEntity.ok(Category);
	    }

	  

	    @DeleteMapping("/id/{id}")
	    public ResponseEntity<?> delete(@PathVariable() Integer id) {
	        Categoryservice.delete(id);
	        return ResponseEntity.noContent().build();
	    }

	    @PutMapping("/id/{id}")
	    public ResponseEntity<Category> update( @RequestBody() Category Category, @PathVariable() Integer id) throws NotFoundException {
	        Category category = Categoryservice.update(Category, id);
	        return ResponseEntity.accepted().body(category);
	    }
}
