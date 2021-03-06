package com.frame.core.webapp.controller.menu;

import com.frame.core.entity.MenuEntity;
import com.frame.core.query.xml.GeneralController;
import com.frame.core.query.xml.annoation.PageDefinition;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
@PageDefinition("pageDefinition.xml")
public class MenuController extends GeneralController <MenuEntity>{
	@Override
	public boolean beforeDelete(MenuEntity entity) {
		System.out.println("beforeDelete MenuEntity id："+entity.getId());
		return true;
	}
	
}
