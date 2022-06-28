package com.SamiEcommerce.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SamiEcommerce.Ecommerce.Model.Article;

public interface Articlerepository extends JpaRepository<Article, Integer>{

}
