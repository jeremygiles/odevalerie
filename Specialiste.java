package resources.domaine;

public class Specialiste {

	private String nom;
	private String prenom;
	private int num;

	public Specialiste(String nom, String prenom,int num) {
		this.nom = nom;
		this.prenom=prenom;
		this.num=num;
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
