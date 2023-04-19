package br.com.api.client.services;

import br.com.api.client.model.ClientModel;
import br.com.api.client.repositorio.ClientRepositorio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
public class ClientService {

    @Autowired
    private ClientRepositorio clientRepositorio;
    @Autowired
    private ClientModel rModel;

    public Iterable<ClientModel> listarTodos() {
        return clientRepositorio.findAll();
    }

    public ResponseEntity<?> cadastraClient(ClientModel pm) {
        if (pm.getName() == null || pm.getName().isEmpty()) {
            pm.setName("Sem nome");
            return new ResponseEntity<>(pm, HttpStatus.BAD_REQUEST);
        } else if (pm.getMarca() == null || pm.getMarca().isEmpty()) {
            pm.setMarca("Sem marca");
            return new ResponseEntity<>(pm, HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(clientRepositorio.save(pm), HttpStatus.CREATED);

        }
    }

}
