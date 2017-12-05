/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CurrFacade;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.enterprise.context.Conversation;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Andreas
 */
@Named("currManager")
@ViewScoped
public class CurrManager implements Serializable{
    @EJB
    private CurrFacade currFacade;
    private String fromCurr;
    private String toCurr;
    private double inAmount;
    private double outAmount;
    
    public void doConversion(){

        outAmount = currFacade.convert(fromCurr, toCurr, inAmount);
    }

    public String getFromCurr() {
        return fromCurr;
    }

    public String getToCurr() {
        return toCurr;
    }

    public double getInAmount() {
        return inAmount;
    }

    public double getOutAmount() {
        return outAmount;
    }

    public void setFromCurr(String fromCurr) {
        this.fromCurr = fromCurr;
    }

    public void setToCurr(String toCurr) {
        this.toCurr = toCurr;
    }

    public void setInAmount(double inAmount) {
        this.inAmount = inAmount;
    }

    public void setOutAmount(double outAmount) {
        this.outAmount = outAmount;
    }
}
