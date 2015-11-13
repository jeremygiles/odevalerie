package resources.domaine;

import java.util.ArrayList;

public class Specialite {

	// Nom de la spécialité
	private String nom;

	// Liste des spécialistes concernés
	private ArrayList<Specialiste> specialistes;

	public Specialite(String nom, ArrayList<Specialiste> specialistes) {
		this.nom = nom;
		this.specialistes = new ArrayList<Specialiste>();
		this.specialistes.addAll(specialistes);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Specialiste> getSpecialistes() {
		return specialistes;
	}

	public void setSpecialistes(ArrayList<Specialiste> specialistes) {
		this.specialistes = specialistes;
	}

}
