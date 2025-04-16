/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.graci.garagem99.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesideva
 */

@RestController
public class GaragemController {
    
    @Autowired
    private GaragemService garagemService;
    
    /***
     * retorna TODOS os carros d base de dados
     */
    
    
}
