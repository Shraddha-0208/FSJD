package com.glvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.glvc.bean.Subjects;
import com.glvc.dbutil.DbUtil;

public class SubjectsDao {
	public int Subjectinsert(Subjects Subject) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		String sql="insert into Subjects values(?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,Subject.getSubject_id());
		ps.setString(2, Subject.getSubject_name());
	
		return ps.executeUpdate();
	}
	
	
	public List<Subjects> Subjectdisplay() throws ClassNotFoundException, SQLException{
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		List<Subjects> list=new ArrayList<Subjects>();
		String sql="select * from Subjects";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Subjects Subject=new Subjects();
			Subject.setSubject_id(rs.getInt(1));
			Subject.setSubject_name(rs.getNString(2));
						
			list.add(Subject);
		}
		return list;
	}
	
	public int Subjectedit(Subjects Subject) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		String sql="update Subjects set Subject_name=? where Subject_id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(2,Subject.getSubject_id());
		ps.setString(1, Subject.getSubject_name());
		return ps.executeUpdate();
	}
	
	public int Subjectdelete(Subjects Subject) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		String sql="delete from Subjects where Subject_id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,Subject.getSubject_id());
		return ps.executeUpdate();
	}
}
