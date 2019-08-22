package com.sts.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.vo.RecipeVO;

@Service
public class RecipeDAO implements RecipeService {
	
	@Autowired
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	@Override
	public int insertRecipeOne(RecipeVO rvo) {
		return sqlSession.insert("recipeMapper.insertRecipeOne", rvo);
	}
}
