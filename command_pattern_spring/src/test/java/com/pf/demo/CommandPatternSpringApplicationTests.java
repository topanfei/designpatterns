package com.pf.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pf.demo.util.SaleUtil;
import com.pf.demo.util.SaleUtil2;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommandPatternSpringApplicationTests {

	@Autowired
	private SaleUtil saleUtil;
	
	@Autowired
	private SaleUtil2 saleUtil2;
	
	@Test
	public void Test1() {
		saleUtil.sale("normal", "张三");
		saleUtil.sale("vip", "李四");
		saleUtil.sale("svip", "王五");
	}
	
	@Test
	public void test2() {
		System.out.println("**********测试************");
		/*saleUtil2.sale("normal", "张三");
		saleUtil2.sale("vip", "李四");
		saleUtil2.sale("svip", "王五");*/
		saleUtil2.get();
	}

}

