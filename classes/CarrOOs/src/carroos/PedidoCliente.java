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
public class PedidoCliente {
    private int numPedidoCliente;
    private float totalPedido;
    private String formaPagamento;
    private String parcelamento;
    private String entrega;    

    /**
     * @return the numPedidoCliente
     */
    public int getNumPedidoCliente() {
        return numPedidoCliente;
    }

    /**
     * @param numPedidoCliente the numPedidoCliente to set
     */
    public void setNumPedidoCliente(int numPedidoCliente) {
        this.numPedidoCliente = numPedidoCliente;
    }

    /**
     * @return the totalPedido
     */
    public float getTotalPedido() {
        return totalPedido;
    }

    /**
     * @param totalPedido the totalPedido to set
     */
    public void setTotalPedido(float totalPedido) {
        this.totalPedido = totalPedido;
    }

    /**
     * @return the formaPagamento
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    /**
     * @return the entrega
     */
    public String getEntrega() {
        return entrega;
    }

    /**
     * @param entrega the entrega to set
     */
    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }
   
    public abstract class Cliente{
        
    }
}
