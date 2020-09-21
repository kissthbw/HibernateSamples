package hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class EjercicioHibernateUtil {

	static StandardServiceRegistry registry;
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {

		try {
			registry = new StandardServiceRegistryBuilder().configure("ejercicio.hibernate.cfg.xml").build();
			// Create MetadataSources
			MetadataSources sources = new MetadataSources(registry);
			// Create Metadata
			Metadata metadata = sources.getMetadataBuilder().build();
			// Create SessionFactory
			return metadata.getSessionFactoryBuilder().build();
		} catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had trouble
			// building the SessionFactory
			// so destroy it manually.
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(registry);

			return null;
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		if (registry != null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
}
