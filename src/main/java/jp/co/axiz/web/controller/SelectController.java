package jp.co.axiz.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.axiz.web.entitiy.User;
import jp.co.axiz.web.service.UserService;

@Controller
public class SelectController {

	@Autowired
	private UserService userservice;
	@Autowired
	HttpSession session ;

	@GetMapping("/select")
	public String loginGet(Model model) {
		return "select";
	}

//	@PostMapping(value = "/list")
//	public String loginPost(@ModelAttribute("Form") Form form, Model model) {
//
//		User condition = new User();
//		condition.setUserId(form.getUserId());
//		condition.setUserName(form.getName());
//		condition.setTelephone(form.getTel());
//
//		List<User> list = userservice.findAll();
//
//		session.setAttribute("name", list.get(0).getUserName());
//
//		return "select";
//	}
	@RequestMapping(value = "/list")
	public String list(@ModelAttribute("Form") Form form,
			Model model) {

//		if (bindingResult.hasErrors()) {
//			model.addAttribute("errmsg", errorMsg);
//			return "select";
//		}

		User condition = new User();
		condition.setUserId(form.getUserId());
		condition.setUserName(form.getName());
		condition.setTelephone(form.getTel());

		List<User> resultList = userservice.findAll(condition);

		if(resultList.isEmpty()) {
			model.addAttribute("errmsg", errorMsg);
			return "select";
		}else {
			model.addAttribute("userlist", resultList);
			return "selectResult";
		}
}