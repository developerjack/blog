package org.jack.blog.provider.repository.content;

import org.jack.blog.provider.entity.content.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author jack
 */
public interface ArticleRepository extends MongoRepository<Article, String> {

}
