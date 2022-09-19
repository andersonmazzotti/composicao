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
public class Composicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // primeira forma de chamar
        
       /* carro carro = new carro();
        
        carro carro2 = new carro(2000); 
        
        // SEGUNDA FORMA DE CHAMAR
        carro carro3 = new carro();
        carro3.ligarCarro(2000);
        */
        
        carro carro4 = new carro(1000);
        motor motor = new motor();
        motor motor2 = new motor(2000);
        
        
       //carro4.setmotor(motor); 
        
        carro4.imprimeDados();
        
        
        
        
    }
    
    
    
    
    
}
