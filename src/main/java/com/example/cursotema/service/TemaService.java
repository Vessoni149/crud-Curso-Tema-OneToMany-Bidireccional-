
package com.example.cursotema.service;

import com.example.cursotema.model.Tema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cursotema.repository.ITemaRepository;
import java.util.List;
import java.util.Optional;

@Service
public class TemaService implements ITemaService{
    @Autowired
    private ITemaRepository temaRepo;

    @Override
    public List<Tema> getTemas() {
       List<Tema> listaDeTemas = temaRepo.findAll();
       return listaDeTemas;
    }

    @Override
    public void saveTema(Tema tema) {
        temaRepo.save(tema);
    }

    @Override
    public void deleteTema(int id) {
        temaRepo.deleteById(id);
    }

    @Override
    public Tema findTema(int id) {
       Tema tema = temaRepo.findById(id).orElse(null);
       return tema;
    }

    
    @Override
    public void editTema(Tema tema) {
        this.saveTema(tema);
    }
   
}
    

