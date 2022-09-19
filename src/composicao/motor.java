/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author anderson.mazzotti
 */
public class motor {
    
    
    private int potencia;

    public motor(){
        potencia =1000; //VALOR PADRAO
    }
    
    public motor (int potencia) {
    
        this.potencia=potencia; // valor definido por vc
        
    
    }
    
    
    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
    
}
