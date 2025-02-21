package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
// The below code is to add a custom name to the table
// @Table(name="alien_table")
public class Alien
{
    @Id
    private int aid;
    // The below code is to add custom name to Column
    // @Column(name="alien_name")
    private String aname;

    // Now Suppose in the databse you want to only store the above two value and want to ignore the below value
    // then use the following annotations
    // @Transient
    private String tech;

    // Now we want to also store a details about the Laptop which is allocated

    // for one to one relationship we need to add this below annontaions
    // @OneToOne

    // for one to many
    @OneToMany(mappedBy = "alien")
    private List<Laptop> laptop;


//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    // Getter setter for one to Many


    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public String getAname() {
        return aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
}
