/**
 * Copyright 2014@ fazalcode
 * All Rights Reserved to fazalcode
 */
package com.hb.fazalcode.dbconn;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * @author Tatarao voleti
 * @date   18-Feb-2014
 *
 */
public class HibernateSessionFactory {
	
	public static final SessionFactory buildSessionFactory;
	public static ServiceRegistry serviceRegistry;

	static int count=0,getCount=0;
	
	/* Creating sessionfactory object in static block means, it will be executed only on time
	 * 
	 * We are making it as singleton object
	 * 
	 * buildSessionFactory method is deprecated in Hibernate 4.0, so we are using ServiceRegistryBuilder().applySettings. 
	 * 
	 * Since this method also deprecated. so we are using ServiceRegistryBuilder method.
	 *   
	 */
	
	static{
		
		System.out.println("Session Factory Creation Count ***** "+(++count)); // Printing SessionFactory creation Count
		
		Configuration cfg=new Configuration();
		cfg.configure();
		serviceRegistry=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		buildSessionFactory=cfg.buildSessionFactory(serviceRegistry);
		
	}
	
	/*  Here we are getting session factory object by calling this method */
	
	public static SessionFactory getSessionFactory() {
		
		System.out.println("Getting session factory count ***** "+(++getCount)); // Printing no. of calls to getSessionFactory method.
		
		return buildSessionFactory;
	}

}
