package com.rajat.sbjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmazonAppApplication {

	public static void main(String[] args) {
		ApplicationContext context
		 = SpringApplication.run(AmazonAppApplication.class, args);

		 OrdersOperations ops = context.getBean(OrdersOperations.class);
		 //ops.loadDataByemailIdWithSorting();
		 
		 //======================================================================
		// ops.getFirstPageData();
		 
		// ops.getRecordsByPageIdAndNoOfRecords(1,3);
		 
		// ops.getDataByPaginationAndSorting(1, 3);
	}

}
