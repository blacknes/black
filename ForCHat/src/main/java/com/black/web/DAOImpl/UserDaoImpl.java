package com.black.web.DAOImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.black.web.DAO.UserDao;
import com.black.web.POJO.User;

public class UserDaoImpl implements UserDao {

private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void add(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	public boolean delete(String id) {
		String hql = "delete User u where u.id=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		
		return (query.executeUpdate()>0);
	}

	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		
		String hql = "from User";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
		
	}

	public User findOne(String id) {
		String hql = "from User u where u.id=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		return (User)query.uniqueResult();
	}

	public boolean update(User user) {
		String hql = "update User u set u.firstName=?,u.lastName=?,u.age=?,u.gender=?,u.description=? where u.id=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, user.getFirstName());
		query.setString(1, user.getLastName());
		query.setString(2, user.getAge());
		query.setString(3, user.getGender());
		query.setString(4, user.getDescription());
		query.setString(5, user.getId());
		
		return (query.executeUpdate()>0);
	}

}
