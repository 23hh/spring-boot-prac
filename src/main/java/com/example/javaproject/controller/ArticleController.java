package com.example.javaproject.controller;

import com.example.javaproject.dto.ArticleForm;
import com.example.javaproject.entity.Article;
import com.example.javaproject.repositoty.ArticleRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class ArticleController {
    @Autowired // 스프링 부트가 미리 생성해놓은 객체를 가져다가 자동 연결
    private ArticleRepositoty articleRepositoty;
    @GetMapping("/articles/new")
    public String newArticleForm() {

        return "articles/new";
    }
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());

        //1. dto를 변환 Entity
        Article article = form.toEntity();
        System.out.println(article);

        //2. Repository에게 Entity를 DB에 저장하게 함
        Article saved = articleRepositoty.save(article);
        System.out.println(saved.toString());
        return "";
    }
}
