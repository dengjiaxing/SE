package com.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.model.Book;
import com.model.HibernateSessionFactory;
import com.model.Ppt;

public class PptDao {
	public static List<Ppt> GetPptList() {
		// TODO Auto-generated method stu
		
		Session session = HibernateSessionFactory.getSession();
		List<Ppt> list = new ArrayList<Ppt>();
		try {
			session.beginTransaction();
		
			Criteria criteria = session.createCriteria(Ppt.class);
			criteria.addOrder(Order.asc("id"));

			
			list = (List<Ppt>) criteria.list();
			session.getTransaction().commit();
			
			return list;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}

	}
	
	public static int GetPptSize() {
		// TODO Auto-generated method stub
		
		Session session = HibernateSessionFactory.getSession();
		List<Ppt> list = new ArrayList<Ppt>();
		try {
			session.beginTransaction();
		
			Criteria criteria = session.createCriteria(Ppt.class);
			criteria.add(Restrictions.eq("status", true));
			list = (List<Ppt>) criteria.list();
			session.getTransaction().commit();
		
			return list.size();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		
		} finally {
			session.close();
		}
		return 0;
	}
	public static Ppt GetPpt(int uid) {
		// TODO Auto-generated method stub
		
		Session session = HibernateSessionFactory.getSession();
		
		try {
			session.beginTransaction();
		
			Ppt ppt=(Ppt)session.get(Ppt.class, uid);
			session.getTransaction().commit();
		
			return ppt;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		
		} finally {
			session.close();
		}
		return null;
	}
	public static Ppt deletePpt(int uid) {
		// TODO Auto-generated method stub
		
		Session session = HibernateSessionFactory.getSession();
		
		try {
			session.beginTransaction();
		
			Ppt ppt=(Ppt)session.get(Ppt.class, uid);
			session.delete(ppt);
			session.getTransaction().commit();
		
			return ppt;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		
		} finally {
			session.close();
		}
		return null;
	}
	public static void  savePpt(String filename, String path) {
		// TODO Auto-generated method stub
		
		Session session = HibernateSessionFactory.getSession();
		Ppt ppt=new Ppt();
		ppt.setDate(new Date().toLocaleString());
		ppt.setName(filename);
		ppt.setPath(path);
		try {
			session.beginTransaction();
		
			session.save(ppt);
			session.getTransaction().commit();
		
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		
		} finally {
			session.close();
		}
		
	}
}
