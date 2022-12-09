package com.glvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.glvc.bean.Students;
import com.glvc.dbutil.DbUtil;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StudentsDao {

	public int Studentinsert(Students Student) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		String sql="insert into Students values(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,Student.getStudent_id());
		ps.setString(2, Student.getStudent_Fname());
		ps.setString(3, Student.getStudent_Lname());
		ps.setInt(4, Student.getStudent_age());
		ps.setInt(5, Student.getStudent_class());
		return ps.executeUpdate();
	}
	
	
	public List<Students> Studentdisplay() throws ClassNotFoundException, SQLException{
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		List<Students> list=new ArrayList<Students>();
		String sql="select * from Students";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Students student=new Students();
			student.setStudent_id(rs.getInt(1));
			student.setStudent_Fname(rs.getString(2));
			student.setStudent_Lname(rs.getString(3));
			student.setStudent_age(rs.getInt(4));
			student.setStudent_class(rs.getInt(5));
			list.add(student);
		}
		return list;
	}
	
	public List<Students> StudentList() throws ClassNotFoundException, SQLException{
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		List<Students> list=new ArrayList<Students>();
		String sql="select * from Students where Student_class=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Students student=new Students();
			student.setStudent_id(rs.getInt(1));
			student.setStudent_Fname(rs.getString(2));
			student.setStudent_Lname(rs.getString(3));
			student.setStudent_age(rs.getInt(4));
			student.setStudent_class(rs.getInt(5));
			list.add(student);
		}
		return list;
	}
	
	public	int Studentedit(Students Student) throws ClassNotFoundException, SQLException {
			Connection con=DbUtil.dbConn();
			if(con!=null) {
				System.out.println("connection with dB is established ");
			}
			else {
				System.out.println("connection failed ");
			}
			String sql="update Students set Student_class=? where Student_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(2,Student.getStudent_id());
			ps.setInt(1, Student.getStudent_class());
			return ps.executeUpdate();
		}
		
	
	
	public int Studentdelete(Students Student) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		String sql="delete from Students where Student_id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,Student.getStudent_id());
	    return ps.executeUpdate();
	}
	
	
	public List<Students> display1(){
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		//Meta data in the config file should be executed	
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		//read session factory in the xml
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		//to perform crud operation we need to define an object
		Session session=sf.openSession();
		//used to save the crud operation result on the table
		Transaction tran=session.beginTransaction();
		Query q=session.createQuery("from Students");
		return q.list();
		
	}
}

