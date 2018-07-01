package jp.co.axiz.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.axiz.web.entitiy.Admin;
import jp.co.axiz.web.service.AdminService;

@Controller
public class AuthController {
	@Autowired
	private AdminService adminservice;
	@Autowired
	HttpSession session ;

	@GetMapping(value = "/login")
	public String loginGet(@ModelAttribute("Form") Form form, Model model) {
		return "login";
	}
	@PostMapping(value = "/login")
	public String loginPost(@ModelAttribute("Form") Form form,Model model) {

		 String loginId = form.getLoginId();
		 String loginPass = form.getLoginPass();

		 List<Admin> list =	adminservice.authentication(loginId, loginPass);
		 Boolean isSuccess = list.isEmpty() != true;

		 			if(isSuccess) {
		 					session.setAttribute("name", list.get(0).getAdminName());

		 				return "menu";
		 			}
		 			else {
		 				model.addAttribute("msg", "IDまたはPASSが間違っています");
		 				return "login";
		 			}
		}
}

