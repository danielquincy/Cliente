package com.cliente.web;

import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class DanielCliente {
    Client cliente;


    @Autowired
    public DanielCliente(Client cliente) {
        this.cliente = ClientBuilder.newClient();
    }

    public void bienvenidaJson() {
        try {
            String resultado = this.cliente.target("http://localhost:8080/DanielController/daniel/todo")
                    .request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).get(String.class);

            System.out.println("Salida del Servidor ....");
            System.out.println(resultado);
            System.out.println("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
