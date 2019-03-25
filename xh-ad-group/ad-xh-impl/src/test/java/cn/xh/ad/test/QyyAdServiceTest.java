package cn.xh.ad.test;

import cn.xh.ad.entity.QyyAd;
import cn.xh.ad.service.AdService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:hao.xu
 * @Email:hao.xu@rograndec.com
 * @Date: 2019/3/25
 * @Version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-config.xml" })
public class QyyAdServiceTest {

    @Autowired
    private AdService adService;

    @Test
    public void testFindQyyAdById() {
        QyyAd qyyAd = adService.findQyyAdById(1);
        System.out.println(qyyAd.getAdName());
    }

}
