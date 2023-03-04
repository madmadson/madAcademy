package de.madAcademy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class MyFirstController {

    @GetMapping("/{requestedId}")
    public ResponseEntity<Article> findById(@PathVariable Long requestedId) {
        if (requestedId.equals(1000L)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(new Article(1000L, "lala"));
    }

}
