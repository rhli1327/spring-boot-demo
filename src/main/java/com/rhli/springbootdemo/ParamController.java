package com.rhli.springbootdemo;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParamController {
    @GetMapping("/noAnnotation")
    public User noAnnotation(User user) {
        return user;
    }

    @RequestMapping("/requestParam")
    public User requestParam(@RequestParam String name, @RequestParam int age) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        return user;
    }

    @GetMapping("/pathVar/{name}/{age}")
    public User pathVar(@PathVariable String name, @PathVariable int age) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        return user;
    }

    @PostMapping("/requestBody")
    public User requestBody(@RequestBody @Valid User user) {
        return user;
    }
}
