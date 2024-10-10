package gr.aueb.cf.starter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

//    @RequestMapping(path = "/coding", method = RequestMethod.GET)
    @GetMapping("/coding")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello Coding");
        return "index";
    }

    @GetMapping("/welcome")
    public String sayWelcome(@RequestParam(value = "name", defaultValue = "Guest") String name,
                             Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }
}
