//package com.urbain.photocollector.entities;
//
//import java.sql.Date;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//
//public class ArticleEntity {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "article_ref")
//	private Long articleRef;
//
//	@Column(nullable = false)
//	private String nom;
//
//	@Column(columnDefinition = "TEXT")
//	private String description;
//
//	@Column(name = "prix_base",length = 10, nullable = false)
//	private float prixBase;
//
//	@Column(name = "date_ajout", columnDefinition = "DATE")
//	private Date dateAjout;
//
//	@ManyToOne
//	private ArtisteEntity artiste;
//
//	@OneToMany(mappedBy = "article")
//	private List<ImageEntity> images = new ArrayList<>();
//
//	@ManyToOne
//	private Orientation orientation;
//
//	@OneToMany(mappedBy = "article")
//	private List<ArticleCommandeDetails> commandes;
//
//	@ManyToMany
//	private List<Tag> tags;
//
//	@OneToMany(mappedBy = "article")
//	private List<ArticleFormat> formats;
//
//	@ManyToMany
//	private List<Theme> themes;
//}
