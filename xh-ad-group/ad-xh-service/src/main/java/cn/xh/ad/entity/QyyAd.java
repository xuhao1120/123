package cn.xh.ad.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:hao.xu
 * @Email:hao.xu@rograndec.com
 * @Date: 2019/3/22
 * @Version:1.0
 */
@Data
public class QyyAd implements Serializable{

    private static final long serialVersionUID = -3266733070151658261L;

    private Integer adId;

    private Integer adParentId;

    private Integer adType;

    private String adName;

    private String adDesc;

    private Integer refId;

    private String refContent;

    private String adLinkUrl;

    private Date adStartTime;

    private Date adEndTime;

    private String adPic;

    private Integer adOrder;

    private Integer adStatus;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getAdParentId() {
        return adParentId;
    }

    public void setAdParentId(Integer adParentId) {
        this.adParentId = adParentId;
    }

    public Integer getAdType() {
        return adType;
    }

    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getAdDesc() {
        return adDesc;
    }

    public void setAdDesc(String adDesc) {
        this.adDesc = adDesc;
    }

    public Integer getRefId() {
        return refId;
    }

    public void setRefId(Integer refId) {
        this.refId = refId;
    }

    public String getRefContent() {
        return refContent;
    }

    public void setRefContent(String refContent) {
        this.refContent = refContent;
    }

    public String getAdLinkUrl() {
        return adLinkUrl;
    }

    public void setAdLinkUrl(String adLinkUrl) {
        this.adLinkUrl = adLinkUrl;
    }

    public Date getAdStartTime() {
        return adStartTime;
    }

    public void setAdStartTime(Date adStartTime) {
        this.adStartTime = adStartTime;
    }

    public Date getAdEndTime() {
        return adEndTime;
    }

    public void setAdEndTime(Date adEndTime) {
        this.adEndTime = adEndTime;
    }

    public String getAdPic() {
        return adPic;
    }

    public void setAdPic(String adPic) {
        this.adPic = adPic;
    }

    public Integer getAdOrder() {
        return adOrder;
    }

    public void setAdOrder(Integer adOrder) {
        this.adOrder = adOrder;
    }

    public Integer getAdStatus() {
        return adStatus;
    }

    public void setAdStatus(Integer adStatus) {
        this.adStatus = adStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        return "QyyAd{" +
                "adId=" + adId +
                ", adParentId=" + adParentId +
                ", adType=" + adType +
                ", adName='" + adName + '\'' +
                ", adDesc='" + adDesc + '\'' +
                ", refId=" + refId +
                ", refContent='" + refContent + '\'' +
                ", adLinkUrl='" + adLinkUrl + '\'' +
                ", adStartTime=" + adStartTime +
                ", adEndTime=" + adEndTime +
                ", adPic='" + adPic + '\'' +
                ", adOrder=" + adOrder +
                ", adStatus=" + adStatus +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", updateTime=" + updateTime +
                ", updateUser='" + updateUser + '\'' +
                '}';
    }
}
