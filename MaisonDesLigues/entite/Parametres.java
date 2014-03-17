package entite;

public class Parametres 
{
	private String nomUtilisateur;
	private String motDePasse;
	private String serveurBD;
	private String driverSGBD;
	public Parametres (){
		//Modifier nomUtiliateur, motDePasse et la dernière partie de serveurBD
      	nomUtilisateur = "sa";
	  	motDePasse = "aazz";		
	  	driverSGBD ="sun.jdbc.odbc.JdbcOdbcDriver";
	  	serveurBD = "jdbc:odbc:ODBC_M2L_local";
	}
	public String getDriverSGBD() {
		return driverSGBD;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public String getServeurBD() {
		return serveurBD;
	}
	
}
