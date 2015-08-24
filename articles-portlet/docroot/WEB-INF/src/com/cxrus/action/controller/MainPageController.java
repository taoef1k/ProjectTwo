package com.cxrus.action.controller;

import com.cxrus.model.Articles;
import com.cxrus.model.CategoryArticles;
import com.cxrus.model.impl.ArticlesImpl;
import com.cxrus.model.impl.CategoryArticlesImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowStateException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * This class is controller for main list page of merchant registration.
 */
@Controller(value = "mainPageController")
@RequestMapping("VIEW")
public class MainPageController {
	
	private static Log log = LogFactoryUtil.getLog(MainPageController.class);
	
	/**
	 * Render landing page. The controller prepare for the all available task for current login user
	 *
	 * @return String jsp name
	 */
	@RenderMapping
	public String renderDefaultListRequest(RenderRequest request, RenderResponse response, 
			Model model) throws WindowStateException, SystemException{
		
		log.info("In renderDefaultListRequest method");
		
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		
		log.info("user: "+user.getScreenName());
		
		List<CategoryArticles> listCategoryArticles= new ArrayList<CategoryArticles>();
		List<Articles> listArticles= new ArrayList<Articles>();
		
		/*
		 * Set of category articles
		 */
		CategoryArticlesImpl category= new CategoryArticlesImpl(); 
		category.setCategoryArticlesId((long) 1);
		category.setCategoryName("Category 1");
		
		listCategoryArticles.add(category);
		
		category= new CategoryArticlesImpl();
		category.setCategoryArticlesId((long) 2);
		category.setCategoryName("Category 2");
		
		listCategoryArticles.add(category);
		
		/*
		 * Set of articles
		 */
		ArticlesImpl articles= new ArticlesImpl();
		articles.setArticlesId((long) 1);
		articles.setArticleName("Article 1");
		articles.setArticleTitle("Title 1");
		articles.setCategoryArticlesId((long) 1);
		
		listArticles.add(articles);
		
		articles= new ArticlesImpl();
		articles.setArticlesId((long) 2);
		articles.setArticleName("Article 2");
		articles.setArticleTitle("Title 2");
		articles.setCategoryArticlesId((long) 1);
		
		listArticles.add(articles);
		
		articles= new ArticlesImpl();
		articles.setArticlesId((long) 1);
		articles.setArticleName("Article 3");
		articles.setArticleTitle("Title 3");
		articles.setCategoryArticlesId((long) 1);
		
		listArticles.add(articles);
		
		articles= new ArticlesImpl();
		articles.setArticlesId((long) 4);
		articles.setArticleName("Article 4");
		articles.setArticleTitle("Title 4");
		articles.setCategoryArticlesId((long) 2);
		
		listArticles.add(articles);
		
		articles= new ArticlesImpl();
		articles.setArticlesId((long) 5);
		articles.setArticleName("Article 5");
		articles.setArticleTitle("Title 5");
		articles.setCategoryArticlesId((long) 2);
		
		listArticles.add(articles);
		
		model.addAttribute("listCategoryArticles", listCategoryArticles);
		model.addAttribute("listArticles", listArticles);
		
		return "view";
	}
	
}
