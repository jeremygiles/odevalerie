package resources.domaine;

public class Specialiste {

	private String nom;
	private int num;

	public Specialiste(String nom,int num) {
		this.nom = nom;
		this.num=num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
