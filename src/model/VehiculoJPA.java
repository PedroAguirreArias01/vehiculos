/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Pedro
 */
@Entity
@Table(name="VEHICULOS_JPA")
public class VehiculoJPA implements Serializable{
    
    @Id
    @Column(name = "COD_PLACA")
    private String placa;
    @Column(name = "MODELO")
    private Integer modelo;
    @Column(name = "MARCA")
    private String marca;

    public VehiculoJPA() {
    }

    public VehiculoJPA(String placa, Integer modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + '}';
    }
    
}
