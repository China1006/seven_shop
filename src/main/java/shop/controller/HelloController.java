package shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello controller
 */
@RestController
public class HelloController {
    /**
     * say hello api.
     * http://localhost:8080/v1/hello/seven
     * @param name
     * @return hello string
     */
    @GetMapping(path = "v1/hello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return String.format("hello, %S", name);
    }

    /**
     * say greeting
     * http://localhost:8080/v1/hello?name=java
     * @param name
     * @return hello
     */
    @GetMapping("v1/hello")
    public String sayGreeting(@RequestParam("name") String name){
        return String.format("hello, %s",name);
    }
}
