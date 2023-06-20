package com.nimapinfotech.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CATEGORY")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "CATEGORY_ID", nullable = false)
	private Integer categoryId;

	@Column(name = "CATEGORY_TITLE", nullable = false)
	private String categoryTitle;

	@Column(name = "CATEGORY_DESCRIPTION", nullable = false)
	private String categoryDescription;

	@JsonIgnore// to ignore this field
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private Set<Product> product = new HashSet<>();
}
