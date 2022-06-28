package com.SamiEcommerce.Ecommerce.Service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.SamiEcommerce.Ecommerce.Model.Order;
import com.SamiEcommerce.Ecommerce.Repository.Orderrepository;

@Service()
public class Orderservice  {
	  private Orderrepository Orderrepository;
	  

	    public Orderservice(Orderrepository Order) {
	        this.Orderrepository = Order;
	       
	    }

	   
	    public Order save(Order Order) {
	    	return Orderrepository.save(Order);
	      
	    }

	   
	    public Order findById(Integer id) {
	    	return Orderrepository.findById(id).orElseThrow(() -> new EntityNotFoundException(" not found"));
	        
	    }

	   
	
	   
	    public void delete(Integer id) {
	    	Orderrepository.deleteById(id);
	    }

	   
	    public Order update(Order Order, Integer id) throws NotFoundException {
	        Optional<Order> OrderOptional = Orderrepository.findById(id);
	        if (OrderOptional.isPresent()) {
	       //     Orderrepository.setId(id);
	            return Orderrepository.save(Order);
	          
	        } else {
	            throw new EntityNotFoundException(" Not Found");
	        }
	    }

	   
	    public List<Order> findAll() {
	        return Orderrepository.findAll();
	    }
	
}
