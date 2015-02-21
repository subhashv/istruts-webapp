package com.company.istruts.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

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
		if(userForm.getUserName().equals("admin") && userForm.getPassword().equals("system")){
			return mapping.findForward("successScreen");
		}
		
		return mapping.findForward("loginPage");
	}
}
