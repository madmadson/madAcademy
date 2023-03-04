package de.madAcademy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class MyFirstController {

    @GetMapping("/{requestedId}")
    public ResponseEntity<String> findById() {
        return ResponseEntity.ok("{}");
    }

}
