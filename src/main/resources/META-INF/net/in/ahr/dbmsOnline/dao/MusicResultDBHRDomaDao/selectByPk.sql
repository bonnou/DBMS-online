SELECT
	/*%expand*/*
FROM
	music_result_dbhr
WHERE
	1 = 1
	/*%if @isNotEmpty(result.userName) */
		AND user_name = /* result.userName */'userName'
	/*%end*/
    /*%if @isNotEmpty(result.name) */
		AND name LIKE /* @prefix(result.name) */'X%' escape '$'
	/*%end*/
    /*%if @isNotEmpty(result.nha) */
		AND nha = /* result.nha */'NORMAL or HYPER or ANOTHER'
	/*%end*/