package com.puttipob.SpringBootMySQL.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Forum {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String author;
	private String detail;
	private Integer love;
	private LocalDateTime postDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getLove() {
		return love;
	}

	public void setLove(Integer love) {
		this.love = love;
	}

	public LocalDateTime getPostDate() {
		return postDate;
	}

	public void setPostDate(LocalDateTime postDate) {
		this.postDate = postDate;
	}

}
