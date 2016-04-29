/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term.inator.opperrator;

import term.inator.opperrator.Opperrator;

/**
 *
 * @author philipp
 */
public class Variable extends Opperrator{
    private double value;

    public Variable(double value) {
        super(null,null);
        this.value = value;
    }
    
    @Override
    public double opperrate() {
        return value;
    }
    
    public double getValue(){
        return value;
    }
    
    public void setValue(double value){
        this.value = value;
    }
}
