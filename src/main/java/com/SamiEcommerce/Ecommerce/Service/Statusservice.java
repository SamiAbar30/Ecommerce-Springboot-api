package com.SamiEcommerce.Ecommerce.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.SamiEcommerce.Ecommerce.Model.Status;
import com.SamiEcommerce.Ecommerce.Repository.Statusrepository;

@Service()
public class Statusservice{

	  private Statusrepository statusrepository;
	  

	    public Statusservice(Statusrepository Status) {
	        this.statusrepository = Status;
	       
	    }

	   
	    public Status save(Status Status) {
	    	return statusrepository.save(Status);
	      
	    }

	   
	    public Status findById(Integer id) {
	    	return statusrepository.findById(id).orElseThrow(() -> new EntityNotFoundException(" not found"));
	        
	    }

	   
	
	   
	    public void delete(Integer id) {
	    	statusrepository.deleteById(id);
	    }

	   
	    public Status update(Status Status, Integer id) throws NotFoundException {
	        Optional<Status> StatusOptional = statusrepository.findById(id);
	        if (StatusOptional.isPresent()) {
	           // statusrepository.setId(id);
	            return statusrepository.save(Status);
	          
	        } else {
	            throw new EntityNotFoundException(" Not Found");
	        }
	    }

	   
	    public List<Status> findAll() {
	        return statusrepository.findAll();
	    }

}
