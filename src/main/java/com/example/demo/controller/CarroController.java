package com.example.demo.controller;

import java.util.ArrayList;

import com.example.demo.model.Carro;
import com.example.demo.service.CarroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * CarroController
 */
@Controller
@RequestMapping("/app")

public class CarroController {
    @Autowired
    private CarroService sc;

    public CarroController(){
    }
    
    @GetMapping("/carro/{cod}")
    public ModelAndView getCarroByID(@PathVariable("cod")int cod){
        Carro c = sc.getCarroByID(cod);

        if(c == null){
            return new ModelAndView("viewCarroErro");
        }
        else{
            ModelAndView mv = new ModelAndView("viewCarro");
            mv.addObject("c", c);
            return mv;
        }
    
    }
    @GetMapping("/lista")
    public ModelAndView getCarrosAsList(){
        ArrayList<Carro> listCarros = sc.getCarrosAsList();

        if(listCarros == null){

            return new ModelAndView("viewCarroErro");
        }
        else{
            ModelAndView mv = new ModelAndView("viewCarros");
            mv.addObject("listCarros", listCarros);
            return mv;
        }
    }
}