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

import com.telefonica.centroseducativos.NoSuchPaisException;
import com.telefonica.centroseducativos.model.Pais;
import com.telefonica.centroseducativos.model.impl.PaisImpl;
import com.telefonica.centroseducativos.model.impl.PaisModelImpl;
import com.telefonica.centroseducativos.service.persistence.PaisPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the pais service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PaisPersistence
 * @see PaisUtil
 * @generated
 */
public class PaisPersistenceImpl extends BasePersistenceImpl<Pais>
    implements PaisPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PaisUtil} to access the pais persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PaisImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaisModelImpl.ENTITY_CACHE_ENABLED,
            PaisModelImpl.FINDER_CACHE_ENABLED, PaisImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaisModelImpl.ENTITY_CACHE_ENABLED,
            PaisModelImpl.FINDER_CACHE_ENABLED, PaisImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaisModelImpl.ENTITY_CACHE_ENABLED,
            PaisModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PAIS = "SELECT pais FROM Pais pais";
    private static final String _SQL_COUNT_PAIS = "SELECT COUNT(pais) FROM Pais pais";
    private static final String _ORDER_BY_ENTITY_ALIAS = "pais.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Pais exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PaisPersistenceImpl.class);
    private static Pais _nullPais = new PaisImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Pais> toCacheModel() {
                return _nullPaisCacheModel;
            }
        };

    private static CacheModel<Pais> _nullPaisCacheModel = new CacheModel<Pais>() {
            @Override
            public Pais toEntityModel() {
                return _nullPais;
            }
        };

    public PaisPersistenceImpl() {
        setModelClass(Pais.class);
    }

    /**
     * Caches the pais in the entity cache if it is enabled.
     *
     * @param pais the pais
     */
    @Override
    public void cacheResult(Pais pais) {
        EntityCacheUtil.putResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
            PaisImpl.class, pais.getPrimaryKey(), pais);

        pais.resetOriginalValues();
    }

    /**
     * Caches the paises in the entity cache if it is enabled.
     *
     * @param paises the paises
     */
    @Override
    public void cacheResult(List<Pais> paises) {
        for (Pais pais : paises) {
            if (EntityCacheUtil.getResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
                        PaisImpl.class, pais.getPrimaryKey()) == null) {
                cacheResult(pais);
            } else {
                pais.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all paises.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PaisImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PaisImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the pais.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Pais pais) {
        EntityCacheUtil.removeResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
            PaisImpl.class, pais.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Pais> paises) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Pais pais : paises) {
            EntityCacheUtil.removeResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
                PaisImpl.class, pais.getPrimaryKey());
        }
    }

    /**
     * Creates a new pais with the primary key. Does not add the pais to the database.
     *
     * @param idpais the primary key for the new pais
     * @return the new pais
     */
    @Override
    public Pais create(int idpais) {
        Pais pais = new PaisImpl();

        pais.setNew(true);
        pais.setPrimaryKey(idpais);

        return pais;
    }

    /**
     * Removes the pais with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idpais the primary key of the pais
     * @return the pais that was removed
     * @throws com.telefonica.centroseducativos.NoSuchPaisException if a pais with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Pais remove(int idpais) throws NoSuchPaisException, SystemException {
        return remove((Serializable) idpais);
    }

    /**
     * Removes the pais with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the pais
     * @return the pais that was removed
     * @throws com.telefonica.centroseducativos.NoSuchPaisException if a pais with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Pais remove(Serializable primaryKey)
        throws NoSuchPaisException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Pais pais = (Pais) session.get(PaisImpl.class, primaryKey);

            if (pais == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPaisException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(pais);
        } catch (NoSuchPaisException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Pais removeImpl(Pais pais) throws SystemException {
        pais = toUnwrappedModel(pais);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(pais)) {
                pais = (Pais) session.get(PaisImpl.class,
                        pais.getPrimaryKeyObj());
            }

            if (pais != null) {
                session.delete(pais);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (pais != null) {
            clearCache(pais);
        }

        return pais;
    }

    @Override
    public Pais updateImpl(com.telefonica.centroseducativos.model.Pais pais)
        throws SystemException {
        pais = toUnwrappedModel(pais);

        boolean isNew = pais.isNew();

        Session session = null;

        try {
            session = openSession();

            if (pais.isNew()) {
                session.save(pais);

                pais.setNew(false);
            } else {
                session.merge(pais);
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

        EntityCacheUtil.putResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
            PaisImpl.class, pais.getPrimaryKey(), pais);

        return pais;
    }

    protected Pais toUnwrappedModel(Pais pais) {
        if (pais instanceof PaisImpl) {
            return pais;
        }

        PaisImpl paisImpl = new PaisImpl();

        paisImpl.setNew(pais.isNew());
        paisImpl.setPrimaryKey(pais.getPrimaryKey());

        paisImpl.setIdpais(pais.getIdpais());
        paisImpl.setNombrepais(pais.getNombrepais());

        return paisImpl;
    }

    /**
     * Returns the pais with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the pais
     * @return the pais
     * @throws com.telefonica.centroseducativos.NoSuchPaisException if a pais with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Pais findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPaisException, SystemException {
        Pais pais = fetchByPrimaryKey(primaryKey);

        if (pais == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPaisException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return pais;
    }

    /**
     * Returns the pais with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchPaisException} if it could not be found.
     *
     * @param idpais the primary key of the pais
     * @return the pais
     * @throws com.telefonica.centroseducativos.NoSuchPaisException if a pais with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Pais findByPrimaryKey(int idpais)
        throws NoSuchPaisException, SystemException {
        return findByPrimaryKey((Serializable) idpais);
    }

    /**
     * Returns the pais with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the pais
     * @return the pais, or <code>null</code> if a pais with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Pais fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Pais pais = (Pais) EntityCacheUtil.getResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
                PaisImpl.class, primaryKey);

        if (pais == _nullPais) {
            return null;
        }

        if (pais == null) {
            Session session = null;

            try {
                session = openSession();

                pais = (Pais) session.get(PaisImpl.class, primaryKey);

                if (pais != null) {
                    cacheResult(pais);
                } else {
                    EntityCacheUtil.putResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
                        PaisImpl.class, primaryKey, _nullPais);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PaisModelImpl.ENTITY_CACHE_ENABLED,
                    PaisImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return pais;
    }

    /**
     * Returns the pais with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param idpais the primary key of the pais
     * @return the pais, or <code>null</code> if a pais with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Pais fetchByPrimaryKey(int idpais) throws SystemException {
        return fetchByPrimaryKey((Serializable) idpais);
    }

    /**
     * Returns all the paises.
     *
     * @return the paises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Pais> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the paises.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.PaisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of paises
     * @param end the upper bound of the range of paises (not inclusive)
     * @return the range of paises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Pais> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the paises.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.PaisModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of paises
     * @param end the upper bound of the range of paises (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of paises
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Pais> findAll(int start, int end,
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

        List<Pais> list = (List<Pais>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PAIS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PAIS;

                if (pagination) {
                    sql = sql.concat(PaisModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Pais>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Pais>(list);
                } else {
                    list = (List<Pais>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the paises from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Pais pais : findAll()) {
            remove(pais);
        }
    }

    /**
     * Returns the number of paises.
     *
     * @return the number of paises
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

                Query q = session.createQuery(_SQL_COUNT_PAIS);

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
     * Initializes the pais persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.telefonica.centroseducativos.model.Pais")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Pais>> listenersList = new ArrayList<ModelListener<Pais>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Pais>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PaisImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
