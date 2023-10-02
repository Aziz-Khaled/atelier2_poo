package test_personne;

import personne.Personne ; 

public class TestPersonne {
	public static void main (String args[]) 
	{ 
		
		Personne p2 = new Personne ("Florant" , "Christine" , "11/06/1980" , 'F') ; 
		Personne p1 = new Personne ("Florant" , "Patrice" , "18/09/1972" , 'M' , p2);
		p1.setConjoint (p2) ; 
		System.out.println (p1.toString()) ;
		System.out.println(p1==p2) ; 
		System.out.println(p1.equals(p2)) ;
	}
	
	
	
	
	/*		4.	Le programme doit pouvoir afficher les caractéristiques de l’objet P1. Comment faire ?
	 *		reponse : on peut l'importer la class personne et on utilise system.out.println */
	
	/* 6.	Réexécutez votre programme. Que remarquez-vous ?
	 * reponse : Erreur */
	
/*	7.	Que faut-il ajouter à la classe Personne pour rendre possible l’affichage des caractéristiques d’une personne à partir de la classe TestPersonne ?
 * reponse : on peut utiliser methode Get()	*/
	
	/* 8.	Quelle est la différence entre les modificateurs de visibilité public et private ?
	 		reponse : */
	
	/*9.	Comment peut-on accéder aux attributs privés ?
	 * reponse : */
}
