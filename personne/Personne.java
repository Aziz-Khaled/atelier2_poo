package personne;

public class Personne {
	
 private String Nom ; 
 private String Prenom ;
 public String dateNaissance ;
 public char Sexe ;
 private Personne Conjoint ;
 public boolean marie;
 	
 public Personne () {
	 this.Nom = "" ;
	 this.Prenom = "" ;
	 this.dateNaissance = "" ;
	 this.Sexe = ' ' ;
 }
 public Personne (String N , String P , String DN , char S  , Personne C) {
	 this.Nom = N ; 
	 this.Prenom = P ;
	 this.dateNaissance = DN ;
	 this.Sexe = S ;
	 
	 if (this.marie==false) { 
	 this.Conjoint = null ; }
	 else {
		 this.Conjoint = C ; 
	 	  }
	 
 }
 public Personne (String N , String P , String DN , char S ) {
	 this.Nom = N ; 
	 this.Prenom = P ;
	 this.dateNaissance = DN ;
	 this.Sexe = S ;
	  
 }
 
 public Personne (String N , String P ) {
	 this.Nom = N ; 
	 this.Prenom = P ; 
 }
 // Methodes Set () et Get () de Nom et Prenom 
 public String GetNom () {
	 return Nom ; 
 }
 
 public String GetPrenom () {
	 return Prenom ; 
 }
 
 public void SetNom (String no) {
	 this.Nom = no ; 
 }
 
public void SetPrenom (String PR)
{
	this.Prenom = PR ; 
}

 
 public Personne getConjoint() {
     return Conjoint;
 }

 
 public String getDateNais () {
	 return dateNaissance ; 
 }
 
 
 
 public void setConjoint(Personne conj) {
     this.Conjoint = conj;
 }
 
 public String toString () {
	 String S ; 
	S = "nom : "  + GetNom ()  + "\n";
	S+= "prenom : " + GetPrenom () + "\n" ;
	S+= "date de naissance : " + this.dateNaissance + "\n" ;
	S+= "sexe : " + this.Sexe + "\n";
	S+= "Conjoint : \n" ; 
	if (Conjoint != null) {
	S+= "nom : "  + Conjoint.GetNom ()  + "\n";
	S+= "prenom : " + Conjoint.GetPrenom () + "\n" ;
	S+= "date de naissance : " + Conjoint.dateNaissance + "\n" ;
	S+= "sexe : " + Conjoint.Sexe + "\n";
 }else {
	 S+= "null" ; 
 }
	return S ; 
}
}


