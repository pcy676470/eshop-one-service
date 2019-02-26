package com.roncoo.eshop.one.service.fallback;

import com.roncoo.eshop.one.service.EshopInventoryService;

public class EshopInventoryServiceFallback implements EshopInventoryService{

	@Override
	public String findByProductId(Long productId) {

		return "降级库存数据";
	}

}
