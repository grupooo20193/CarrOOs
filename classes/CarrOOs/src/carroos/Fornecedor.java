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
public class Fornecedor {
    private String nomeFor;
    private String cnpj;
    private String endereco;
    private String contatoFor;
    private String emailFor;

    /**
     * @return the nomeFor
     */
    public String getNomeFor() {
        return nomeFor;
    }

    /**
     * @param nomeFor the nomeFor to set
     */
    public void setNomeFor(String nomeFor) {
        this.nomeFor = nomeFor;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the endereço
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereço the endereço to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the contatoFor
     */
    public String getContatoFor() {
        return contatoFor;
    }

    /**
     * @param contatoFor the contatoFor to set
     */
    public void setContatoFor(String contatoFor) {
        this.contatoFor = contatoFor;
    }

    /**
     * @return the emailFor
     */
    public String getEmailFor() {
        return emailFor;
    }

    /**
     * @param emailFor the emailFor to set
     */
    public void setEmailFor(String emailFor) {
        this.emailFor = emailFor;
    }

    public Fornecedor(String nomeFor, String cnpj, String endereco, String contatoFor, String emailFor){
        this.nomeFor = nomeFor;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contatoFor = contatoFor;
        this.emailFor = emailFor;
    }
}
