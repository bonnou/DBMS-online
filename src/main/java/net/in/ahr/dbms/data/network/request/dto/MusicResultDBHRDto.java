package net.in.ahr.dbms.data.network.request.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.seasar.doma.Entity;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;

import java.util.Date;

@Entity(naming = NamingType.SNAKE_LOWER_CASE)
@Table(name = "music_result_dbhr")
@Data
public class MusicResultDBHRDto {

	public MusicResultDBHRDto(){}

    public Long id;

    @Id
    public String userName;

    @Id
    public String name;

    @Id
    public String nha;

    public String clearLamp;
    public Integer exScore;
    public Integer bp;
    public String scoreRank;
    public Double scoreRate;
    public Double missRate;
    public String tag;
    public String fav;
    public String clearLamp_DBR;
    public String clearLamp_DBRR;
    public String clearLamp_DBM;
    public String clearLamp_DBSR;
    public String clearLamp_DBM_NONAS;
    public String clearLamp_RH;
    public String clearLamp_LH;
    public Double myDifficult;
    public Double djPoint;
    public Double clearProgressRate;
    public java.util.Date lastPlayDate;
    public java.util.Date lastUpdateDate;
    public Integer remainingGaugeOrDeadNotes;
    public String memoOther;
    public String pGreat;
    public String great;
    public String good;
    public String bad;
    public String poor;
    public String comboBreak;
    public java.util.Date insDate;
    public java.util.Date updDate;

}
