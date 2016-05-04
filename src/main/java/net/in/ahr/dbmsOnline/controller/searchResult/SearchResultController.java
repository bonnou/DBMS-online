package net.in.ahr.dbmsOnline.controller.searchResult;

import net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto;
import net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("searchResult")
public class SearchResultController {

	@Autowired
	MusicResultDBHRDomaDao musicResultDBHRDomaDao;

	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
	String searchResultList(@Validated MusicResultDBHRDto musicResultDBHRDto,
							BindingResult result,
							Model model) {

		// 検索しModelに設定
		List<MusicResultDBHRDto> searchResultList = musicResultDBHRDomaDao.selectByPk(musicResultDBHRDto);
		model.addAttribute("searchResultList", searchResultList);

		return "searchResult/list";
	}

}
