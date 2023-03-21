package de.madAcademy.article;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!local")
public class ArticleServiceImpl implements ArticleService {

    Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);

    @Override
    public String sayHEllo() {
        logger.info("not local");

        return "not local";
    }

}
