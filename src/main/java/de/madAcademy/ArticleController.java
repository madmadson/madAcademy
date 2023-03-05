package de.madAcademy;

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

    @Autowired
    private ArticleRepository repo;

    @Autowired
    private ArticleService service;

    // public ArticleController(ArticleRepository repo) {
    // this.repo = repo;
    // }

    @GetMapping()
    public ResponseEntity<String> hello() {

        return ResponseEntity.ok("Hello");

    }

    @GetMapping("/{requestedId}")
    public ResponseEntity<Article> findById(@PathVariable Long requestedId) {

        if (requestedId.equals(1000L))
            return ResponseEntity.notFound().build();

        // Optional<Article> maybeArticle = repo.findById(requestedId);
        Optional<Article> maybeArticle = Optional.of(new Article(99L, "lala"));
        if (maybeArticle.isPresent()) {
            return ResponseEntity.ok(maybeArticle.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
