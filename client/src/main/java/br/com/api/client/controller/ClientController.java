package br.com.api.client.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.client.model.ClientModel;
import br.com.api.client.services.ClientService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    
    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ClientModel client){
        return clientService.cadastra(client, "cadastrar");
    }
    @GetMapping("/client")
    public Iterable<ClientModel> listarTodos(){
        return clientService.listarTodos();
    }   
    @GetMapping ("/")
    public String rota(){
        return "Api de clientes rodando";    
    }
}