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

import com.telefonica.centroseducativos.NoSuchCentroEducativoException;
import com.telefonica.centroseducativos.model.CentroEducativo;
import com.telefonica.centroseducativos.model.impl.CentroEducativoImpl;
import com.telefonica.centroseducativos.model.impl.CentroEducativoModelImpl;
import com.telefonica.centroseducativos.service.persistence.CentroEducativoPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the centro educativo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CentroEducativoPersistence
 * @see CentroEducativoUtil
 * @generated
 */
public class CentroEducativoPersistenceImpl extends BasePersistenceImpl<CentroEducativo>
    implements CentroEducativoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link CentroEducativoUtil} to access the centro educativo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = CentroEducativoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CentroEducativoModelImpl.ENTITY_CACHE_ENABLED,
            CentroEducativoModelImpl.FINDER_CACHE_ENABLED,
            CentroEducativoImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CentroEducativoModelImpl.ENTITY_CACHE_ENABLED,
            CentroEducativoModelImpl.FINDER_CACHE_ENABLED,
            CentroEducativoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CentroEducativoModelImpl.ENTITY_CACHE_ENABLED,
            CentroEducativoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_CENTROEDUCATIVO = "SELECT centroEducativo FROM CentroEducativo centroEducativo";
    private static final String _SQL_COUNT_CENTROEDUCATIVO = "SELECT COUNT(centroEducativo) FROM CentroEducativo centroEducativo";
    private static final String _ORDER_BY_ENTITY_ALIAS = "centroEducativo.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CentroEducativo exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(CentroEducativoPersistenceImpl.class);
    private static CentroEducativo _nullCentroEducativo = new CentroEducativoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<CentroEducativo> toCacheModel() {
                return _nullCentroEducativoCacheModel;
            }
        };

    private static CacheModel<CentroEducativo> _nullCentroEducativoCacheModel = new CacheModel<CentroEducativo>() {
            @Override
            public CentroEducativo toEntityModel() {
                return _nullCentroEducativo;
            }
        };

    public CentroEducativoPersistenceImpl() {
        setModelClass(CentroEducativo.class);
    }

    /**
     * Caches the centro educativo in the entity cache if it is enabled.
     *
     * @param centroEducativo the centro educativo
     */
    @Override
    public void cacheResult(CentroEducativo centroEducativo) {
        EntityCacheUtil.putResult(CentroEducativoModelImpl.ENTITY_CACHE_ENABLED,
            CentroEducativoImpl.class, centroEducativo.getPrimaryKey(),
            centroEducativo);

        centroEducativo.resetOriginalValues();
    }

    /**
     * Caches the centro educativos in the entity cache if it is enabled.
     *
     * @param centroEducativos the centro educativos
     */
    @Override
    public void cacheResult(List<CentroEducativo> centroEducativos) {
        for (CentroEducativo centroEducativo : centroEducativos) {
            if (EntityCacheUtil.getResult(
                        CentroEducativoModelImpl.ENTITY_CACHE_ENABLED,
                        CentroEducativoImpl.class,
                        centroEducativo.getPrimaryKey()) == null) {
                cacheResult(centroEducativo);
            } else {
                centroEducativo.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all centro educativos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(CentroEducativoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(CentroEducativoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the centro educativo.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(CentroEducativo centroEducativo) {
        EntityCacheUtil.removeResult(CentroEducativoModelImpl.ENTITY_CACHE_ENABLED,
            CentroEducativoImpl.class, centroEducativo.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<CentroEducativo> centroEducativos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (CentroEducativo centroEducativo : centroEducativos) {
            EntityCacheUtil.removeResult(CentroEducativoModelImpl.ENTITY_CACHE_ENABLED,
                CentroEducativoImpl.class, centroEducativo.getPrimaryKey());
        }
    }

    /**
     * Creates a new centro educativo with the primary key. Does not add the centro educativo to the database.
     *
     * @param idce the primary key for the new centro educativo
     * @return the new centro educativo
     */
    @Override
    public CentroEducativo create(int idce) {
        CentroEducativo centroEducativo = new CentroEducativoImpl();

        centroEducativo.setNew(true);
        centroEducativo.setPrimaryKey(idce);

        return centroEducativo;
    }

    /**
     * Removes the centro educativo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idce the primary key of the centro educativo
     * @return the centro educativo that was removed
     * @throws com.telefonica.centroseducativos.NoSuchCentroEducativoException if a centro educativo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CentroEducativo remove(int idce)
        throws NoSuchCentroEducativoException, SystemException {
        return remove((Serializable) idce);
    }

    /**
     * Removes the centro educativo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the centro educativo
     * @return the centro educativo that was removed
     * @throws com.telefonica.centroseducativos.NoSuchCentroEducativoException if a centro educativo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CentroEducativo remove(Serializable primaryKey)
        throws NoSuchCentroEducativoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            CentroEducativo centroEducativo = (CentroEducativo) session.get(CentroEducativoImpl.class,
                    primaryKey);

            if (centroEducativo == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchCentroEducativoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(centroEducativo);
        } catch (NoSuchCentroEducativoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected CentroEducativo removeImpl(CentroEducativo centroEducativo)
        throws SystemException {
        centroEducativo = toUnwrappedModel(centroEducativo);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(centroEducativo)) {
                centroEducativo = (CentroEducativo) session.get(CentroEducativoImpl.class,
                        centroEducativo.getPrimaryKeyObj());
            }

            if (centroEducativo != null) {
                session.delete(centroEducativo);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (centroEducativo != null) {
            clearCache(centroEducativo);
        }

        return centroEducativo;
    }

    @Override
    public CentroEducativo updateImpl(
        com.telefonica.centroseducativos.model.CentroEducativo centroEducativo)
        throws SystemException {
        centroEducativo = toUnwrappedModel(centroEducativo);

        boolean isNew = centroEducativo.isNew();

        Session session = null;

        try {
            session = openSession();

            if (centroEducativo.isNew()) {
                session.save(centroEducativo);

                centroEducativo.setNew(false);
            } else {
                session.merge(centroEducativo);
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

        EntityCacheUtil.putResult(CentroEducativoModelImpl.ENTITY_CACHE_ENABLED,
            CentroEducativoImpl.class, centroEducativo.getPrimaryKey(),
            centroEducativo);

        return centroEducativo;
    }

    protected CentroEducativo toUnwrappedModel(CentroEducativo centroEducativo) {
        if (centroEducativo instanceof CentroEducativoImpl) {
            return centroEducativo;
        }

        CentroEducativoImpl centroEducativoImpl = new CentroEducativoImpl();

        centroEducativoImpl.setNew(centroEducativo.isNew());
        centroEducativoImpl.setPrimaryKey(centroEducativo.getPrimaryKey());

        centroEducativoImpl.setIdce(centroEducativo.getIdce());
        centroEducativoImpl.setNombrece(centroEducativo.getNombrece());
        centroEducativoImpl.setIdca(centroEducativo.getIdca());

        return centroEducativoImpl;
    }

    /**
     * Returns the centro educativo with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the centro educativo
     * @return the centro educativo
     * @throws com.telefonica.centroseducativos.NoSuchCentroEducativoException if a centro educativo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CentroEducativo findByPrimaryKey(Serializable primaryKey)
        throws NoSuchCentroEducativoException, SystemException {
        CentroEducativo centroEducativo = fetchByPrimaryKey(primaryKey);

        if (centroEducativo == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchCentroEducativoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return centroEducativo;
    }

    /**
     * Returns the centro educativo with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchCentroEducativoException} if it could not be found.
     *
     * @param idce the primary key of the centro educativo
     * @return the centro educativo
     * @throws com.telefonica.centroseducativos.NoSuchCentroEducativoException if a centro educativo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CentroEducativo findByPrimaryKey(int idce)
        throws NoSuchCentroEducativoException, SystemException {
        return findByPrimaryKey((Serializable) idce);
    }

    /**
     * Returns the centro educativo with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the centro educativo
     * @return the centro educativo, or <code>null</code> if a centro educativo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CentroEducativo fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        CentroEducativo centroEducativo = (CentroEducativo) EntityCacheUtil.getResult(CentroEducativoModelImpl.ENTITY_CACHE_ENABLED,
                CentroEducativoImpl.class, primaryKey);

        if (centroEducativo == _nullCentroEducativo) {
            return null;
        }

        if (centroEducativo == null) {
            Session session = null;

            try {
                session = openSession();

                centroEducativo = (CentroEducativo) session.get(CentroEducativoImpl.class,
                        primaryKey);

                if (centroEducativo != null) {
                    cacheResult(centroEducativo);
                } else {
                    EntityCacheUtil.putResult(CentroEducativoModelImpl.ENTITY_CACHE_ENABLED,
                        CentroEducativoImpl.class, primaryKey,
                        _nullCentroEducativo);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(CentroEducativoModelImpl.ENTITY_CACHE_ENABLED,
                    CentroEducativoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return centroEducativo;
    }

    /**
     * Returns the centro educativo with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param idce the primary key of the centro educativo
     * @return the centro educativo, or <code>null</code> if a centro educativo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CentroEducativo fetchByPrimaryKey(int idce)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) idce);
    }

    /**
     * Returns all the centro educativos.
     *
     * @return the centro educativos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CentroEducativo> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the centro educativos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CentroEducativoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of centro educativos
     * @param end the upper bound of the range of centro educativos (not inclusive)
     * @return the range of centro educativos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CentroEducativo> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the centro educativos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CentroEducativoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of centro educativos
     * @param end the upper bound of the range of centro educativos (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of centro educativos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CentroEducativo> findAll(int start, int end,
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

        List<CentroEducativo> list = (List<CentroEducativo>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CENTROEDUCATIVO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CENTROEDUCATIVO;

                if (pagination) {
                    sql = sql.concat(CentroEducativoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<CentroEducativo>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CentroEducativo>(list);
                } else {
                    list = (List<CentroEducativo>) QueryUtil.list(q,
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
     * Removes all the centro educativos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (CentroEducativo centroEducativo : findAll()) {
            remove(centroEducativo);
        }
    }

    /**
     * Returns the number of centro educativos.
     *
     * @return the number of centro educativos
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

                Query q = session.createQuery(_SQL_COUNT_CENTROEDUCATIVO);

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
     * Initializes the centro educativo persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.telefonica.centroseducativos.model.CentroEducativo")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<CentroEducativo>> listenersList = new ArrayList<ModelListener<CentroEducativo>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<CentroEducativo>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(CentroEducativoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
