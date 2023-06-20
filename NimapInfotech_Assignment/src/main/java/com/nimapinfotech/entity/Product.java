package com.nimapinfotech.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PRODUCT")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "PRODUCT_ID", nullable = false)
	private Integer productId;

	@Column(name = "PRODUCT_NAME", nullable = false)
	private String productName;

	@Column(name = "PRODUCT_PRICE", nullable = false)
	private Double productPrice;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CATEGORY_ID", nullable = false)
	private Category category;

}
