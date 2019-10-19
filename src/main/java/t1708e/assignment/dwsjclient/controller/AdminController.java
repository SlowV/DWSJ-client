package t1708e.assignment.dwsjclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "admin_index";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user() {return "admin_user";}

    @RequestMapping(value = "/place/manage", method = RequestMethod.GET)
    public String managePlace() {return "admin-place-manage";}

    @RequestMapping(value = "/image/manage", method = RequestMethod.GET)
    public String manageImage() {return "admin-image-manage";}
}
