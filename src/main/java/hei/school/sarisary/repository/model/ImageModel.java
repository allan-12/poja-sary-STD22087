package hei.school.sarisary.repository.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;
@Getter
@Setter
@Builder
public class ImageModel {
    private MultipartFile file;
}
