package de.madAcademy;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {

    private ArticleRepositoty repo;

    public ArticleController(ArticleRepositoty repo) {
        this.repo = repo;
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
