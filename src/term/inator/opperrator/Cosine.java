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
public class Cosine extends Opperrator{
    public Cosine(Opperrator opp1) {
        super(opp1, opp1);
    }

    @Override
    public double opperrate() {
        return Math.cos(getOpp1().opperrate());
    }
}
