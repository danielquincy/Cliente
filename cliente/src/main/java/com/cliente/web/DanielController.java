package com.cliente.web;

import com.cliente.modelo.entities.Daniel;
import com.cliente.services.DanielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;
import java.util.List;


@RestController
@RequestMapping(value = "/daniel")
public class DanielController {
    private final DanielService oService;

    @Autowired
    public DanielController(DanielService oService) {
        this.oService = oService;

    }
    @GetMapping(value = "/todo", produces = MediaType.APPLICATION_JSON)
    public List<Daniel> buscarTodos(){
        return oService.buscarTodos();
    }

}
