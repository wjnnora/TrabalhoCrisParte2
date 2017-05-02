package br.sp.unifae.cris.comp7.model;
// Generated 01/05/2017 22:04:39 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Entrada generated by hbm2java
 */
public class Entrada  implements java.io.Serializable {


     private Integer id;
     private Fornecedor fornecedor;
     private Integer fornecedor_1;
     private Float precoTotal;
     private Set entradaProdutos = new HashSet(0);

    public Entrada() {
    }

	
    public Entrada(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public Entrada(Fornecedor fornecedor, Integer fornecedor_1, Float precoTotal, Set entradaProdutos) {
       this.fornecedor = fornecedor;
       this.fornecedor_1 = fornecedor_1;
       this.precoTotal = precoTotal;
       this.entradaProdutos = entradaProdutos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public Integer getFornecedor_1() {
        return this.fornecedor_1;
    }
    
    public void setFornecedor_1(Integer fornecedor_1) {
        this.fornecedor_1 = fornecedor_1;
    }
    public Float getPrecoTotal() {
        return this.precoTotal;
    }
    
    public void setPrecoTotal(Float precoTotal) {
        this.precoTotal = precoTotal;
    }
    public Set getEntradaProdutos() {
        return this.entradaProdutos;
    }
    
    public void setEntradaProdutos(Set entradaProdutos) {
        this.entradaProdutos = entradaProdutos;
    }




}


