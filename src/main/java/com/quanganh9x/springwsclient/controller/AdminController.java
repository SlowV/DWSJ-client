//package com.quanganh9x.springwsclient.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import com.quanganh9x.springwsclient.service.place.Image;
//import com.quanganh9x.springwsclient.service.place.Place;
//import com.quanganh9x.springwsclient.service.place.PlaceService;
//
//import java.rmi.RemoteException;
//
//@Controller
//@RequestMapping(value = "/admin")
//public class AdminController {
//
//    @Autowired
//    PlaceService placeService;
//
//    @RequestMapping(method = RequestMethod.GET)
//    public String index() {
//        return "admin_index";
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/createPlace")
//    public String getFormCreate(Model model){
//        Place place= new Place();
//        model.addAttribute("place", place);
//        return "test/addPlace";
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/createPlace")
//    public String postFormCreate(Model model, Place place) throws RemoteException {
//        placeService.createPlace(place, new Image());
//        return "test/addPlace";
//    }
//    @RequestMapping(value = "/user", method = RequestMethod.GET)
//    public String user() {return "admin_user";}
//
//    @RequestMapping(value = "/place/manage", method = RequestMethod.GET)
//    public String managePlace() {return "admin-place-manage";}
//
//    @RequestMapping(value = "/image/manage", method = RequestMethod.GET)
//    public String manageImage() {return "admin-image-manage";}
//
//    @RequestMapping(value = "/comment/manage", method = RequestMethod.GET)
//    public String manageComment() {return "admin-comment-manage";}
//
//    @RequestMapping(value = "/rating/manage", method = RequestMethod.GET)
//    public String manageRating() {return "admin-rating-manage";}
//}
