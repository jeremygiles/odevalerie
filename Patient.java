package resources.domaine;
//Class Patient
public class Patient {

	private long numero_secu;
	private String nom;
	private String adresse;
	private int age;

	private FicheSejour fiche_sejour;

	public Patient(String nom, long numSecu, String adresse, int age) {
		this.nom = nom;
		this.numero_secu = numSecu;
		this.adresse = adresse;
		this.age = age;
	}

	public long getNumero_secu() {
		return numero_secu;
	}

	public void setNumero_secu(int numero_secu) {
		this.numero_secu = numero_secu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public FicheSejour getFiche_sejour() {
		return fiche_sejour;
	}

	public void setFiche_sejour(FicheSejour fiche_sejour) {
		this.fiche_sejour = fiche_sejour;
	}

	public void resetFiche_sejour() {
		this.fiche_sejour = null;
	}
}
