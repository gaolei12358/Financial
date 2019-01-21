package com.breach.huajinbao.service.product;

import com.breach.huajinbao.util.product.QueryProduct;
import com.breach.huajinbao.util.sign.ReturnUtil;

/**
 * @program: Financial
 * @description:
 * @author: shaokang
 * @create: 2019-01-19 14:30
 **/
public interface IProductService {

    /**
     * 商品列表页面加载后请求商品列表的数据
     * @param queryProduct
     * @return
     */
    ReturnUtil disperseBid(QueryProduct queryProduct);

    /**
     * 请求商品的详情页数据
     * @param productID
     * @return
     */
    ReturnUtil personBidDetail(String productID);
}
