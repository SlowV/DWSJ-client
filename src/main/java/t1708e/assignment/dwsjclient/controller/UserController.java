package t1708e.assignment.dwsjclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.assignment.dwsjclient.entity.User;

@Controller
@RequestMapping(value = "/users")
public class UserController {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getFormLogin(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String postFormLogin(){
        return "index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getFormRegister(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String postFormRegister(User User){
        return "redirect:/users/login";
    }


}
