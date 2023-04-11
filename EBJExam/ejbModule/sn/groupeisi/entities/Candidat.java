package sn.groupeisi.entities;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Candidat implements Serializable{
	private static final long serialVersionUID = 1L;
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private int id;
	  @Column
	  private String firstname;
	  @Column
	  private String lastname;
	  @Column
	  private  String email;
	  @Column
	  private String password;
	//  @OneToMany( targetEntity=Cv.class, mappedBy="candidat", fetch=FetchType.EAGER )
//	    private List<Cv> cv = new ArrayList<>();
	  @OneToOne(targetEntity=Cv.class,mappedBy = "candidat")
	    private Cv cv;
	  
	  
	  
	  public int getId() {return id;}
	  public void setId(int id) {this.id = id;}
	  public String getFirstname() {return firstname;}
	  public void setFirstname(String firstname) {this.firstname = firstname;}
	  public String getLastname() {return lastname;}
	  public void setLastname(String lastname) {this.lastname = lastname;}
	  public String getEmail() {return email;}
	  public void setEmail(String email) {this.email = email;}
	  public String getPassword() {return password;}
	  public void setPassword(String password) {this.password = password;}
	  public Cv getCv() {
	    return cv;
	  }
	  public void setCv(Cv cv) {
	    this.cv = cv;
	  }
	  
	//  public List<Cv> getCv() {return cv;}
	//  public void setCv(List<Cv> cv) {this.cv = cv;}
	  //public List<Candidature> getMescandidature() {return mescandidature;}
	  //public void setMescandidature(List<Candidature> mescandidature) {this.mescandidature = mescandidature;}
	  
	  
	}

