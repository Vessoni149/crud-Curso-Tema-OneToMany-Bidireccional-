
package com.example.cursotema.service;

import com.example.cursotema.model.Tema;
import java.util.List;


public interface ITemaService {
    public List<Tema> getTemas();
    public void saveTema(Tema tema);
    public void deleteTema(int id);
    public Tema findTema(int id);
    public void editTema(Tema tema);
}
