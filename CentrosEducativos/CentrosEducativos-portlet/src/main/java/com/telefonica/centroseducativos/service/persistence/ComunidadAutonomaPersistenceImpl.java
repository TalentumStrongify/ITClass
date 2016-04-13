package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.telefonica.centroseducativos.NoSuchComunidadAutonomaException;
import com.telefonica.centroseducativos.model.ComunidadAutonoma;
import com.telefonica.centroseducativos.model.impl.ComunidadAutonomaImpl;
import com.telefonica.centroseducativos.model.impl.ComunidadAutonomaModelImpl;
import com.telefonica.centroseducativos.service.persistence.ComunidadAutonomaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the comunidad autonoma service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ComunidadAutonomaPersistence
 * @see ComunidadAutonomaUtil
 * @generated
 */
public class ComunidadAutonomaPersistenceImpl extends BasePersistenceImpl<ComunidadAutonoma>
    implements ComunidadAutonomaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ComunidadAutonomaUtil} to access the comunidad autonoma persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ComunidadAutonomaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ComunidadAutonomaModelImpl.ENTITY_CACHE_ENABLED,
            ComunidadAutonomaModelImpl.FINDER_CACHE_ENABLED,
            ComunidadAutonomaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ComunidadAutonomaModelImpl.ENTITY_CACHE_ENABLED,
            ComunidadAutonomaModelImpl.FINDER_CACHE_ENABLED,
            ComunidadAutonomaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ComunidadAutonomaModelImpl.ENTITY_CACHE_ENABLED,
            ComunidadAutonomaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_COMUNIDADAUTONOMA = "SELECT comunidadAutonoma FROM ComunidadAutonoma comunidadAutonoma";
    private static final String _SQL_COUNT_COMUNIDADAUTONOMA = "SELECT COUNT(comunidadAutonoma) FROM ComunidadAutonoma comunidadAutonoma";
    private static final String _ORDER_BY_ENTITY_ALIAS = "comunidadAutonoma.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ComunidadAutonoma exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ComunidadAutonomaPersistenceImpl.class);
    private static ComunidadAutonoma _nullComunidadAutonoma = new ComunidadAutonomaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<ComunidadAutonoma> toCacheModel() {
                return _nullComunidadAutonomaCacheModel;
            }
        };

    private static CacheModel<ComunidadAutonoma> _nullComunidadAutonomaCacheModel =
        new CacheModel<ComunidadAutonoma>() {
            @Override
            public ComunidadAutonoma toEntityModel() {
                return _nullComunidadAutonoma;
            }
        };

    public ComunidadAutonomaPersistenceImpl() {
        setModelClass(ComunidadAutonoma.class);
    }

    /**
     * Caches the comunidad autonoma in the entity cache if it is enabled.
     *
     * @param comunidadAutonoma the comunidad autonoma
     */
    @Override
    public void cacheResult(ComunidadAutonoma comunidadAutonoma) {
        EntityCacheUtil.putResult(ComunidadAutonomaModelImpl.ENTITY_CACHE_ENABLED,
            ComunidadAutonomaImpl.class, comunidadAutonoma.getPrimaryKey(),
            comunidadAutonoma);

        comunidadAutonoma.resetOriginalValues();
    }

    /**
     * Caches the comunidad autonomas in the entity cache if it is enabled.
     *
     * @param comunidadAutonomas the comunidad autonomas
     */
    @Override
    public void cacheResult(List<ComunidadAutonoma> comunidadAutonomas) {
        for (ComunidadAutonoma comunidadAutonoma : comunidadAutonomas) {
            if (EntityCacheUtil.getResult(
                        ComunidadAutonomaModelImpl.ENTITY_CACHE_ENABLED,
                        ComunidadAutonomaImpl.class,
                        comunidadAutonoma.getPrimaryKey()) == null) {
                cacheResult(comunidadAutonoma);
            } else {
                comunidadAutonoma.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all comunidad autonomas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ComunidadAutonomaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ComunidadAutonomaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the comunidad autonoma.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(ComunidadAutonoma comunidadAutonoma) {
        EntityCacheUtil.removeResult(ComunidadAutonomaModelImpl.ENTITY_CACHE_ENABLED,
            ComunidadAutonomaImpl.class, comunidadAutonoma.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<ComunidadAutonoma> comunidadAutonomas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (ComunidadAutonoma comunidadAutonoma : comunidadAutonomas) {
            EntityCacheUtil.removeResult(ComunidadAutonomaModelImpl.ENTITY_CACHE_ENABLED,
                ComunidadAutonomaImpl.class, comunidadAutonoma.getPrimaryKey());
        }
    }

    /**
     * Creates a new comunidad autonoma with the primary key. Does not add the comunidad autonoma to the database.
     *
     * @param idca the primary key for the new comunidad autonoma
     * @return the new comunidad autonoma
     */
    @Override
    public ComunidadAutonoma create(int idca) {
        ComunidadAutonoma comunidadAutonoma = new ComunidadAutonomaImpl();

        comunidadAutonoma.setNew(true);
        comunidadAutonoma.setPrimaryKey(idca);

        return comunidadAutonoma;
    }

    /**
     * Removes the comunidad autonoma with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idca the primary key of the comunidad autonoma
     * @return the comunidad autonoma that was removed
     * @throws com.telefonica.centroseducativos.NoSuchComunidadAutonomaException if a comunidad autonoma with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ComunidadAutonoma remove(int idca)
        throws NoSuchComunidadAutonomaException, SystemException {
        return remove((Serializable) idca);
    }

    /**
     * Removes the comunidad autonoma with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the comunidad autonoma
     * @return the comunidad autonoma that was removed
     * @throws com.telefonica.centroseducativos.NoSuchComunidadAutonomaException if a comunidad autonoma with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ComunidadAutonoma remove(Serializable primaryKey)
        throws NoSuchComunidadAutonomaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            ComunidadAutonoma comunidadAutonoma = (ComunidadAutonoma) session.get(ComunidadAutonomaImpl.class,
                    primaryKey);

            if (comunidadAutonoma == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchComunidadAutonomaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(comunidadAutonoma);
        } catch (NoSuchComunidadAutonomaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected ComunidadAutonoma removeImpl(ComunidadAutonoma comunidadAutonoma)
        throws SystemException {
        comunidadAutonoma = toUnwrappedModel(comunidadAutonoma);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(comunidadAutonoma)) {
                comunidadAutonoma = (ComunidadAutonoma) session.get(ComunidadAutonomaImpl.class,
                        comunidadAutonoma.getPrimaryKeyObj());
            }

            if (comunidadAutonoma != null) {
                session.delete(comunidadAutonoma);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (comunidadAutonoma != null) {
            clearCache(comunidadAutonoma);
        }

        return comunidadAutonoma;
    }

    @Override
    public ComunidadAutonoma updateImpl(
        com.telefonica.centroseducativos.model.ComunidadAutonoma comunidadAutonoma)
        throws SystemException {
        comunidadAutonoma = toUnwrappedModel(comunidadAutonoma);

        boolean isNew = comunidadAutonoma.isNew();

        Session session = null;

        try {
            session = openSession();

            if (comunidadAutonoma.isNew()) {
                session.save(comunidadAutonoma);

                comunidadAutonoma.setNew(false);
            } else {
                session.merge(comunidadAutonoma);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(ComunidadAutonomaModelImpl.ENTITY_CACHE_ENABLED,
            ComunidadAutonomaImpl.class, comunidadAutonoma.getPrimaryKey(),
            comunidadAutonoma);

        return comunidadAutonoma;
    }

    protected ComunidadAutonoma toUnwrappedModel(
        ComunidadAutonoma comunidadAutonoma) {
        if (comunidadAutonoma instanceof ComunidadAutonomaImpl) {
            return comunidadAutonoma;
        }

        ComunidadAutonomaImpl comunidadAutonomaImpl = new ComunidadAutonomaImpl();

        comunidadAutonomaImpl.setNew(comunidadAutonoma.isNew());
        comunidadAutonomaImpl.setPrimaryKey(comunidadAutonoma.getPrimaryKey());

        comunidadAutonomaImpl.setIdca(comunidadAutonoma.getIdca());
        comunidadAutonomaImpl.setNombrecomunidad(comunidadAutonoma.getNombrecomunidad());
        comunidadAutonomaImpl.setIdpais(comunidadAutonoma.getIdpais());

        return comunidadAutonomaImpl;
    }

    /**
     * Returns the comunidad autonoma with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the comunidad autonoma
     * @return the comunidad autonoma
     * @throws com.telefonica.centroseducativos.NoSuchComunidadAutonomaException if a comunidad autonoma with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ComunidadAutonoma findByPrimaryKey(Serializable primaryKey)
        throws NoSuchComunidadAutonomaException, SystemException {
        ComunidadAutonoma comunidadAutonoma = fetchByPrimaryKey(primaryKey);

        if (comunidadAutonoma == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchComunidadAutonomaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return comunidadAutonoma;
    }

    /**
     * Returns the comunidad autonoma with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchComunidadAutonomaException} if it could not be found.
     *
     * @param idca the primary key of the comunidad autonoma
     * @return the comunidad autonoma
     * @throws com.telefonica.centroseducativos.NoSuchComunidadAutonomaException if a comunidad autonoma with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ComunidadAutonoma findByPrimaryKey(int idca)
        throws NoSuchComunidadAutonomaException, SystemException {
        return findByPrimaryKey((Serializable) idca);
    }

    /**
     * Returns the comunidad autonoma with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the comunidad autonoma
     * @return the comunidad autonoma, or <code>null</code> if a comunidad autonoma with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ComunidadAutonoma fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        ComunidadAutonoma comunidadAutonoma = (ComunidadAutonoma) EntityCacheUtil.getResult(ComunidadAutonomaModelImpl.ENTITY_CACHE_ENABLED,
                ComunidadAutonomaImpl.class, primaryKey);

        if (comunidadAutonoma == _nullComunidadAutonoma) {
            return null;
        }

        if (comunidadAutonoma == null) {
            Session session = null;

            try {
                session = openSession();

                comunidadAutonoma = (ComunidadAutonoma) session.get(ComunidadAutonomaImpl.class,
                        primaryKey);

                if (comunidadAutonoma != null) {
                    cacheResult(comunidadAutonoma);
                } else {
                    EntityCacheUtil.putResult(ComunidadAutonomaModelImpl.ENTITY_CACHE_ENABLED,
                        ComunidadAutonomaImpl.class, primaryKey,
                        _nullComunidadAutonoma);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(ComunidadAutonomaModelImpl.ENTITY_CACHE_ENABLED,
                    ComunidadAutonomaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return comunidadAutonoma;
    }

    /**
     * Returns the comunidad autonoma with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param idca the primary key of the comunidad autonoma
     * @return the comunidad autonoma, or <code>null</code> if a comunidad autonoma with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ComunidadAutonoma fetchByPrimaryKey(int idca)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) idca);
    }

    /**
     * Returns all the comunidad autonomas.
     *
     * @return the comunidad autonomas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ComunidadAutonoma> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the comunidad autonomas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.ComunidadAutonomaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of comunidad autonomas
     * @param end the upper bound of the range of comunidad autonomas (not inclusive)
     * @return the range of comunidad autonomas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ComunidadAutonoma> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the comunidad autonomas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.ComunidadAutonomaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of comunidad autonomas
     * @param end the upper bound of the range of comunidad autonomas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of comunidad autonomas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ComunidadAutonoma> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<ComunidadAutonoma> list = (List<ComunidadAutonoma>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_COMUNIDADAUTONOMA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_COMUNIDADAUTONOMA;

                if (pagination) {
                    sql = sql.concat(ComunidadAutonomaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<ComunidadAutonoma>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<ComunidadAutonoma>(list);
                } else {
                    list = (List<ComunidadAutonoma>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the comunidad autonomas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (ComunidadAutonoma comunidadAutonoma : findAll()) {
            remove(comunidadAutonoma);
        }
    }

    /**
     * Returns the number of comunidad autonomas.
     *
     * @return the number of comunidad autonomas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_COMUNIDADAUTONOMA);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the comunidad autonoma persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.telefonica.centroseducativos.model.ComunidadAutonoma")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<ComunidadAutonoma>> listenersList = new ArrayList<ModelListener<ComunidadAutonoma>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<ComunidadAutonoma>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ComunidadAutonomaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
