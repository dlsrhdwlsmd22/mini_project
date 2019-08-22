package com.sts.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.sts.dao.RecipeService;
import com.sts.vo.RecipeVO;

@Controller
public class RecipeController {
	
	@Autowired
	private RecipeService rDAO;
	
	@RequestMapping(value="/recipew.do", method = RequestMethod.GET)
	public String recipewrite(Model model, HttpSession httpSession) {
		return "recipew";
	}
	
	@RequestMapping(value="/recipew.do", method = RequestMethod.POST)
	public String recipewrite(RecipeVO rvo, MultipartHttpServletRequest request) {
		rDAO.toString();
		try {
			MultipartFile file = request.getFile("rimage1");
			rvo.setRimage( file.getBytes() );
			System.out.println(file.getOriginalFilename());
			rDAO.insertRecipeOne(rvo);
			rDAO.toString();
			return "redirect:recipew.do"; 
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return "redirect:recipew.do";
		}
		
		
	}		
}
