package com.rcelestinoadvocacia.util;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;


public abstract class GenericDAO<A> {
    
    protected static EntityManager manager;
    
    public abstract Class<A> getClassType();
    
    public EntityManager getEm(){
        if (manager == null || !manager.isOpen()){
            manager = DataBase.getInstance().getEm();
        }
        return manager;
    }
    public A insert(A a){
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception error) {
            System.out.println("Erro: " + error);
            em.getTransaction().rollback();
        }
        return a;
    }
    public A delete(A a) {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            em.remove(a);
            em.getTransaction().commit();
        } catch (Exception error) {
            System.out.println("Erro: " + error);
            em.getTransaction().rollback();
        }
        return a;
    }
    public A update(A a) {
        EntityManager em = getEm();
        try {
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        } catch (Exception error) {
            System.out.println("Erro: " + error);
            em.getTransaction().rollback();
        }
        return a;
    }
    public A selectById(int id){
    EntityManager em = getEm();
    return em.find(getClassType(), id);
    }
    public List<A> selectAll() {
        EntityManager em = getEm();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<A> query = builder.createQuery(getClassType());
        TypedQuery<A> typedQuery = em.createQuery(query.select(query.from(getClassType())));
        return typedQuery.getResultList();
    }
}
