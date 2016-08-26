
package service.contracts.service.istp1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfCiudadSvc;


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
 *         &lt;element name="ObtenerCiudadesResult" type="{http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data}ArrayOfCiudadSvc" minOccurs="0"/>
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
    "obtenerCiudadesResult"
})
@XmlRootElement(name = "ObtenerCiudadesResponse")
public class ObtenerCiudadesResponse {

    @XmlElementRef(name = "ObtenerCiudadesResult", namespace = "http://ISTP1.Service.Contracts.Service", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCiudadSvc> obtenerCiudadesResult;

    /**
     * Obtiene el valor de la propiedad obtenerCiudadesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCiudadSvc }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCiudadSvc> getObtenerCiudadesResult() {
        return obtenerCiudadesResult;
    }

    /**
     * Define el valor de la propiedad obtenerCiudadesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCiudadSvc }{@code >}
     *     
     */
    public void setObtenerCiudadesResult(JAXBElement<ArrayOfCiudadSvc> value) {
        this.obtenerCiudadesResult = value;
    }

}
