package com.sts.dao;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class RecipeDAO implements RecipeService {
	@Autowired
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	@Override
	public int insertRecipeOne(Map<String, Object> map) {
		return sqlSession.insert("recipeMapper.insertRecipeOne", map);
	}
}
