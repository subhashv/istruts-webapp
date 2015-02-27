package com.company.istruts.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.company.istruts.service.UserService;
import com.company.istruts.service.impl.UserServiceImpl;
import com.company.istruts.web.forms.UserForm;

public class LoginAction extends Action{//1

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {//2
		System.out.println("--------------------------Action Class-------------------------"+form);
		
		UserForm userForm = (UserForm)form;
		System.out.println(userForm.getUserName() +"::::::::::::::::::::::::::"+userForm.getPassword());
		
		if(userForm.getUserName()==null && userForm.getPassword() == null){
			return mapping.findForward("loginPage");
		}
		
		UserService service = new UserServiceImpl();
		String msg = service.auth(userForm.getUserName(), userForm.getPassword());
		if(msg.equals("SUCCESS")){
			return mapping.findForward("successScreen");
		}
		
		return mapping.findForward("loginPage");
	}
}
