package com.example.feastfreedom.controller;
import com.example.feastfreedom.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "")
public class controller {

    @GetMapping("/")
    public String home(){
        return "Home (All kitchens)";
    }

    @GetMapping("/kitchen/:id")
    public String kitchen(@PathVariable String id){
        return "Kitchen: "+id;
    }

    @PostMapping("/user_signup")
    public String user_signup(@RequestBody User user){
        return "User Registration (auto logs in)";
    }

    @PostMapping("/user_login")
    public String user_login(@RequestBody Map<String, String> info){
        return "User Login";
    }

    @PostMapping("/kitchen_registration")
    public String kitchen_registration(@RequestBody Map<String, String> info){
        return "User Login";
    }
}
