
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfButacaSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfCiudadSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfUnidadSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.Resultado;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IBusService", targetNamespace = "http://ISTP1.Service.Contracts.Service")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class,
    org.datacontract.schemas._2004._07.sge_service_contracts.ObjectFactory.class,
    service.contracts.service.istp1.ObjectFactory.class
})
public interface IBusService {


    /**
     * 
     * @param codigo
     * @return
     *     returns org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfCiudadSvc
     * @throws IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage
     */
    @WebMethod(operationName = "ObtenerCiudades", action = "http://ISTP1.Service.Contracts.Service/IBusService/ObtenerCiudades")
    @WebResult(name = "ObtenerCiudadesResult", targetNamespace = "http://ISTP1.Service.Contracts.Service")
    @RequestWrapper(localName = "ObtenerCiudades", targetNamespace = "http://ISTP1.Service.Contracts.Service", className = "service.contracts.service.istp1.ObtenerCiudades")
    @ResponseWrapper(localName = "ObtenerCiudadesResponse", targetNamespace = "http://ISTP1.Service.Contracts.Service", className = "service.contracts.service.istp1.ObtenerCiudadesResponse")
    public ArrayOfCiudadSvc obtenerCiudades(
        @WebParam(name = "codigo", targetNamespace = "http://ISTP1.Service.Contracts.Service")
        String codigo)
        throws IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage
    ;

    /**
     * 
     * @param codigo
     * @param ciudad
     * @return
     *     returns org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfUnidadSvc
     * @throws IBusServiceObtenerUnidadesBusServiceFaultFaultFaultMessage
     */
    @WebMethod(operationName = "ObtenerUnidades", action = "http://ISTP1.Service.Contracts.Service/IBusService/ObtenerUnidades")
    @WebResult(name = "ObtenerUnidadesResult", targetNamespace = "http://ISTP1.Service.Contracts.Service")
    @RequestWrapper(localName = "ObtenerUnidades", targetNamespace = "http://ISTP1.Service.Contracts.Service", className = "service.contracts.service.istp1.ObtenerUnidades")
    @ResponseWrapper(localName = "ObtenerUnidadesResponse", targetNamespace = "http://ISTP1.Service.Contracts.Service", className = "service.contracts.service.istp1.ObtenerUnidadesResponse")
    public ArrayOfUnidadSvc obtenerUnidades(
        @WebParam(name = "codigo", targetNamespace = "http://ISTP1.Service.Contracts.Service")
        String codigo,
        @WebParam(name = "ciudad", targetNamespace = "http://ISTP1.Service.Contracts.Service")
        Integer ciudad)
        throws IBusServiceObtenerUnidadesBusServiceFaultFaultFaultMessage
    ;

    /**
     * 
     * @param unidad
     * @param codigo
     * @return
     *     returns org.datacontract.schemas._2004._07.sge_service_contracts.Resultado
     * @throws IBusServiceVincularUnidadBusServiceFaultFaultFaultMessage
     */
    @WebMethod(operationName = "VincularUnidad", action = "http://ISTP1.Service.Contracts.Service/IBusService/VincularUnidad")
    @WebResult(name = "VincularUnidadResult", targetNamespace = "http://ISTP1.Service.Contracts.Service")
    @RequestWrapper(localName = "VincularUnidad", targetNamespace = "http://ISTP1.Service.Contracts.Service", className = "service.contracts.service.istp1.VincularUnidad")
    @ResponseWrapper(localName = "VincularUnidadResponse", targetNamespace = "http://ISTP1.Service.Contracts.Service", className = "service.contracts.service.istp1.VincularUnidadResponse")
    public Resultado vincularUnidad(
        @WebParam(name = "codigo", targetNamespace = "http://ISTP1.Service.Contracts.Service")
        String codigo,
        @WebParam(name = "unidad", targetNamespace = "http://ISTP1.Service.Contracts.Service")
        Integer unidad)
        throws IBusServiceVincularUnidadBusServiceFaultFaultFaultMessage
    ;

    /**
     * 
     * @param unidad
     * @param codigo
     * @return
     *     returns org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfButacaSvc
     * @throws IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage
     */
    @WebMethod(operationName = "ObtenerButacas", action = "http://ISTP1.Service.Contracts.Service/IBusService/ObtenerButacas")
    @WebResult(name = "ObtenerButacasResult", targetNamespace = "http://ISTP1.Service.Contracts.Service")
    @RequestWrapper(localName = "ObtenerButacas", targetNamespace = "http://ISTP1.Service.Contracts.Service", className = "service.contracts.service.istp1.ObtenerButacas")
    @ResponseWrapper(localName = "ObtenerButacasResponse", targetNamespace = "http://ISTP1.Service.Contracts.Service", className = "service.contracts.service.istp1.ObtenerButacasResponse")
    public ArrayOfButacaSvc obtenerButacas(
        @WebParam(name = "codigo", targetNamespace = "http://ISTP1.Service.Contracts.Service")
        String codigo,
        @WebParam(name = "unidad", targetNamespace = "http://ISTP1.Service.Contracts.Service")
        Integer unidad)
        throws IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage
    ;

    /**
     * 
     * @param unidad
     * @param codigo
     * @param butacas
     * @return
     *     returns org.datacontract.schemas._2004._07.sge_service_contracts.Resultado
     * @throws IBusServiceReservarButacasBusServiceFaultFaultFaultMessage
     */
    @WebMethod(operationName = "ReservarButacas", action = "http://ISTP1.Service.Contracts.Service/IBusService/ReservarButacas")
    @WebResult(name = "ReservarButacasResult", targetNamespace = "http://ISTP1.Service.Contracts.Service")
    @RequestWrapper(localName = "ReservarButacas", targetNamespace = "http://ISTP1.Service.Contracts.Service", className = "service.contracts.service.istp1.ReservarButacas")
    @ResponseWrapper(localName = "ReservarButacasResponse", targetNamespace = "http://ISTP1.Service.Contracts.Service", className = "service.contracts.service.istp1.ReservarButacasResponse")
    public Resultado reservarButacas(
        @WebParam(name = "codigo", targetNamespace = "http://ISTP1.Service.Contracts.Service")
        String codigo,
        @WebParam(name = "unidad", targetNamespace = "http://ISTP1.Service.Contracts.Service")
        Integer unidad,
        @WebParam(name = "butacas", targetNamespace = "http://ISTP1.Service.Contracts.Service")
        ArrayOfint butacas)
        throws IBusServiceReservarButacasBusServiceFaultFaultFaultMessage
    ;

}
