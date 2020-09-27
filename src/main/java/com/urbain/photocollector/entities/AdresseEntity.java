package com.urbain.photocollector.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "adresse")
@Entity
public class AdresseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="adresse_id")
	private Long adresseId;

	@Column(length = 10, nullable = false)
	private Long numeroVoie;
	
	@Column(nullable = false)
	private String voie;

	@Column(nullable = false)
	private String complement_voie;

	@Column(nullable = false)
	private String ville;

	@Column(length = 10, nullable = false)
	private int code_postal;

	@Column(length = 100, nullable = false)
	private String pays;

	@Column(length = 50)
	private String nom_adresse;

//	@ManyToOne
//	private UtilisateurEntity utilisateur;

}
