package com.cliente.services;

import com.cliente.modelo.entities.Daniel;
import com.cliente.modelo.repo.crud.DanielCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanielService {

    private final DanielCrud oCrud;

    @Autowired
    public DanielService(DanielCrud oCrud) {
        this.oCrud = oCrud;
    }

    public List<Daniel> buscarTodos(){
        return (List<Daniel>) oCrud.findAll();
    }
}
