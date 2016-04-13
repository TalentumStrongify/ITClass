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

import com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException;
import com.telefonica.centroseducativos.model.CategoriaPregunta;
import com.telefonica.centroseducativos.model.impl.CategoriaPreguntaImpl;
import com.telefonica.centroseducativos.model.impl.CategoriaPreguntaModelImpl;
import com.telefonica.centroseducativos.service.persistence.CategoriaPreguntaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the categoria pregunta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaPreguntaPersistence
 * @see CategoriaPreguntaUtil
 * @generated
 */
public class CategoriaPreguntaPersistenceImpl extends BasePersistenceImpl<CategoriaPregunta>
    implements CategoriaPreguntaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link CategoriaPreguntaUtil} to access the categoria pregunta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = CategoriaPreguntaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CategoriaPreguntaModelImpl.ENTITY_CACHE_ENABLED,
            CategoriaPreguntaModelImpl.FINDER_CACHE_ENABLED,
            CategoriaPreguntaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CategoriaPreguntaModelImpl.ENTITY_CACHE_ENABLED,
            CategoriaPreguntaModelImpl.FINDER_CACHE_ENABLED,
            CategoriaPreguntaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CategoriaPreguntaModelImpl.ENTITY_CACHE_ENABLED,
            CategoriaPreguntaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_CATEGORIAPREGUNTA = "SELECT categoriaPregunta FROM CategoriaPregunta categoriaPregunta";
    private static final String _SQL_COUNT_CATEGORIAPREGUNTA = "SELECT COUNT(categoriaPregunta) FROM CategoriaPregunta categoriaPregunta";
    private static final String _ORDER_BY_ENTITY_ALIAS = "categoriaPregunta.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CategoriaPregunta exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(CategoriaPreguntaPersistenceImpl.class);
    private static CategoriaPregunta _nullCategoriaPregunta = new CategoriaPreguntaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<CategoriaPregunta> toCacheModel() {
                return _nullCategoriaPreguntaCacheModel;
            }
        };

    private static CacheModel<CategoriaPregunta> _nullCategoriaPreguntaCacheModel =
        new CacheModel<CategoriaPregunta>() {
            @Override
            public CategoriaPregunta toEntityModel() {
                return _nullCategoriaPregunta;
            }
        };

    public CategoriaPreguntaPersistenceImpl() {
        setModelClass(CategoriaPregunta.class);
    }

    /**
     * Caches the categoria pregunta in the entity cache if it is enabled.
     *
     * @param categoriaPregunta the categoria pregunta
     */
    @Override
    public void cacheResult(CategoriaPregunta categoriaPregunta) {
        EntityCacheUtil.putResult(CategoriaPreguntaModelImpl.ENTITY_CACHE_ENABLED,
            CategoriaPreguntaImpl.class, categoriaPregunta.getPrimaryKey(),
            categoriaPregunta);

        categoriaPregunta.resetOriginalValues();
    }

    /**
     * Caches the categoria preguntas in the entity cache if it is enabled.
     *
     * @param categoriaPreguntas the categoria preguntas
     */
    @Override
    public void cacheResult(List<CategoriaPregunta> categoriaPreguntas) {
        for (CategoriaPregunta categoriaPregunta : categoriaPreguntas) {
            if (EntityCacheUtil.getResult(
                        CategoriaPreguntaModelImpl.ENTITY_CACHE_ENABLED,
                        CategoriaPreguntaImpl.class,
                        categoriaPregunta.getPrimaryKey()) == null) {
                cacheResult(categoriaPregunta);
            } else {
                categoriaPregunta.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all categoria preguntas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(CategoriaPreguntaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(CategoriaPreguntaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the categoria pregunta.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(CategoriaPregunta categoriaPregunta) {
        EntityCacheUtil.removeResult(CategoriaPreguntaModelImpl.ENTITY_CACHE_ENABLED,
            CategoriaPreguntaImpl.class, categoriaPregunta.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<CategoriaPregunta> categoriaPreguntas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (CategoriaPregunta categoriaPregunta : categoriaPreguntas) {
            EntityCacheUtil.removeResult(CategoriaPreguntaModelImpl.ENTITY_CACHE_ENABLED,
                CategoriaPreguntaImpl.class, categoriaPregunta.getPrimaryKey());
        }
    }

    /**
     * Creates a new categoria pregunta with the primary key. Does not add the categoria pregunta to the database.
     *
     * @param idcategoria the primary key for the new categoria pregunta
     * @return the new categoria pregunta
     */
    @Override
    public CategoriaPregunta create(int idcategoria) {
        CategoriaPregunta categoriaPregunta = new CategoriaPreguntaImpl();

        categoriaPregunta.setNew(true);
        categoriaPregunta.setPrimaryKey(idcategoria);

        return categoriaPregunta;
    }

    /**
     * Removes the categoria pregunta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idcategoria the primary key of the categoria pregunta
     * @return the categoria pregunta that was removed
     * @throws com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException if a categoria pregunta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CategoriaPregunta remove(int idcategoria)
        throws NoSuchCategoriaPreguntaException, SystemException {
        return remove((Serializable) idcategoria);
    }

    /**
     * Removes the categoria pregunta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the categoria pregunta
     * @return the categoria pregunta that was removed
     * @throws com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException if a categoria pregunta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CategoriaPregunta remove(Serializable primaryKey)
        throws NoSuchCategoriaPreguntaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            CategoriaPregunta categoriaPregunta = (CategoriaPregunta) session.get(CategoriaPreguntaImpl.class,
                    primaryKey);

            if (categoriaPregunta == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchCategoriaPreguntaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(categoriaPregunta);
        } catch (NoSuchCategoriaPreguntaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected CategoriaPregunta removeImpl(CategoriaPregunta categoriaPregunta)
        throws SystemException {
        categoriaPregunta = toUnwrappedModel(categoriaPregunta);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(categoriaPregunta)) {
                categoriaPregunta = (CategoriaPregunta) session.get(CategoriaPreguntaImpl.class,
                        categoriaPregunta.getPrimaryKeyObj());
            }

            if (categoriaPregunta != null) {
                session.delete(categoriaPregunta);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (categoriaPregunta != null) {
            clearCache(categoriaPregunta);
        }

        return categoriaPregunta;
    }

    @Override
    public CategoriaPregunta updateImpl(
        com.telefonica.centroseducativos.model.CategoriaPregunta categoriaPregunta)
        throws SystemException {
        categoriaPregunta = toUnwrappedModel(categoriaPregunta);

        boolean isNew = categoriaPregunta.isNew();

        Session session = null;

        try {
            session = openSession();

            if (categoriaPregunta.isNew()) {
                session.save(categoriaPregunta);

                categoriaPregunta.setNew(false);
            } else {
                session.merge(categoriaPregunta);
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

        EntityCacheUtil.putResult(CategoriaPreguntaModelImpl.ENTITY_CACHE_ENABLED,
            CategoriaPreguntaImpl.class, categoriaPregunta.getPrimaryKey(),
            categoriaPregunta);

        return categoriaPregunta;
    }

    protected CategoriaPregunta toUnwrappedModel(
        CategoriaPregunta categoriaPregunta) {
        if (categoriaPregunta instanceof CategoriaPreguntaImpl) {
            return categoriaPregunta;
        }

        CategoriaPreguntaImpl categoriaPreguntaImpl = new CategoriaPreguntaImpl();

        categoriaPreguntaImpl.setNew(categoriaPregunta.isNew());
        categoriaPreguntaImpl.setPrimaryKey(categoriaPregunta.getPrimaryKey());

        categoriaPreguntaImpl.setIdcategoria(categoriaPregunta.getIdcategoria());
        categoriaPreguntaImpl.setCategoria(categoriaPregunta.getCategoria());

        return categoriaPreguntaImpl;
    }

    /**
     * Returns the categoria pregunta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the categoria pregunta
     * @return the categoria pregunta
     * @throws com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException if a categoria pregunta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CategoriaPregunta findByPrimaryKey(Serializable primaryKey)
        throws NoSuchCategoriaPreguntaException, SystemException {
        CategoriaPregunta categoriaPregunta = fetchByPrimaryKey(primaryKey);

        if (categoriaPregunta == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchCategoriaPreguntaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return categoriaPregunta;
    }

    /**
     * Returns the categoria pregunta with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException} if it could not be found.
     *
     * @param idcategoria the primary key of the categoria pregunta
     * @return the categoria pregunta
     * @throws com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException if a categoria pregunta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CategoriaPregunta findByPrimaryKey(int idcategoria)
        throws NoSuchCategoriaPreguntaException, SystemException {
        return findByPrimaryKey((Serializable) idcategoria);
    }

    /**
     * Returns the categoria pregunta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the categoria pregunta
     * @return the categoria pregunta, or <code>null</code> if a categoria pregunta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CategoriaPregunta fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        CategoriaPregunta categoriaPregunta = (CategoriaPregunta) EntityCacheUtil.getResult(CategoriaPreguntaModelImpl.ENTITY_CACHE_ENABLED,
                CategoriaPreguntaImpl.class, primaryKey);

        if (categoriaPregunta == _nullCategoriaPregunta) {
            return null;
        }

        if (categoriaPregunta == null) {
            Session session = null;

            try {
                session = openSession();

                categoriaPregunta = (CategoriaPregunta) session.get(CategoriaPreguntaImpl.class,
                        primaryKey);

                if (categoriaPregunta != null) {
                    cacheResult(categoriaPregunta);
                } else {
                    EntityCacheUtil.putResult(CategoriaPreguntaModelImpl.ENTITY_CACHE_ENABLED,
                        CategoriaPreguntaImpl.class, primaryKey,
                        _nullCategoriaPregunta);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(CategoriaPreguntaModelImpl.ENTITY_CACHE_ENABLED,
                    CategoriaPreguntaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return categoriaPregunta;
    }

    /**
     * Returns the categoria pregunta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param idcategoria the primary key of the categoria pregunta
     * @return the categoria pregunta, or <code>null</code> if a categoria pregunta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CategoriaPregunta fetchByPrimaryKey(int idcategoria)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) idcategoria);
    }

    /**
     * Returns all the categoria preguntas.
     *
     * @return the categoria preguntas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CategoriaPregunta> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the categoria preguntas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CategoriaPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of categoria preguntas
     * @param end the upper bound of the range of categoria preguntas (not inclusive)
     * @return the range of categoria preguntas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CategoriaPregunta> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the categoria preguntas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.CategoriaPreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of categoria preguntas
     * @param end the upper bound of the range of categoria preguntas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of categoria preguntas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CategoriaPregunta> findAll(int start, int end,
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

        List<CategoriaPregunta> list = (List<CategoriaPregunta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CATEGORIAPREGUNTA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CATEGORIAPREGUNTA;

                if (pagination) {
                    sql = sql.concat(CategoriaPreguntaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<CategoriaPregunta>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CategoriaPregunta>(list);
                } else {
                    list = (List<CategoriaPregunta>) QueryUtil.list(q,
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
     * Removes all the categoria preguntas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (CategoriaPregunta categoriaPregunta : findAll()) {
            remove(categoriaPregunta);
        }
    }

    /**
     * Returns the number of categoria preguntas.
     *
     * @return the number of categoria preguntas
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

                Query q = session.createQuery(_SQL_COUNT_CATEGORIAPREGUNTA);

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
     * Initializes the categoria pregunta persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.telefonica.centroseducativos.model.CategoriaPregunta")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<CategoriaPregunta>> listenersList = new ArrayList<ModelListener<CategoriaPregunta>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<CategoriaPregunta>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(CategoriaPreguntaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
