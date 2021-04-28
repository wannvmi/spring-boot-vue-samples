package org.javaboy.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private SayHello sayHello;

    @GetMapping("/hello")
    public String Hello() {
        return sayHello.sayHello("life");
    }
}
