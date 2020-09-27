package com.urbain.photocollector.repositotries;

import org.springframework.data.repository.CrudRepository;

import com.urbain.photocollector.entities.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, String> {

}
