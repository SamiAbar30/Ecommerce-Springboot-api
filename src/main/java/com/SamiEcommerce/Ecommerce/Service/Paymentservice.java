package com.SamiEcommerce.Ecommerce.Service;


import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.SamiEcommerce.Ecommerce.Model.Payment;
import com.SamiEcommerce.Ecommerce.Repository.Paymentrepsitory;

@Service()
public class Paymentservice {
	  private Paymentrepsitory Paymentrepository;
	  

	    public Paymentservice(Paymentrepsitory Payment) {
	        this.Paymentrepository = Payment;
	       
	    }

	   
	    public Payment save(Payment Payment) {
	    	return Paymentrepository.save(Payment);
	      
	    }

	   
	    public Payment findById(Integer id) {
	    	return Paymentrepository.findById(id).orElseThrow(() -> new EntityNotFoundException(" not found"));
	        
	    }

	   
	
	   
	    public void delete(Integer id) {
	    	Paymentrepository.deleteById(id);
	    }

	   
	    public Payment update(Payment Payment, Integer id) throws NotFoundException {
	        Optional<Payment> PaymentOptional = Paymentrepository.findById(id);
	        if (PaymentOptional.isPresent()) {
	       //     Paymentrepository.setId(id);
	            return Paymentrepository.save(Payment);
	          
	        } else {
	            throw new EntityNotFoundException(" Not Found");
	        }
	    }

	   
	    public List<Payment> findAll() {
	        return Paymentrepository.findAll();
	    }
	
}
