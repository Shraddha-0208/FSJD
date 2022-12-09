package com.glvc.dao;


import java.sql.*;

import java.sql.Connection; import java.sql.ResultSet; import java.sql.SQLException; import java.util.ArrayList; import java.util.logging.Level; import java.util.logging.Logger;

public class assigndao { 
	Session session;
	StandardServiceRegistry ssr;
	Metadata md;
	SessionFactory sf;
	Transaction tran ;
	
	
	
	public String insert(ReportSubjectNTeacher cc) {
		hibConn();

		int r = (int) session.save(cc);

		if (r > 0) {
			close();
			return "data inserted";
		} else {
			close();
			return "data not inserted";
		}
		
	
	}
	
	
public	List<ReportSubjectNTeacher> getAllData(int id){
		hibConn();
		Query q=session.createQuery("from ReportSubjectNTeacher where cid="+id);
		ArrayList<ReportSubjectNTeacher> arr=(ArrayList<ReportSubjectNTeacher>) q.list();
		
		close();
		return arr;
	}

public String delete(int id) {
	hibConn();

	System.out.print("id" + id);
	ReportSubjectNTeacher myObject = (ReportSubjectNTeacher) session.load(ReportSubjectNTeacher.class, id);
	session.delete(myObject);

	// This makes the pending delete to be done
	session.flush();
	close();
	return "deleted";
}
	
	public void hibConn() {

		 ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		// Meta data in the config file should be executed
		 md = new MetadataSources(ssr).getMetadataBuilder().build();
		// read session factory in the xml
		 sf = md.getSessionFactoryBuilder().build();
		// to perform crud operation we need to define an object
		session = sf.openSession();
		// used to save the crud operation result on the table
		 tran = session.beginTransaction();

		 
		
		
	}
	
	public void close() {
		tran.commit();
		session.close();
		sf.close();
	}

}
}