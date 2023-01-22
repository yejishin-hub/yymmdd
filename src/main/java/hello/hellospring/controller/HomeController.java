package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // 2022-03-12 (Sat)
    // 맵핑되는 정적 컨텐츠가 있으므로 index.html (웰컴 페이지) 으로 이동하지 않음
    @GetMapping("/")
    public String home() {
        return "home";  // home.html
    }
}
