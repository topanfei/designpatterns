package com.pf.demo.util;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.pf.demo.service.impl.NormalAccountNumber;
import com.pf.demo.service.impl.SvipAccountNumber;
import com.pf.demo.service.impl.VipAccountNumber;
@Component
public class SaleUtil {

	@Resource(name="vipAccountNumber")
	private VipAccountNumber vip;
	
	@Resource(name="svipAccountNumber")
	private SvipAccountNumber svip;
	
	@Resource(name="normalAccountNumber")
	private NormalAccountNumber normal;
	
	
	/**
	 * 销售方法
	 * @param type
	 * @param name
	 */
	public void sale(String type,String name) {
		if("normal".equals(type)) {//一般的用户
			normal.sale(name);
		}else if("vip".equals(type)) {//vip用户
			vip.sale(name);
		}else if("svip".equals(type)) {//svip用户
			svip.sale(name);
		}
	}
	
	
	
}
