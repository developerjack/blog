package org.jack.blog.site.controller;

import org.jack.blog.site.client.SampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jack
 */
@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @Autowired
    private SampleClient sampleClient;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return sampleClient.sayHi(name);
    }
}
