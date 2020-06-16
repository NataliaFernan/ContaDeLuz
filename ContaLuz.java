
package contadeluz;

import javax.swing.JOptionPane;

class ContaLuz {
    public int leituraAnterior;
    public int leituraAtual;
    public double tusd = 0.3;
    public double te = 0.29;
    public double total;
    public double corDaBandeira;
    public int diferencaLeitura;
    private Object subtrair;
    
    
  

    
    public int getLeituraAnterior() {
        return leituraAnterior;
    }


    public void setLeituraAnterior(int leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    /**
     * @return the leituraAtual
     */
    public int getLeituraAtual() {
        return leituraAtual;
    }

 
    public void setLeituraAtual(int leituraAtual) {
        this.leituraAtual = leituraAtual;
         
        

    }
    public double getTusd() {
        return tusd;
    }

    /**
     * @param tusd the tusd to set
     */
    public void setTusd(double tusd) {
        this.tusd = tusd;
    }

    /**
     * @return the te
     */
    public double getTe() {
        return te;
    }

    /**
     * @param te the te to set
     */
    public void setTe(double te) {
        this.te = te;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

  
    public void setTotal(double total) {
        this.total = total;
       
    }


   

    /**
     * @return the corDaBandeira
     */
    public double getCorDaBandeira() {
        return corDaBandeira;
    }

    /**
     * @param corDaBandeira the corDaBandeira to set
     */
    public void setCorDaBandeira(double corDaBandeira) {
        this.corDaBandeira = corDaBandeira;
    }

    /**
     * @return the diferencaLeitura
     */
    public int getDiferencaLeitura() {
        return diferencaLeitura;
    }

    /**
     * @param diferencaLeitura the diferencaLeitura to set
     */
    public void setDiferencaLeitura(int diferencaLeitura) {
        this.diferencaLeitura = diferencaLeitura;
    }
    
}
