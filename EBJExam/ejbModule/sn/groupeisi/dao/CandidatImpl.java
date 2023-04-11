package sn.groupeisi.dao;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import sn.groupeisi.entities.Candidat;
import sn.groupeisi.entities.Cv;
import sn.groupeisi.repository.ICandidat;

@Stateless
public  class CandidatImpl extends RepositoryImpl<Candidat> implements ICandidat {
  @PersistenceContext(unitName = "UP_Exam")
  protected EntityManager em;
  private static final String USERNAME = "youssoudiarra.ndiaye@uvs.edu.snr";
  private static final String PASSWORD = "younger@#99";

//    pour authentification
  @Override
  public Candidat authenticatecandidat(String email, String password) {
    Candidat candidat = null;
    try {
      candidat = (Candidat) em.createQuery("FROM Candidat U WHERE U.email = :email").setParameter("email", email)
          .getSingleResult();
      if (candidat != null && candidat.getPassword().equals(password)) {
        return candidat;
      }
      return null;

    } catch (Exception e) {
      return null;
    }

  }
//  pour recuperer IdCandidat
  @Override
  public Candidat getCandidatById(int id) {return em.find(Candidat.class, id);}
//  pour recuperer IdCv
  public Cv getCvByCandidatId(int candidatId) {
        Candidat candidat = em.find(Candidat.class, candidatId);
        if (candidat != null) {
            return candidat.getCv();
        } else {
            return null;
        }
    }
  
  
  
  
  
  
  

}