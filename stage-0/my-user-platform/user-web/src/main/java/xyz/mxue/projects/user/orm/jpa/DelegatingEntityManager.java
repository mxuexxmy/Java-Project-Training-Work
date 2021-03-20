package xyz.mxue.projects.user.orm.jpa;

import xyz.mxue.context.ComponentContext;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author mxuexxmy
 * 委派实现（静态 AOP 实现）
 */
public class DelegatingEntityManager implements EntityManager {

    private String persistenceUnitName;

    private String propertiesLocation;

    private EntityManager entityManager;

    @PostConstruct
    public void init() {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory(persistenceUnitName, loadProperties(propertiesLocation));
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    private Map loadProperties(String propertiesLocation) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL propertiesFileURL = classLoader.getResource(propertiesLocation);
        Properties properties = new Properties();
        try {
           properties.load(propertiesFileURL.openStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 增加 JNDI 引用处理
        ComponentContext componentContext = ComponentContext.getInstance();
        for (String propertyName : properties.stringPropertyNames()) {
            String propertyValue = properties.getProperty(propertyName);
            if (propertyValue.startsWith("@")) {
                String componentName = propertyValue.substring(1);
                Object component = componentContext.getComponent(componentName);
                properties.put(propertyName, component);
            }
        }
        return properties;
    }

    // Setter 方法会被 Tomcat JNDI 实现调用

    public void setPersistenceUnitName(String persistenceUnitName) {
        this.persistenceUnitName = persistenceUnitName;
    }

    public void setPropertiesLocation(String propertiesLocation) {
        this.propertiesLocation = propertiesLocation;
    }

    @Override
    public void persist(Object entity) {
        entityManager.persist(entity);
    }

    @Override
    public <T> T merge(T entity) {
        return entityManager.merge(entity);
    }

    @Override
    public void remove(Object entity) {
        entityManager.remove(entity);
    }

    @Override
    public <T> T find(Class<T> entityClass, Object primaryKey) {
        return entityManager.find(entityClass, primaryKey);
    }

    @Override
    public <T> T find(Class<T> entityClass, Object primaryKey, Map<String, Object> properties) {
        return entityManager.find(entityClass, primaryKey, properties);
    }

    @Override
    public <T> T find(Class<T> aClass, Object o, LockModeType lockModeType) {
        return null;
    }

    @Override
    public <T> T find(Class<T> aClass, Object o, LockModeType lockModeType, Map<String, Object> map) {
        return null;
    }

    @Override
    public <T> T getReference(Class<T> aClass, Object o) {
        return null;
    }

    @Override
    public void flush() {
        entityManager.flush();
    }

    @Override
    public void setFlushMode(FlushModeType flushModeType) {

    }

    @Override
    public FlushModeType getFlushMode() {
        return null;
    }

    @Override
    public void lock(Object o, LockModeType lockModeType) {

    }

    @Override
    public void lock(Object o, LockModeType lockModeType, Map<String, Object> map) {

    }

    @Override
    public void refresh(Object o) {
         entityManager.refresh(o);
    }

    @Override
    public void refresh(Object o, Map<String, Object> map) {
          entityManager.refresh(o, map);
    }

    @Override
    public void refresh(Object o, LockModeType lockModeType) {

    }

    @Override
    public void refresh(Object o, LockModeType lockModeType, Map<String, Object> map) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void detach(Object o) {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public LockModeType getLockMode(Object o) {
        return null;
    }

    @Override
    public void setProperty(String s, Object o) {

    }

    @Override
    public Map<String, Object> getProperties() {
        return null;
    }

    @Override
    public Query createQuery(String s) {
        return null;
    }

    @Override
    public <T> TypedQuery<T> createQuery(CriteriaQuery<T> criteriaQuery) {
        return null;
    }

    @Override
    public Query createQuery(CriteriaUpdate criteriaUpdate) {
        return null;
    }

    @Override
    public Query createQuery(CriteriaDelete criteriaDelete) {
        return null;
    }

    @Override
    public <T> TypedQuery<T> createQuery(String s, Class<T> aClass) {
        return null;
    }

    @Override
    public Query createNamedQuery(String s) {
        return entityManager.createNamedQuery(s);
    }

    @Override
    public <T> TypedQuery<T> createNamedQuery(String s, Class<T> aClass) {
        return entityManager.createNamedQuery(s, aClass);
    }

    @Override
    public Query createNativeQuery(String s) {
        return entityManager.createNativeQuery(s);
    }

    @Override
    public Query createNativeQuery(String s, Class aClass) {
        return entityManager.createNativeQuery(s, aClass);
    }

    @Override
    public Query createNativeQuery(String s, String s1) {
        return entityManager.createNativeQuery(s, s1);
    }

    @Override
    public StoredProcedureQuery createNamedStoredProcedureQuery(String s) {
        return entityManager.createStoredProcedureQuery(s);
    }

    @Override
    public StoredProcedureQuery createStoredProcedureQuery(String s) {
        return entityManager.createStoredProcedureQuery(s);
    }

    @Override
    public StoredProcedureQuery createStoredProcedureQuery(String s, Class... classes) {
        return entityManager.createStoredProcedureQuery(s, classes);
    }

    @Override
    public StoredProcedureQuery createStoredProcedureQuery(String s, String... strings) {
        return entityManager.createStoredProcedureQuery(s, strings);
    }

    @Override
    public void joinTransaction() {
          entityManager.joinTransaction();
    }

    @Override
    public boolean isJoinedToTransaction() {
        return entityManager.isJoinedToTransaction();
    }

    @Override
    public <T> T unwrap(Class<T> aClass) {
        return entityManager.unwrap(aClass);
    }

    @Override
    public Object getDelegate() {
        return entityManager.getDelegate();
    }

    @Override
    public void close() {
        entityManager.close();
    }

    @Override
    public boolean isOpen() {
        return entityManager.isOpen();
    }

    @Override
    public EntityTransaction getTransaction() {
        return entityManager.getTransaction();
    }

    @Override
    public EntityManagerFactory getEntityManagerFactory() {
        return entityManager.getEntityManagerFactory();
    }

    @Override
    public CriteriaBuilder getCriteriaBuilder() {
        return entityManager.getCriteriaBuilder();
    }

    @Override
    public Metamodel getMetamodel() {
        return entityManager.getMetamodel();
    }

    @Override
    public <T> EntityGraph<T> createEntityGraph(Class<T> entityClass) {
        return entityManager.createEntityGraph(entityClass);
    }

    @Override
    public EntityGraph<?> createEntityGraph(String graphName) {
        return entityManager.createEntityGraph(graphName);
    }

    @Override
    public EntityGraph<?> getEntityGraph(String graphName) {
        return entityManager.getEntityGraph(graphName);
    }

    @Override
    public <T> List<EntityGraph<? super T>> getEntityGraphs(Class<T> entityClass) {
        return entityManager.getEntityGraphs(entityClass);
    }
}
