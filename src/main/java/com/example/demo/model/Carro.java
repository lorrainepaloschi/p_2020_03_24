package com.example.demo.model;

/**
 * Carro
 */
public class Carro {

    public Carro(int cod, String modelo, int ano, String cor, String chassi, double motor){
        this.cod = cod;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.chassi = chassi;
        this.motor = motor;
    }

    private int cod;
    private String modelo;
    private int ano;
    private String cor;
    private String chassi;
    private double motor;

    public int getCod() {
		return this.cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return this.chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getMotor() {
        return this.motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }


}
