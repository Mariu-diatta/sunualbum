package beans.persistent;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Utilisateur extends Personne{

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(Integer id, String prenom, String nom, String mail, String username, String password,
			Date registeredDate) {
		super(id, prenom, nom, mail, username, password, registeredDate);
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(String prenom, String nom, String mail, String username, String password, Date registeredDate) {
		super(prenom, nom, mail, username, password, registeredDate);
		// TODO Auto-generated constructor stub
	}


	
	
	
}
