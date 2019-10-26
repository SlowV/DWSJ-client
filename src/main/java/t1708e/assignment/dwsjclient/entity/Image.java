package t1708e.assignment.dwsjclient.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String source;
    private Place place;
    private Set<Rating> ratings;
    private Set<Comment> comments;
    private long createdAt;
    private long updatedAt;
    private long deletedAt;
    private int status;

    public Image() {
        long now = System.currentTimeMillis();
        this.createdAt = now;
        this.updatedAt = now;
        this.status = 1;
    }


}
