package com.ghassen.arbres.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

@Entity
public class Arbre {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idArbre;
@NotNull
@Size (min = 4,max = 15)
private String nomArbre;

@ManyToOne
private Categorie categorie;

@Min(value = 10)
@Max(value = 10000)
private Double prixArbre;

@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-MM-dd")
@PastOrPresent

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