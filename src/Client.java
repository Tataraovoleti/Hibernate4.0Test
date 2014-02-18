
/**
 * Copyright 2014@ fazalcode
 * All Rights Reserved to fazalcode
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hb.fazalcode.dbconn.HibernateSessionFactory;
import com.hb.fazalcode.entity.StudentEntity;

/**
 * @author Tatarao voleti
 * @date   18-Feb-2014
 *
 */
public class Client {

	public static void main(String[] args) {
		
		SessionFactory factory=HibernateSessionFactory.getSessionFactory();
		Session session=factory.getCurrentSession();
		
		Transaction tx=session.beginTransaction();
		
   /*  Code for inserting Record in Database
		
		StudentEntity st=new StudentEntity();
		st.setSname("Sanjay");
		st.setSaddr("AP");
		st.setSphno("9999999999");
		
		session.save(st);
		tx.commit();
		
	*/
		
		StudentEntity st=new StudentEntity();
		st.setSname("Sanjay");
		st.setSaddr("Kakinadaaa");
		st.setSphno("9999999999");
		st.setSid(1);
		session.update(st);
		
		// Retrieving Record from Database table based on Id

		StudentEntity stt=(StudentEntity)session.get(StudentEntity.class,1);
		System.out.println(stt.getSname()+"  "+stt.getSaddr()+"   "+stt.getSphno());
		
		tx.commit();
	}
}
