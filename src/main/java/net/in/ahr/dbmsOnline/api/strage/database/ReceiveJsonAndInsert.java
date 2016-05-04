package net.in.ahr.dbmsOnline.api.strage.database;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.in.ahr.dbms.data.network.request.dto.MusicMstDto;
import net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto;
import net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ReceiveJsonAndInsert {
/*
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;
*/
    @Autowired
    MusicResultDBHRDomaDao musicResultDBHRDomaDao;

	@Transactional
    @RequestMapping(value = "/recvInsert", method = RequestMethod.POST)
    List<MusicResultDBHRDto> recvInsert(@RequestBody String json) {

		// 返却値
		List<MusicResultDBHRDto> musicResultList = null;

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

		// 全件取得し返却
		musicResultList = musicResultDBHRDomaDao.selectAll();

        return musicResultList;
    }

}
