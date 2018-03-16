package org.jack.blog.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jack
 */
@Controller
@RequestMapping
public class HomeController {

    @RequestMapping
    public String home() {
        return "index.html";
    }
}
