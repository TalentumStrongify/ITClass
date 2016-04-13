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

import com.telefonica.centroseducativos.NoSuchRolUsuarioException;
import com.telefonica.centroseducativos.model.RolUsuario;
import com.telefonica.centroseducativos.model.impl.RolUsuarioImpl;
import com.telefonica.centroseducativos.model.impl.RolUsuarioModelImpl;
import com.telefonica.centroseducativos.service.persistence.RolUsuarioPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the rol usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RolUsuarioPersistence
 * @see RolUsuarioUtil
 * @generated
 */
public class RolUsuarioPersistenceImpl extends BasePersistenceImpl<RolUsuario>
    implements RolUsuarioPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RolUsuarioUtil} to access the rol usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RolUsuarioImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RolUsuarioModelImpl.ENTITY_CACHE_ENABLED,
            RolUsuarioModelImpl.FINDER_CACHE_ENABLED, RolUsuarioImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RolUsuarioModelImpl.ENTITY_CACHE_ENABLED,
            RolUsuarioModelImpl.FINDER_CACHE_ENABLED, RolUsuarioImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RolUsuarioModelImpl.ENTITY_CACHE_ENABLED,
            RolUsuarioModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ROLUSUARIO = "SELECT rolUsuario FROM RolUsuario rolUsuario";
    private static final String _SQL_COUNT_ROLUSUARIO = "SELECT COUNT(rolUsuario) FROM RolUsuario rolUsuario";
    private static final String _ORDER_BY_ENTITY_ALIAS = "rolUsuario.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RolUsuario exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RolUsuarioPersistenceImpl.class);
    private static RolUsuario _nullRolUsuario = new RolUsuarioImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<RolUsuario> toCacheModel() {
                return _nullRolUsuarioCacheModel;
            }
        };

    private static CacheModel<RolUsuario> _nullRolUsuarioCacheModel = new CacheModel<RolUsuario>() {
            @Override
            public RolUsuario toEntityModel() {
                return _nullRolUsuario;
            }
        };

    public RolUsuarioPersistenceImpl() {
        setModelClass(RolUsuario.class);
    }

    /**
     * Caches the rol usuario in the entity cache if it is enabled.
     *
     * @param rolUsuario the rol usuario
     */
    @Override
    public void cacheResult(RolUsuario rolUsuario) {
        EntityCacheUtil.putResult(RolUsuarioModelImpl.ENTITY_CACHE_ENABLED,
            RolUsuarioImpl.class, rolUsuario.getPrimaryKey(), rolUsuario);

        rolUsuario.resetOriginalValues();
    }

    /**
     * Caches the rol usuarios in the entity cache if it is enabled.
     *
     * @param rolUsuarios the rol usuarios
     */
    @Override
    public void cacheResult(List<RolUsuario> rolUsuarios) {
        for (RolUsuario rolUsuario : rolUsuarios) {
            if (EntityCacheUtil.getResult(
                        RolUsuarioModelImpl.ENTITY_CACHE_ENABLED,
                        RolUsuarioImpl.class, rolUsuario.getPrimaryKey()) == null) {
                cacheResult(rolUsuario);
            } else {
                rolUsuario.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all rol usuarios.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RolUsuarioImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RolUsuarioImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the rol usuario.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(RolUsuario rolUsuario) {
        EntityCacheUtil.removeResult(RolUsuarioModelImpl.ENTITY_CACHE_ENABLED,
            RolUsuarioImpl.class, rolUsuario.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<RolUsuario> rolUsuarios) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (RolUsuario rolUsuario : rolUsuarios) {
            EntityCacheUtil.removeResult(RolUsuarioModelImpl.ENTITY_CACHE_ENABLED,
                RolUsuarioImpl.class, rolUsuario.getPrimaryKey());
        }
    }

    /**
     * Creates a new rol usuario with the primary key. Does not add the rol usuario to the database.
     *
     * @param idrol the primary key for the new rol usuario
     * @return the new rol usuario
     */
    @Override
    public RolUsuario create(int idrol) {
        RolUsuario rolUsuario = new RolUsuarioImpl();

        rolUsuario.setNew(true);
        rolUsuario.setPrimaryKey(idrol);

        return rolUsuario;
    }

    /**
     * Removes the rol usuario with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idrol the primary key of the rol usuario
     * @return the rol usuario that was removed
     * @throws com.telefonica.centroseducativos.NoSuchRolUsuarioException if a rol usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RolUsuario remove(int idrol)
        throws NoSuchRolUsuarioException, SystemException {
        return remove((Serializable) idrol);
    }

    /**
     * Removes the rol usuario with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the rol usuario
     * @return the rol usuario that was removed
     * @throws com.telefonica.centroseducativos.NoSuchRolUsuarioException if a rol usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RolUsuario remove(Serializable primaryKey)
        throws NoSuchRolUsuarioException, SystemException {
        Session session = null;

        try {
            session = openSession();

            RolUsuario rolUsuario = (RolUsuario) session.get(RolUsuarioImpl.class,
                    primaryKey);

            if (rolUsuario == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRolUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(rolUsuario);
        } catch (NoSuchRolUsuarioException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected RolUsuario removeImpl(RolUsuario rolUsuario)
        throws SystemException {
        rolUsuario = toUnwrappedModel(rolUsuario);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(rolUsuario)) {
                rolUsuario = (RolUsuario) session.get(RolUsuarioImpl.class,
                        rolUsuario.getPrimaryKeyObj());
            }

            if (rolUsuario != null) {
                session.delete(rolUsuario);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (rolUsuario != null) {
            clearCache(rolUsuario);
        }

        return rolUsuario;
    }

    @Override
    public RolUsuario updateImpl(
        com.telefonica.centroseducativos.model.RolUsuario rolUsuario)
        throws SystemException {
        rolUsuario = toUnwrappedModel(rolUsuario);

        boolean isNew = rolUsuario.isNew();

        Session session = null;

        try {
            session = openSession();

            if (rolUsuario.isNew()) {
                session.save(rolUsuario);

                rolUsuario.setNew(false);
            } else {
                session.merge(rolUsuario);
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

        EntityCacheUtil.putResult(RolUsuarioModelImpl.ENTITY_CACHE_ENABLED,
            RolUsuarioImpl.class, rolUsuario.getPrimaryKey(), rolUsuario);

        return rolUsuario;
    }

    protected RolUsuario toUnwrappedModel(RolUsuario rolUsuario) {
        if (rolUsuario instanceof RolUsuarioImpl) {
            return rolUsuario;
        }

        RolUsuarioImpl rolUsuarioImpl = new RolUsuarioImpl();

        rolUsuarioImpl.setNew(rolUsuario.isNew());
        rolUsuarioImpl.setPrimaryKey(rolUsuario.getPrimaryKey());

        rolUsuarioImpl.setIdrol(rolUsuario.getIdrol());
        rolUsuarioImpl.setNombrerol(rolUsuario.getNombrerol());

        return rolUsuarioImpl;
    }

    /**
     * Returns the rol usuario with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the rol usuario
     * @return the rol usuario
     * @throws com.telefonica.centroseducativos.NoSuchRolUsuarioException if a rol usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RolUsuario findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRolUsuarioException, SystemException {
        RolUsuario rolUsuario = fetchByPrimaryKey(primaryKey);

        if (rolUsuario == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRolUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return rolUsuario;
    }

    /**
     * Returns the rol usuario with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchRolUsuarioException} if it could not be found.
     *
     * @param idrol the primary key of the rol usuario
     * @return the rol usuario
     * @throws com.telefonica.centroseducativos.NoSuchRolUsuarioException if a rol usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RolUsuario findByPrimaryKey(int idrol)
        throws NoSuchRolUsuarioException, SystemException {
        return findByPrimaryKey((Serializable) idrol);
    }

    /**
     * Returns the rol usuario with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the rol usuario
     * @return the rol usuario, or <code>null</code> if a rol usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RolUsuario fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        RolUsuario rolUsuario = (RolUsuario) EntityCacheUtil.getResult(RolUsuarioModelImpl.ENTITY_CACHE_ENABLED,
                RolUsuarioImpl.class, primaryKey);

        if (rolUsuario == _nullRolUsuario) {
            return null;
        }

        if (rolUsuario == null) {
            Session session = null;

            try {
                session = openSession();

                rolUsuario = (RolUsuario) session.get(RolUsuarioImpl.class,
                        primaryKey);

                if (rolUsuario != null) {
                    cacheResult(rolUsuario);
                } else {
                    EntityCacheUtil.putResult(RolUsuarioModelImpl.ENTITY_CACHE_ENABLED,
                        RolUsuarioImpl.class, primaryKey, _nullRolUsuario);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RolUsuarioModelImpl.ENTITY_CACHE_ENABLED,
                    RolUsuarioImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return rolUsuario;
    }

    /**
     * Returns the rol usuario with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param idrol the primary key of the rol usuario
     * @return the rol usuario, or <code>null</code> if a rol usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RolUsuario fetchByPrimaryKey(int idrol) throws SystemException {
        return fetchByPrimaryKey((Serializable) idrol);
    }

    /**
     * Returns all the rol usuarios.
     *
     * @return the rol usuarios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RolUsuario> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the rol usuarios.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.RolUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of rol usuarios
     * @param end the upper bound of the range of rol usuarios (not inclusive)
     * @return the range of rol usuarios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RolUsuario> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the rol usuarios.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.RolUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of rol usuarios
     * @param end the upper bound of the range of rol usuarios (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of rol usuarios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RolUsuario> findAll(int start, int end,
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

        List<RolUsuario> list = (List<RolUsuario>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ROLUSUARIO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ROLUSUARIO;

                if (pagination) {
                    sql = sql.concat(RolUsuarioModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<RolUsuario>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RolUsuario>(list);
                } else {
                    list = (List<RolUsuario>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the rol usuarios from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (RolUsuario rolUsuario : findAll()) {
            remove(rolUsuario);
        }
    }

    /**
     * Returns the number of rol usuarios.
     *
     * @return the number of rol usuarios
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

                Query q = session.createQuery(_SQL_COUNT_ROLUSUARIO);

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
     * Initializes the rol usuario persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.telefonica.centroseducativos.model.RolUsuario")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<RolUsuario>> listenersList = new ArrayList<ModelListener<RolUsuario>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<RolUsuario>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RolUsuarioImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
