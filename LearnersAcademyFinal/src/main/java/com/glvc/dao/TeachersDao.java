package com.glvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.glvc.bean.Teachers;
import com.glvc.dbutil.DbUtil;

public class TeachersDao {
	public int Teacherinsert(Teachers Teacher) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		String sql="insert into Teachers values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,Teacher.getTeacher_id());
		ps.setString(2, Teacher.getFname());
		ps.setString(3, Teacher.getLname());
		ps.setInt(4, Teacher.getTeacher_age());
		return ps.executeUpdate();
	}
	
	
	public List<Teachers> Teacherdisplay() throws ClassNotFoundException, SQLException{
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		List<Teachers> list=new ArrayList<Teachers>();
		String sql="select * from Teachers";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Teachers Teacher=new Teachers();
			Teacher.setTeacher_id(rs.getInt(1));
			Teacher.setFname(rs.getString(2));
			Teacher.setLname(rs.getString(3));
			Teacher.setTeacher_age(rs.getInt(4));
			list.add(Teacher);
		}
		return list;
	}
	
	public int Teacheredit(Teachers Teacher) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		String sql="update Teachers set Fname=?,Lname=?,Teacher_age=? where Teacher_id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(4,Teacher.getTeacher_id());
		ps.setString(1, Teacher.getFname());
		ps.setString(2, Teacher.getLname());
		ps.setInt(3, Teacher.getTeacher_age());
		return ps.executeUpdate();
	}
	
	public int Teacherdelete(Teachers Teacher) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		String sql="delete from Teachers where Teacher_id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,Teacher.getTeacher_id());
		return ps.executeUpdate();
	}
}
