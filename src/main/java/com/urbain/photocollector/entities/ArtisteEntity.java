//package com.urbain.photocollector.entities;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//public class ArtisteEntity {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "artiste_id")
//	private Long artisteId;
//
//	private String biographie;
//
//	@Column(nullable = false)
//	private String nom;
//
//	@Column(nullable = false)
//	private String prenom;
//
//	private String nationalite;
//
//	@OneToMany(mappedBy = "artiste")
//	private List<ArticleEntity> article = new ArrayList<>();
//
//	@OneToMany(mappedBy = "artiste")
//	private List<UtilisateurEntity> utilisateur = new ArrayList<>();
//}
