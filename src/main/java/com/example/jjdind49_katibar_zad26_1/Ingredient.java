package com.example.jjdind49_katibar_zad26_1;

import jakarta.persistence.*;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private String unitOfMeasure;
    private String name;
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    public Ingredient() {
    }

    public Ingredient(Long id, double amount, String unitOfMeasure, String name) {
        this.id = id;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", amount=" + amount +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
