package br.com.api.client.services;

import br.com.api.client.model.ClientModel;
import br.com.api.client.model.ResModel;
import br.com.api.client.repositorio.ClientRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepositorio clientRepositorio;
    @Autowired
    private ResModel rm;

    public Iterable<ClientModel> listarTodos() {
        return clientRepositorio.findAll();
    }   
    //metodo para salvar cliente
    public ResponseEntity<?> cadastra(ClientModel md, String acao){
        if(md.getName().equals("") || md.getName() == null){
            rm.setMensagem("Nome não pode ser vazio");
            return ResponseEntity.badRequest().body(rm);
        }else if(md.getMarca().equals("") || md.getMarca() == null){
            rm.setMensagem("Marca não pode ser vazio");
            return ResponseEntity.badRequest().body(rm);
        }else{
           if(acao.equals("cadastrar")){
                clientRepositorio.save(md);
                rm.setMensagem("Cliente cadastrado com sucesso");
                return ResponseEntity.ok().body(rm);
            }else if(acao.equals("atualizar")){
                clientRepositorio.save(md);
                rm.setMensagem("Cliente editado com sucesso");
                return ResponseEntity.ok().body(rm);
            
            }else if(acao.equals("remover")){
                clientRepositorio.delete(md);
                rm.setMensagem("Cliente removido com sucesso");
                return ResponseEntity.ok().body(rm);
            }            
            else{
                rm.setMensagem("Ação não encontrada");
                return ResponseEntity.badRequest().body(rm);
            }
        }    
    }

    //remover cliente
        public ResponseEntity<ResModel> remover(Long id){
            if(clientRepositorio.existsById(id)){
                clientRepositorio.deleteById(id);
                rm.setMensagem("Cliente removido com sucesso");
                return ResponseEntity.ok().body(rm);
            }else{
                rm.setMensagem("Cliente não encontrado");
                return ResponseEntity.badRequest().body(rm);
            }
        }
}
