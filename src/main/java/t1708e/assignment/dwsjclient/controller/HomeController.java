package t1708e.assignment.dwsjclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "")
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getFormLogin(Model model){
        return "index";
    }
}
