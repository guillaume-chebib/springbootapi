package fr.poly.mtp.ig5.iwa.springbootapi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("")
@RestController
public class HomeController {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("")
    public Map<String,String> getHome(){
        Map<String,String> version = new HashMap<>();
        version.put("version",appVersion);
        return version;
    }
}
