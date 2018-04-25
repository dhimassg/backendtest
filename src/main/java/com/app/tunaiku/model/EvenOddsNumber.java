/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.tunaiku.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author <Dhimas Surya G>
 */
@Entity
@Table(name = "t_evenoddsnumber")
public class EvenOddsNumber implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Getter @Setter private Long id;
    @Getter @Setter private Integer evens;
    @Getter @Setter private Integer odds;
    @Getter @Setter private Integer total;
    @Getter @Setter private String nameTotal;

    public EvenOddsNumber() {
    }

    public EvenOddsNumber(Long id, Integer evens, Integer odds, Integer total, String nameTotal) {
        this.id = id;
        this.evens = evens;
        this.odds = odds;
        this.total = total;
        this.nameTotal = nameTotal;
    }

    public EvenOddsNumber(Integer evens, Integer odds, Integer total, String nameTotal) {
        this.evens = evens;
        this.odds = odds;
        this.total = total;
        this.nameTotal = nameTotal;
    }
    
    
    
}
