/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import intergration.CurrDAO;
import javax.ejb.*;

/**
 *
 * @author Andreas
 */
//set up container manged transaction 
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
@Stateless
public class CurrFacade {
    @EJB CurrDAO currencyDB;
    
    public double convert(String from, String to, double inAmount){
        //call the database access class to convert a currency
        return currencyDB.convert(from, to, inAmount);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
