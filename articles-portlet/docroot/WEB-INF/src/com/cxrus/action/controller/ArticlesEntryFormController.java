package com.cxrus.action.controller;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowStateException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * Portlet implementation class ArticlesEntryFormController
 */
@Controller(value = "articlesEntryFormController")
@RequestMapping("VIEW")
public class ArticlesEntryFormController {

	private static Log log = LogFactoryUtil.getLog(MainPageController.class);

	/**
	 * Render landing page. The controller prepare for the all available task
	 * for current login user
	 *
	 * @return String jsp name
	 */
	@RenderMapping
	public String renderDefaultListRequest(RenderRequest request,
			RenderResponse response, Model model) throws WindowStateException,
			SystemException {
		return "articles-entryform/view";
	}
}
