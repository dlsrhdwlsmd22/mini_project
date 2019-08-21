package com.sts.web;

import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sts.dao.RecipeService;

@Controller
public class RecipeController {
	
	@Autowired
	private RecipeService rDAO;
	
	@RequestMapping(value="/recipew.do", method = RequestMethod.GET)
	public String recipewrite() {
		return "recipew";
	}
	
	@RequestMapping(value="/recipew.do", method = RequestMethod.POST)
	public String recipewrite(
			@RequestParam("name") String a,
			@RequestParam("item") String b,
			@RequestParam("image") Image c,
			@RequestParam("content") String d) {
		//insert, update, delete  => INT(0 또는 1), select,
		//DB에 추가함. : DAO로 전달함. -> DAO가 mapper로 전달함 -> mapper SQL문을 수행
		//Map 또는 VO 사용
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("NA", a);
		map.put("IT", b);
		map.put("RIMG", c);
		map.put("CO", d);
		
		int ret = rDAO.insertRecipeOne( map );
		return "redirect:recipew.do"; //board.jsp
	}
}
