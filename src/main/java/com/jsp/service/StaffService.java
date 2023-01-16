package com.jsp.service;

import java.util.List;

import com.jsp.dao.StaffDao;
import com.jsp.dto.Staff;

public class StaffService {
	StaffDao staffDao=new StaffDao();
	
	public Staff saveStaff(Staff staff) {
		return staffDao.saveStaff(staff);	
   	}
	     
	public Staff getstaffById(int id) {
		return staffDao.getStaffById(id);
	}
	
	public List<Staff> getAllstaff() {
		return staffDao.getAllStaff();
	}
	
	public Staff deleteStaff(int id) {
		return staffDao.deleteStaffById(id);
	}
	
	public Staff  updateStaffEmailById(int id, String email) {
		return staffDao.updateStaffEmailById(id, email);
	}
	
	public Staff  updateStaffjobById(int id, String job) {
		return staffDao.updateStaffEmailById(id, job);
	}
	public Staff  updateStaffNameById(int id, String name) {
		return staffDao.updateStaffNameById(id, name);
	}
}
