package net.in.ahr.dbms.data.network.request.dto;

/** */
@javax.annotation.Generated(value = { "Doma", "2.6.2" }, date = "2016-05-03T16:42:51.939+0900")
public final class _MusicMstDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<net.in.ahr.dbms.data.network.request.dto.MusicMstDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.6.2");
    }

    private static final _MusicMstDto __singleton = new _MusicMstDto();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the id */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.Long, Object> $id = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.Long.class, java.lang.Long.class, () -> new org.seasar.doma.wrapper.LongWrapper(), null, null, "id", "", __namingType, false);

    /** the name */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "name", "", __namingType, true, true, false);

    /** the nha */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.String, Object> $nha = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "nha", "", __namingType, true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.String, Object> $version = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "version", "", __namingType, true, true, false);

    /** the genre */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.String, Object> $genre = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "genre", "", __namingType, true, true, false);

    /** the artist */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.String, Object> $artist = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "artist", "", __namingType, true, true, false);

    /** the bpmFrom */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.Integer, Object> $bpmFrom = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "bpmFrom", "", __namingType, true, true, false);

    /** the bpmTo */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.Integer, Object> $bpmTo = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "bpmTo", "", __namingType, true, true, false);

    /** the difficult */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.String, Object> $difficult = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "difficult", "", __namingType, true, true, false);

    /** the notes */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.Integer, Object> $notes = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "notes", "", __namingType, true, true, false);

    /** the scratchNotes */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.Integer, Object> $scratchNotes = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "scratchNotes", "", __namingType, true, true, false);

    /** the chargeNotes */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.Integer, Object> $chargeNotes = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "chargeNotes", "", __namingType, true, true, false);

    /** the backSpinScratchNotes */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.Integer, Object> $backSpinScratchNotes = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "backSpinScratchNotes", "", __namingType, true, true, false);

    /** the sortNumInDifficult */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.Integer, Object> $sortNumInDifficult = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "sortNumInDifficult", "", __namingType, true, true, false);

    /** the mstVersion */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.String, Object> $mstVersion = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "mstVersion", "", __namingType, true, true, false);

    /** the insDate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.util.Date, Object> $insDate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.util.Date.class, java.util.Date.class, () -> new org.seasar.doma.wrapper.UtilDateWrapper(), null, null, "insDate", "", __namingType, true, true, false);

    /** the updDate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.util.Date, Object> $updDate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.util.Date.class, java.util.Date.class, () -> new org.seasar.doma.wrapper.UtilDateWrapper(), null, null, "updDate", "", __namingType, true, true, false);

    /** the musicResultIdDBHR */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, java.lang.Long, Object> $musicResultIdDBHR = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class, java.lang.Long.class, java.lang.Long.class, () -> new org.seasar.doma.wrapper.LongWrapper(), null, null, "musicResultIdDBHR", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<net.in.ahr.dbms.data.network.request.dto.MusicMstDto>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicMstDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicMstDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicMstDto, ?>> __entityPropertyTypeMap;

    private _MusicMstDto() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "MusicMstDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicMstDto, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicMstDto, ?>> __list = new java.util.ArrayList<>(18);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicMstDto, ?>> __map = new java.util.HashMap<>(18);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($name);
        __map.put("name", $name);
        __list.add($nha);
        __map.put("nha", $nha);
        __list.add($version);
        __map.put("version", $version);
        __list.add($genre);
        __map.put("genre", $genre);
        __list.add($artist);
        __map.put("artist", $artist);
        __list.add($bpmFrom);
        __map.put("bpmFrom", $bpmFrom);
        __list.add($bpmTo);
        __map.put("bpmTo", $bpmTo);
        __list.add($difficult);
        __map.put("difficult", $difficult);
        __list.add($notes);
        __map.put("notes", $notes);
        __list.add($scratchNotes);
        __map.put("scratchNotes", $scratchNotes);
        __list.add($chargeNotes);
        __map.put("chargeNotes", $chargeNotes);
        __list.add($backSpinScratchNotes);
        __map.put("backSpinScratchNotes", $backSpinScratchNotes);
        __list.add($sortNumInDifficult);
        __map.put("sortNumInDifficult", $sortNumInDifficult);
        __list.add($mstVersion);
        __map.put("mstVersion", $mstVersion);
        __list.add($insDate);
        __map.put("insDate", $insDate);
        __list.add($updDate);
        __map.put("updDate", $updDate);
        __list.add($musicResultIdDBHR);
        __map.put("musicResultIdDBHR", $musicResultIdDBHR);
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
    public void preInsert(net.in.ahr.dbms.data.network.request.dto.MusicMstDto entity, org.seasar.doma.jdbc.entity.PreInsertContext<net.in.ahr.dbms.data.network.request.dto.MusicMstDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(net.in.ahr.dbms.data.network.request.dto.MusicMstDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext<net.in.ahr.dbms.data.network.request.dto.MusicMstDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(net.in.ahr.dbms.data.network.request.dto.MusicMstDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext<net.in.ahr.dbms.data.network.request.dto.MusicMstDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(net.in.ahr.dbms.data.network.request.dto.MusicMstDto entity, org.seasar.doma.jdbc.entity.PostInsertContext<net.in.ahr.dbms.data.network.request.dto.MusicMstDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(net.in.ahr.dbms.data.network.request.dto.MusicMstDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext<net.in.ahr.dbms.data.network.request.dto.MusicMstDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(net.in.ahr.dbms.data.network.request.dto.MusicMstDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext<net.in.ahr.dbms.data.network.request.dto.MusicMstDto> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicMstDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicMstDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<net.in.ahr.dbms.data.network.request.dto.MusicMstDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, net.in.ahr.dbms.data.network.request.dto.MusicMstDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public net.in.ahr.dbms.data.network.request.dto.MusicMstDto newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<net.in.ahr.dbms.data.network.request.dto.MusicMstDto, ?>> __args) {
        net.in.ahr.dbms.data.network.request.dto.MusicMstDto entity = new net.in.ahr.dbms.data.network.request.dto.MusicMstDto();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<net.in.ahr.dbms.data.network.request.dto.MusicMstDto> getEntityClass() {
        return net.in.ahr.dbms.data.network.request.dto.MusicMstDto.class;
    }

    @Override
    public net.in.ahr.dbms.data.network.request.dto.MusicMstDto getOriginalStates(net.in.ahr.dbms.data.network.request.dto.MusicMstDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(net.in.ahr.dbms.data.network.request.dto.MusicMstDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MusicMstDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MusicMstDto newInstance() {
        return new _MusicMstDto();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<net.in.ahr.dbms.data.network.request.dto.MusicMstDto> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
