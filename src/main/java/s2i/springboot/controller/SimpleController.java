package s2i.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @PostMapping(value = "/s2i-sample-post")
    public String post(@RequestBody String test) {
        return "s2i controller post working: "+ test;
    }

    @GetMapping(value = "/s2i-sample-get")
    public String get() {
        return "s2i controller get working...\n";
    }

}
