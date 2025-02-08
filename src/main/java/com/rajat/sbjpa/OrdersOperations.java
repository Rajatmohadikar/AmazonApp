package com.rajat.sbjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

@Component
public class OrdersOperations {

	@Autowired
	AmazonRepository repository;

	public void loadDataByemailIdWithSorting() {
		List<AmazonOrders> allOrders = repository.findAll(Sort.by("email"));
		System.out.println(allOrders);
	}

	// ===============================================================================================
	// Pagination
	public void getFirstPageData() {
		List<AmazonOrders> orders = repository.findAll(Pageable.ofSize(2)).getContent();
		orders.forEach(System.out::println);
		;
	}

	public void getRecordsByPageIdAndNoOfRecords(int pageId, int noOfReorcds) {
		Pageable pageable = PageRequest.of(pageId, noOfReorcds);
		List<AmazonOrders> allOrders = repository.findAll(pageable).getContent();
		allOrders.forEach(System.out::println);
	}

	public void getDataByPaginationAndSorting(int pageId, int noOFReorcds) {
		List<AmazonOrders> allOrders = repository
				.findAll(PageRequest.of(pageId, noOFReorcds, Sort.by(Direction.DESC, "noOfItems"))).getContent();
		allOrders.forEach(System.out::println);;
	}

}
