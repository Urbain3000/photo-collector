//package com.urbain.photocollector.entities;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
//import com.sun.istack.NotNull;
//
//@Entity
//@Table(name = "utilisateur")
//public class UtilisateurEntity {
//
//	@Id
//	@NotNull
//	@NotBlank
//	@Column(length = 150)
//	private String email;
//
//	@Column(length = 40)
//	private String civilite;
//
//	@Column(nullable = false)
//	private String nom;
//
//	@Column(nullable = false)
//	private String prenom;
//
//	@Column(length = 16)
//	private String telephone;
//
////	@Transient
////	private String pwdRaw;
//
//	@Column(nullable = false)
//	private String password;
//
//	@Column(length = 150, nullable = false)
//	private String salt;
//
//	@OneToMany(mappedBy = "code")
//	private List<CommandeEntity> commandes;
//
//	@ManyToOne
//	private UserType userType;
//
//	@OneToMany(mappedBy = "user")
//	private List<AdresseEntity> adresses = new ArrayList<>();
//
//	@ManyToOne
//	private ArtisteEntity artiste;
//
//	
//}
