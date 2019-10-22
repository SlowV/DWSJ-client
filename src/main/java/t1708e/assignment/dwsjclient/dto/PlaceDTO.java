package t1708e.assignment.dwsjclient.dto;

import org.springframework.web.multipart.MultipartFile;

public class PlaceDTO {
    private String name;
    private String description;
    private Object images;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getImages() {
        return images;
    }

    public void setImages(Object images) {
        this.images = images;
    }
}
