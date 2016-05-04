package net.in.ahr.dbmsOnline.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.6.2" }, date = "2016-05-04T15:45:11.745+0900")
public class MusicResultDBHRDomaDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.6.2");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDao.class, "selectAll");

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDao.class, "selectByPk", net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDao.class, "insert", net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDao.class, "update", net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public MusicResultDBHRDomaDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> selectAll() {
        entering("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl", "selectAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/net/in/ahr/dbmsOnline/dao/MusicResultDBHRDomaDao/selectAll.sql");
            __query.setEntityType(net.in.ahr.dbms.data.network.request.dto._MusicResultDBHRDto.getSingletonInternal());
            __query.setCallerClassName("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto>(net.in.ahr.dbms.data.network.request.dto._MusicResultDBHRDto.getSingletonInternal()));
            java.util.List<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> __result = __command.execute();
            __query.complete();
            exiting("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> selectByPk(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto result) {
        entering("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl", "selectByPk", result);
        try {
            if (result == null) {
                throw new org.seasar.doma.DomaNullPointerException("result");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/net/in/ahr/dbmsOnline/dao/MusicResultDBHRDomaDao/selectByPk.sql");
            __query.setEntityType(net.in.ahr.dbms.data.network.request.dto._MusicResultDBHRDto.getSingletonInternal());
            __query.addParameter("result", net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto.class, result);
            __query.setCallerClassName("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl");
            __query.setCallerMethodName("selectByPk");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto>> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto>(net.in.ahr.dbms.data.network.request.dto._MusicResultDBHRDto.getSingletonInternal()));
            java.util.List<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> __result = __command.execute();
            __query.complete();
            exiting("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl", "selectByPk", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl", "selectByPk", __e);
            throw __e;
        }
    }

    @Override
    public int insert(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto musicResultDBHRDto) {
        entering("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl", "insert", musicResultDBHRDto);
        try {
            if (musicResultDBHRDto == null) {
                throw new org.seasar.doma.DomaNullPointerException("musicResultDBHRDto");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> __query = getQueryImplementors().createAutoInsertQuery(__method2, net.in.ahr.dbms.data.network.request.dto._MusicResultDBHRDto.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntity(musicResultDBHRDto);
            __query.setCallerClassName("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto musicResultDBHRDto) {
        entering("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl", "update", musicResultDBHRDto);
        try {
            if (musicResultDBHRDto == null) {
                throw new org.seasar.doma.DomaNullPointerException("musicResultDBHRDto");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<net.in.ahr.dbms.data.network.request.dto.MusicResultDBHRDto> __query = getQueryImplementors().createAutoUpdateQuery(__method3, net.in.ahr.dbms.data.network.request.dto._MusicResultDBHRDto.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(musicResultDBHRDto);
            __query.setCallerClassName("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("net.in.ahr.dbmsOnline.dao.MusicResultDBHRDomaDaoImpl", "update", __e);
            throw __e;
        }
    }

}
