package com.puttipob.SpringBootMySQL.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class WearerRepository {
	@PersistenceContext
	private EntityManager em;

	public List<Wearer> findAll() {
		Query q = em.createQuery("from Wearer");
		return q.getResultList();
	}
}
