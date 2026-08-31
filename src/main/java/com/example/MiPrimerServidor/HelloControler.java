package com.example.MiPrimerServidor;
// En esta clase es la que va a recibir peticiones http
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // Le estamos indicando que solo lo hará cuando haya /api
public class HelloControler {

    @GetMapping("/hello")
    public String hello(){
        return "Hola desde mi Servidor de Aplicación";
    }

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre){
        return "Hola: " +nombre+ " desde mi servidor de apps";
    }

    @PostMapping("/mensaje") // POST es para guardar
    public String recibirMensaje(@RequestBody String mensaje){ // Se puede enviaar un objeto completo como parametro
        return "recibí el mensaje "+mensaje;
    }

}
