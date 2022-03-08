package scott.springBootMasterClass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    @GetMapping
    public String login(ModelMap model) {
    	//model.addAttribute("hello", "Hello World!!!");
    	model.put("hello", "Hello World!!!");
        return "hello";
    }

}
