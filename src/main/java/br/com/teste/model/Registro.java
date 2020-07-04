package br.com.teste.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Registro {

    @Id
    private int id;
    private String diaCompra;
    private String horarioCompra;
    private String notafiscal;
    private String metodoPag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiaCompra() {
        return diaCompra;
    }

    public void setDiaCompra(String diaCompra) {
        this.diaCompra = diaCompra;
    }

    public String getHorarioCompra() {
        return horarioCompra;
    }

    public void setHorarioCompra(String horarioCompra) {
        this.horarioCompra = horarioCompra;
    }

    public String getNotafiscal() {
        return notafiscal;
    }

    public void setNotafiscal(String notafiscal) {
        this.notafiscal = notafiscal;
    }

    public String getMetodoPag() {
        return metodoPag;
    }

    public void setMetodoPag(String metodoPag) {
        this.metodoPag = metodoPag;
    }
}
