package sn.edu.isepat.tic.dfe.entities;

import jakarta.persistence.*;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY) // permet d'auto inclementer
    private long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = true)
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
