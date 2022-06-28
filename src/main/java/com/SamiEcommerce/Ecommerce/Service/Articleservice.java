package com.SamiEcommerce.Ecommerce.Service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.SamiEcommerce.Ecommerce.Model.Article;
import com.SamiEcommerce.Ecommerce.Repository.Articlerepository;

@Service()
public class Articleservice{



	 private Articlerepository Articlerepository;
	  

	    public Articleservice(Articlerepository Article) {
	        this.Articlerepository = Article;
	       
	    }

	   
	    public Article save(Article Article) {
	    	return Articlerepository.save(Article);
	      
	    }

	   
	    public Article findById(Integer id) {
	    	return Articlerepository.findById(id).orElseThrow(() -> new EntityNotFoundException(" not found"));
	        
	    }

	   
	
	   
	    public void delete(Integer id) {
	    	Articlerepository.deleteById(id);
	    }

	   
	    public Article update(Article Article, Integer id) throws NotFoundException {
	        Optional<Article> ArticleOptional = Articlerepository.findById(id);
	        if (ArticleOptional.isPresent()) {
	   //         Articlerepository.setId(id);
	            return Articlerepository.save(Article);
	          
	        } else {
	            throw new EntityNotFoundException(" Not Found");
	        }
	    }

	   
	    public List<Article> findAll() {
	        return Articlerepository.findAll();
	    }

}
