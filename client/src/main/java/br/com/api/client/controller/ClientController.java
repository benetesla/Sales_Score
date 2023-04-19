package br.com.api.client.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.client.model.ClientModel;
import br.com.api.client.services.ClientService;


import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("/client")
    public Iterable<ClientModel> listarTodos(){
        return clientService.listarTodos();
    }   

    @GetMapping ("/")
    public String rota(){
        return "Api de clientes rodando";    
    }
}