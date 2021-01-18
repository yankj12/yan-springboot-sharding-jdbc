package com.yan.sharding_jdbc.mapper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yan.sharding_jdbc.model.Goods;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@DisplayName("GoodsMapperTest")
class GoodsMapperTest {

    @Autowired
    GoodsMapper goodsMapper;
    
	@Test
	void testInsert() {
		for(int i=0;i<10;i++) {
			Goods good = new Goods();
			good.setGname("手机_"+i);
			good.setUserId(100L);
			good.setGstatus("已发布");
			goodsMapper.insert(good);
		}
	}

	//@Test
	void testDeleteById() {
		
	}

	//@Test
	void testUpdateById() {
		
	}

	//@Test
	void testSelectById() {
		
	}

}
