package cn.xh.ad.test;

import com.rogrand.common.util.MD5;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import com.rogrand.common.util.StringUtil;
import java.io.Serializable;
import java.math.BigDecimal;

import static org.apache.zookeeper.KeeperException.CodeDeprecated.NotEmpty;

/**
 * @Author:hao.xu
 * @Email:hao.xu@rograndec.com
 * @Date: 2019/5/7
 * @Version:1.0
 */
public class ErpGoods implements Serializable{
    static                   Logger logger           = Logger.getLogger(ErpGoods.class);
    private static final long   serialVersionUID = -6051645518335782527L;
    private Integer gId;
    private String gInSn;
    private String gSn;
    private String gBarCode;
    private String gName;
    private String gNameCode;
    private String gAlias;
    private String gLicenseNo;
    private String gSpecifications;
    private String gUnit;
    private Integer gMiddlePackage;
    private Integer gBigPackage;
    private String gManufacture;
    private String gManufactureCode;
    private BigDecimal gPrice;
    private BigDecimal gBasePrice;
    private BigDecimal gCostPrice;
    private BigDecimal gNumber;
    private BigDecimal gRealnum;
    private String gPurview;
    private Integer gCanSplit;
    private String gOrderCate;
    private Integer gArea;
    private Integer gControl;
    private Integer gStatus;
    private BigDecimal gTaxRate;
    private BigDecimal gConversionRate;
    private String gTaxRateCode;
    private String gDosageName;
    private String gSecondPurview;
    private String gThirdPurview;
    private Integer goodsId;
    private String gOrderCateId;

    public ErpGoods() {
    }

    public Integer getGId() {
        return this.gId;
    }

    public void setGId(Integer value) {
        this.gId = value;
    }

    public String getGInSn() {
        return this.gInSn;
    }

    public void setGInSn(String value) {
        this.gInSn = value;
    }

    public String getGSn() {
        return this.gSn;
    }

    public void setGSn(String value) {
        this.gSn = value;
    }

    public String getGBarCode() {
        return this.gBarCode;
    }

    public void setGBarCode(String value) {
        this.gBarCode = value;
    }

    public String getgName() {
        this.gName = StringUtil.dbSafeString(this.gName, false, 64);
        return this.gName;
    }

    public void setGName(String value) {
        this.gName = value;
    }

    public String getgNameCode() {
        if(StringUtil.isEmpty(this.gNameCode)) {
            String pinyin = "";

            return pinyin;
        } else {
            return this.gNameCode;
        }
    }

    public void setGNameCode(String value) {
        this.gNameCode = value;
    }

    public String getgAlias() {
        return this.gAlias;
    }

    public void setGAlias(String value) {
        this.gAlias = value;
    }

    public String getgLicenseNo() {
        return this.gLicenseNo;
    }

    public void setGLicenseNo(String value) {
        this.gLicenseNo = value;
    }

    public String getgSpecifications() {
        return this.gSpecifications;
    }

    public void setGSpecifications(String value) {
        this.gSpecifications = value;
    }

    public String getgUnit() {
        return this.gUnit == null?"":this.gUnit;
    }

    public void setGUnit(String value) {
        this.gUnit = value;
    }

    public Integer getgMiddlePackage() {
        if(this.gMiddlePackage == null || this.gMiddlePackage.intValue() == 0) {
            this.gMiddlePackage = Integer.valueOf(1);
        }

        return this.gMiddlePackage;
    }

    public void setGMiddlePackage(Integer value) {
        this.gMiddlePackage = value;
    }

    public Integer getgBigPackage() {
        if(this.gBigPackage == null || this.gBigPackage.intValue() == 0) {
            this.gBigPackage = Integer.valueOf(1);
        }

        if(this.gBigPackage.intValue() < this.getgMiddlePackage().intValue()) {
            this.gBigPackage = this.getgMiddlePackage();
        }

        return this.gBigPackage;
    }

    public void setGBigPackage(Integer value) {
        this.gBigPackage = value;
    }

