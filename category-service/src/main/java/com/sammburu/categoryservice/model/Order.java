package com.sammburu.categoryservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "ORDERS_TBL")
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String category;
    private String color;
    private double price;

    public Order(String name, String category, String color, double price) {
        this.name = name;
        this.category = category;
        this.color = color;
        this.price = price;
    }
}
