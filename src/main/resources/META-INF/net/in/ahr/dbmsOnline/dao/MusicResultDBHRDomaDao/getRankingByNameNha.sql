SELECT
	/*%expand*/*
FROM
	music_result_dbhr
WHERE
		1 = 1
	AND ex_score != 0
	AND name = /* result.name */'name'
	AND nha = /* result.nha */'NORMAL or HYPER or ANOTHER'
ORDER BY ex_score DESC, upd_date