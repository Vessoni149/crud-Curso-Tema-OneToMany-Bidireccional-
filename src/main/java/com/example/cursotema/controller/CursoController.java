
package com.example.cursotema.controller;

import com.example.cursotema.model.Curso;
import com.example.cursotema.service.ICursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    @Autowired
    private ICursoService cursoServ;
    
    @GetMapping("/cursos/traer")
    public List<Curso> getCursos(){
        return cursoServ.getCursos();
    }
    
    @PostMapping("/cursos/crear")
    public String saveCurso(@RequestBody Curso curso){
        cursoServ.saveCurso(curso);
        return "Curso creado";
    }
    
    @DeleteMapping("/cursos/borrar/{id}")
    public String deleteCurso(@PathVariable int id){
        cursoServ.deleteCurso(id);
        return "Curso eliminado";
    }
    
    @PutMapping("/cursos/editar")
    public String editCurso(@RequestBody Curso curso){
        cursoServ.editCurso(curso);        
        return "Curso editado";
    }
    
}
