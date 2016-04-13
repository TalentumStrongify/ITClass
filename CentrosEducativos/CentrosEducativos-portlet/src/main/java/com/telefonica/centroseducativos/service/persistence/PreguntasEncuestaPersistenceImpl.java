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

import com.telefonica.centroseducativos.NoSuchPreguntasEncuestaException;
import com.telefonica.centroseducativos.model.PreguntasEncuesta;
import com.telefonica.centroseducativos.model.impl.PreguntasEncuestaImpl;
import com.telefonica.centroseducativos.model.impl.PreguntasEncuestaModelImpl;
import com.telefonica.centroseducativos.service.persistence.PreguntasEncuestaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the preguntas encuesta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PreguntasEncuestaPersistence
 * @see PreguntasEncuestaUtil
 * @generated
 */
public class PreguntasEncuestaPersistenceImpl extends BasePersistenceImpl<PreguntasEncuesta>
    implements PreguntasEncuestaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PreguntasEncuestaUtil} to access the preguntas encuesta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PreguntasEncuestaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PreguntasEncuestaModelImpl.ENTITY_CACHE_ENABLED,
            PreguntasEncuestaModelImpl.FINDER_CACHE_ENABLED,
            PreguntasEncuestaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PreguntasEncuestaModelImpl.ENTITY_CACHE_ENABLED,
            PreguntasEncuestaModelImpl.FINDER_CACHE_ENABLED,
            PreguntasEncuestaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PreguntasEncuestaModelImpl.ENTITY_CACHE_ENABLED,
            PreguntasEncuestaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PREGUNTASENCUESTA = "SELECT preguntasEncuesta FROM PreguntasEncuesta preguntasEncuesta";
    private static final String _SQL_COUNT_PREGUNTASENCUESTA = "SELECT COUNT(preguntasEncuesta) FROM PreguntasEncuesta preguntasEncuesta";
    private static final String _ORDER_BY_ENTITY_ALIAS = "preguntasEncuesta.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PreguntasEncuesta exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PreguntasEncuestaPersistenceImpl.class);
    private static PreguntasEncuesta _nullPreguntasEncuesta = new PreguntasEncuestaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PreguntasEncuesta> toCacheModel() {
                return _nullPreguntasEncuestaCacheModel;
            }
        };

    private static CacheModel<PreguntasEncuesta> _nullPreguntasEncuestaCacheModel =
        new CacheModel<PreguntasEncuesta>() {
            @Override
            public PreguntasEncuesta toEntityModel() {
                return _nullPreguntasEncuesta;
            }
        };

    public PreguntasEncuestaPersistenceImpl() {
        setModelClass(PreguntasEncuesta.class);
    }

    /**
     * Caches the preguntas encuesta in the entity cache if it is enabled.
     *
     * @param preguntasEncuesta the preguntas encuesta
     */
    @Override
    public void cacheResult(PreguntasEncuesta preguntasEncuesta) {
        EntityCacheUtil.putResult(PreguntasEncuestaModelImpl.ENTITY_CACHE_ENABLED,
            PreguntasEncuestaImpl.class, preguntasEncuesta.getPrimaryKey(),
            preguntasEncuesta);

        preguntasEncuesta.resetOriginalValues();
    }

    /**
     * Caches the preguntas encuestas in the entity cache if it is enabled.
     *
     * @param preguntasEncuestas the preguntas encuestas
     */
    @Override
    public void cacheResult(List<PreguntasEncuesta> preguntasEncuestas) {
        for (PreguntasEncuesta preguntasEncuesta : preguntasEncuestas) {
            if (EntityCacheUtil.getResult(
                        PreguntasEncuestaModelImpl.ENTITY_CACHE_ENABLED,
                        PreguntasEncuestaImpl.class,
                        preguntasEncuesta.getPrimaryKey()) == null) {
                cacheResult(preguntasEncuesta);
            } else {
                preguntasEncuesta.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all preguntas encuestas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PreguntasEncuestaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PreguntasEncuestaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the preguntas encuesta.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PreguntasEncuesta preguntasEncuesta) {
        EntityCacheUtil.removeResult(PreguntasEncuestaModelImpl.ENTITY_CACHE_ENABLED,
            PreguntasEncuestaImpl.class, preguntasEncuesta.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PreguntasEncuesta> preguntasEncuestas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PreguntasEncuesta preguntasEncuesta : preguntasEncuestas) {
            EntityCacheUtil.removeResult(PreguntasEncuestaModelImpl.ENTITY_CACHE_ENABLED,
                PreguntasEncuestaImpl.class, preguntasEncuesta.getPrimaryKey());
        }
    }

    /**
     * Creates a new preguntas encuesta with the primary key. Does not add the preguntas encuesta to the database.
     *
     * @param numpregunta the primary key for the new preguntas encuesta
     * @return the new preguntas encuesta
     */
    @Override
    public PreguntasEncuesta create(int numpregunta) {
        PreguntasEncuesta preguntasEncuesta = new PreguntasEncuestaImpl();

        preguntasEncuesta.setNew(true);
        preguntasEncuesta.setPrimaryKey(numpregunta);

        return preguntasEncuesta;
    }

    /**
     * Removes the preguntas encuesta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param numpregunta the primary key of the preguntas encuesta
     * @return the preguntas encuesta that was removed
     * @throws com.telefonica.centroseducativos.NoSuchPreguntasEncuestaException if a preguntas encuesta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PreguntasEncuesta remove(int numpregunta)
        throws NoSuchPreguntasEncuestaException, SystemException {
        return remove((Serializable) numpregunta);
    }

    /**
     * Removes the preguntas encuesta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the preguntas encuesta
     * @return the preguntas encuesta that was removed
     * @throws com.telefonica.centroseducativos.NoSuchPreguntasEncuestaException if a preguntas encuesta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PreguntasEncuesta remove(Serializable primaryKey)
        throws NoSuchPreguntasEncuestaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PreguntasEncuesta preguntasEncuesta = (PreguntasEncuesta) session.get(PreguntasEncuestaImpl.class,
                    primaryKey);

            if (preguntasEncuesta == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPreguntasEncuestaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(preguntasEncuesta);
        } catch (NoSuchPreguntasEncuestaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PreguntasEncuesta removeImpl(PreguntasEncuesta preguntasEncuesta)
        throws SystemException {
        preguntasEncuesta = toUnwrappedModel(preguntasEncuesta);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(preguntasEncuesta)) {
                preguntasEncuesta = (PreguntasEncuesta) session.get(PreguntasEncuestaImpl.class,
                        preguntasEncuesta.getPrimaryKeyObj());
            }

            if (preguntasEncuesta != null) {
                session.delete(preguntasEncuesta);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (preguntasEncuesta != null) {
            clearCache(preguntasEncuesta);
        }

        return preguntasEncuesta;
    }

    @Override
    public PreguntasEncuesta updateImpl(
        com.telefonica.centroseducativos.model.PreguntasEncuesta preguntasEncuesta)
        throws SystemException {
        preguntasEncuesta = toUnwrappedModel(preguntasEncuesta);

        boolean isNew = preguntasEncuesta.isNew();

        Session session = null;

        try {
            session = openSession();

            if (preguntasEncuesta.isNew()) {
                session.save(preguntasEncuesta);

                preguntasEncuesta.setNew(false);
            } else {
                session.merge(preguntasEncuesta);
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

        EntityCacheUtil.putResult(PreguntasEncuestaModelImpl.ENTITY_CACHE_ENABLED,
            PreguntasEncuestaImpl.class, preguntasEncuesta.getPrimaryKey(),
            preguntasEncuesta);

        return preguntasEncuesta;
    }

    protected PreguntasEncuesta toUnwrappedModel(
        PreguntasEncuesta preguntasEncuesta) {
        if (preguntasEncuesta instanceof PreguntasEncuestaImpl) {
            return preguntasEncuesta;
        }

        PreguntasEncuestaImpl preguntasEncuestaImpl = new PreguntasEncuestaImpl();

        preguntasEncuestaImpl.setNew(preguntasEncuesta.isNew());
        preguntasEncuestaImpl.setPrimaryKey(preguntasEncuesta.getPrimaryKey());

        preguntasEncuestaImpl.setNumpregunta(preguntasEncuesta.getNumpregunta());
        preguntasEncuestaImpl.setEnunciadopregunta(preguntasEncuesta.getEnunciadopregunta());
        preguntasEncuestaImpl.setIdcategoria(preguntasEncuesta.getIdcategoria());

        return preguntasEncuestaImpl;
    }

    /**
     * Returns the preguntas encuesta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the preguntas encuesta
     * @return the preguntas encuesta
     * @throws com.telefonica.centroseducativos.NoSuchPreguntasEncuestaException if a preguntas encuesta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PreguntasEncuesta findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPreguntasEncuestaException, SystemException {
        PreguntasEncuesta preguntasEncuesta = fetchByPrimaryKey(primaryKey);

        if (preguntasEncuesta == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPreguntasEncuestaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return preguntasEncuesta;
    }

    /**
     * Returns the preguntas encuesta with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchPreguntasEncuestaException} if it could not be found.
     *
     * @param numpregunta the primary key of the preguntas encuesta
     * @return the preguntas encuesta
     * @throws com.telefonica.centroseducativos.NoSuchPreguntasEncuestaException if a preguntas encuesta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PreguntasEncuesta findByPrimaryKey(int numpregunta)
        throws NoSuchPreguntasEncuestaException, SystemException {
        return findByPrimaryKey((Serializable) numpregunta);
    }

    /**
     * Returns the preguntas encuesta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the preguntas encuesta
     * @return the preguntas encuesta, or <code>null</code> if a preguntas encuesta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PreguntasEncuesta fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PreguntasEncuesta preguntasEncuesta = (PreguntasEncuesta) EntityCacheUtil.getResult(PreguntasEncuestaModelImpl.ENTITY_CACHE_ENABLED,
                PreguntasEncuestaImpl.class, primaryKey);

        if (preguntasEncuesta == _nullPreguntasEncuesta) {
            return null;
        }

        if (preguntasEncuesta == null) {
            Session session = null;

            try {
                session = openSession();

                preguntasEncuesta = (PreguntasEncuesta) session.get(PreguntasEncuestaImpl.class,
                        primaryKey);

                if (preguntasEncuesta != null) {
                    cacheResult(preguntasEncuesta);
                } else {
                    EntityCacheUtil.putResult(PreguntasEncuestaModelImpl.ENTITY_CACHE_ENABLED,
                        PreguntasEncuestaImpl.class, primaryKey,
                        _nullPreguntasEncuesta);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PreguntasEncuestaModelImpl.ENTITY_CACHE_ENABLED,
                    PreguntasEncuestaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return preguntasEncuesta;
    }

    /**
     * Returns the preguntas encuesta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param numpregunta the primary key of the preguntas encuesta
     * @return the preguntas encuesta, or <code>null</code> if a preguntas encuesta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PreguntasEncuesta fetchByPrimaryKey(int numpregunta)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) numpregunta);
    }

    /**
     * Returns all the preguntas encuestas.
     *
     * @return the preguntas encuestas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PreguntasEncuesta> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the preguntas encuestas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.PreguntasEncuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of preguntas encuestas
     * @param end the upper bound of the range of preguntas encuestas (not inclusive)
     * @return the range of preguntas encuestas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PreguntasEncuesta> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the preguntas encuestas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.PreguntasEncuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of preguntas encuestas
     * @param end the upper bound of the range of preguntas encuestas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of preguntas encuestas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PreguntasEncuesta> findAll(int start, int end,
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

        List<PreguntasEncuesta> list = (List<PreguntasEncuesta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PREGUNTASENCUESTA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PREGUNTASENCUESTA;

                if (pagination) {
                    sql = sql.concat(PreguntasEncuestaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PreguntasEncuesta>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PreguntasEncuesta>(list);
                } else {
                    list = (List<PreguntasEncuesta>) QueryUtil.list(q,
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
     * Removes all the preguntas encuestas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PreguntasEncuesta preguntasEncuesta : findAll()) {
            remove(preguntasEncuesta);
        }
    }

    /**
     * Returns the number of preguntas encuestas.
     *
     * @return the number of preguntas encuestas
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

                Query q = session.createQuery(_SQL_COUNT_PREGUNTASENCUESTA);

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
     * Initializes the preguntas encuesta persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.telefonica.centroseducativos.model.PreguntasEncuesta")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PreguntasEncuesta>> listenersList = new ArrayList<ModelListener<PreguntasEncuesta>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PreguntasEncuesta>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PreguntasEncuestaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
