/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.tunaiku.model;

import java.io.Serializable;
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
@Table(name = "t_nominalamount")
public class NominalAmount implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;
    @Getter @Setter private Double nominal;
    @Getter @Setter private Integer additional_number;
    @Getter @Setter private Double total;

    public NominalAmount() {
    }

    public NominalAmount(Long id, Double nominal, Integer additional_number, Double total) {
        this.id = id;
        this.nominal = nominal;
        this.additional_number = additional_number;
        this.total = total;
    }
    
    
}
