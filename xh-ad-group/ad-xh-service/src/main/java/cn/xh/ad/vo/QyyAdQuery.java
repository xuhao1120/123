package cn.xh.ad.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:hao.xu
 * @Email:hao.xu@rograndec.com
 * @Date: 2019/3/25
 * @Version:1.0
 */
@Data
public class QyyAdQuery implements Serializable {

    private static final long serialVersionUID = 5589531094822609205L;

    private Integer parentId;

    private String adName;

    private Date startTime;

    private String password;
}
