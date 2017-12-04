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
@NamedQueries({
    @NamedQuery(name = "Currency.findAll", query = "SELECT c FROM Currency c")
    , @NamedQuery(name = "Currency.findByName", query = "SELECT c FROM Currency c WHERE c.name = :name")
    , @NamedQuery(name = "Currency.findBySek", query = "SELECT c FROM Currency c WHERE c.sek = :sek")
    , @NamedQuery(name = "Currency.findByNok", query = "SELECT c FROM Currency c WHERE c.nok = :nok")
    , @NamedQuery(name = "Currency.findByUsd", query = "SELECT c FROM Currency c WHERE c.usd = :usd")
    , @NamedQuery(name = "Currency.findByEur", query = "SELECT c FROM Currency c WHERE c.eur = :eur")})
public class Currency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NAME")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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

    public void setName(String name) {
        this.name = name;
    }

    public double getSek() {
        return sek;
    }

    public void setSek(double sek) {
        this.sek = sek;
    }

    public double getNok() {
        return nok;
    }

    public void setNok(double nok) {
        this.nok = nok;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getEur() {
        return eur;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Currency)) {
            return false;
        }
        Currency other = (Currency) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Currency[ name=" + name + " ]";
    }
    
}
