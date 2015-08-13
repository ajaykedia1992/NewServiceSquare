package com.square.dao;


import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


import org.springframework.jdbc.core.JdbcTemplate;

import com.square.entity.Booking;
import com.square.entity.User;
import com.square.entity.Worker;
public class DaoImpl implements DaoI {
	

	public void setJtemp(JdbcTemplate jtemp) {
		this.jtemp = jtemp;
	}

	private JdbcTemplate jtemp;
	public int addUserDetails(User user) {
		String sql="insert into user(user_id,email,password,full_name,contactno,sex) values('',?,?,?,?,?)";
		jtemp.update(sql,user.getUid(),user.getPassword(),user.getFullname(),user.getContactno(),user.getSex());
			
		return 0;
	}

	public int addWorkerDetails(Worker worker) {
		return 0;
	}

	public Set<String> getCategories() {
		String sql="Select worker_category from worker";
		List<String> lst=jtemp.queryForList(sql,String.class);
		Set<String> set=new HashSet<String>();
		set.addAll(lst);
		return set;
		
	}

	public List<Map<String, Object>> viewWorkersByCategory(String category,String sex) {
		String sql="select worker_name from worker where worker_category=? or Worker_sex=?";
		Object[] params={category,sex};
		List<Map<String, Object>> lst=jtemp.queryForList(sql,params);
		return lst;
	}

	public int update(int wid, int wavail) {
		String sql="update worker set wavail=? where wid=?";
		Object[] params={wid, wavail};
		return jtemp.update(sql, params);
	}

	public Set<Integer> getIds() {
		String sql="Select worker_id from worker";
		List<Integer> lst=jtemp.queryForList(sql,Integer.class);
		Set<Integer> set=new HashSet<Integer>();
		set.addAll(lst);
		return set;
	}

	@Override
	public List<Map<String, Object>> sortByRating(String category) {
		
		String sql="select worker_name from worker where worker_category=? ORDER BY worker_ranking DESC";
		Object[] params={category};
		List<Map<String, Object>> lst=jtemp.queryForList(sql,params);
		return lst;
	}

	@Override
	public List<Map<String, Object>> viewWorkersByExp(String category) {
		String sql="select worker_name from worker where worker_category=? ORDER BY worker_rcount DESC";
		Object[] params={category};
		List<Map<String, Object>> lst=jtemp.queryForList(sql,params);
		return lst;
	}

	@Override
	public int addFeedback() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addBooking(Booking book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> BookingDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> client_Worker(String Username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int fetchUser_id() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> viewWorkersByPrice(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> viewWorkersByDateRange(String start,
			String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> viewWorkersNearBy(User u, Worker w) {
		// TODO Auto-generated method stub
		return null;
	}

}
