
package sn.groupeisi.repository;




import javax.ejb.Local;
import sn.groupeisi.entities.Candidat;
import sn.groupeisi.entities.Cv;

@Local
	public interface ICandidat extends Repository<Candidat> {
	     public  Candidat authenticatecandidat(String email,String password);
	     public Candidat getCandidatById(int id) ;
	     public Cv getCvByCandidatId(int candidatId) ;
	//  public void sendEmail(String email, String subject, String body);
	  

	     
	}


