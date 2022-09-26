package com.zhangs.mallorder;

import com.zhangs.mallorder.entity.OrderEntity;
import com.zhangs.mallorder.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallOrderApplicationTests {

	@Autowired
	OrderService orderService;

	@Test
	void contextLoads() {
		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setOrderSn("1000元");
		orderService.save(orderEntity);
		System.out.println("添加成功");
	}

}
