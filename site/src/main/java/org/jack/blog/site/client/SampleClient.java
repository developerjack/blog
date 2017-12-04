package org.jack.blog.site.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jack
 */
@FeignClient("router")
public interface SampleClient {

    @RequestMapping(value = "/sample/hi", method = RequestMethod.GET)
    String sayHi(@RequestParam("name") String name);
}
