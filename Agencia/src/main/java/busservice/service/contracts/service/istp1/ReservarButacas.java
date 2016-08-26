
package service.contracts.service.istp1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="butacas" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
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
    "codigo",
    "unidad",
    "butacas"
})
@XmlRootElement(name = "ReservarButacas")
public class ReservarButacas {

    @XmlElementRef(name = "codigo", namespace = "http://ISTP1.Service.Contracts.Service", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigo;
    protected Integer unidad;
    @XmlElementRef(name = "butacas", namespace = "http://ISTP1.Service.Contracts.Service", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> butacas;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigo(JAXBElement<String> value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnidad(Integer value) {
        this.unidad = value;
    }

    /**
     * Obtiene el valor de la propiedad butacas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getButacas() {
        return butacas;
    }

    /**
     * Define el valor de la propiedad butacas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setButacas(JAXBElement<ArrayOfint> value) {
        this.butacas = value;
    }

}
