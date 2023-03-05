package de.madAcademy;

import org.springframework.data.annotation.Id;

public class Article {

    @Id
    private Long id;
    private String article_name;

    public Article() {
    }

    public Article(Long id, String article_name) {
        this.id = id;
        this.article_name = article_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticle_name() {
        return article_name;
    }

    public void setArticle_name(String article_name) {
        this.article_name = article_name;
    }

}