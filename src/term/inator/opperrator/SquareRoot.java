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
public class SquareRoot extends Root{
    public SquareRoot(Opperrator opp1) {
        super(opp1,new Constant(2));
    }
}
