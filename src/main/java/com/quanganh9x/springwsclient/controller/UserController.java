//package com.quanganh9x.springwsclient.controller;
//
//import com.quanganh9x.springwsclient.util.StringUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import com.quanganh9x.springwsclient.service.user.User;
//import com.quanganh9x.springwsclient.service.user.UserService;
//
//import java.rmi.RemoteException;
//
//@Controller
//@RequestMapping(value = "/users")
//public class UserController {
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String getFormLogin(Model model) {
//        model.addAttribute("user", new User());
//        return "login";
//    }
//
////    @RequestMapping(value = "/login", method = RequestMethod.POST)
////    public String postFormLogin(Model model, User user) throws RemoteException {
////        User userResult = userService.login(user);
////        if (userResult == null || !userResult.getPassword().equals(passwordEncoder.encode(user.getPassword()))) {
////            model.addAttribute("user", user);
////            return "login";
////        }
////        return "index";
////    }
//
//    @RequestMapping(value = "/register", method = RequestMethod.GET)
//    public String getFormRegister(Model model) {
//        model.addAttribute("user", new User());
//        return "register";
//    }
//
//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public String postFormRegister(Model model, User user) throws RemoteException {
//        if (userService.register(user) == null) {
//            user.setRole(StringUtil.ROLE_USER);
//            user.setPassword(passwordEncoder.encode(user.getPassword()));
//            model.addAttribute("user", user);
//            return "register";
//        }
//        return "redirect:/users/login";
//    }
//
//}
