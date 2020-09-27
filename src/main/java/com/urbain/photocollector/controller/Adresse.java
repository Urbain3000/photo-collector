package com.urbain.photocollector.controller;

public class Adresse {

@Table(name = "adresse")
@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long adresse_id;

	@Column(length = 10, nullable = false)
	private Long num;

	@Enumerated(EnumType.STRING)
	private VoieEnum voie;

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

	@ManyToOne
	private User user;

	public Adresse() {

	}

	public Adresse(Long adresse_id, Long num, VoieEnum voie, String complement_voie, String ville, int code_postal,
			String pays, String nom_adresse) {
		this.adresse_id = adresse_id;
		this.num = num;
		this.voie = voie;
		this.complement_voie = complement_voie;
		this.ville = ville;
		this.code_postal = code_postal;
		this.pays = pays;
		this.nom_adresse = nom_adresse;
	}

	public Long getAdresse_id() {
		return adresse_id;
	}

	public void setAdresse_id(Long adresse_id) {
		this.adresse_id = adresse_id;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public VoieEnum getVoie() {
		return voie;
	}

	public void setVoie(VoieEnum voie) {
		this.voie = voie;
	}

	public String getComplement_voie() {
		return complement_voie;
	}

	public void setComplement_voie(String complement_voie) {
		this.complement_voie = complement_voie;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}

	public String getPays() {
		return pays;
	}

	public User getUser() {
		return user;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getNom_adresse() {
		return nom_adresse;
	}

	public void setNom_adresse(String nom_adresse) {
		this.nom_adresse = nom_adresse;
	}

	public void addUser(User user) {
		this.user = user;
		user.setAdresses(Arrays.asList(this));

	}
}

}
