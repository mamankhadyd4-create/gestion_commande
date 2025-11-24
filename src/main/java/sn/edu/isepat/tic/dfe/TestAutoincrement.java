package sn.edu.isepat.tic.dfe;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sn.edu.isepat.tic.dfe.entities.utilisateur;

public class TestAutoincrement {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dfepu");
        EntityManager em = emf.createEntityManager();

        utilisateur u1 = new utilisateur();
        u1.setNom("khady diop");
        u1.setEmail("khady@gmail.com");

        em.getTransaction().begin();

        em.persist(u1);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
