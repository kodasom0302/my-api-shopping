package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.ProductDao;
import com.javaex.vo.ProductVo;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	//등록
	public int exeProductWrite(ProductVo productVo) {
		System.out.println("ProductService.exeProductWrite()");
		
		return productDao.productInsert(productVo);
	}
	
	//삭제
	public int exeProductRemove(ProductVo productVo) {
		System.out.println("ProductService.exeProductRemove()");
		
		int count=productDao.productDelete(productVo);
		
		return count;
	}

	//리스트
	public List<ProductVo> exeProductAdminList() {
		System.out.println("ProductService.exeProductAdminList()");

		List<ProductVo> pList = productDao.productAdminList();

		return pList;
	}
}
