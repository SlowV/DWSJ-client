package t1708e.assignment.dwsjclient.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import t1708e.assignment.dwsjclient.entity.Image;
import t1708e.assignment.dwsjclient.entity.Place;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.*;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    Environment environment;

//    @Autowired
//    PlaceService placeService;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "admin_index";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/createPlace")
    public String getFormCreate(Model model){
        model.addAttribute("place", new Place());
        return "test/addPlace";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createPlace")
    @ResponseBody
    public String postFormCreate(@RequestParam("name") String name,
                                 @RequestParam("description") String description,
                                 @RequestParam("images") MultipartFile[] images) throws RemoteException {
        List<Image> imageList = new ArrayList<>();
        for (MultipartFile file : images) {
            Image image = new Image();
            image.setName(file.getOriginalFilename());
            image.setSource(uploadImage(file));
            imageList.add(image);
        }
        Place place = new Place();
        place.setName(name);
        place.setDescription(description);
//        placeService.createPlace(place, (Image[]) imageList.toArray());
        return imageList.toString();
    }


    public String uploadImage(MultipartFile file){
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", environment.getProperty("cloudinary.cloud_name"),
                "api_key", environment.getProperty("cloudinary.api_key"),
                "api_secret", environment.getProperty("cloudinary.api_secret")));
        try {
            File uploadedFile = convertMultiPartToFile(file);
            Map uploadResult = cloudinary.uploader().upload(uploadedFile, ObjectUtils.emptyMap());
            return uploadResult.get("url").toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(Objects.requireNonNull(file.getOriginalFilename()));
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user() {return "admin_user";}

    @RequestMapping(value = "/place/manage", method = RequestMethod.GET)
    public String managePlace() {return "admin-place-manage";}

    @RequestMapping(value = "/image/manage", method = RequestMethod.GET)
    public String manageImage() {return "admin-image-manage";}

    @RequestMapping(value = "/comment/manage", method = RequestMethod.GET)
    public String manageComment() {return "admin-comment-manage";}

    @RequestMapping(value = "/rating/manage", method = RequestMethod.GET)
    public String manageRating() {return "admin-rating-manage";}
}
