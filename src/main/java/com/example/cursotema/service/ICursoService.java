
package com.example.cursotema.service;

import com.example.cursotema.model.Curso;
import java.util.Date;
import java.util.List;


public interface ICursoService {
    
    public List<Curso> getCursos();
    public void saveCurso(Curso curso);
    public void deleteCurso(int id);
    public Curso findCurso(int id);
    public void editCurso(Curso curso);
}
