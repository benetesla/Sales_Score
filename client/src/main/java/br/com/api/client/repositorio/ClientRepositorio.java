package br.com.api.client.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.client.model.ClientModel;
@Repository
public  interface ClientRepositorio extends CrudRepository<ClientModel,Long> {
}
