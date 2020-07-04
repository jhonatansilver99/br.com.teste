package br.com.teste.service;


import br.com.teste.model.Registro;
import br.com.teste.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroService {


    @Autowired
    private RegistroRepository registroRepository;

    public Registro save(Registro registro){
        return registroRepository.save(registro);
    }

    public List<Registro> findAll (){
        return registroRepository.findAll();
    }

    public Optional<Registro> findById (int id){
        return registroRepository.findById(id);
    }

    public void delete(int id){
        registroRepository.deleteById(id);
    }
}
