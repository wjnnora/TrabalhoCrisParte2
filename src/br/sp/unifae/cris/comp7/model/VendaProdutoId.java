package br.sp.unifae.cris.comp7.model;
// Generated 01/05/2017 22:04:39 by Hibernate Tools 4.3.1



/**
 * VendaProdutoId generated by hbm2java
 */
public class VendaProdutoId  implements java.io.Serializable {


     private int idVenda;
     private int item;

    public VendaProdutoId() {
    }

    public VendaProdutoId(int idVenda, int item) {
       this.idVenda = idVenda;
       this.item = item;
    }
   
    public int getIdVenda() {
        return this.idVenda;
    }
    
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
    public int getItem() {
        return this.item;
    }
    
    public void setItem(int item) {
        this.item = item;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VendaProdutoId) ) return false;
		 VendaProdutoId castOther = ( VendaProdutoId ) other; 
         
		 return (this.getIdVenda()==castOther.getIdVenda())
 && (this.getItem()==castOther.getItem());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdVenda();
         result = 37 * result + this.getItem();
         return result;
   }   


}


