package com.SamiEcommerce.Ecommerce.Service;


import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.SamiEcommerce.Ecommerce.Model.Category;
import com.SamiEcommerce.Ecommerce.Repository.Categoryrepository;

@Service()
public class Categoryservice {

	 private Categoryrepository Categoryrepository;
	  

	    public Categoryservice(Categoryrepository Category) {
	        this.Categoryrepository = Category;
	       
	    }

	   
	    public Category save(Category Category) {
	    	return Categoryrepository.save(Category);
	      
	    }

	   
	    public Category findById(Integer id) {
	    	return Categoryrepository.findById(id).orElseThrow(() -> new EntityNotFoundException(" not found"));
	        
	    }

	   
	
	   
	    public void delete(Integer id) {
	    	Categoryrepository.deleteById(id);
	    }

	   
	    public Category update(Category Category, Integer id) throws NotFoundException {
	        Optional<Category> CategoryOptional = Categoryrepository.findById(id);
	        if (CategoryOptional.isPresent()) {
	          //  Categoryrepository.setId(id);
	            return Categoryrepository.save(Category);
	          
	        } else {
	            throw new EntityNotFoundException(" Not Found");
	        }
	    }

	   
	    public List<Category> findAll() {
	        return Categoryrepository.findAll();
	    }
	
}
