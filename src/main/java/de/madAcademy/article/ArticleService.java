package de.madAcademy.article;

import org.springframework.stereotype.Service;

@Service
interface ArticleService {

    public String sayHEllo();

    default ArticleDto toDto(Article a) {
        ArticleDto dto = new ArticleDto();
        dto.setArticleName(a.getArticle_name());
        dto.setId(a.getId());
        return dto;
    }
}
