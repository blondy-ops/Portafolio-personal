package com.example.Portafolio.Personal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //registra la clase como controlador HTTP
@RequestMapping("/api") //prefijo base de las rutas
public class HelloController {

    @GetMapping("/hello")     //GET /api/hello
    public String hello() {return "Hola desde springboot";}

    @GetMapping("/saludo") //GET /api/saludo
    public String saludar(@RequestParam String nombre) {return "Hola, " + nombre + "!";}
}
