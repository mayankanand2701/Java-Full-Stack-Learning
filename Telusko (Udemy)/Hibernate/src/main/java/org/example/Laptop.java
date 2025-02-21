package org.example;

// We are trying to embed the details of laptop inside alien
// In that case what will happen is the below three instance variables will also become independent column of alien table
// The annotations used to achieve that is

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

// For one to one mapping we do not need this so commenting this out
// @Embeddable

// For one to one maaping
@Entity
public class Laptop {
    @Id
    private int id;
    private String brand;
    private String model;
    private int ram;

    // to privew the alien entry in the laptop table
    @ManyToOne
    private Alien alien;

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", id=" + id +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }

    public Alien getAlien() {
        return alien;
    }

    public void setAlien(Alien alien) {
        this.alien = alien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
