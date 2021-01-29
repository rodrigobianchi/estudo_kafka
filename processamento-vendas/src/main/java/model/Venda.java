package model;

import java.math.BigDecimal;

public class Venda {

    private Long operacao;
    private Long cliente;
    private Integer qtdeIngressos;
    private BigDecimal valorTotal;
    private String status;

    public Venda() {

    }

    public Venda(Long operacao, Long cliente, Integer qtdeIngressos, BigDecimal valorTotal) {
        this.operacao = operacao;
        this.cliente = cliente;
        this.qtdeIngressos = qtdeIngressos;
        this.valorTotal = valorTotal;
    }

    public Long getOperacao() {
        return operacao;
    }

    public void setOperacao(Long operacao) {
        this.operacao = operacao;
    }

    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    public Integer getQtdeIngressos() {
        return qtdeIngressos;
    }

    public void setQtdeIngressos(Integer qtdeIngressos) {
        this.qtdeIngressos = qtdeIngressos;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "operacao=" + operacao +
                ", cliente=" + cliente +
                ", qtdeIngressos=" + qtdeIngressos +
                ", valorTotal=" + valorTotal +
                ", status='" + status + '\'' +
                '}';
    }
}
