
package com.example.cursotema.repository;

import com.example.cursotema.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Integer> {
    
}
