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
@Table(name = "t_primenumber")
public class PrimeNumber implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private Integer number;
    @Getter
    @Setter
    private String nameNumber;

    public PrimeNumber(Long id, Integer number, String nameNumber) {
        this.id = id;
        this.number = number;
        this.nameNumber = nameNumber;
    }

    public PrimeNumber(Integer number, String nameNumber) {
        this.number = number;
        this.nameNumber = nameNumber;
    }

    public PrimeNumber() {
    }

}
