package com.xworkz.mobile.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.entity.MobileEntity;

@Component
public class MobileDAOImpl implements MobileDAO {

	@Autowired
	private SessionFactory factory;

	public MobileDAOImpl() {
		System.out.println(this.getClass().getSimpleName() + "Object Created");
	}

	@Override
	public boolean saveMobileDTO(MobileEntity mobileEntity) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(mobileEntity);
			transaction.commit();
			System.out.println("Data saved");
			return true;

		} catch (Exception e) {
			transaction.rollback();
			System.out.println("data not saved, rolling back");
			return false;

		} finally {
			if (session != null) {
				System.out.println("session is closed");

				session.close();
			} else {
				System.out.println("session is not closed");
			}
		}

	}

}
