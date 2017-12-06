package org.jack.blog.provider.controller.content;

import org.jack.blog.provider.entity.content.Article;
import org.jack.blog.provider.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jack
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        articleService.create();
        Article article = articleService.get("5a2783f09450f31f626e451c");
        return article.getTitle();
    }
}
