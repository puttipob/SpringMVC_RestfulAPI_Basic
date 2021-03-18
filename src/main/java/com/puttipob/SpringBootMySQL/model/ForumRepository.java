package com.puttipob.SpringBootMySQL.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class ForumRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public Forum findOne(Integer id) {
		return entityManager.find(Forum.class, id);
	}

	public List<Forum> findAll() {
		Query q = entityManager.createQuery("FROM Forum");
		return q.getResultList();
	}

	@Transactional
	public Forum save(Forum forum) {
		entityManager.persist(forum);
		return forum;
	}

}
