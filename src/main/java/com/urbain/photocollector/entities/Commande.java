package com.urbain.photocollector.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ref;

	@Column(nullable = false, columnDefinition = "DATE")
	@NotBlank
	@NotNull
	private String date;

	@Column(nullable = false)
	@NotBlank
	@NotNull
	private Float prixTotalHt;

	@Column(nullable = false)
	@NotBlank
	@NotNull
	private Float tva;

	@Column(nullable = false, columnDefinition = "DATE")
	private String dateLivraison;

	@Column(nullable = false, columnDefinition = "DATE")
	private String datePaiement;

	@ManyToOne
	private Utilisateur utilisateur;

	@ManyToOne
	private CodePromo code;

	@OneToMany(mappedBy = "commande")
	private List<ArticleCommandeDetails> articles;
}
