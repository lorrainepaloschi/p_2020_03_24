package com.example.demo.repository;

import java.util.ArrayList;


import com.example.demo.model.Carro;

import org.springframework.stereotype.Repository;

/**
 * CarroRepository
 */
@Repository
public class CarroRepository {

    public ArrayList <Carro> hm = new ArrayList<Carro>();
    
    public CarroRepository(){
        hm.add(1, new Carro(1, "Celta", 2012, "Preto", "ADUWEIUW874653QTRRTTWD", 1.0));
        hm.add(2, new Carro(2, "Palio", 2017, "Prata", "UIWRUQIOE5465464AQUECN", 1.4));
        hm.add(3, new Carro(3, "Vectra", 2009, "Branco", "POSIDYARDF87513297DKAH", 2.0));
        hm.add(4, new Carro(4, "Saveiro", 2017, "Vermelho", "EIWOEIRUQI987987987EQWE", 1.6));
        hm.add(5, new Carro(5, "Onix", 2013, "Azul", "ASDQWERD128371293ZNMXCBVKS", 1.4));

    }

    public Carro getCarroByID(int cod){
        return hm.get(cod);
    }

    public ArrayList<Carro> getCarrosAsList(){
        return  hm;
    }
}