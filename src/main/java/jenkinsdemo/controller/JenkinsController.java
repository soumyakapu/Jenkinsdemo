package jenkinsdemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class JenkinsController {
    @PostMapping("/create")
    public String test(){
        return "testing created";
    }
}
