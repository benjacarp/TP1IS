
package org.datacontract.schemas._2004._07.sge_service_contracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BusServiceFault complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusServiceFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusServiceFault", namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Faults", propOrder = {
    "errorMessage"
})
public class BusServiceFault {

    @XmlElementRef(name = "ErrorMessage", namespace = "http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Faults", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMessage;

    /**
     * Obtiene el valor de la propiedad errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define el valor de la propiedad errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = value;
    }

}
