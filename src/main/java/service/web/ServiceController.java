package service.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ServiceController {

    @RequestMapping("/")
    String home() {
        return new Date().toString();
    }
}
