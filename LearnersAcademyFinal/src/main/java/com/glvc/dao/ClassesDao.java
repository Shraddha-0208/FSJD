package com.glvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.glvc.bean.Classes;
import com.glvc.dbutil.DbUtil;

import org.hibernate.boot.registry.StandardServiceRegistry;

public class ClassesDao {
	public int Classinsert(Classes Class) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		String sql="insert into Classes values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,Class.getClass_Id());
		ps.setString(2,Class.getClass_Section());
		ps.setInt(3, Class.getStu_id());					
		return ps.executeUpdate();
	}
	
	
	public List<Classes> Classdisplay() throws ClassNotFoundException, SQLException{
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		List<Classes> list=new ArrayList<Classes>();
		String sql="select * from Classes";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Classes Class=new Classes();
			Class.setClass_Id(rs.getInt(1));
			Class.setClass_Section(rs.getString(2));
			Class.setStu_id(rs.getInt(3));
			list.add(Class);
		}
		return list;
	}
	
	public int Classedit(Classes Class) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		String sql="update Classes set Stu_id=? where Class_Id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, Class.getStu_id());
		ps.setInt(2,Class.getClass_Id());
		return ps.executeUpdate();
	}
	
	public int Classdelete(Classes Class) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		String sql="delete from Classes where Class_Id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,Class.getClass_Id());
		
		return ps.executeUpdate();
	}
	
	
	
	
	

}
