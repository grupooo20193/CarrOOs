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
public class Cliente {
    private String categoriaCliente;
    private String nomeCliente;
    private String cpf;
    private String cnpj;
    private String rg;
    private String contatoCliente;
    private String enderecoCliente;
    private String dadosBancarios;
    private String emailCliente;

    /**
     * @return the categoriaCliente
     */
    public String getCategoriaCliente() {
        return categoriaCliente;
    }

    /**
     * @param categoriaCliente the categoriaCliente to set
     */
    public void setCategoriaCliente(String categoriaCliente) {
        this.categoriaCliente = categoriaCliente;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the contatoCliente
     */
    public String getContatoCliente() {
        return contatoCliente;
    }

    /**
     * @param contatoCliente the contatoCliente to set
     */
    public void setContatoCliente(String contatoCliente) {
        this.contatoCliente = contatoCliente;
    }

    /**
     * @return the enderecoCliente
     */
    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    /**
     * @param enderecoCliente the enderecoCliente to set
     */
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    /**
     * @return the dadosBancarios
     */
    public String getDadosBancarios() {
        return dadosBancarios;
    }

    /**
     * @param dadosBancarios the dadosBancarios to set
     */
    public void setDadosBancarios(String dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }
    public void getEmailCliente (String emailCliente) {
        this.emailCliente = emailCliente;
    }
    
    public Cliente(String categoriaCliente, String nomeCliente, String cpf, String rg, String contatoCliente, String enderecoCliente, String dadosBancarios){
    this.categoriaCliente = categoriaCliente;
    this.nomeCliente = nomeCliente;
    this.cpf = cpf;
    this.rg = rg;
    this.contatoCliente = contatoCliente;
    this.enderecoCliente = enderecoCliente;
    this.dadosBancarios = dadosBancarios;
    this.emailCliente = emailCliente;
    }
    
}
