package net.in.ahr.dbmsOnline.api.strage.database;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.in.ahr.dbms.data.network.request.dto.MusicMstDto;
import net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto;
import net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.security.oauth2.common.exceptions.UnauthorizedUserException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
public class ReceiveJsonAndInsert {

	private static final Logger logger = LoggerFactory.getLogger(ReceiveJsonAndInsert.class);
/*
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;
*/
    @Autowired
    MusicResultDBHRDomaDao musicResultDBHRDomaDao;

	@Transactional
    @RequestMapping(value = "/insertResult", method = RequestMethod.POST)
    MusicResultDBHRDto insertResult(@RequestBody String json, HttpServletRequest request) {

		if (!request.isUserInRole("ROLE_USER")) {
			throw new UnauthorizedUserException("You don't have a required role. ");
		}

        System.out.println("■json:");
        System.out.println(json);

        // デシリアライズ
        Gson gson = new Gson();
        MusicResultDBHRDto musicResult = gson.fromJson(json, MusicResultDBHRDto.class);

		// 1件登録
		int affectRowCnt = 0;
        if (musicResult != null) {
			int selectCnt = musicResultDBHRDomaDao.selectByPk(musicResult).size();
			if (selectCnt == 0) {
				affectRowCnt = musicResultDBHRDomaDao.insert(musicResult);
			} else {
				affectRowCnt = musicResultDBHRDomaDao.update(musicResult);
			}
        }

		// 受け取った内容を返却する
        return musicResult;
    }

	@Transactional
	@RequestMapping(value = "/insertAllResults", method = RequestMethod.POST)
	int insertAllResults(@RequestBody String json, HttpServletRequest request) {

		if (!request.isUserInRole("ROLE_USER")) {
			throw new UnauthorizedUserException("You don't have a required role. ");
		}

		System.out.println("■json:");
		System.out.println(json);

		// デシリアライズ
		Gson gson = new Gson();
		Type collectionType = new TypeToken<List<MusicResultDBHRDto>>(){}.getType();
		List<MusicResultDBHRDto> musicResultList = gson.fromJson(json, collectionType);

		// 全件処理
		int affectRowCnt = 0;
		for (MusicResultDBHRDto musicResult : musicResultList) {
			// 1件登録
			if (musicResult != null) {
				int selectCnt = musicResultDBHRDomaDao.selectByPk(musicResult).size();
				if (selectCnt == 0) {
					affectRowCnt = musicResultDBHRDomaDao.insert(musicResult);
				} else {
					affectRowCnt = musicResultDBHRDomaDao.update(musicResult);
				}
			}
		}

		logger.info("■musicResultList.size()" + musicResultList.size());
		logger.info("■affectRowCnt" + affectRowCnt);

		// 処理件数を返却する
		return affectRowCnt;
	}

	@RequestMapping(value = "/getAllResult", method = RequestMethod.POST)
	List<MusicResultDBHRDto> getAllResult(@RequestBody String json) {
		// 返却値
		return musicResultDBHRDomaDao.selectAll();
	}


	@RequestMapping("/hello")
	public Map<String, String> getMessage(HttpServletRequest request) {

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

		if (request.isUserInRole("ROLE_USER")) {
			Map<String, String> response = new HashMap<>();
			response.put("message", "Hello, " + request.getRemoteUser() + "!!!");
			return response;
		}
		throw new UnauthorizedUserException("You don't have a required role. ");
	}

	@ExceptionHandler(UnauthorizedUserException.class)
	public void unauthorized(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.UNAUTHORIZED.value());
	}


}
