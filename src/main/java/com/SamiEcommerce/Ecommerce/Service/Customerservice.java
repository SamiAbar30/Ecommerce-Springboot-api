package com.SamiEcommerce.Ecommerce.Service;


import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.SamiEcommerce.Ecommerce.Model.Customer;
import com.SamiEcommerce.Ecommerce.Repository.Customerrepository;

@Service()
public class Customerservice {

	 private Customerrepository Customerrepository;
	  

	    public Customerservice(Customerrepository Customer) {
	        this.Customerrepository = Customer;
	       
	    }

	   
	    public Customer save(Customer Customer) {
	    	return Customerrepository.save(Customer);
	      
	    }

	   
	    public Customer findById(Integer id) {
	    	return Customerrepository.findById(id).orElseThrow(() -> new EntityNotFoundException(" not found"));
	        
	    }

	   
	
	   
	    public void delete(Integer id) {
	    	Customerrepository.deleteById(id);
	    }

	   
	    public Customer update(Customer Customer, Integer id) throws NotFoundException {
	        Optional<Customer> CustomerOptional = Customerrepository.findById(id);
	        if (CustomerOptional.isPresent()) {
	    //        Customerrepository.setId(id);
	            return Customerrepository.save(Customer);
	          
	        } else {
	            throw new EntityNotFoundException(" Not Found");
	        }
	    }

	   
	    public List<Customer> findAll() {
	        return Customerrepository.findAll();
	    }
}
