package com.version2.crudesprgv2.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor


public class Produits  {


    @Id
    @GeneratedValue
    private Integer Id;
    @Column
    private String name;
    @Column
    private  String Description;
    @Column
    private  Integer prix;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }



    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Produits{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", prix=" + prix +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }




}
