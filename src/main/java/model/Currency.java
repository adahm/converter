/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andreas
 */
@Entity
@Table(name = "CURRENCY")
@XmlRootElement
public class Currency implements Serializable {
    //map variables to collums
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NAME")
    private String name;
    @Column(name = "SEK")
    private double sek;
    @Column(name = "NOK")
    private double nok;
    @Column(name = "USD")
    private double usd;
    @Column(name = "EUR")
    private double eur;

    public Currency() {
    }

    public Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSek() {
        return sek;
    }

    public double getNok() {
        return nok;
    }


    public double getUsd() {
        return usd;
    }

    public double getEur() {
        return eur;
    }
    
}
