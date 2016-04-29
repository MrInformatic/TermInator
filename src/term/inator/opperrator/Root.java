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
public class Root extends Exponentiate{

    public Root(Opperrator opp1, Opperrator opp2) {
        super(opp1, new Divide(new Constant(1),opp2));
    }
}
