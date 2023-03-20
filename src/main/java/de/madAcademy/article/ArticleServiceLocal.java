package de.madAcademy.article;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("local")
public class ArticleServiceLocal implements ArticleService {

    Logger logger = LoggerFactory.getLogger(ArticleServiceLocal.class);

    @Override
    public String sayHEllo() {
        logger.info("local");
        return "local3";
    }
}
