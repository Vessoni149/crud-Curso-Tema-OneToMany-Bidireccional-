
package com.example.cursotema.controller;

import com.example.cursotema.model.Tema;
import com.example.cursotema.service.ITemaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
    @Autowired
    private ITemaService temaServ;
    
    @GetMapping("/temas/traer")
    public List<Tema> getTemas(){
        return temaServ.getTemas();
    }
    
    @PostMapping("/temas/crear")
    public String saveTema(@RequestBody Tema tema){
        temaServ.saveTema(tema);
        return "Tema creado";
    }
    
    @DeleteMapping("/temas/borrar/{id}")
    public String deleteTema(@PathVariable int id){
        temaServ.deleteTema(id);
        return "Tema borrado";
    }
    
    @PutMapping("/temas/editar")
    public String editTema(@RequestBody Tema tema){
        temaServ.editTema(tema);
        return "Tema editado correctamente";
    }
}