    public String getGManufacture() {
        return this.gManufacture == null?"":this.gManufacture;
    }

    public void setGManufacture(String value) {
        this.gManufacture = value;
    }

    public String getgManufactureCode() {
        if(StringUtil.isEmpty(this.gManufactureCode)) {
            String pinyin = "";


            return pinyin;
        } else {
            return this.gManufactureCode;
        }
    }

    public void setGManufactureCode(String value) {
        this.gManufactureCode = value;
    }

    public BigDecimal getgPrice() {
        return this.gPrice == null?BigDecimal.ZERO:this.gPrice;
    }

    public void setGPrice(BigDecimal value) {
        this.gPrice = value;
    }

    public BigDecimal getgBasePrice() {
        return this.gBasePrice;
    }

    public void setGBasePrice(BigDecimal value) {
        this.gBasePrice = value;
    }

    public BigDecimal getgCostPrice() {
        return this.gCostPrice == null?BigDecimal.ZERO:this.gCostPrice;
    }

    public void setGCostPrice(BigDecimal value) {
        this.gCostPrice = value;
    }

    public BigDecimal getgNumber() {
        return this.gNumber == null?BigDecimal.ZERO:this.gNumber;
    }

    public void setGNumber(BigDecimal value) {
        this.gNumber = value;
    }

    public BigDecimal getGRealnum() {
        return this.gRealnum == null?BigDecimal.ZERO:this.gRealnum;
    }

    public void setGRealnum(BigDecimal value) {
        this.gRealnum = value;
    }

    public String getgPurview() {
        return this.gPurview == null?"":this.gPurview;
    }

    public void setGPurview(String value) {
        this.gPurview = value;
    }

    public Integer getgCanSplit() {
        if(this.gCanSplit == null) {
            this.gCanSplit = Integer.valueOf(0);
        }

        return this.gCanSplit;
    }

    public void setGCanSplit(Integer value) {
        this.gCanSplit = value;
    }

    public String getgOrderCate() {
        return this.gOrderCate != null && !this.gOrderCate.equals("0")?this.gOrderCate:"";
    }

    public void setGOrderCate(String value) {
        this.gOrderCate = value;
    }

    public Integer getgArea() {
        return this.gArea == null?Integer.valueOf(0):this.gArea;
    }

    public void setGArea(Integer value) {
        this.gArea = value;
    }

    public Integer getgControl() {
        if(this.gControl == null) {
            this.gControl = Integer.valueOf(0);
        }

        return this.gControl;
    }

    public void setGControl(Integer value) {
        this.gControl = value;
    }

    public Integer getgStatus() {
        if(this.gStatus == null) {
            this.gStatus = Integer.valueOf(1);
        }

        return this.gStatus;
    }

    public void setGStatus(Integer value) {
        this.gStatus = value;
    }

    public BigDecimal getgTaxRate() {
        return this.gTaxRate;
    }

    public void setgTaxRate(BigDecimal gTaxRate) {
        this.gTaxRate = gTaxRate;
    }

    public BigDecimal getgConversionRate() {
        return this.gConversionRate;
    }

    public void setgConversionRate(BigDecimal gConversionRate) {
        this.gConversionRate = gConversionRate;
    }

    public String getgTaxRateCode() {
        return this.gTaxRateCode;
    }

    public void setgTaxRateCode(String gTaxRateCode) {
        this.gTaxRateCode = gTaxRateCode;
    }

    public String getgDosageName() {
        return this.gDosageName;
    }

    public void setgDosageName(String gDosageName) {
        this.gDosageName = gDosageName;
    }

    public Integer getPrimaryKey() {
        return this.gId;
    }

    public void setPrimaryKey(Integer primaryKey) {
        this.gId = primaryKey;
    }

    public String getErpPrimaryKey() {
        return this.gInSn;
    }

