
package service.contracts.service.istp1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfUnidadSvc;


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
 *         &lt;element name="ObtenerUnidadesResult" type="{http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data}ArrayOfUnidadSvc" minOccurs="0"/>
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
    "obtenerUnidadesResult"
})
@XmlRootElement(name = "ObtenerUnidadesResponse")
public class ObtenerUnidadesResponse {

    @XmlElementRef(name = "ObtenerUnidadesResult", namespace = "http://ISTP1.Service.Contracts.Service", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUnidadSvc> obtenerUnidadesResult;

    /**
     * Obtiene el valor de la propiedad obtenerUnidadesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnidadSvc }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUnidadSvc> getObtenerUnidadesResult() {
        return obtenerUnidadesResult;
    }

    /**
     * Define el valor de la propiedad obtenerUnidadesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUnidadSvc }{@code >}
     *     
     */
    public void setObtenerUnidadesResult(JAXBElement<ArrayOfUnidadSvc> value) {
        this.obtenerUnidadesResult = value;
    }

}
