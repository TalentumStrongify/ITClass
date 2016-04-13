package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.telefonica.centroseducativos.model.Pais;

/**
 * The persistence interface for the pais service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PaisPersistenceImpl
 * @see PaisUtil
 * @generated
 */
public interface PaisPersistence extends BasePersistence<Pais> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PaisUtil} to access the pais persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the pais in the entity cache if it is enabled.
    *
    * @param pais the pais
    */
    public void cacheResult(com.telefonica.centroseducativos.model.Pais pais);

    /**
    * Caches the paises in the entity cache if it is enabled.
    *
    * @param paises the paises
    */
    public void cacheResult(
        java.util.List<com.telefonica.centroseducativos.model.Pais> paises);

    /**
    * Creates a new pais with the primary key. Does not add the pais to the database.
    *
    * @param idpais the primary key for the new pais
    * @return the new pais
    */
    public com.telefonica.centroseducativos.model.Pais create(int idpais);

    /**
    * Removes the pais with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idpais the primary key of the pais
    * @return the pais that was removed
    * @throws com.telefonica.centroseducativos.NoSuchPaisException if a pais with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.centroseducativos.model.Pais remove(int idpais)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchPaisException;

    public com.telefonica.centroseducativos.model.Pais updateImpl(
        com.telefonica.centroseducativos.model.Pais pais)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the pais with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchPaisException} if it could not be found.
    *
    * @param idpais the primary key of the pais
    * @return the pais
    * @throws com.telefonica.centroseducativos.NoSuchPaisException if a pais with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.centroseducativos.model.Pais findByPrimaryKey(
        int idpais)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchPaisException;

    /**
    * Returns the pais with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idpais the primary key of the pais
    * @return the pais, or <code>null</code> if a pais with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.centroseducativos.model.Pais fetchByPrimaryKey(
        int idpais) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the paises.
    *
    * @return the paises
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.telefonica.centroseducativos.model.Pais> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.centroseducativos.model.Pais> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.centroseducativos.model.Pais> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the paises from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of paises.
    *
    * @return the number of paises
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
