package cn.xh.ad.service;

import cn.xh.ad.dao.read.QyyAdReadDao;
import cn.xh.ad.entity.QyyAd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 广告serviceImpl
 *
 * @Author:hao.xu
 * @Email:hao.xu@rograndec.com
 * @Date: 2019/3/22
 * @Version:1.0
 */
@Service
public class AdServiceImpl implements AdService{

    @Autowired
    private QyyAdReadDao qyyAdReadDao;

    /**
     * 根据主键查询广告
     * @author hao.xu
     * @Email: hao.xu@rograndec.com
     * @date 2019/3/25 9:21
     */
    @Override
    public QyyAd findQyyAdById(Integer adId) {
        if (null == adId){
            throw new RuntimeException("adId为空!");
        }
        return qyyAdReadDao.findQyyAdById(adId);
    }
}
