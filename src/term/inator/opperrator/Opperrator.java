/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term.inator.opperrator;

/**
 *
 * @author philipp
 */
public abstract class Opperrator {
    private Opperrator opp1;
    private Opperrator opp2;
    
    public Opperrator(Opperrator opp1,Opperrator opp2){
        
    }
    
    public abstract double opperrate();
    
    public Opperrator getOpp1(){
        return opp1;
    }
    
    public Opperrator getOpp2(){
        return opp2;
    }
    
    public void serOpp1(Opperrator value){
        opp1 = value;
    }
    
    public void setOpp2(Opperrator value){
        opp2 = value;
    }
}
