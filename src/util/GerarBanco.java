package util;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class GerarBanco {

	static EntityManagerFactory factory = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory = Persistence.createEntityManagerFactory("VendaJPA");
		
		gerarDados();
		
		System.exit(0);
	}

	private static void gerarDados() {
		// TODO Auto-generated method stub
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

}
