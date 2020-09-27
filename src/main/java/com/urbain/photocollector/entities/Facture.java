package com.urbain.photocollector.entities;

import javax.persistence.Column;
import javax.persistence.Id;

import com.sun.istack.NotNull;

public class Facture {
	@Id
	@NotNull
	@NotBlank
	private Long ref;

	@Column(nullable = false)
	private Float prixHt;

	@Column(nullable = false)
	private Float tva;

	private String paiementID;

	@Column(columnDefinition = "DATE")
	private String dateLivraison;

	@Column(nullable = false, columnDefinition = "DATE")
	private String datePaiement;

	@Column(nullable = false)
	private String userName;

	@Column(nullable = false)
	private String userForname;

	@Column(nullable = false)
	private String userEmail;

	@Column(nullable = false, columnDefinition = "TEXT")
	private String description;
}
