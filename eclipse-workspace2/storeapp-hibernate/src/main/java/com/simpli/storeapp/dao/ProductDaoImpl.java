package com.simpli.storeapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;

import com.simpli.storeapp.domain.Product;

@Component("productDao")
@Scope("singleton")
@Transactional()
public class ProductDaoImpl implements ProductDao {

	
	@Autowired
	@Qualifier("mysqlSessionFactory")
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public int insert(Product product) {
		
		return (Integer)sessionFactory.getCurrentSession().save(product);
				
	}

	@Override
	@Transactional
	public void update(Product product) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(product);;
	}

	@Override
	@Transactional
	public int delete(int id) {
		
		/*
		 * Session session = sessionFactory.getCurrentSession();
		 *  Product product = session.get(Product.class, id); 
		 *  session.delete(product);
		 */
		
		Session session = sessionFactory.getCurrentSession(); 
		Query query = session.createSQLQuery("delete from product_details where id= :identifier");
		query.setInteger("identifier", id);

		return query.executeUpdate();
	}

	@Transactional()
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProducts() {
		
		Session session = sessionFactory.getCurrentSession(); 
	    Criteria criteria =  session.createCriteria(Product.class);
	    
		return (List<Product>)criteria.list();
	}

	@Override
	public Product getProductById(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from com.simpli.storeapp.domain.Product p where p.id = :id");
		query.setParameter(id, id);
		
		return (Product)query.uniqueResult();
	}
	
	
}
