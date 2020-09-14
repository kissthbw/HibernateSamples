package hibernate.examples;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import hibernate.examples.model.CatPhoneType;
import hibernate.examples.model.Client;
import hibernate.examples.model.Phone;
import hibernate.util.HibernateUtil;

public class PhoneManager {
	public static void main( String...args ) {
		PhoneManager m = new PhoneManager();
//		m.saveCatPhoneType();
//		m.getAllPhones();
//		m.savePhone();
//		m.saveClient();
//		m.getAllClients();
		m.saveClientWithNewPhone();
	}
	
	private void saveCatPhoneType(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		CatPhoneType pt = new CatPhoneType("Home");
		session.save(pt);
		
		pt = new CatPhoneType("Work");
		session.save(pt);
		
		pt = new CatPhoneType("Mobile");
		session.save(pt);
		
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
	
	private void savePhone() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		CatPhoneType cat = session.get(CatPhoneType.class, 1);
		
		Phone p = new Phone();
//		CatPhoneType cat = new CatPhoneType();
//		cat.setId(1);
		
		p.setNumber( "5557423748" );
		p.setCatPhoneType(cat);
		
		session.save(p);
		
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
	
	private void saveClient() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Phone p = session.get(Phone.class, 2);
		
		Client c = new Client();
		c.setName("Paola");
		c.setLastName("Sanchez Pardo");
		c.setEmail("beyota_paola@gmail.com");
		c.getPhones().add( p );
		
		session.save(c);
		
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
	
	private void saveClientWithNewPhone() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		CatPhoneType cat = session.get(CatPhoneType.class, 1);
		
		Phone p = new Phone();
		p.setNumber( "5544332200" );
		p.setCatPhoneType(cat);
		
		session.save(p);
		
		Client c = new Client();
		c.setName("Paola");
		c.setLastName("Sanchez Pardo");
		c.setEmail("beyota_paola@hotmail.com");
		c.getPhones().add( p );
		p.setClient(c);
		
		session.save(c);
		
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
	
	private void getAllPhones() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		List<Phone> list = session.createQuery( "from Phone" ).list();
		for( Phone p : list ) {
			CatPhoneType c = p.getCatPhoneType();
			if( c != null ) {
				System.out.println( p.getNumber() + ", " + c.getName() );
			}
			else {
				System.out.println( p.getNumber() + ", " + "Sin categoria" );
			}
			
		}
		
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
	
	@SuppressWarnings("unchecked")
	private void getAllClients() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		List<Client> list = session.createQuery( "from Client" ).list();
		for( Client c : list ) {

			System.out.println( c.getName() );
			
			Set<Phone> phones = c.getPhones();
			if( !phones.isEmpty() ) {
				System.out.println( "Contiene " + phones.size() + " telefonos" );
				
				for( Phone p : phones ) {
					System.out.println( p.getNumber() + " - " + 
							( p.getCatPhoneType() == null ? "Sin categoria" : p.getCatPhoneType().getName() )  );
				}
			}
			
		}
		
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
}
