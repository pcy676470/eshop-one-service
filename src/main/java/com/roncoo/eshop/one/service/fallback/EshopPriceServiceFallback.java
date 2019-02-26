package com.roncoo.eshop.one.service.fallback;

import com.roncoo.eshop.one.service.EshopPriceService;

public class EshopPriceServiceFallback implements EshopPriceService{

	@Override
	public String findByProductId(Long productId) {

		return "降级价格数据";
	}

}
