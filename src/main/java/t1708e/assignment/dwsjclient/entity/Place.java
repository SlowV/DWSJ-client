package t1708e.assignment.dwsjclient.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import t1708e.assignment.dwsjclient.service.image.ImageService;
import t1708e.assignment.dwsjclient.service.rating.RatingService;
import t1708e.assignment.dwsjclient.util.StringConst;

import javax.persistence.*;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private Set<Image> images;
    private Set<Rating> ratings;
    private Set<Comment> comments;
    private long createdAt;
    private long updatedAt;
    private long deletedAt;
    private int status;

//    @Autowired
//    private ImageService imageService;
//    @Autowired
//    private RatingService ratingService;

    public Place() {
        long now = System.currentTimeMillis();
        this.createdAt = now;
        this.updatedAt = now;
        this.status = 1;
    }

//    public Rating getRatingBiggest(Place place) throws RemoteException {
//        return ratingService.findByPlaceOrImage(place, StringConst.TYPE_PLACE);
//    }
//
//    public void setImages(Set<Image> images) {
//        this.images = images;
//    }
//
//    public List<Image> getImages(Place place) throws RemoteException {
//        return imageService.getImagesByPlace(place);
//    }
}
