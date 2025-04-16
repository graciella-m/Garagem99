/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.graci.garagem99.DTO;

import com.graci.garagem99.entities.Veiculo;

/**
 *
 * @author sesideva
 */
public class VeiculoDTO {
 private long id; 
 private String marca;
 private String modelo;
 private String cor;
 private int ano;
 private int km;

public VeiculoDTO() {
    }

public VeiculoDTO(Veiculo veiculo){
    this.id = veiculo.getId();
    this.marca = veiculo.getMarca();
    this.modelo = veiculo.getModelo();
    this.cor = veiculo.getCor();
    this.ano = veiculo.getAno();
    
}

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public int getKm() {
        return km;
    }
}
