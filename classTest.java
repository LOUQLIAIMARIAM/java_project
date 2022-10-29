package MenuProgramme;
import java.util.LinkedList;
import java.util.Scanner;

public class testem {
	LinkedList<Employe> list;
    // Default Constructor
    public testem()
    {
        list = new LinkedList<>();
    }
    public static void menu()
    {
 
        // Printing statements displaying menu on console
        System.out.println("MENU");
        System.out.println("1 - Ajouter un nouvel employé :");
        System.out.println("2 - Modifier un employé  :");
        System.out.println("3 - Supprimer un employé :");
        System.out.println("4 - Afficher un employé  :");
        System.out.println("5 - Afficher tous les employés :");
        System.out.println("6 - Calculer le nombre des employés ayant un salaire qui dépasse 10000:");
        System.out.println("7 - Afficher l’employé le plus âgé :");
        System.out.println("8 - Afficher l’employé le moins âgé :");
        System.out.println("9 - Quitter");
        System.out.print("Enter your selection : ");
    }
	public void add(Employe emp) {
		 if (!find(emp.getMatricule())) {
	            list.add(emp);
	        }
	        else {
	            System.out.println("Employee deja exist dans la list");
	        }
	    }
	public boolean find(int matr) {

       for (Employe l : list) {
           if (l.getMatricule() == matr) {

               System.out.println(l);
               return true;
           }
       }
       return false;
   }
    public Employe findEmploye(int matNumber)
    {
        for (Employe l : list) {
            if (l.getMatricule() > matNumber) {
                return l;
            }
        }
 
        return null;
    }
    public void delete(int matNumber)
    {
        Employe empDel = null;
        for (Employe ll : list) {
            if (ll.getMatricule() == matNumber) {
                empDel = ll;
            }
        }
        if ( empDel == null) {
            System.out.println("Invalid Employe Matricule");
        }
        else {
 
            list.remove( empDel);
            System.out.println("L'employe est suprrimer dans la list avec sucess");
        }
    }
    public void update(int matrc, Scanner input)
    {
 
        if (find(matrc)) {
            Employe emp = findEmploye(matrc);
 
    
            System.out.print("Nouveau Matricule:");
            int matr = input.nextInt();
            System.out.println("Nouveau Nom : ");
            String nom = input.next();
            System.out.print("Nouveau Prenom ");
            String prenom = input.next();
            System.out.println("Nouveau Age : ");
            int age = input.nextInt();
            input.nextLine();
            System.out.print( "Nouveau Salaiare ");
            int salaire = input.nextInt();
            input.nextLine();
 
            emp.setMatricule(matr);
            emp.setNom(nom);
            emp.setPrenom(prenom);
            emp.setAge(age);
            emp.setSalaire(salaire);

            System.out.println( "Employe et modifier avec sucess");
        }
        else {
            System.out.println( "Employe  n'exist pas dans la  list");
        }
    }
    public void display()
    {
        if (list.isEmpty()) {
            System.out.println("la list est vide");
        }
        for (Employe emp : list) {

            System.out.println(emp.toString());
        }
        }

    public void moinsAge() {
    for (Employe emp : list) {
  	  if( emp.getAge() < 20) {
      System.out.println("l'employe le moins age est :"+" "+emp.getNom()+" "+"sont age est :"+" "+emp.getAge());
  
      }
  	}
    }
    public void plusAge() {
    for (Employe emp : list) {
  	  if(emp.getAge() > 20) {
      System.out.println("l'employe le plus age est :"+" "+emp.getNom()+" "+"sont age est :"+" "+emp.getAge());
  
      }
  	}
    }
  public  int  salaire() {
    	 int count = 0;
    	 for(Employe emp : list){
    	    if(emp.getSalaire()>10000){
    	        count++;
    	    }
    	 }
    	 return count;
    	 }

 
    public static void main(String[] args) {
    testem hr= new testem ();
    Employe emp = new Employe();
    Scanner input = new Scanner(System.in);
    int option = 0;
    do {
        menu();
        option = input.nextInt();
        switch (option) {
        case 1:
            System.out.print("matricule : ");
            int mat = input.nextInt();
            System.out.print("nom : ");
            String nom = input.next();
            System.out.print("prenom : ");
            String prenom = input.next();
            System.out.print("Age :");
            int age = input.nextInt();
            input.nextLine();
            System.out.print("salaire : ");
            double salaire = input.nextInt();
            input.nextLine();
            emp = new Employe(mat,nom,prenom,age,salaire);
            hr.add(emp);
            break;
        case 2:
            System.out.print( "quelle le matricule ? ");
                int rIdNo = input.nextInt();
                hr.update(rIdNo, input);

            break;
        case 3:
            System.out.print("quel est le matricule ? ");
                int rId = input.nextInt();
                hr.delete(rId);
        case 4:
              System.out.println(emp.toString());
            break;
        case 5:
            hr.display();
            break;
        case 6:
        	 System.out.println(hr.salaire());
        	break;
        case 7:
        	hr.plusAge();
        	break;
        case 8:
        	hr.moinsAge();
        	break;
        case 9:
            System.out.println("Merci d'utiliser le programme .");
            System.exit(0);
            break;
        default:
            System.out.println("erreur");
            break;
        }
    }
    while (option != 9);
    }
}

 
    




