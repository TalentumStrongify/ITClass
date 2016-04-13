package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.telefonica.centroseducativos.model.RolUsuario;

/**
 * The persistence interface for the rol usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RolUsuarioPersistenceImpl
 * @see RolUsuarioUtil
 * @generated
 */
public interface RolUsuarioPersistence extends BasePersistence<RolUsuario> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RolUsuarioUtil} to access the rol usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the rol usuario in the entity cache if it is enabled.
    *
    * @param rolUsuario the rol usuario
    */
    public void cacheResult(
        com.telefonica.centroseducativos.model.RolUsuario rolUsuario);

    /**
    * Caches the rol usuarios in the entity cache if it is enabled.
    *
    * @param rolUsuarios the rol usuarios
    */
    public void cacheResult(
        java.util.List<com.telefonica.centroseducativos.model.RolUsuario> rolUsuarios);

    /**
    * Creates a new rol usuario with the primary key. Does not add the rol usuario to the database.
    *
    * @param idrol the primary key for the new rol usuario
    * @return the new rol usuario
    */
    public com.telefonica.centroseducativos.model.RolUsuario create(int idrol);

    /**
    * Removes the rol usuario with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idrol the primary key of the rol usuario
    * @return the rol usuario that was removed
    * @throws com.telefonica.centroseducativos.NoSuchRolUsuarioException if a rol usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.centroseducativos.model.RolUsuario remove(int idrol)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchRolUsuarioException;

    public com.telefonica.centroseducativos.model.RolUsuario updateImpl(
        com.telefonica.centroseducativos.model.RolUsuario rolUsuario)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the rol usuario with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchRolUsuarioException} if it could not be found.
    *
    * @param idrol the primary key of the rol usuario
    * @return the rol usuario
    * @throws com.telefonica.centroseducativos.NoSuchRolUsuarioException if a rol usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.centroseducativos.model.RolUsuario findByPrimaryKey(
        int idrol)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchRolUsuarioException;

    /**
    * Returns the rol usuario with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idrol the primary key of the rol usuario
    * @return the rol usuario, or <code>null</code> if a rol usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.centroseducativos.model.RolUsuario fetchByPrimaryKey(
        int idrol) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the rol usuarios.
    *
    * @return the rol usuarios
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.telefonica.centroseducativos.model.RolUsuario> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.centroseducativos.model.RolUsuario> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.centroseducativos.model.RolUsuario> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the rol usuarios from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rol usuarios.
    *
    * @return the number of rol usuarios
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
