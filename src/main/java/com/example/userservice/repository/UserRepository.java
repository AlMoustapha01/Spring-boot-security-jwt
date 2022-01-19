package com.example.userservice.repository;

import com.example.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*
JpaRepository est une classe qui implemente des methodes permettant de faire
des requetes sur une table de la base de données tels un ORM.
Donc le repository UserRepository herite de celle-ci avec comme argument l'Entité et le type de la
clé primaire.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
//ok je maitrise les repository
