package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello"; // -> resources:templates/hello.html (Thymeleaf 템플릿 엔진 처리)
    }

    // required = false로 지정하면 name에 해당하는 값이 없어도 Error 발생 x
    // required 지정하지 않고 localhost:8080/hello-mvc 호출 시 파라미터가 없어 Error 발생 o
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name"/*, required = false*/) String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; //"hello spring"
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        //Jackson (범용성 있음), Gson -> 기본 객체처리 MappingJackson2HttpMessageConverter
        return hello;   // JSON 객체 형태로 반환 {"name","xxx"}
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
