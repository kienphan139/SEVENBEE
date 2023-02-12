package com.sevenbee.controller;




import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




import com.sevenbee.service.ParamService;
import com.sevenbee.service.SessionService;

import com.sevenbee.util.PageInfo;
import com.sevenbee.util.PageType;

import jakarta.servlet.ServletException;





@Controller
public class GiohangController {
	
	
	@Autowired 
	ParamService param;
	
	@Autowired
	SessionService session;
	
	@RequestMapping("/ShoppingCart")
	public String LoadShopcart(Model model) throws ServletException, IOException{
		
		return PageInfo.goSite(model, PageType.SITE_SHOPPINGCART);
	}
	
	@GetMapping("/addCart?id")
	public String addToCart(@PathVariable Integer id, Model model) {
	
	
		model.addAttribute("messages", "Add success!");
		return "redirect:/ShoppingCart";
	}
	
	@GetMapping("/updateCart?id")
	public String updateCart(@PathVariable Integer id, Model model) {
	
		model.addAttribute("messages", "Update success!");
		return "redirect:/ShoppingCart";
	}
	
	@GetMapping("/removeCart?id")
	public String removeCart(@PathVariable Integer id, Model model) {
	
		model.addAttribute("messages", "remove success!");
		return "redirect:/ShoppingCart";
	}
	
	@GetMapping("/clear")
	public String clearCart(Model model) {
	
		model.addAttribute("messages", "Clear success!");
		return "redirect:/ShoppingCart";
	}
}
