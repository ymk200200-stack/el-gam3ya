package com.gam3eya.gam3eya;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() throws Exception {
        // بيقرأ ملف index.html الجديد اللي انت عملته
        return new String(Files.readAllBytes(Paths.get("src/main/resources/templates/index.html")));
    }
}