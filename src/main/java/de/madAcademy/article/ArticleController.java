package de.madAcademy.article;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {

    private ArticleService service;
    private ArticleRepository repo;

    public ArticleController(ArticleRepository repo, ArticleService service) {
        this.repo = repo;
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<String> hello() {

        return ResponseEntity.ok(service.sayHEllo());

    }

    @GetMapping("/{requestedId}")
    public ResponseEntity<Article> findById(@PathVariable Long requestedId) {

        Optional<Article> maybeArticle = repo.findById(requestedId);

        if (maybeArticle.isPresent()) {
            return ResponseEntity.ok(maybeArticle.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
