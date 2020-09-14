package hibernate.examples;

import org.hibernate.Session;

import hibernate.util.HibernateUtil;

public class ClientManager {
	public static void main( String... args ) {
		ClientManager cm = new ClientManager();
		cm.createAndStoreCliente();
	}
	
	private void createAndStoreCliente() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
//		
//		Cliente c = new Cliente();
//		c.setNombre( "Juanito" );
//		c.setPaterno( "Osorio" );
//		c.setMaterno( "Alvarezzz" );
//		session.save(c);
//		
//		session.getTransaction().commit();
		
//		session = HibernateUtil.getSessionFactory().getCurrentSession();
//		session.beginTransaction();
//		List<Cliente> clientes = session.createQuery("from Cliente").list();
//		
//		for( Cliente item : clientes ) {
//			System.out.println( "Cliente:" + item.getNombre() );
//		}
//		
//		session.getTransaction().commit();
		
		HibernateUtil.getSessionFactory().close();
	}
}
