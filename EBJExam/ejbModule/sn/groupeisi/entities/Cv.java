package sn.groupeisi.entities;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cv implements Serializable {
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
	  private  String adresse;
	  @Column
	  private  Integer age;
	  @Column
	  private  String specialite;
	  @Column
	  private  String niveauEtude;
	  @Column
	  private  String experienceProfessionnelle;
	  //"Candidat" object to be associated with only one "Cv"
	  @ManyToOne(fetch = FetchType.LAZY)  
	  @JoinColumn( name="idCandidat" )
	    private Candidat candidat;
	  
	  
	  public Cv(int id, String firstname, String lastname, String email, String adresse, Integer age, String specialite,
	      String niveauEtude, String experienceProfessionnelle, Candidat candidat) {
	    super();
	    this.id = id;
	    this.firstname = firstname;
	    this.lastname = lastname;
	    this.email = email;
	    this.adresse = adresse;
	    this.age = age;
	    this.specialite = specialite;
	    this.niveauEtude = niveauEtude;
	    this.experienceProfessionnelle = experienceProfessionnelle;
	    this.candidat = candidat;
	  }

	  public Cv() {super();}
	  
	  public Cv(String firstname, String lastname, String email, String adresse, Integer age, String specialite,
	      String niveauEtude, String experienceProfessionnelle) {
	    super();
	    this.firstname = firstname;
	    this.lastname = lastname;
	    this.email = email;
	    this.adresse = adresse;
	    this.age = age;
	    this.specialite = specialite;
	    this.niveauEtude = niveauEtude;
	    this.experienceProfessionnelle = experienceProfessionnelle;
	  }
	  public int getId() {
	    return id;
	  }
	  public void setId(int id) {
	    this.id = id;
	  }
	  public String getFirstname() {
	    return firstname;
	  }
	  public void setFirstname(String firstname) {
	    this.firstname = firstname;
	  }
	  public String getLastname() {
	    return lastname;
	  }
	  public void setLastname(String lastname) {
	    this.lastname = lastname;
	  }
	  public String getEmail() {
	    return email;
	  }
	  public void setEmail(String email) {
	    this.email = email;
	  }
	  public String getAdresse() {
	    return adresse;
	  }
	  public void setAdresse(String adresse) {
	    this.adresse = adresse;
	  }
	  public Integer getAge() {
	    return age;
	  }
	  public void setAge(Integer age) {
	    this.age = age;
	  }
	  public String getSpecialite() {
	    return specialite;
	  }
	  public void setSpecialite(String specialite) {
	    this.specialite = specialite;
	  }
	  public String getNiveauEtude() {
	    return niveauEtude;
	  }
	  public void setNiveauEtude(String niveauEtude) {
	    this.niveauEtude = niveauEtude;
	  }
	  public String getExperienceProfessionnelle() {
	    return experienceProfessionnelle;
	  }
	  public void setExperienceProfessionnelle(String experienceProfessionnelle) {
	    this.experienceProfessionnelle = experienceProfessionnelle;
	  }
	  public Candidat getCandidat() {
	    return candidat;
	  }
	  public void setCandidat(Candidat candidat) {
	    this.candidat = candidat;
	  }
	  
	  
}
