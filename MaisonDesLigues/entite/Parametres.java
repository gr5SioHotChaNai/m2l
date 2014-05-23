package entite;

public class Parametres 
{
	private String nomUtilisateur;
	private String motDePasse;
	private String serveurBD;
	private String driverSGBD;
	public Parametres (){
		//Modifier nomUtiliateur, motDePasse et la dernière partie de serveurBD
      	nomUtilisateur = "GR5";
	  	motDePasse = "GR5";		
	  	driverSGBD ="sun.jdbc.odbc.JdbcOdbcDriver";
	  	serveurBD = "jdbc:odbc:ODBC_M2L";
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
