package com.telefonica.centroseducativos.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.telefonica.centroseducativos.model.EvaluacionesCE;

/**
 * The persistence interface for the evaluaciones c e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EvaluacionesCEPersistenceImpl
 * @see EvaluacionesCEUtil
 * @generated
 */
public interface EvaluacionesCEPersistence extends BasePersistence<EvaluacionesCE> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EvaluacionesCEUtil} to access the evaluaciones c e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the evaluaciones c e in the entity cache if it is enabled.
    *
    * @param evaluacionesCE the evaluaciones c e
    */
    public void cacheResult(
        com.telefonica.centroseducativos.model.EvaluacionesCE evaluacionesCE);

    /**
    * Caches the evaluaciones c es in the entity cache if it is enabled.
    *
    * @param evaluacionesCEs the evaluaciones c es
    */
    public void cacheResult(
        java.util.List<com.telefonica.centroseducativos.model.EvaluacionesCE> evaluacionesCEs);

    /**
    * Creates a new evaluaciones c e with the primary key. Does not add the evaluaciones c e to the database.
    *
    * @param evaluacionesCEPK the primary key for the new evaluaciones c e
    * @return the new evaluaciones c e
    */
    public com.telefonica.centroseducativos.model.EvaluacionesCE create(
        com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK evaluacionesCEPK);

    /**
    * Removes the evaluaciones c e with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param evaluacionesCEPK the primary key of the evaluaciones c e
    * @return the evaluaciones c e that was removed
    * @throws com.telefonica.centroseducativos.NoSuchEvaluacionesCEException if a evaluaciones c e with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.centroseducativos.model.EvaluacionesCE remove(
        com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK evaluacionesCEPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchEvaluacionesCEException;

    public com.telefonica.centroseducativos.model.EvaluacionesCE updateImpl(
        com.telefonica.centroseducativos.model.EvaluacionesCE evaluacionesCE)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the evaluaciones c e with the primary key or throws a {@link com.telefonica.centroseducativos.NoSuchEvaluacionesCEException} if it could not be found.
    *
    * @param evaluacionesCEPK the primary key of the evaluaciones c e
    * @return the evaluaciones c e
    * @throws com.telefonica.centroseducativos.NoSuchEvaluacionesCEException if a evaluaciones c e with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.centroseducativos.model.EvaluacionesCE findByPrimaryKey(
        com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK evaluacionesCEPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.centroseducativos.NoSuchEvaluacionesCEException;

    /**
    * Returns the evaluaciones c e with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param evaluacionesCEPK the primary key of the evaluaciones c e
    * @return the evaluaciones c e, or <code>null</code> if a evaluaciones c e with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.centroseducativos.model.EvaluacionesCE fetchByPrimaryKey(
        com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPK evaluacionesCEPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the evaluaciones c es.
    *
    * @return the evaluaciones c es
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.telefonica.centroseducativos.model.EvaluacionesCE> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.centroseducativos.model.EvaluacionesCE> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.centroseducativos.model.EvaluacionesCE> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the evaluaciones c es from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of evaluaciones c es.
    *
    * @return the number of evaluaciones c es
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
