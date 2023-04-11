package sn.groupeisi.dao;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.groupeisi.entities.Cv;
import sn.groupeisi.repository.ICv;

@Stateless
public class CvImpl extends RepositoryImpl<Cv>implements ICv {
  
  @PersistenceContext(unitName="UP_Exam")
  protected EntityManager em;

}