    public String sign() {
        StringBuilder sb = new StringBuilder();

        if(StringUtils.isNotEmpty(this.gInSn)) {
            sb.append(this.gInSn);
        }

        if(StringUtils.isNotEmpty(this.gSn)) {
            sb.append(this.gSn);
        }

        if(StringUtils.isNotEmpty(this.gBarCode)) {
            sb.append(this.gBarCode);
        }

        if(StringUtils.isNotEmpty(this.gName)) {
            sb.append(this.gName);
        }

        if(StringUtils.isNotEmpty(this.gNameCode)) {
            sb.append(this.gNameCode);
        }

        if(StringUtils.isNotEmpty(this.gAlias)) {
            sb.append(this.gAlias);
        }

        if(StringUtils.isNotEmpty(this.gLicenseNo)) {
            sb.append(this.gLicenseNo);
        }

        if(StringUtils.isNotEmpty(this.gSpecifications)) {
            sb.append(this.gSpecifications);
        }

        if(StringUtils.isNotEmpty(this.gUnit)) {
            sb.append(this.gUnit);
        }

        if(this.gMiddlePackage != null) {
            sb.append(this.gMiddlePackage);
        }

        if(this.gBigPackage != null) {
            sb.append(this.gBigPackage);
        }

        if(StringUtils.isNotEmpty(this.gManufacture)) {
            sb.append(this.gManufacture);
        }

        if(StringUtils.isNotEmpty(this.gManufactureCode)) {
            sb.append(this.gManufactureCode);
        }

        if(this.gPrice != null) {
            sb.append(this.gPrice);
        }

        if(this.gBasePrice != null) {
            sb.append(this.gBasePrice);
        }

        if(this.gCostPrice != null) {
            sb.append(this.gCostPrice);
        }

        if(this.gNumber != null) {
            sb.append(this.gNumber);
        }

        if(this.gRealnum != null) {
            sb.append(this.gRealnum);
        }

        if(StringUtils.isNotEmpty(this.gPurview)) {
            sb.append(this.gPurview);
        }

        if(StringUtils.isNotEmpty(this.gSecondPurview)) {
            sb.append(this.gSecondPurview);
        }

        if(StringUtils.isNotEmpty(this.gThirdPurview)) {
            sb.append(this.gThirdPurview);
        }

        if(this.gCanSplit != null) {
            sb.append(this.gCanSplit);
        }

        if(StringUtils.isNotEmpty(this.gOrderCate)) {
            sb.append(this.gOrderCate);
        }

        if(StringUtils.isNotEmpty(this.gOrderCateId)) {
            sb.append(this.gOrderCateId);
        }

        if(this.gArea != null) {
            sb.append(this.gArea);
        }

        if(this.gControl != null) {
            sb.append(this.gControl);
        }

        if(this.gStatus != null) {
            sb.append(this.gStatus);
        }

        if(this.gTaxRate != null) {
            sb.append(this.gTaxRate);
        }

        if(StringUtils.isNotEmpty(this.gTaxRateCode)) {
            sb.append(this.gTaxRateCode);
        }

        if(this.gConversionRate != null) {
            sb.append(this.gConversionRate);
        }

        if(StringUtils.isNotEmpty(this.gDosageName)) {
            sb.append(this.gDosageName);
        }

        String sign = MD5.md5(sb.toString());
        return sign;
    }

    public String getUniqueKey() {
        StringBuilder uk = new StringBuilder();

        if(StringUtils.isNotEmpty(this.gInSn)) {
            uk.append("-").append(this.gInSn);
        }

        return uk.toString();
    }

    public String getGSecondPurview() {
        return this.gSecondPurview;
    }

    public String getGThirdPurview() {
        return this.gThirdPurview;
    }

    public void setGSecondPurview(String gSecondPurview) {
        this.gSecondPurview = gSecondPurview;
    }

    public void setGThirdPurview(String gThirdPurview) {
        this.gThirdPurview = gThirdPurview;
    }

    public String getGOrderCateId() {
        return this.gOrderCateId;
    }

    public void setGOrderCateId(String gOrderCateId) {
        this.gOrderCateId = gOrderCateId;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getErplockKey() {
        return this.gInSn + "_" ;
    }
}
