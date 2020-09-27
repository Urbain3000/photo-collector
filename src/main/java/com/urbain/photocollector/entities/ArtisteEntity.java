package com.urbain.photocollector.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class ArtisteEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long artiste_id;

	@Column
	private String biographie;

	@Column(nullable = false)
	private String nom;

	@Column(nullable = false)
	private String prenom;

	@Enumerated(EnumType.STRING)
	private NationalityEnum nationalite;

	@OneToMany(mappedBy = "artiste")
	private List<ArticleEntity> article = new ArrayList<>();

	@OneToMany(mappedBy = "artiste")
	private List<Utilisateur> utilisateur = new ArrayList<>();
}
