package cn.xh.ad.test;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:hao.xu
 * @Email:hao.xu@rograndec.com
 * @Date: 2019/5/7
 * @Version:1.0
 */
public class XmlParseHandler extends DefaultHandler {

    private List<ErpGoods> erpGoodsList;
    private String         currentTag; // 记录当前解析到的节点名称
    private ErpGoods           erpGoods; // 记录当前的erpGoods

    /**
     * 文档解析结束后调用
     */
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    /**
     * 节点解析结束后调用
     * @param uri : 命名空间的uri
     * @param localName : 标签的名称
     * @param qName : 带命名空间的标签名称
     */
    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        super.endElement(uri, localName, qName);
        if("item".equals(qName)){
            erpGoods.setGCanSplit(0);
            erpGoodsList.add(erpGoods);
            erpGoods = null;
        }
        currentTag = null;
    }

    /**
     * 文档解析开始调用
     */
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        erpGoodsList = new ArrayList<>();
    }

    /**
     * 节点解析开始调用
     * @param uri : 命名空间的uri
     * @param localName : 标签的名称
     * @param qName : 带命名空间的标签名称
     */
    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if ("item".equals(qName)) { // 是一个节点开始
            erpGoods = new ErpGoods();
        }
        currentTag = qName; // 把当前标签记录下来
    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        super.characters(ch, start, length);
        String value = new String(ch,start,length); // 将当前TextNode转换为String
        switch (currentTag){
            case "ID":
                // 该节点为ID节点
                erpGoods.setGInSn(value);
                break;
            case "YPBH":
                // 该节点为YPBH节点
                erpGoods.setGSn(value);
                break;
            case "YPMC":
                // 该节点为YPMC节点
                erpGoods.setGName(value);
                break;
            case "YPDM":
                // 该节点为YPDM节点
                erpGoods.setGNameCode(value);
                break;
            case "GG":
                // 该节点为GG节点
                erpGoods.setGSpecifications(value);
                break;
            case "CDMC":
                // 该节点为CDMC节点
                erpGoods.setGManufacture(value);
                break;
            case "CDDM":
                // 该节点为CDDM节点
                erpGoods.setGManufactureCode(value);
                break;
            case "DW":
                // 该节点为DW节点
                erpGoods.setGUnit(value);
                break;
            case "DJ":
                // 该节点为DJ节点
                erpGoods.setGBasePrice(new BigDecimal(value));
                break;
            case "LSJ":
                // 该节点为LSJ节点
                erpGoods.setGPrice(new BigDecimal(value));
                break;
            case "PZWH":
                // 该节点为PZWH节点
                erpGoods.setGLicenseNo(value);
                break;
            case "JX":
                // 该节点为JX节点
                erpGoods.setgDosageName(value);
                break;
            case "NEWZBZ":
                // 该节点为NEWZBZ节点
                erpGoods.setGMiddlePackage(Integer.parseInt(value));
                break;
            case "SL":
                // 该节点为NEWZBZ节点
                erpGoods.setGNumber(new BigDecimal(value));
                break;
        }
//        if("ID".equals(currentTag)){
//            // 该节点为ID节点
//            erpGoods.setGInSn(value);
//        }else if("YPBH".equals(currentTag)){
//            // 该节点为YPBH节点
//            erpGoods.setGSn(value);
//        }else if("YPMC".equals(currentTag)){
//            // 该节点为YPMC节点
//            erpGoods.setGName(value);
//        }else if("YPDM".equals(currentTag)){
//            // 该节点为YPDM节点
//            erpGoods.setGNameCode(value);
//        }else if("GG".equals(currentTag)){
//            // 该节点为GG节点
//            erpGoods.setGSpecifications(value);
//        }else if("CDMC".equals(currentTag)){
//            // 该节点为CDMC节点
//            erpGoods.setGManufacture(value);
//        }else if("CDDM".equals(currentTag)){
//            // 该节点为CDDM节点
//            erpGoods.setGManufactureCode(value);
//        }else if("DW".equals(currentTag)){
//            // 该节点为DW节点
//            erpGoods.setGUnit(value);
//        }else if("DJ".equals(currentTag)){
//            // 该节点为DJ节点
//            erpGoods.setGBasePrice(new BigDecimal(value));
//        }else if("LSJ".equals(currentTag)){
//            // 该节点为LSJ节点
//            erpGoods.setGPrice(new BigDecimal(value));
//        }else if("PZWH".equals(currentTag)){
//            // 该节点为PZWH节点
//            erpGoods.setGLicenseNo(value);
//        }else if("JX".equals(currentTag)){
//            // 该节点为JX节点
//            erpGoods.setgDosageName(value);
//        }else if("NEWZBZ".equals(currentTag)){
//            // 该节点为NEWZBZ节点
//            erpGoods.setGMiddlePackage(Integer.parseInt(value));
//        }else if("SL".equals(currentTag)){
//            // 该节点为NEWZBZ节点
//            erpGoods.setGNumber(new BigDecimal(value));
//        }
    }

    public List<ErpGoods> getErpGoodsList() {
        return erpGoodsList;
    }


}
