package com.example.javaproject.repositoty;

import com.example.javaproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepositoty extends CrudRepository<Article, Long> {


}
