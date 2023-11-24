
package com.example.cursotema.service;

import com.example.cursotema.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cursotema.repository.ICursoRepository;
import java.util.Date;
import java.util.List;

@Service
public class CursoService implements ICursoService{
    @Autowired
    private ICursoRepository cursoRepo;

    @Override
    public List<Curso> getCursos() {
        List<Curso> listaCursos = cursoRepo.findAll();
        return listaCursos;
    }

   
    @Override
    public void deleteCurso(int id) {
        cursoRepo.deleteById(id);
    }

    @Override
    public Curso findCurso(int id) {
        Curso curso = cursoRepo.findById(id).orElse(null);
        return curso;
    }

    @Override
    public void saveCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public void editCurso(Curso curso) {
     this.saveCurso(curso);
     
    }
}
