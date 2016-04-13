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

import com.telefonica.centroseducativos.NoSuchEvaluacionesCEException;
import com.telefonica.centroseducativos.model.EvaluacionesCE;
import com.telefonica.centroseducativos.model.impl.EvaluacionesCEImpl;
import com.telefonica.centroseducativos.model.impl.EvaluacionesCEModelImpl;
import com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the evaluaciones c e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EvaluacionesCEPersistence
 * @see EvaluacionesCEUtil
 * @generated
 */
public class EvaluacionesCEPersistenceImpl extends BasePersistenceImpl<EvaluacionesCE>
    implements EvaluacionesCEPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EvaluacionesCEUtil} to access the evaluaciones c e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EvaluacionesCEImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EvaluacionesCEModelImpl.ENTITY_CACHE_ENABLED,
            EvaluacionesCEModelImpl.FINDER_CACHE_ENABLED,
            EvaluacionesCEImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EvaluacionesCEModelImpl.ENTITY_CACHE_ENABLED,
            EvaluacionesCEModelImpl.FINDER_CACHE_ENABLED,
            EvaluacionesCEImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EvaluacionesCEModelImpl.ENTITY_CACHE_ENABLED,
            EvaluacionesCEModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_EVALUACIONESCE = "SELECT evaluacionesCE FROM EvaluacionesCE evaluacionesCE";
    private static final String _SQL_COUNT_EVALUACIONESCE = "SELECT COUNT(evaluacionesCE) FROM EvaluacionesCE evaluacionesCE";
    private static final String _ORDER_BY_ENTITY_ALIAS = "evaluacionesCE.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EvaluacionesCE exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EvaluacionesCEPersistenceImpl.class);
    private static EvaluacionesCE _nullEvaluacionesCE = new EvaluacionesCEImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EvaluacionesCE> toCacheModel() {
                return _nullEvaluacionesCECacheModel;
            }
        };

    private static CacheModel<EvaluacionesCE> _nullEvaluacionesCECacheModel = new CacheModel<EvaluacionesCE>() {
            @Override
            public EvaluacionesCE toEntityModel() {
                return _nullEvaluacionesCE;
            }
        };

    public EvaluacionesCEPersistenceImpl() {
        setModelClass(EvaluacionesCE.class);
    }

    /**
     * Caches the evaluaciones c e in the entity cache if it is enabled.
     *
     * @param evaluacionesCE the evaluaciones c e
     */
    @Override
    public void cacheResult(EvaluacionesCE evaluacionesCE) {
        EntityCacheUtil.putResult(EvaluacionesCEModelImpl.ENTITY_CACHE_ENABLED,
            EvaluacionesCEImpl.class, evaluacionesCE.getPrimaryKey(),
            evaluacionesCE);

        evaluacionesCE.resetOriginalValues();
    }

    /**
     * Caches the evaluaciones c es in the entity cache if it is enabled.
     *
     * @param evaluacionesCEs the evaluaciones c es
     */
    @Override
    public void cacheResult(List<EvaluacionesCE> evaluacionesCEs) {
        for (EvaluacionesCE evaluacionesCE : evaluacionesCEs) {
            if (EntityCacheUtil.getResult(
                        EvaluacionesCEModelImpl.ENTITY_CACHE_ENABLED,
                        EvaluacionesCEImpl.class, evaluacionesCE.getPrimaryKey()) == null) {
                cacheResult(evaluacionesCE);
            } else {
                evaluacionesCE.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all evaluaciones c es.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EvaluacionesCEImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EvaluacionesCEImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the evaluaciones c e.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EvaluacionesCE evaluacionesCE) {
        EntityCacheUtil.removeResult(EvaluacionesCEModelImpl.ENTITY_CACHE_ENABLED,
            EvaluacionesCEImpl.class, evaluacionesCE.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<EvaluacionesCE> evaluacionesCEs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EvaluacionesCE evaluacionesCE : evaluacionesCEs) {
            EntityCacheUtil.removeResult(EvaluacionesCEModelImpl.ENTITY_CACHE_ENABLED,
                EvaluacionesCEImpl.class, evaluacionesCE.getPrimaryKey());
        }
    }

    /**
     * Creates a new evaluaciones c e with the primary key. Does not add the evaluaciones c e to the database.
     *
     * @param evaluacionesCEPK the primary key for the new evaluaciones c e
     * @return the new evaluaciones c e
     */
    @Override
    public EvaluacionesCE create(EvaluacionesCEPK evaluacionesCEPK) {
        EvaluacionesCE evaluacionesCE = new EvaluacionesCEImpl();

        evaluacionesCE.setNew(true);
        evaluacionesCE.setPrimaryKey(evaluacionesCEPK);

        return evaluacionesCE;
    }

    /**
     * Removes the evaluaciones c e with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param evaluacionesCEPK the primary key of the evaluaciones c e
     * @return the evaluaciones c e that was removed
     * @throws com.telefonica.centroseducativos.NoSuchEvaluacionesCEException if a evaluaciones c e with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EvaluacionesCE remove(EvaluacionesCEPK evaluacionesCEPK)
        throws NoSuchEvaluacionesCEException, SystemException {
        return remove((Serializable) evaluacionesCEPK);
    }

    /**
     * Removes the evaluaciones c e with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the evaluaciones c e
     * @return the evaluaciones c e that was removed
     * @throws com.telefonica.centroseducativos.NoSuchEvaluacionesCEException if a evaluaciones c e with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EvaluacionesCE remove(Serializable primaryKey)
        throws NoSuchEvaluacionesCEException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EvaluacionesCE evaluacionesCE = (EvaluacionesCE) session.get(EvaluacionesCEImpl.class,
                    primaryKey);

            if (evaluacionesCE == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEvaluacionesCEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(evaluacionesCE);
        } catch (NoSuchEvaluacionesCEException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EvaluacionesCE removeImpl(EvaluacionesCE evaluacionesCE)
        throws SystemException {
        evaluacionesCE = toUnwrappedModel(evaluacionesCE);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(evaluacionesCE)) {
                evaluacionesCE = (EvaluacionesCE) session.get(EvaluacionesCEImpl.class,
                        evaluacionesCE.getPrimaryKeyObj());
            }

            if (evaluacionesCE != null) {
                session.delete(evaluacionesCE);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (evaluacionesCE != null) {
            clearCache(evaluacionesCE);
        }

        return evaluacionesCE;
    }

    @Override
    public EvaluacionesCE updateImpl(
        com.telefonica.centroseducativos.model.EvaluacionesCE evaluacionesCE)
        throws SystemException {
        evaluacionesCE = toUnwrappedModel(evaluacionesCE);

        boolean isNew = evaluacionesCE.isNew();

        Session session = null;

        try {
            session = openSession();

            if (evaluacionesCE.isNew()) {
                session.save(evaluacionesCE);

                evaluacionesCE.setNew(false);
            } else {
                session.merge(evaluacionesCE);
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

        EntityCacheUtil.putResult(EvaluacionesCEModelImpl.ENTITY_CACHE_ENABLED,
            EvaluacionesCEImpl.class, evaluacionesCE.getPrimaryKey(),
            evaluacionesCE);

        return evaluacionesCE;
    }

    protected EvaluacionesCE toUnwrappedModel(EvaluacionesCE evaluacionesCE) {
        if (evaluacionesCE instanceof EvaluacionesCEImpl) {
            return evaluacionesCE;
        }

        EvaluacionesCEImpl evaluacionesCEImpl = new EvaluacionesCEImpl();

        evaluacionesCEImpl.setNew(evaluacionesCE.isNew());
        evaluacionesCEImpl.setPrimaryKey(evaluacionesCE.getPrimaryKey());

        evaluacionesCEImpl.setIdencuesta(evaluacionesCE.getIdencuesta());
        evaluacionesCEImpl.setNumpregunta(evaluacionesCE.getNumpregunta());
        evaluacionesCEImpl.setNotapregunta(evaluacionesCE.getNotapregunta());
        evaluacionesCEImpl.setIdce(evaluacionesCE.getIdce());
        evaluacionesCEImpl.setIdrol(evaluacionesCE.getIdrol());

        return evaluacionesCEImpl;
    }

    /**
     * Returns the evaluaciones c e with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the evaluaciones c e
     * @return the evaluaciones c e
     * @throws com.telefonica.centroseducativos.NoSuchEvaluacionesCEException if a evaluaciones c e with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EvaluacionesCE findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEvaluacionesCEException, SystemException {
        EvaluacionesCE evaluacionesCE = fetchByPrimaryKey(primaryKey);

        if (evaluacionesCE == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEvaluacionesCEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return evaluacionesCE;
    }

    /**
     * Returns the evaluaciones c e with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchEvaluacionesCEException} if it could not be found.
     *
     * @param evaluacionesCEPK the primary key of the evaluaciones c e
     * @return the evaluaciones c e
     * @throws com.telefonica.centroseducativos.NoSuchEvaluacionesCEException if a evaluaciones c e with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EvaluacionesCE findByPrimaryKey(EvaluacionesCEPK evaluacionesCEPK)
        throws NoSuchEvaluacionesCEException, SystemException {
        return findByPrimaryKey((Serializable) evaluacionesCEPK);
    }

    /**
     * Returns the evaluaciones c e with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the evaluaciones c e
     * @return the evaluaciones c e, or <code>null</code> if a evaluaciones c e with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EvaluacionesCE fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EvaluacionesCE evaluacionesCE = (EvaluacionesCE) EntityCacheUtil.getResult(EvaluacionesCEModelImpl.ENTITY_CACHE_ENABLED,
                EvaluacionesCEImpl.class, primaryKey);

        if (evaluacionesCE == _nullEvaluacionesCE) {
            return null;
        }

        if (evaluacionesCE == null) {
            Session session = null;

            try {
                session = openSession();

                evaluacionesCE = (EvaluacionesCE) session.get(EvaluacionesCEImpl.class,
                        primaryKey);

                if (evaluacionesCE != null) {
                    cacheResult(evaluacionesCE);
                } else {
                    EntityCacheUtil.putResult(EvaluacionesCEModelImpl.ENTITY_CACHE_ENABLED,
                        EvaluacionesCEImpl.class, primaryKey,
                        _nullEvaluacionesCE);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EvaluacionesCEModelImpl.ENTITY_CACHE_ENABLED,
                    EvaluacionesCEImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return evaluacionesCE;
    }

    /**
     * Returns the evaluaciones c e with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param evaluacionesCEPK the primary key of the evaluaciones c e
     * @return the evaluaciones c e, or <code>null</code> if a evaluaciones c e with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EvaluacionesCE fetchByPrimaryKey(EvaluacionesCEPK evaluacionesCEPK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) evaluacionesCEPK);
    }

    /**
     * Returns all the evaluaciones c es.
     *
     * @return the evaluaciones c es
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EvaluacionesCE> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the evaluaciones c es.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.EvaluacionesCEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of evaluaciones c es
     * @param end the upper bound of the range of evaluaciones c es (not inclusive)
     * @return the range of evaluaciones c es
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EvaluacionesCE> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the evaluaciones c es.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.EvaluacionesCEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of evaluaciones c es
     * @param end the upper bound of the range of evaluaciones c es (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of evaluaciones c es
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EvaluacionesCE> findAll(int start, int end,
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

        List<EvaluacionesCE> list = (List<EvaluacionesCE>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_EVALUACIONESCE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_EVALUACIONESCE;

                if (pagination) {
                    sql = sql.concat(EvaluacionesCEModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EvaluacionesCE>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EvaluacionesCE>(list);
                } else {
                    list = (List<EvaluacionesCE>) QueryUtil.list(q,
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
     * Removes all the evaluaciones c es from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EvaluacionesCE evaluacionesCE : findAll()) {
            remove(evaluacionesCE);
        }
    }

    /**
     * Returns the number of evaluaciones c es.
     *
     * @return the number of evaluaciones c es
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

                Query q = session.createQuery(_SQL_COUNT_EVALUACIONESCE);

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
     * Initializes the evaluaciones c e persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.telefonica.centroseducativos.model.EvaluacionesCE")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EvaluacionesCE>> listenersList = new ArrayList<ModelListener<EvaluacionesCE>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EvaluacionesCE>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EvaluacionesCEImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
