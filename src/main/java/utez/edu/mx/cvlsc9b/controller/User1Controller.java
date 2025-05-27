package utez.edu.mx.cvlsc9b.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user1")

public class User1Controller {
    @GetMapping("")
    public String getMessage() {
        return "Hola desde user1";
    }
}
