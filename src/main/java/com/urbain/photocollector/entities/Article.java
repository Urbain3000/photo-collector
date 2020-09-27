package com.urbain.photocollector.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long article_ref;

	@Column(nullable = false)
	private String nom;

	@Column(columnDefinition = "TEXT")
	private String description;

	@Column(length = 10, nullable = false)
	private float prix_base;

	@Column(columnDefinition = "DATE")
	private Date date_ajout;

	@ManyToOne
	private Artiste artiste;

	@OneToMany(mappedBy = "article")
	private List<Image> images = new ArrayList<>();

	@ManyToOne
	private Orientation orientation;

	@OneToMany(mappedBy = "article")
	private List<ArticleCommandeDetails> commandes;

	@ManyToMany
	private List<Tag> tags;

	@OneToMany(mappedBy = "article")
	private List<ArticleFormat> formats;

	@ManyToMany
	private List<Theme> themes;
}
