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
public class Add extends Opperrator{
    public Add(Opperrator opp1, Opperrator opp2) {
        super(opp1, opp2);
    }

    @Override
    public double opperrate() {
        return getOpp1().opperrate()+getOpp2().opperrate();
    }
}
