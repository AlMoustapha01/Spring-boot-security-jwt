package com.example.userservice.repository;

import com.example.userservice.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/*
JpaRepository est une classe qui implemente des methodes permettant de faire
des requetes sur une table de la base de données tels un ORM.
Donc le repository RoleRepository herite de celle-ci avec comme argument l'Entité et le type de la
clé primaire.
 */
public interface RoleRepository  extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
//ok je maitrise les repository
