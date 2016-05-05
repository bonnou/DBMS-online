package net.in.ahr.dbmsOnline.controller.index;

import org.springframework.security.oauth2.common.exceptions.UnauthorizedUserException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

	@RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
	public String index(HttpServletRequest request, Model model) {

		if (request.isUserInRole("ROLE_USER")) {

			// セッションIDのCookieを取得
			String sessionIdCookieName = "";
			String sessionIdCookieValue = "";
			Cookie[] cookies = request.getCookies();
			for (Cookie cookie : cookies) {
				System.out.println("cookieName:[" + cookie.getName() + "],cookieValue:[" + cookie.getValue() + "]");
				if ( "JSESSIONID".equals(cookie.getName()) ) {
					sessionIdCookieName = cookie.getName();
					sessionIdCookieValue = cookie.getValue();
				}
			}
			String sessionIdCookieParam = "sessionIdCookieName"
					                    + "="
					                    + sessionIdCookieName
					                    + "&"
					                    + "sessionIdCookieValue"
					                    + "="
					                    + sessionIdCookieValue;

			model.addAttribute("isOAuthFlg", true);
			model.addAttribute("sessionIdCookieParam", sessionIdCookieParam);
		} else {
			model.addAttribute("isOAuthFlg", false);
		}

		return "index";
	}

}