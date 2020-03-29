package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Carro;
import com.example.demo.repository.CarroRepository;

import org.springframework.stereotype.Service;

/**
 * CarroService
 */
@Service
public class CarroService {

    public CarroRepository rc;

    public CarroService(){
        rc = new CarroRepository();
    }

    public Carro getCarroByID(int cod){

        return rc.getCarroByID(cod);

    }
    public ArrayList<Carro> getCarrosAsList(){

        ArrayList<Carro> listCarros = rc.getCarrosAsList();

        if(listCarros.size() <= 0){
            return null;
        }
        else{
            return listCarros;
        }
    }
       

   
    
}