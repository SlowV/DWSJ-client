package t1708e.assignment.dwsjclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import t1708e.assignment.dwsjclient.service.comment.CommentService;
import t1708e.assignment.dwsjclient.service.comment.CommentServiceServiceLocator;
import t1708e.assignment.dwsjclient.service.image.ImageService;
import t1708e.assignment.dwsjclient.service.image.ImageServiceServiceLocator;
import t1708e.assignment.dwsjclient.service.rating.RatingService;
import t1708e.assignment.dwsjclient.service.rating.RatingServiceServiceLocator;
import t1708e.assignment.dwsjclient.service.user.UserService;
import t1708e.assignment.dwsjclient.service.user.UserServiceServiceLocator;

import javax.xml.rpc.ServiceException;

@Configuration
public class AppConfig {
    @Bean
    public UserService userService() throws ServiceException {
        UserServiceServiceLocator userServiceServiceLocator = new UserServiceServiceLocator();
        return userServiceServiceLocator.getUserServicePort();
    }

    @Bean
    public ImageService imageService() throws ServiceException {
        ImageServiceServiceLocator imageServiceServiceLocator = new ImageServiceServiceLocator();
        return imageServiceServiceLocator.getImageServicePort();
    }

    @Bean
    public CommentService commentService() throws ServiceException {
        CommentServiceServiceLocator commentServiceServiceLocator = new CommentServiceServiceLocator();
        return commentServiceServiceLocator.getCommentServicePort();
    }

    @Bean
    public RatingService ratingService() throws ServiceException {
        RatingServiceServiceLocator ratingtServiceServiceLocator = new RatingServiceServiceLocator();
        return ratingtServiceServiceLocator.getRatingServicePort();
    }

//    @Bean
//    public PlaceService placeService() throws ServiceException {
//        PlaceServiceServiceLocator placeServiceServiceLocator = new PlaceServiceServiceLocator();
//        return placeServiceServiceLocator.getPlaceServicePort();
//    }

}
