/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.graci.garagem99.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author sesideva
 */
@Entity
@Table(name = "veiculos")
public class Veiculo {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 
 private String marca;
 private String modelo;
 private String cor;
 private int ano;
 private int km;
 
 @Column(name="linkimagem")
 private String linkImagem;
 
 @Column(name="descricaocompleta")
 private String descricaoCompleta;
 private String avarias;

    public Veiculo() { //construtor vazio obrigatorio para JPA!!! - tipo banco de dados, sabe?
    }

    public Veiculo(long id, String marca, String modelo, String cor, int ano, int KM, String LinkImagem, String DescricaoCompleta, String Avarias) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.km = KM;
        this.linkImagem = LinkImagem;
        this.descricaoCompleta = DescricaoCompleta;
        this.avarias = Avarias;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKM() {
        return km;
    }

    public void setKM(int KM) {
        this.km = KM;
    }

    public String getLinkImagem() {
        return linkImagem;
    }

    public void setLinkImagem(String linkImagem) {
        this.linkImagem = linkImagem;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
    }

    public String getAvarias() {
        return avarias;
    }

    public void setAvarias(String Avarias) {
        this.avarias = Avarias;
    }
 

 
 }
