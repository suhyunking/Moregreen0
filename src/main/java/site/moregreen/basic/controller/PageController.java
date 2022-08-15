package site.moregreen.basic.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages")
public class PageController {
		
	@GetMapping("/dashboard")
	public String dashborad() {
		return "pages/dashboard";
	}
	
	@GetMapping("/members")
	public String members() {
		return "pages/members";
	}
	
	@GetMapping("/notifications")
	public String notifications() {
		return "pages/notifications";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "pages/profile";
	}
	
	@GetMapping("/signIn")
	public String signIn() {
		return "pages/signIn";
	}
	
	@GetMapping("/signUp")
	public String signUp() {
		return "pages/signUp";
	}
	
	@GetMapping("/fundingList")
	public String fundingList() {
		return "pages/fundingList";
	}
	
	@GetMapping("/noticeList")
	public String noticeList() {
		return "pages/noticeList";
	}
	
	@GetMapping("/eventList")
	public String eventList() {
		return "pages/eventList";
	}
	
	@GetMapping("/eventReg")
	public String eventReg() {
		return "pages/eventReg";
	}
	
	@GetMapping("/template")
	public String template() {
		return "pages/template";
	}
	
	
	@GetMapping("/orderList")
	public String orderList() {
		return "pages/orderList";
	}
	
}
