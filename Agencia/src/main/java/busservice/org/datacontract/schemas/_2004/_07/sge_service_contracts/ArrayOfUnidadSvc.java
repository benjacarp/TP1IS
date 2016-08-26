
package org.datacontract.schemas._2004._07.sge_service_contracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfUnidadSvc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnidadSvc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnidadSvc" type="{http://schemas.datacontract.org/2004/07/SGE.Service.Contracts.Data}UnidadSvc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnidadSvc", propOrder = {
    "unidadSvc"
})
public class ArrayOfUnidadSvc {

    @XmlElement(name = "UnidadSvc", nillable = true)
    protected List<UnidadSvc> unidadSvc;

    /**
     * Gets the value of the unidadSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidadSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnidadSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnidadSvc }
     * 
     * 
     */
    public List<UnidadSvc> getUnidadSvc() {
        if (unidadSvc == null) {
            unidadSvc = new ArrayList<UnidadSvc>();
        }
        return this.unidadSvc;
    }

}
