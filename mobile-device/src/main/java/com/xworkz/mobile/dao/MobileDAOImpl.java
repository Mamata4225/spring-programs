package com.xworkz.mobile.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobile.dto.MobileDTO;

@Component
public class MobileDAOImpl implements MobileDAO {

	@Autowired
	private SessionFactory factory;

	public MobileDAOImpl(SessionFactory factory) {
		this.factory = factory;
	}

	public void saveMobileDTO(MobileDTO dto) {
		System.out.println("Invoking Save Method");
		Session openSession = null;
		try {
			openSession = factory.openSession();
			openSession.getTransaction().begin();
			openSession.save(dto);
			openSession.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (openSession != null) {
				System.out.println("Session Closed");
				openSession.close();
			}
		}

	}

}
