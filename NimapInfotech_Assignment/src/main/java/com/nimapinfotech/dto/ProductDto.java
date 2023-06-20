package com.nimapinfotech.dto;

import com.nimapinfotech.entity.Category;

import lombok.Data;

@Data
public class ProductDto {

	private Integer productId;
	
	private String productName;
	
	private Double productPrice;
	
	private Category category;

}
