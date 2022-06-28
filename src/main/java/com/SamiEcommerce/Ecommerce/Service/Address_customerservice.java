package com.SamiEcommerce.Ecommerce.Service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.SamiEcommerce.Ecommerce.Model.Address;
import com.SamiEcommerce.Ecommerce.Repository.addresscustomerrepository;

@Service()
public class Address_customerservice {
	

	 private addresscustomerrepository Addresscustomerrepository;
	  

	    public Address_customerservice(addresscustomerrepository Addresscustomer) {
	        this.Addresscustomerrepository = Addresscustomer;
	       
	    }

	   
	    public Address save(Address Addresscustomer) {
	    	return Addresscustomerrepository.save(Addresscustomer);
	      
	    }

	   
	    public Address findById(Integer id) {
	    	return Addresscustomerrepository.findById(id).orElseThrow(() -> new EntityNotFoundException(" not found"));
	        
	    }

	   
	
	   
	    public void delete(Integer id) {
	    	Addresscustomerrepository.deleteById(id);
	    }

	   
	    public Address update(Address Addresscustomer, Integer id) throws NotFoundException {
	        Optional<Address> AddresscustomerOptional = Addresscustomerrepository.findById(id);
	        if (AddresscustomerOptional.isPresent()) {
	    //        Addresscustomerrepository.setId(id);
	            return Addresscustomerrepository.save(Addresscustomer);
	          
	        } else {
	            throw new EntityNotFoundException(" Not Found");
	        }
	    }

	   
	    public List<Address> findAll() {
	        return Addresscustomerrepository.findAll();
	    }

}
