package com.telefonica.centroseducativos.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.telefonica.centroseducativos.model.RolUsuario;
import com.telefonica.centroseducativos.service.RolUsuarioLocalService;
import com.telefonica.centroseducativos.service.persistence.CategoriaPreguntaPersistence;
import com.telefonica.centroseducativos.service.persistence.CentroEducativoPersistence;
import com.telefonica.centroseducativos.service.persistence.ComunidadAutonomaPersistence;
import com.telefonica.centroseducativos.service.persistence.EvaluacionesCEPersistence;
import com.telefonica.centroseducativos.service.persistence.PaisPersistence;
import com.telefonica.centroseducativos.service.persistence.PreguntasEncuestaPersistence;
import com.telefonica.centroseducativos.service.persistence.RolUsuarioPersistence;
import com.telefonica.centroseducativos.service.persistence.UsuarioPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the rol usuario local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.telefonica.centroseducativos.service.impl.RolUsuarioLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.centroseducativos.service.impl.RolUsuarioLocalServiceImpl
 * @see com.telefonica.centroseducativos.service.RolUsuarioLocalServiceUtil
 * @generated
 */
public abstract class RolUsuarioLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements RolUsuarioLocalService,
        IdentifiableBean {
    @BeanReference(type = com.telefonica.centroseducativos.service.CategoriaPreguntaLocalService.class)
    protected com.telefonica.centroseducativos.service.CategoriaPreguntaLocalService categoriaPreguntaLocalService;
    @BeanReference(type = com.telefonica.centroseducativos.service.CategoriaPreguntaService.class)
    protected com.telefonica.centroseducativos.service.CategoriaPreguntaService categoriaPreguntaService;
    @BeanReference(type = CategoriaPreguntaPersistence.class)
    protected CategoriaPreguntaPersistence categoriaPreguntaPersistence;
    @BeanReference(type = com.telefonica.centroseducativos.service.CentroEducativoLocalService.class)
    protected com.telefonica.centroseducativos.service.CentroEducativoLocalService centroEducativoLocalService;
    @BeanReference(type = com.telefonica.centroseducativos.service.CentroEducativoService.class)
    protected com.telefonica.centroseducativos.service.CentroEducativoService centroEducativoService;
    @BeanReference(type = CentroEducativoPersistence.class)
    protected CentroEducativoPersistence centroEducativoPersistence;
    @BeanReference(type = com.telefonica.centroseducativos.service.ComunidadAutonomaLocalService.class)
    protected com.telefonica.centroseducativos.service.ComunidadAutonomaLocalService comunidadAutonomaLocalService;
    @BeanReference(type = com.telefonica.centroseducativos.service.ComunidadAutonomaService.class)
    protected com.telefonica.centroseducativos.service.ComunidadAutonomaService comunidadAutonomaService;
    @BeanReference(type = ComunidadAutonomaPersistence.class)
    protected ComunidadAutonomaPersistence comunidadAutonomaPersistence;
    @BeanReference(type = com.telefonica.centroseducativos.service.EvaluacionesCELocalService.class)
    protected com.telefonica.centroseducativos.service.EvaluacionesCELocalService evaluacionesCELocalService;
    @BeanReference(type = com.telefonica.centroseducativos.service.EvaluacionesCEService.class)
    protected com.telefonica.centroseducativos.service.EvaluacionesCEService evaluacionesCEService;
    @BeanReference(type = EvaluacionesCEPersistence.class)
    protected EvaluacionesCEPersistence evaluacionesCEPersistence;
    @BeanReference(type = com.telefonica.centroseducativos.service.PaisLocalService.class)
    protected com.telefonica.centroseducativos.service.PaisLocalService paisLocalService;
    @BeanReference(type = com.telefonica.centroseducativos.service.PaisService.class)
    protected com.telefonica.centroseducativos.service.PaisService paisService;
    @BeanReference(type = PaisPersistence.class)
    protected PaisPersistence paisPersistence;
    @BeanReference(type = com.telefonica.centroseducativos.service.PreguntasEncuestaLocalService.class)
    protected com.telefonica.centroseducativos.service.PreguntasEncuestaLocalService preguntasEncuestaLocalService;
    @BeanReference(type = com.telefonica.centroseducativos.service.PreguntasEncuestaService.class)
    protected com.telefonica.centroseducativos.service.PreguntasEncuestaService preguntasEncuestaService;
    @BeanReference(type = PreguntasEncuestaPersistence.class)
    protected PreguntasEncuestaPersistence preguntasEncuestaPersistence;
    @BeanReference(type = com.telefonica.centroseducativos.service.RolUsuarioLocalService.class)
    protected com.telefonica.centroseducativos.service.RolUsuarioLocalService rolUsuarioLocalService;
    @BeanReference(type = com.telefonica.centroseducativos.service.RolUsuarioService.class)
    protected com.telefonica.centroseducativos.service.RolUsuarioService rolUsuarioService;
    @BeanReference(type = RolUsuarioPersistence.class)
    protected RolUsuarioPersistence rolUsuarioPersistence;
    @BeanReference(type = com.telefonica.centroseducativos.service.UsuarioLocalService.class)
    protected com.telefonica.centroseducativos.service.UsuarioLocalService usuarioLocalService;
    @BeanReference(type = com.telefonica.centroseducativos.service.UsuarioService.class)
    protected com.telefonica.centroseducativos.service.UsuarioService usuarioService;
    @BeanReference(type = UsuarioPersistence.class)
    protected UsuarioPersistence usuarioPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private RolUsuarioLocalServiceClpInvoker _clpInvoker = new RolUsuarioLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.telefonica.centroseducativos.service.RolUsuarioLocalServiceUtil} to access the rol usuario local service.
     */

    /**
     * Adds the rol usuario to the database. Also notifies the appropriate model listeners.
     *
     * @param rolUsuario the rol usuario
     * @return the rol usuario that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public RolUsuario addRolUsuario(RolUsuario rolUsuario)
        throws SystemException {
        rolUsuario.setNew(true);

        return rolUsuarioPersistence.update(rolUsuario);
    }

    /**
     * Creates a new rol usuario with the primary key. Does not add the rol usuario to the database.
     *
     * @param idrol the primary key for the new rol usuario
     * @return the new rol usuario
     */
    @Override
    public RolUsuario createRolUsuario(int idrol) {
        return rolUsuarioPersistence.create(idrol);
    }

    /**
     * Deletes the rol usuario with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idrol the primary key of the rol usuario
     * @return the rol usuario that was removed
     * @throws PortalException if a rol usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public RolUsuario deleteRolUsuario(int idrol)
        throws PortalException, SystemException {
        return rolUsuarioPersistence.remove(idrol);
    }

    /**
     * Deletes the rol usuario from the database. Also notifies the appropriate model listeners.
     *
     * @param rolUsuario the rol usuario
     * @return the rol usuario that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public RolUsuario deleteRolUsuario(RolUsuario rolUsuario)
        throws SystemException {
        return rolUsuarioPersistence.remove(rolUsuario);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(RolUsuario.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return rolUsuarioPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.RolUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return rolUsuarioPersistence.findWithDynamicQuery(dynamicQuery, start,
            end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.centroseducativos.model.impl.RolUsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return rolUsuarioPersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return rolUsuarioPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return rolUsuarioPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public RolUsuario fetchRolUsuario(int idrol) throws SystemException {
        return rolUsuarioPersistence.fetchByPrimaryKey(idrol);
    }

    /**
     * Returns the rol usuario with the primary key.
     *
     * @param idrol the primary key of the rol usuario
     * @return the rol usuario
     * @throws PortalException if a rol usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RolUsuario getRolUsuario(int idrol)
        throws PortalException, SystemException {
        return rolUsuarioPersistence.findByPrimaryKey(idrol);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return rolUsuarioPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<RolUsuario> getRolUsuarios(int start, int end)
        throws SystemException {
        return rolUsuarioPersistence.findAll(start, end);
    }

    /**
     * Returns the number of rol usuarios.
     *
     * @return the number of rol usuarios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getRolUsuariosCount() throws SystemException {
        return rolUsuarioPersistence.countAll();
    }

    /**
     * Updates the rol usuario in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param rolUsuario the rol usuario
     * @return the rol usuario that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public RolUsuario updateRolUsuario(RolUsuario rolUsuario)
        throws SystemException {
        return rolUsuarioPersistence.update(rolUsuario);
    }

    /**
     * Returns the categoria pregunta local service.
     *
     * @return the categoria pregunta local service
     */
    public com.telefonica.centroseducativos.service.CategoriaPreguntaLocalService getCategoriaPreguntaLocalService() {
        return categoriaPreguntaLocalService;
    }

    /**
     * Sets the categoria pregunta local service.
     *
     * @param categoriaPreguntaLocalService the categoria pregunta local service
     */
    public void setCategoriaPreguntaLocalService(
        com.telefonica.centroseducativos.service.CategoriaPreguntaLocalService categoriaPreguntaLocalService) {
        this.categoriaPreguntaLocalService = categoriaPreguntaLocalService;
    }

    /**
     * Returns the categoria pregunta remote service.
     *
     * @return the categoria pregunta remote service
     */
    public com.telefonica.centroseducativos.service.CategoriaPreguntaService getCategoriaPreguntaService() {
        return categoriaPreguntaService;
    }

    /**
     * Sets the categoria pregunta remote service.
     *
     * @param categoriaPreguntaService the categoria pregunta remote service
     */
    public void setCategoriaPreguntaService(
        com.telefonica.centroseducativos.service.CategoriaPreguntaService categoriaPreguntaService) {
        this.categoriaPreguntaService = categoriaPreguntaService;
    }

    /**
     * Returns the categoria pregunta persistence.
     *
     * @return the categoria pregunta persistence
     */
    public CategoriaPreguntaPersistence getCategoriaPreguntaPersistence() {
        return categoriaPreguntaPersistence;
    }

    /**
     * Sets the categoria pregunta persistence.
     *
     * @param categoriaPreguntaPersistence the categoria pregunta persistence
     */
    public void setCategoriaPreguntaPersistence(
        CategoriaPreguntaPersistence categoriaPreguntaPersistence) {
        this.categoriaPreguntaPersistence = categoriaPreguntaPersistence;
    }

    /**
     * Returns the centro educativo local service.
     *
     * @return the centro educativo local service
     */
    public com.telefonica.centroseducativos.service.CentroEducativoLocalService getCentroEducativoLocalService() {
        return centroEducativoLocalService;
    }

    /**
     * Sets the centro educativo local service.
     *
     * @param centroEducativoLocalService the centro educativo local service
     */
    public void setCentroEducativoLocalService(
        com.telefonica.centroseducativos.service.CentroEducativoLocalService centroEducativoLocalService) {
        this.centroEducativoLocalService = centroEducativoLocalService;
    }

    /**
     * Returns the centro educativo remote service.
     *
     * @return the centro educativo remote service
     */
    public com.telefonica.centroseducativos.service.CentroEducativoService getCentroEducativoService() {
        return centroEducativoService;
    }

    /**
     * Sets the centro educativo remote service.
     *
     * @param centroEducativoService the centro educativo remote service
     */
    public void setCentroEducativoService(
        com.telefonica.centroseducativos.service.CentroEducativoService centroEducativoService) {
        this.centroEducativoService = centroEducativoService;
    }

    /**
     * Returns the centro educativo persistence.
     *
     * @return the centro educativo persistence
     */
    public CentroEducativoPersistence getCentroEducativoPersistence() {
        return centroEducativoPersistence;
    }

    /**
     * Sets the centro educativo persistence.
     *
     * @param centroEducativoPersistence the centro educativo persistence
     */
    public void setCentroEducativoPersistence(
        CentroEducativoPersistence centroEducativoPersistence) {
        this.centroEducativoPersistence = centroEducativoPersistence;
    }

    /**
     * Returns the comunidad autonoma local service.
     *
     * @return the comunidad autonoma local service
     */
    public com.telefonica.centroseducativos.service.ComunidadAutonomaLocalService getComunidadAutonomaLocalService() {
        return comunidadAutonomaLocalService;
    }

    /**
     * Sets the comunidad autonoma local service.
     *
     * @param comunidadAutonomaLocalService the comunidad autonoma local service
     */
    public void setComunidadAutonomaLocalService(
        com.telefonica.centroseducativos.service.ComunidadAutonomaLocalService comunidadAutonomaLocalService) {
        this.comunidadAutonomaLocalService = comunidadAutonomaLocalService;
    }

    /**
     * Returns the comunidad autonoma remote service.
     *
     * @return the comunidad autonoma remote service
     */
    public com.telefonica.centroseducativos.service.ComunidadAutonomaService getComunidadAutonomaService() {
        return comunidadAutonomaService;
    }

    /**
     * Sets the comunidad autonoma remote service.
     *
     * @param comunidadAutonomaService the comunidad autonoma remote service
     */
    public void setComunidadAutonomaService(
        com.telefonica.centroseducativos.service.ComunidadAutonomaService comunidadAutonomaService) {
        this.comunidadAutonomaService = comunidadAutonomaService;
    }

    /**
     * Returns the comunidad autonoma persistence.
     *
     * @return the comunidad autonoma persistence
     */
    public ComunidadAutonomaPersistence getComunidadAutonomaPersistence() {
        return comunidadAutonomaPersistence;
    }

    /**
     * Sets the comunidad autonoma persistence.
     *
     * @param comunidadAutonomaPersistence the comunidad autonoma persistence
     */
    public void setComunidadAutonomaPersistence(
        ComunidadAutonomaPersistence comunidadAutonomaPersistence) {
        this.comunidadAutonomaPersistence = comunidadAutonomaPersistence;
    }

    /**
     * Returns the evaluaciones c e local service.
     *
     * @return the evaluaciones c e local service
     */
    public com.telefonica.centroseducativos.service.EvaluacionesCELocalService getEvaluacionesCELocalService() {
        return evaluacionesCELocalService;
    }

    /**
     * Sets the evaluaciones c e local service.
     *
     * @param evaluacionesCELocalService the evaluaciones c e local service
     */
    public void setEvaluacionesCELocalService(
        com.telefonica.centroseducativos.service.EvaluacionesCELocalService evaluacionesCELocalService) {
        this.evaluacionesCELocalService = evaluacionesCELocalService;
    }

    /**
     * Returns the evaluaciones c e remote service.
     *
     * @return the evaluaciones c e remote service
     */
    public com.telefonica.centroseducativos.service.EvaluacionesCEService getEvaluacionesCEService() {
        return evaluacionesCEService;
    }

    /**
     * Sets the evaluaciones c e remote service.
     *
     * @param evaluacionesCEService the evaluaciones c e remote service
     */
    public void setEvaluacionesCEService(
        com.telefonica.centroseducativos.service.EvaluacionesCEService evaluacionesCEService) {
        this.evaluacionesCEService = evaluacionesCEService;
    }

    /**
     * Returns the evaluaciones c e persistence.
     *
     * @return the evaluaciones c e persistence
     */
    public EvaluacionesCEPersistence getEvaluacionesCEPersistence() {
        return evaluacionesCEPersistence;
    }

    /**
     * Sets the evaluaciones c e persistence.
     *
     * @param evaluacionesCEPersistence the evaluaciones c e persistence
     */
    public void setEvaluacionesCEPersistence(
        EvaluacionesCEPersistence evaluacionesCEPersistence) {
        this.evaluacionesCEPersistence = evaluacionesCEPersistence;
    }

    /**
     * Returns the pais local service.
     *
     * @return the pais local service
     */
    public com.telefonica.centroseducativos.service.PaisLocalService getPaisLocalService() {
        return paisLocalService;
    }

    /**
     * Sets the pais local service.
     *
     * @param paisLocalService the pais local service
     */
    public void setPaisLocalService(
        com.telefonica.centroseducativos.service.PaisLocalService paisLocalService) {
        this.paisLocalService = paisLocalService;
    }

    /**
     * Returns the pais remote service.
     *
     * @return the pais remote service
     */
    public com.telefonica.centroseducativos.service.PaisService getPaisService() {
        return paisService;
    }

    /**
     * Sets the pais remote service.
     *
     * @param paisService the pais remote service
     */
    public void setPaisService(
        com.telefonica.centroseducativos.service.PaisService paisService) {
        this.paisService = paisService;
    }

    /**
     * Returns the pais persistence.
     *
     * @return the pais persistence
     */
    public PaisPersistence getPaisPersistence() {
        return paisPersistence;
    }

    /**
     * Sets the pais persistence.
     *
     * @param paisPersistence the pais persistence
     */
    public void setPaisPersistence(PaisPersistence paisPersistence) {
        this.paisPersistence = paisPersistence;
    }

    /**
     * Returns the preguntas encuesta local service.
     *
     * @return the preguntas encuesta local service
     */
    public com.telefonica.centroseducativos.service.PreguntasEncuestaLocalService getPreguntasEncuestaLocalService() {
        return preguntasEncuestaLocalService;
    }

    /**
     * Sets the preguntas encuesta local service.
     *
     * @param preguntasEncuestaLocalService the preguntas encuesta local service
     */
    public void setPreguntasEncuestaLocalService(
        com.telefonica.centroseducativos.service.PreguntasEncuestaLocalService preguntasEncuestaLocalService) {
        this.preguntasEncuestaLocalService = preguntasEncuestaLocalService;
    }

    /**
     * Returns the preguntas encuesta remote service.
     *
     * @return the preguntas encuesta remote service
     */
    public com.telefonica.centroseducativos.service.PreguntasEncuestaService getPreguntasEncuestaService() {
        return preguntasEncuestaService;
    }

    /**
     * Sets the preguntas encuesta remote service.
     *
     * @param preguntasEncuestaService the preguntas encuesta remote service
     */
    public void setPreguntasEncuestaService(
        com.telefonica.centroseducativos.service.PreguntasEncuestaService preguntasEncuestaService) {
        this.preguntasEncuestaService = preguntasEncuestaService;
    }

    /**
     * Returns the preguntas encuesta persistence.
     *
     * @return the preguntas encuesta persistence
     */
    public PreguntasEncuestaPersistence getPreguntasEncuestaPersistence() {
        return preguntasEncuestaPersistence;
    }

    /**
     * Sets the preguntas encuesta persistence.
     *
     * @param preguntasEncuestaPersistence the preguntas encuesta persistence
     */
    public void setPreguntasEncuestaPersistence(
        PreguntasEncuestaPersistence preguntasEncuestaPersistence) {
        this.preguntasEncuestaPersistence = preguntasEncuestaPersistence;
    }

    /**
     * Returns the rol usuario local service.
     *
     * @return the rol usuario local service
     */
    public com.telefonica.centroseducativos.service.RolUsuarioLocalService getRolUsuarioLocalService() {
        return rolUsuarioLocalService;
    }

    /**
     * Sets the rol usuario local service.
     *
     * @param rolUsuarioLocalService the rol usuario local service
     */
    public void setRolUsuarioLocalService(
        com.telefonica.centroseducativos.service.RolUsuarioLocalService rolUsuarioLocalService) {
        this.rolUsuarioLocalService = rolUsuarioLocalService;
    }

    /**
     * Returns the rol usuario remote service.
     *
     * @return the rol usuario remote service
     */
    public com.telefonica.centroseducativos.service.RolUsuarioService getRolUsuarioService() {
        return rolUsuarioService;
    }

    /**
     * Sets the rol usuario remote service.
     *
     * @param rolUsuarioService the rol usuario remote service
     */
    public void setRolUsuarioService(
        com.telefonica.centroseducativos.service.RolUsuarioService rolUsuarioService) {
        this.rolUsuarioService = rolUsuarioService;
    }

    /**
     * Returns the rol usuario persistence.
     *
     * @return the rol usuario persistence
     */
    public RolUsuarioPersistence getRolUsuarioPersistence() {
        return rolUsuarioPersistence;
    }

    /**
     * Sets the rol usuario persistence.
     *
     * @param rolUsuarioPersistence the rol usuario persistence
     */
    public void setRolUsuarioPersistence(
        RolUsuarioPersistence rolUsuarioPersistence) {
        this.rolUsuarioPersistence = rolUsuarioPersistence;
    }

    /**
     * Returns the usuario local service.
     *
     * @return the usuario local service
     */
    public com.telefonica.centroseducativos.service.UsuarioLocalService getUsuarioLocalService() {
        return usuarioLocalService;
    }

    /**
     * Sets the usuario local service.
     *
     * @param usuarioLocalService the usuario local service
     */
    public void setUsuarioLocalService(
        com.telefonica.centroseducativos.service.UsuarioLocalService usuarioLocalService) {
        this.usuarioLocalService = usuarioLocalService;
    }

    /**
     * Returns the usuario remote service.
     *
     * @return the usuario remote service
     */
    public com.telefonica.centroseducativos.service.UsuarioService getUsuarioService() {
        return usuarioService;
    }

    /**
     * Sets the usuario remote service.
     *
     * @param usuarioService the usuario remote service
     */
    public void setUsuarioService(
        com.telefonica.centroseducativos.service.UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    /**
     * Returns the usuario persistence.
     *
     * @return the usuario persistence
     */
    public UsuarioPersistence getUsuarioPersistence() {
        return usuarioPersistence;
    }

    /**
     * Sets the usuario persistence.
     *
     * @param usuarioPersistence the usuario persistence
     */
    public void setUsuarioPersistence(UsuarioPersistence usuarioPersistence) {
        this.usuarioPersistence = usuarioPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.telefonica.centroseducativos.model.RolUsuario",
            rolUsuarioLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.telefonica.centroseducativos.model.RolUsuario");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return RolUsuario.class;
    }

    protected String getModelClassName() {
        return RolUsuario.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = rolUsuarioPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
