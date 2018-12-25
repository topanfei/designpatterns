package com.pf.demo.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.pf.demo.service.AccountNumber;

@Component
public class SaleUtil2 {

	Map<String,AccountNumber> saleMap = new HashMap<String,AccountNumber>();
	
	public SaleUtil2(List<AccountNumber> accountNumberList) {
		System.out.println("oooooooooooooooooooooo");
		for (AccountNumber accountNumber : accountNumberList) {
			System.out.println("***********type="+accountNumber.type()+"***********");
			saleMap.put(accountNumber.type(), accountNumber);
		}
	}
	
	public void sale(String type,String name) {
		System.out.println("********saleUtil2中的sale方法*********");
		saleMap.get(type).sale(name);
	}
	
	public void get() {
		System.out.println("--------get()测试-----------");
	}
}
