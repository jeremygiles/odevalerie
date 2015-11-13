package resources.domaine;

public class Specialiste {

	private String nom;
	private String prenom;

	public Specialiste(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public String setPrenom(String prenom) {
		this.prenom=prenom;
	}

}
