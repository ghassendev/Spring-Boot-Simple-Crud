package com.ghassen.arbres.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Arbre {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idArbre;
private String nomArbre;
@ManyToOne
private Categorie categorie;
private Double prixArbre;
private Date dateCreation;
public Arbre() {
super();
}
public Arbre(String nomArbre, Double prixArbre, Date dateCreation) {
super();
this.nomArbre = nomArbre;
this.prixArbre = prixArbre;
this.dateCreation = dateCreation;
}
public Long getIdArbre() {
return idArbre;
}
public void setIdArbre(Long idArbre) {
this.idArbre = idArbre;
}
public String getNomArbre() {
return nomArbre;
}
public void setNomArbre(String nomArbre) {
this.nomArbre = nomArbre;
}
public Double getPrixArbre() {
return prixArbre;
}
public void setPrixArbre(Double prixArbre) {
this.prixArbre = prixArbre;
}
public Date getDateCreation() {
return dateCreation;
}
public void setDateCreation(Date dateCreation) {
this.dateCreation = dateCreation;
}
@Override
public String toString() {
return "Arbre [idArbre=" + idArbre + ", nomArbre=" +
nomArbre + ", prixArbre=" + prixArbre
+ ", dateCreation=" + dateCreation + "]";
}
}