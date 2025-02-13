package it.advancia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tutorials")
public class Tutorial {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name="description")
	private String description;

	@Column(name="published")
	private Boolean isPublished;

	@Column(name="title")
	private String title;
	
	public Tutorial () {}

	public Tutorial(Integer id, String title, String description, Boolean isPublished) {
		super();
		this.id = id;
		this.description = description;
		this.isPublished = isPublished;
		this.title = title;
	}

	public Tutorial(String title, String description, Boolean isPublished) {
		super();
		this.description = description;
		this.isPublished = isPublished;
		this.title = title;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getIsPublished() {
		return isPublished;
	}
	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}