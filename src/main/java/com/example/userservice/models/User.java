package com.example.userservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity //creation de table dans la base de donnée
@Data   //Injection de getter et de setter
@NoArgsConstructor // générer un constructeur sans paramètres
@AllArgsConstructor //  génère un constructeur avec 1 paramètre pour chaque champ de votre classe
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private  String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<>();
}
//ok je maitrise les models
