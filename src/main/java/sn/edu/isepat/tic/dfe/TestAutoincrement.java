package sn.edu.isepat.tic.dfe;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sn.edu.isepat.tic.dfe.entities.Profil;
import sn.edu.isepat.tic.dfe.entities.Utilisateur;

public class TestAutoincrement {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dfepu");
        EntityManager em = emf.createEntityManager();

        Utilisateur u1 = new Utilisateur();
        u1.setNom("khady diop");
        u1.setEmail("khady@gmail.com");

        Profil p1 = new Profil();
        p1.setBio("khady diop");
        p1.setTelephone("1234567890");
        p1.setPhoto("photo.png");


        em.getTransaction().begin();

        em.persist(u1);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
