package net.in.ahr.dbmsOnline.dao;

import net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ConfigAutowireable
@Dao
@Component
public interface MusicResultDBHRDomaDao {

    @Select
    List<MusicResultDBHRDto> selectAll();

    @Select
    List<MusicResultDBHRDto> selectByPk(MusicResultDBHRDto result);

    @Select
    List<MusicResultDBHRDto> getRankingByNameNha(MusicResultDBHRDto result);

    @Insert
    int insert(MusicResultDBHRDto musicResultDBHRDto);

    @Update
    int update(MusicResultDBHRDto musicResultDBHRDto);

}
