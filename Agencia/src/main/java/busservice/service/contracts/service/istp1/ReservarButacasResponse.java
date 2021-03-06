
package service.contracts.service.istp1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.sge_service_contracts.Resultado;


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
 *         &lt;element name="ReservarButacasResult" type="{http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data}Resultado" minOccurs="0"/>
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
    "reservarButacasResult"
})
@XmlRootElement(name = "ReservarButacasResponse")
public class ReservarButacasResponse {

    @XmlElementRef(name = "ReservarButacasResult", namespace = "http://ISTP1.Service.Contracts.Service", type = JAXBElement.class, required = false)
    protected JAXBElement<Resultado> reservarButacasResult;

    /**
     * Obtiene el valor de la propiedad reservarButacasResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Resultado }{@code >}
     *     
     */
    public JAXBElement<Resultado> getReservarButacasResult() {
        return reservarButacasResult;
    }

    /**
     * Define el valor de la propiedad reservarButacasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Resultado }{@code >}
     *     
     */
    public void setReservarButacasResult(JAXBElement<Resultado> value) {
        this.reservarButacasResult = value;
    }

}
