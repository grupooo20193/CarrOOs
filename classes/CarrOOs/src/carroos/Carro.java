/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carroos;

/**
 *
 * @author miche
 */
public class Carro {
    private String modelo;
    private int ano;
    //private String tipo;
    private String cor;
    private int numPortas;
    private String tipoCombustivel;
    private String transmissao;
    private Float capPortaMalas;
    private String acessorios;
    private String vendedor;
    private String comprador;
    private String fornecedor;
    //private String garantia;

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the numPortas
     */
    public int getNumPortas() {
        return numPortas;
    }

    /**
     * @param numPortas the numPortas to set
     */
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    /**
     * @return the tipoCombustivel
     */
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * @param tipoCombustivel the tipoCombustivel to set
     */
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    /**
     * @return the transmissao
     */
    public String getTransmissao() {
        return transmissao;
    }

    /**
     * @param transmissao the transmissao to set
     */
    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    /**
     * @return the capPortaMalas
     */
    public Float getCapPortaMalas() {
        return capPortaMalas;
    }

    /**
     * @param capPortaMalas the capPortaMalas to set
     */
    public void setCapPortaMalas(Float capPortaMalas) {
        this.capPortaMalas = capPortaMalas;
    }

    /**
     * @return the acessorios
     */
    public String getAcessorios() {
        return acessorios;
    }

    /**
     * @param acessorios the acessorios to set
     */
    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }
    
    private void getVendedor (String vendedor) {
        this.vendedor = vendedor;
    }
    private void getComprador (String comprador) {
        this.comprador = comprador;
    }
    private void getFornecedor (String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public Carro(String modelo, int ano, String tipo, String cor, int numPortas, String tipoCombustivel, String transmissao, Float capPortaMalas, String acessorios, String garantia, String vendedor, String comprador, String fornecedor){
    this.modelo = modelo;
    this.ano = ano;
    //this.tipo = tipo;
    this.cor = cor;
    this.numPortas = numPortas;
    this.tipoCombustivel = tipoCombustivel;
    this.transmissao = transmissao;
    this.capPortaMalas = capPortaMalas;
    this.acessorios = acessorios;
    //this.garantia = garantia;
    this.vendedor = vendedor;
    this.comprador = comprador;
    this.fornecedor = fornecedor;
    }
    
}

