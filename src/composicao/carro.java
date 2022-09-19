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
public class carro {

    private motor motor;
    private direcao direcao;
    
    
    public carro () {
    
        motor = new motor();
    
    }
    
    public  carro (int potencia) {
    
        motor = new motor(potencia);
        
    }
    

    /**
     * @return the motor
     */
    public motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(motor motor) {
        this.motor = motor;
    }

    /**
     * @return the direcao
     */
    public direcao getDirecao() {
        return direcao;
    }

    /**
     * @param direcao the direcao to set
     */
    public void setDirecao(direcao direcao) {
        this.direcao = direcao;
    }

    
    

    
}
