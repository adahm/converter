/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intergration;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Currency;

/**
 *
 * @author Andreas
 */
@TransactionAttribute(TransactionAttributeType.MANDATORY)
@Stateless
public class CurrDAO {
    @PersistenceContext(unitName = "currPU")
    private EntityManager em;
    
    public double convert(String from, String to, double inAmount){
        Currency curr = em.find(Currency.class, from);
        if(to.equals("eur")){
            return inAmount * curr.getEur();
        }
        else if(to.equals("usd")){
            return inAmount * curr.getUsd();
        }
        else if(to.equals("nok")){
            return inAmount * curr.getNok();
        }
        else{
            return inAmount * curr.getSek();
        }
          
    }
    
}
