package org.jack.blog.provider.service;

import org.jack.blog.provider.entity.content.Article;
import org.jack.blog.provider.repository.content.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jack
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public void create() {
        Article article = new Article();
        article.setTitle("中国联通");
        article.setContent("神州行，我看行");
        articleRepository.insert(article);
    }

    public Article get(String id) {
        return articleRepository.findOne(id);
    }
}
