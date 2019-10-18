package t1708e.assignment.dwsjclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.assignment.dwsjclient.service.user.User;
import t1708e.assignment.dwsjclient.service.user.UserService;

import java.rmi.RemoteException;

@Controller
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getFormLogin(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String postFormLogin(Model model, User user) throws RemoteException {
        if (userService.login(user) == null){
            model.addAttribute("user", user);
            return "login";
        }
        return "index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getFormRegister(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String postFormRegister(Model model, User user) throws RemoteException {
        if(userService.register(user) == null){
            model.addAttribute("user", user);
            return "register";
        };
        return "redirect:/users/login";
    }

}