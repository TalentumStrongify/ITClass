package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.telefonica.centroseducativos.model.CategoriaPregunta;

/**
 * The persistence interface for the categoria pregunta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaPreguntaPersistenceImpl
 * @see CategoriaPreguntaUtil
 * @generated
 */
public interface CategoriaPreguntaPersistence extends BasePersistence<CategoriaPregunta> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CategoriaPreguntaUtil} to access the categoria pregunta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the categoria pregunta in the entity cache if it is enabled.
    *
    * @param categoriaPregunta the categoria pregunta
    */
    public void cacheResult(
        com.telefonica.centroseducativos.model.CategoriaPregunta categoriaPregunta);

    /**
    * Caches the categoria preguntas in the entity cache if it is enabled.
    *
    * @param categoriaPreguntas the categoria preguntas
    */
    public void cacheResult(
        java.util.List<com.telefonica.centroseducativos.model.CategoriaPregunta> categoriaPreguntas);

    /**
    * Creates a new categoria pregunta with the primary key. Does not add the categoria pregunta to the database.
    *
    * @param idcategoria the primary key for the new categoria pregunta
    * @return the new categoria pregunta
    */
    public com.telefonica.centroseducativos.model.CategoriaPregunta create(
        int idcategoria);

    /**
    * Removes the categoria pregunta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idcategoria the primary key of the categoria pregunta
    * @return the categoria pregunta that was removed
    * @throws com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException if a categoria pregunta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.centroseducativos.model.CategoriaPregunta remove(
        int idcategoria)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException;

    public com.telefonica.centroseducativos.model.CategoriaPregunta updateImpl(
        com.telefonica.centroseducativos.model.CategoriaPregunta categoriaPregunta)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the categoria pregunta with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException} if it could not be found.
    *
    * @param idcategoria the primary key of the categoria pregunta
    * @return the categoria pregunta
    * @throws com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException if a categoria pregunta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.centroseducativos.model.CategoriaPregunta findByPrimaryKey(
        int idcategoria)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchCategoriaPreguntaException;

    /**
    * Returns the categoria pregunta with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idcategoria the primary key of the categoria pregunta
    * @return the categoria pregunta, or <code>null</code> if a categoria pregunta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.centroseducativos.model.CategoriaPregunta fetchByPrimaryKey(
        int idcategoria)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the categoria preguntas.
    *
    * @return the categoria preguntas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.telefonica.centroseducativos.model.CategoriaPregunta> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.centroseducativos.model.CategoriaPregunta> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.centroseducativos.model.CategoriaPregunta> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the categoria preguntas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of categoria preguntas.
    *
    * @return the number of categoria preguntas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
