/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estacionamento.bean;

import estacionamento.Veiculo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rgto777
 */
@Stateless
public class VeiculoFacade extends AbstractFacade<Veiculo> {
    @PersistenceContext(unitName = "teste2")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VeiculoFacade() {
        super(Veiculo.class);
    }
    
}
