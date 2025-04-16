/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.graci.garagem99.repositories;

import com.graci.garagem99.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sesideva
 */
@Repository
public interface GaragemRepository extends JpaRepository<Veiculo, Long> {
    
    List<Veiculo> findByCorIgnoreCase(String cor);
    List<Veiculo> findByAno(int ano);

    
    
    
}
