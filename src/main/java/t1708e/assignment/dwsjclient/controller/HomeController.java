package t1708e.assignment.dwsjclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.assignment.dwsjclient.service.place.Place;
import t1708e.assignment.dwsjclient.service.place.PlaceService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "")
public class HomeController {
    @Autowired
    PlaceService placeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) throws RemoteException {
        List<Place> places = placeService.getListPlace();
        model.addAttribute("places", places);
        return "index";
    }

    @RequestMapping(value = "/search-page", method = RequestMethod.GET)
    public String searchPage(Model model){
        return "search-page";
    }

    @RequestMapping(value = "/place-detail", method = RequestMethod.GET)
    public String placeDetail(Model model){
        return "place-detail";
    }
}
