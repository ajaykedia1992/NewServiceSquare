package com.square.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;






import com.square.entity.Booking;
import com.square.entity.User;
import com.square.entity.Worker;

public interface DaoI {

	public int addUserDetails(User user);
	public int addWorkerDetails(Worker  worker);
	public Set<String> getCategories();
	
	
	public int update(int wid, int wavail);

	public Set<Integer> getIds();
	public int addFeedback();
	public int addBooking(Booking book);
	public List<Map<String,Object>> BookingDetails();
	 public Set<String> client_Worker(String Username);
	public int fetchUser_id();
	List<Map<String, Object>> sortByRating(String category);	
	public List<Map<String,Object>> viewWorkersByPrice(String category);
	public List<Map<String,Object>> viewWorkersByExp(String category);
	public List<Map<String,Object>> viewWorkersByCategory(String category,String sex);
	public List<Map<String,Object>> viewWorkersByDateRange(String start,String end);
	public List<Map<String,Object>> viewWorkersNearBy(User u,Worker w);
	 
	
	//public List<Map<String,Object>> viewWorkersNearBy(User u,Worker w);
	
}
