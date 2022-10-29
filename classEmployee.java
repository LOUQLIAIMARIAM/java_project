import java.util.ArrayList;
import java.util.Scanner;

public class Employe {
    private  int matricule;
    private  String nom;
    private  String prenom;
    private  int age;
    private  double salaire;
    
//    constercteur par defaut
    
    public Employe(){};
//    constercteur par parametre
    
	public Employe( int matricule, String nom, String prenom,  int age,  double salaire) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.salaire = salaire;
	}
	
	//	stters & getter
	public  int getMatricule() {
		return matricule;
	}
	public void setMatricule( int matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge( int age) {
		this.age = age;
	}
	public  double getSalaire() {
		return salaire;
	}
	public void setSalaire( double salaire) {
		this.salaire = salaire;
	}
	
	@Override
	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", salaire="
				+ salaire + "]";
	}


	
}