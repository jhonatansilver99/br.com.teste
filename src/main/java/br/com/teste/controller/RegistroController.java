package br.com.teste.controller;


import br.com.teste.constant.Constants;
import br.com.teste.model.Registro;
import br.com.teste.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RegistroController {

    @Autowired
    private RegistroService registroService;

    @PostMapping(Constants.API_REGISTRO)
    public Registro save(@RequestBody Registro registro){
        return registroService.save(registro);
    }

    @GetMapping(Constants.API_REGISTRO)
    public List<Registro> findAll(){
        return registroService.findAll();
    }

    @PutMapping(Constants.API_REGISTRO)
    public Registro update(@RequestBody Registro registro){
        return registroService.save(registro);
    }

    @DeleteMapping(Constants.API_REGISTRO + "/{id}")
    public void delete(@PathVariable("id") int id){
        registroService.delete(id);
    }

    @GetMapping(Constants.API_REGISTRO + "/{id}")
    public Optional<Registro> findById (@PathVariable("id") int id){
        return registroService.findById(id);
    }
}
