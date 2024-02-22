package hei.school.sarisary.endpoint.rest.controller;

import hei.school.sarisary.repository.model.ImageModel;
import hei.school.sarisary.service.SarysaryService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

public class SarysaryController {
    private final SarysaryService sarysaryService;

    public  SarysaryController(SarysaryService sarysaryService) {
        this.sarysaryService = sarysaryService;
    }

    @RequestMapping(
            path = "/blacks/{id}",
            method = RequestMethod.PUT,
            consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}
    )
    public String turnToBlack(@PathVariable(name = "id") String id, @ModelAttribute ImageModel image)
            throws IOException {
        return sarysaryService.transformImage(id, image.getFile());
    }

    @GetMapping("/blacks/{id}")
    public String getBlackedImage(@PathVariable String id) {
        return id + "is blacked";
    }
}
