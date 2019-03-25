package cn.xh.ad.service;

import cn.xh.ad.entity.QyyAd;

/**
 * @Author:hao.xu
 * @Email:hao.xu@rograndec.com
 * @Date: 2019/3/22
 * @Version:1.0
 */
public interface AdService {

    /**
     * 根据主键查询广告
     * @author hao.xu
     * @Email: hao.xu@rograndec.com
     * @date 2019/3/25 9:21
     */
    QyyAd findQyyAdById(Integer adId);
}
