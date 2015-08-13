package com.square.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.square.dao.DaoI;
import com.square.entity.User;
import com.square.entity.Worker;


@Controller
public class ServiceController {

	
	private DaoI dao;
	
@Autowired
	public void setDao(DaoI dao) {
		this.dao = dao;
	}


	@RequestMapping(value="newuser.htm", method=RequestMethod.GET)
	public String addEmployeeFrm(Model model)
	{
	
		model.addAttribute("user",new User());
		return "reg";
	}
	@RequestMapping(value="addclientdetails.htm", method=RequestMethod.POST)
	public String addClientDetails(@ModelAttribute("user")User user,Model model)
	{
		dao.addUserDetails(user);
		//return "HelloWorld";
		
		return "LoginPage";
	}
	@RequestMapping(value="addworkerfrm.htm", method=RequestMethod.GET)
	public String addWorkerForm(Model model)
	{
	
		model.addAttribute("worker",new Worker());
		return "WorkerForm";
	}
	@RequestMapping(value="addworkerdetails.htm", method=RequestMethod.POST)
	public String addWorkerDetails(@ModelAttribute("worker")Worker worker,Model model)
	{
		dao.addWorkerDetails(worker);
		return "HelloWorld";
	}
	@RequestMapping(value="loginfrm.htm", method=RequestMethod.GET)
	public String loginUserForm(Model model)
	{
	
		//model.addAttribute("worker",new Worker());
		return "LoginPage";
	}
	@RequestMapping(value="viewcat.htm",method=RequestMethod.GET)
	public String DisplaycatFrm(Model model){
		model.addAttribute("worker", new Worker());
		model.addAttribute("clist", dao.getCategories());
		return "WCatFrm";
	}
	
	@RequestMapping(value="wcat.htm",method=RequestMethod.POST)
	public String viewCatWork(@ModelAttribute("worker")Worker w,Model model){
		return null;
	}
}
