package com.unicauca.edu.mybill.inversores.Infraestructura.Input.InfraDomiMapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Factura;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOFacturaPeticion;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTORespuesta.DTOFacturaRespuesta;

/**
 * Mapper del objeto de Datos Factura DTO a Factura de Dominio y viceversa.
 * @author Jeison Andrés Vallejo Gómez
 */

@Component("facturaInfraMapper")
public class FacturaMapper {

    /**
     * Mapea un objeto DTO petición a uno del modelo del dominio
     * @param prmFacturaPeticion
     * @return
     */
    public Factura dtoFacturaPeticionAFactura(DTOFacturaPeticion prmFacturaPeticion)
    {
        if(prmFacturaPeticion == null) return null; 

        Factura facturaReturn = new Factura();

        facturaReturn.setIdFactura(prmFacturaPeticion.getIdFactura());
        facturaReturn.setFechaVencimiento(prmFacturaPeticion.getFechaVencimiento());
        facturaReturn.setEstado(prmFacturaPeticion.getEstado());
        facturaReturn.setFechaCreacion(prmFacturaPeticion.getFechaCreacion());
        facturaReturn.setDirFacura(prmFacturaPeticion.getDirFacura());
        facturaReturn.setDirEnvio(prmFacturaPeticion.getDirEnvio());
        facturaReturn.setTotal(prmFacturaPeticion.getTotal());

        return facturaReturn;
    }


    /**
     * Mapea un objeto del dominio a un objeto de respuesta que aceptará el front
     * @param prmFactura
     * @return
     */
    public DTOFacturaRespuesta FacturaADTOFacturaRespuesta(Factura prmFactura)
    {
        if(prmFactura == null) return null; 

        DTOFacturaRespuesta DTOFacturaRespuesta = new DTOFacturaRespuesta();

        DTOFacturaRespuesta.setIdFactura(prmFactura.getIdFactura());
        DTOFacturaRespuesta.setFechaVencimiento(prmFactura.getFechaVencimiento());
        DTOFacturaRespuesta.setEstado(prmFactura.getEstado());
        DTOFacturaRespuesta.setFechaCreacion(prmFactura.getFechaCreacion());
        DTOFacturaRespuesta.setDirFacura(prmFactura.getDirFacura());
        DTOFacturaRespuesta.setDirEnvio(prmFactura.getDirEnvio());
        DTOFacturaRespuesta.setTotal(prmFactura.getTotal());
        DTOFacturaRespuesta.setEmpresaEmisoraName(prmFactura.getEmpresaEmisoraName());
        DTOFacturaRespuesta.setEmpresaPagadoraName(prmFactura.getEmpresaPagadoraName());

        return DTOFacturaRespuesta;
    }

    /**
     * Mapea una lista de objetos del dominio a una lista de objetos aceptados por el front
     * @param listaFacturas
     * @return
     */
    public List<DTOFacturaRespuesta> listaFacturaADtoFacturaRespuesta(List<Factura> listaFacturas)
    {
        if (listaFacturas == null) return null;
        
        List<DTOFacturaRespuesta> listDTOFacturasRespuesta = new ArrayList<>();
        
        for (Factura objFactura : listaFacturas) {//Recorrer la lista del dominio que llega por parámetro
            listDTOFacturasRespuesta.add(this.FacturaADTOFacturaRespuesta(objFactura));//Llamado al mapeo individual y agregarlos a la lista a retornar
        }
        return listDTOFacturasRespuesta;
    }

}
