
package ml.yidreamc.upcpay.net.ruijieservice;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://api.spl.ruijie.com/}queryOnlineDetailResultV2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_return"
})
@XmlRootElement(name = "queryOnlineDetailResponseV2")
public class QueryOnlineDetailResponseV2 {

    @XmlElement(name = "return")
    protected QueryOnlineDetailResultV2 _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QueryOnlineDetailResultV2 }
     *     
     */
    public QueryOnlineDetailResultV2 getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOnlineDetailResultV2 }
     *     
     */
    public void setReturn(QueryOnlineDetailResultV2 value) {
        this._return = value;
    }

}
