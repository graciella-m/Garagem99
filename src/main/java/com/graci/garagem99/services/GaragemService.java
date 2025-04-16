/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.graci.garagem99.services;

import com.graci.garagem99.DTO.VeiculoDTO;
import com.graci.garagem99.entities.Veiculo;
import com.graci.garagem99.repositories.GaragemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesideva
 */
@Service
public class GaragemService {
    @Autowired
    private GaragemRepository garagemRepository;
    
    
    public List<Veiculo> findAll () {
    List<Veiculo> result = garagemRepository.findAll ();
    return result;
    }
    
    public List<VeiculoDTO> findByCor (String cor) {
    List<Veiculo> resultGaragem = garagemRepository.findByCorIgnoreCase (cor);
    List<VeiculoDTO> resultDTO = resultGaragem.stream().map(x -> new VeiculoDTO(x)).toList();
    return resultDTO;
    }
    
    
    
}
    
   /** public List<VeiculoDTO> findAll() {   
    List<Veiculo> result = garagemRepository.findAll();
    return result;
} 
    
    public List<Veiculo> findById (int Id) {
    List<Veiculo> result = garagemRepository.findById (Long (Id));
    return result;
    }
    
    public List<Veiculo> findByAno (int Id) {
    List<Veiculo> result = garagemRepository.findByAno ();
    return result;
    }
    
    


