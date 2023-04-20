package br.com.api.client.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.client.model.ClientModel;
import br.com.api.client.services.ClientService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*")
public class ClientController {
    @Autowired
    private ClientService clientService;
    
    @DeleteMapping("/remover/{codigo}")
    public ResponseEntity<?> remover(@PathVariable Long codigo){
        return clientService.remover(codigo);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<?> atualizar(@RequestBody ClientModel client){
        return clientService.cadastra(client, "atualizar");
    }
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