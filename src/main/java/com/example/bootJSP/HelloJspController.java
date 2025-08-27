package com.example.bootJSP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// http://localhost:8080/hello-jsp
@Controller
public class HelloJspController {
    @GetMapping("/hello-jsp")
    public String helloJsp() {
        return "hello"; // hello.jsp 를 찾아감
    }

}
