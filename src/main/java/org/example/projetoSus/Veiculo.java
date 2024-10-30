package org.example.projetoSus;

public class Veiculo {
    private int id;
    private String modelo;
    private String placa;
    private int lugar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugares) {
        this.lugar = lugares;
    }

    public Veiculo(String modelo, String placa, int lugar) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.lugar = lugar;
    }
}
