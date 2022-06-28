
package com.SamiEcommerce.Ecommerce.Controller;


import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.SamiEcommerce.Ecommerce.Model.Article;
import com.SamiEcommerce.Ecommerce.Service.Articleservice;

@RestController
@RequestMapping("Article")
public class ArticleController  {
	 private Articleservice Articleservice;

	    public ArticleController(Articleservice Articleservice) {
	        this.Articleservice = Articleservice;
	    }

	    @GetMapping("")
	    public ResponseEntity<List<Article>> getClients() {
	        return new ResponseEntity<>(Articleservice.findAll(), HttpStatus.OK);
	    }

	    @PostMapping("")
	    public ResponseEntity<Article> save( @RequestBody() Article Article) {
	        Article article = Articleservice.save(Article);
	        return new ResponseEntity<>(article, HttpStatus.CREATED);
	    }

	    @GetMapping("/id/{id}")
	    public ResponseEntity<Article> findById(@PathVariable("id") Integer id) {
	        Article Article = Articleservice.findById(id);
	        return ResponseEntity.ok(Article);
	    }

	  

	    @DeleteMapping("/id/{id}")
	    public ResponseEntity<?> delete(@PathVariable() Integer id) {
	        Articleservice.delete(id);
	        return ResponseEntity.noContent().build();
	    }

	    @PutMapping("/id/{id}")
	    public ResponseEntity<Article> update( @RequestBody() Article Article, @PathVariable() Integer id) throws NotFoundException {
	        Article article = Articleservice.update(Article, id);
	        return ResponseEntity.accepted().body(article);
	    }
}
