package cn.xh.ad.dao.read;

import cn.xh.ad.entity.QyyAd;
import cn.xh.ad.vo.QyyAdQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:hao.xu
 * @Email:hao.xu@rograndec.com
 * @Date: 2019/3/22
 * @Version:1.0
 */
public interface QyyAdReadDao {

    /**
     * 根据主键查询
     * @author hao.xu
     * @Email: hao.xu@rograndec.com
     * @date 2019/3/25 9:18
     */
    QyyAd findQyyAdById(@Param("adId") Integer adId);

    /**
     * 根据主键查询
     * @author hao.xu
     * @Email: hao.xu@rograndec.com
     * @date 2019/3/25 9:18
     */
    List<QyyAd> listByPage(@Param("qyyAdQuery") QyyAdQuery qyyAdQuery,@Param("start")int start,@Param("pageSize") int pageSize);

    /**
     * 根据主键查询
     * @author hao.xu
     * @Email: hao.xu@rograndec.com
     * @date 2019/3/25 9:18
     */
    int countByPage(@Param("qyyAdQuery") QyyAdQuery qyyAdQuery,@Param("start")int start,@Param("pageSize") int pageSize);


}
