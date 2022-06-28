package com.SamiEcommerce.Ecommerce.Service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.SamiEcommerce.Ecommerce.Model.Administrator;
import com.SamiEcommerce.Ecommerce.Repository.Administratorrepository;

@Service()
public class Administratorservice {

	 private Administratorrepository Administratorrepository;
	  

	    public Administratorservice(Administratorrepository Administrator) {
	        this.Administratorrepository = Administrator;
	       
	    }

	   
	    public Administrator save(Administrator Administrator) {
	    	return Administratorrepository.save(Administrator);
	      
	    }

	   
	    public Administrator findById(Integer id) {
	    	return Administratorrepository.findById(id).orElseThrow(() -> new EntityNotFoundException(" not found"));
	        
	    }

	   
	
	   
	    public void delete(Integer id) {
	    	Administratorrepository.deleteById(id);
	    }

	   
	    public Administrator update(Administrator Administrator, Integer id) throws NotFoundException {
	        Optional<Administrator> AdministratorOptional = Administratorrepository.findById(id);
	        if (AdministratorOptional.isPresent()) {
	      //      Administratorrepository.setId(id);
	            return Administratorrepository.save(Administrator);
	          
	        } else {
	            throw new EntityNotFoundException("Administrator Not Found");
	        }
	    }

	   
	    public List<Administrator> findAll() {
	        return Administratorrepository.findAll();
	    }

}
