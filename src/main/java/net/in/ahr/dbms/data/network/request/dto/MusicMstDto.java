package net.in.ahr.dbms.data.network.request.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class MusicMstDto {

	public MusicMstDto() {}

    private Long id;

    private String name;
    private String nha;
    private String version;
    private String genre;
    private String artist;
    private Integer bpmFrom;
    private Integer bpmTo;
    private String difficult;
    private Integer notes;
    private Integer scratchNotes;
    private Integer chargeNotes;
    private Integer backSpinScratchNotes;
    private Integer sortNumInDifficult;
    private String mstVersion;
    private java.util.Date insDate;
    private java.util.Date updDate;
    private long musicResultIdDBHR;
    private MusicResultDBHRDto musicResultDBHR;

}
