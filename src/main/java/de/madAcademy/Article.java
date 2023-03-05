package de.madAcademy;

import org.springframework.data.annotation.Id;

public record Article(@Id Long id, String article_name) {
}