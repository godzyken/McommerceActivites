package com.clientui.beans;

public class ExpeditionBean {

  private int id;

  private Integer etat;

  private Integer idCommande;

  public ExpeditionBean() {
  }

  public ExpeditionBean(int id, Integer etat, Integer idCommande) {
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

  public Integer getEtat() {
    return etat;
  }

  public void setEtat(Integer etat) {
    this.etat = etat;
  }

  public Integer getIdCommande() {
    return idCommande;
  }

  public void setIdCommande(Integer idCommande) {
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
