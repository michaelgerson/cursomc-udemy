package com.michael.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "categorias")
public class CategoriaResources {

    @RequestMapping()
    public String listar(){
        return "REST está funcionando";
    }
}
