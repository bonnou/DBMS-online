package net.in.ahr.dbms.data.network.request.dto;

/** */
@javax.annotation.Generated(value = { "Doma", "2.6.2" }, date = "2016-05-04T15:45:10.782+0900")
public final class _MusicResultDBHRDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.6.2");
    }

    private static final _MusicResultDBHRDto __singleton = new _MusicResultDBHRDto();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_LOWER_CASE;

    /** the id */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.Long, Object> $id = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.Long.class, java.lang.Long.class, () -> new org.seasar.doma.wrapper.LongWrapper(), null, null, "id", "", __namingType, true, true, false);

    /** the userName */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $userName = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "userName", "", __namingType, false);

    /** the name */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "name", "", __namingType, false);

    /** the nha */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $nha = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "nha", "", __namingType, false);

    /** the clearLamp */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $clearLamp = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "clearLamp", "", __namingType, true, true, false);

    /** the exScore */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.Integer, Object> $exScore = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "exScore", "", __namingType, true, true, false);

    /** the bp */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.Integer, Object> $bp = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "bp", "", __namingType, true, true, false);

    /** the scoreRank */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $scoreRank = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "scoreRank", "", __namingType, true, true, false);

    /** the scoreRate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.Double, Object> $scoreRate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.Double.class, java.lang.Double.class, () -> new org.seasar.doma.wrapper.DoubleWrapper(), null, null, "scoreRate", "", __namingType, true, true, false);

    /** the missRate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.Double, Object> $missRate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.Double.class, java.lang.Double.class, () -> new org.seasar.doma.wrapper.DoubleWrapper(), null, null, "missRate", "", __namingType, true, true, false);

    /** the tag */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $tag = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "tag", "", __namingType, true, true, false);

    /** the fav */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $fav = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "fav", "", __namingType, true, true, false);

    /** the clearLamp_DBR */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $clearLamp_DBR = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "clearLamp_DBR", "", __namingType, true, true, false);

    /** the clearLamp_DBRR */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $clearLamp_DBRR = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "clearLamp_DBRR", "", __namingType, true, true, false);

    /** the clearLamp_DBM */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $clearLamp_DBM = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "clearLamp_DBM", "", __namingType, true, true, false);

    /** the clearLamp_DBSR */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $clearLamp_DBSR = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "clearLamp_DBSR", "", __namingType, true, true, false);

    /** the clearLamp_DBM_NONAS */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $clearLamp_DBM_NONAS = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "clearLamp_DBM_NONAS", "", __namingType, true, true, false);

    /** the clearLamp_RH */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $clearLamp_RH = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "clearLamp_RH", "", __namingType, true, true, false);

    /** the clearLamp_LH */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $clearLamp_LH = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "clearLamp_LH", "", __namingType, true, true, false);

    /** the myDifficult */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.Double, Object> $myDifficult = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.Double.class, java.lang.Double.class, () -> new org.seasar.doma.wrapper.DoubleWrapper(), null, null, "myDifficult", "", __namingType, true, true, false);

    /** the djPoint */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.Double, Object> $djPoint = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.Double.class, java.lang.Double.class, () -> new org.seasar.doma.wrapper.DoubleWrapper(), null, null, "djPoint", "", __namingType, true, true, false);

    /** the clearProgressRate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.Double, Object> $clearProgressRate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.Double.class, java.lang.Double.class, () -> new org.seasar.doma.wrapper.DoubleWrapper(), null, null, "clearProgressRate", "", __namingType, true, true, false);

    /** the lastPlayDate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.util.Date, Object> $lastPlayDate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.util.Date.class, java.util.Date.class, () -> new org.seasar.doma.wrapper.UtilDateWrapper(), null, null, "lastPlayDate", "", __namingType, true, true, false);

    /** the lastUpdateDate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.util.Date, Object> $lastUpdateDate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.util.Date.class, java.util.Date.class, () -> new org.seasar.doma.wrapper.UtilDateWrapper(), null, null, "lastUpdateDate", "", __namingType, true, true, false);

    /** the remainingGaugeOrDeadNotes */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.Integer, Object> $remainingGaugeOrDeadNotes = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "remainingGaugeOrDeadNotes", "", __namingType, true, true, false);

    /** the memoOther */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $memoOther = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "memoOther", "", __namingType, true, true, false);

    /** the pGreat */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $pGreat = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "pGreat", "", __namingType, true, true, false);

    /** the great */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $great = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "great", "", __namingType, true, true, false);

    /** the good */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $good = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "good", "", __namingType, true, true, false);

    /** the bad */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $bad = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "bad", "", __namingType, true, true, false);

    /** the poor */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $poor = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "poor", "", __namingType, true, true, false);

    /** the comboBreak */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.lang.String, Object> $comboBreak = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "comboBreak", "", __namingType, true, true, false);

    /** the insDate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.util.Date, Object> $insDate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.util.Date.class, java.util.Date.class, () -> new org.seasar.doma.wrapper.UtilDateWrapper(), null, null, "insDate", "", __namingType, true, true, false);

    /** the updDate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, java.util.Date, Object> $updDate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, java.util.Date.class, java.util.Date.class, () -> new org.seasar.doma.wrapper.UtilDateWrapper(), null, null, "updDate", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, ?>> __entityPropertyTypeMap;

    private _MusicResultDBHRDto() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "MusicResultDBHRDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "music_result_dbhr";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, ?>> __list = new java.util.ArrayList<>(34);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, ?>> __map = new java.util.HashMap<>(34);
        __list.add($id);
        __map.put("id", $id);
        __idList.add($userName);
        __list.add($userName);
        __map.put("userName", $userName);
        __idList.add($name);
        __list.add($name);
        __map.put("name", $name);
        __idList.add($nha);
        __list.add($nha);
        __map.put("nha", $nha);
        __list.add($clearLamp);
        __map.put("clearLamp", $clearLamp);
        __list.add($exScore);
        __map.put("exScore", $exScore);
        __list.add($bp);
        __map.put("bp", $bp);
        __list.add($scoreRank);
        __map.put("scoreRank", $scoreRank);
        __list.add($scoreRate);
        __map.put("scoreRate", $scoreRate);
        __list.add($missRate);
        __map.put("missRate", $missRate);
        __list.add($tag);
        __map.put("tag", $tag);
        __list.add($fav);
        __map.put("fav", $fav);
        __list.add($clearLamp_DBR);
        __map.put("clearLamp_DBR", $clearLamp_DBR);
        __list.add($clearLamp_DBRR);
        __map.put("clearLamp_DBRR", $clearLamp_DBRR);
        __list.add($clearLamp_DBM);
        __map.put("clearLamp_DBM", $clearLamp_DBM);
        __list.add($clearLamp_DBSR);
        __map.put("clearLamp_DBSR", $clearLamp_DBSR);
        __list.add($clearLamp_DBM_NONAS);
        __map.put("clearLamp_DBM_NONAS", $clearLamp_DBM_NONAS);
        __list.add($clearLamp_RH);
        __map.put("clearLamp_RH", $clearLamp_RH);
        __list.add($clearLamp_LH);
        __map.put("clearLamp_LH", $clearLamp_LH);
        __list.add($myDifficult);
        __map.put("myDifficult", $myDifficult);
        __list.add($djPoint);
        __map.put("djPoint", $djPoint);
        __list.add($clearProgressRate);
        __map.put("clearProgressRate", $clearProgressRate);
        __list.add($lastPlayDate);
        __map.put("lastPlayDate", $lastPlayDate);
        __list.add($lastUpdateDate);
        __map.put("lastUpdateDate", $lastUpdateDate);
        __list.add($remainingGaugeOrDeadNotes);
        __map.put("remainingGaugeOrDeadNotes", $remainingGaugeOrDeadNotes);
        __list.add($memoOther);
        __map.put("memoOther", $memoOther);
        __list.add($pGreat);
        __map.put("pGreat", $pGreat);
        __list.add($great);
        __map.put("great", $great);
        __list.add($good);
        __map.put("good", $good);
        __list.add($bad);
        __map.put("bad", $bad);
        __list.add($poor);
        __map.put("poor", $poor);
        __list.add($comboBreak);
        __map.put("comboBreak", $comboBreak);
        __list.add($insDate);
        __map.put("insDate", $insDate);
        __list.add($updDate);
        __map.put("updDate", $updDate);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto entity, org.seasar.doma.jdbc.entity.PreInsertContext<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto entity, org.seasar.doma.jdbc.entity.PostInsertContext<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto, ?>> __args) {
        net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto entity = new net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> getEntityClass() {
        return net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class;
    }

    @Override
    public net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto getOriginalStates(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MusicResultDBHRDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MusicResultDBHRDto newInstance() {
        return new _MusicResultDBHRDto();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
