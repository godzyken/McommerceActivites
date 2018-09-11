package com.clientui.beans;

public class ExpeditionBean {

  private int id;

  private int etat;

  private int idCommande;

  public ExpeditionBean() {
  }

  public ExpeditionBean(int id, int etat, int idCommande) {
    this.id = id;
    this.etat = etat;
    this.idCommande = idCommande;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getEtat() {
    return etat;
  }

  public void setEtat(int etat) {
    this.etat = etat;
  }

  public int getIdCommande() {
    return idCommande;
  }

  public void setIdCommande(int idCommande) {
    this.idCommande = idCommande;
  }

  @Override
  public String toString() {
    return "ExpeditionBean{" +
            "id=" + id +
            ", etat=" + etat +
            ", idCommande=" + idCommande +
            '}';
  }
}
