package com.unicauca.edu.mybill.inversores.Infraestructura.Input.InfraDomiMapper;

import org.springframework.stereotype.Component;

import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Empresa;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOEmpresaPeticion;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTORespuesta.DTOEmpresaRespuesta;

/**
 * Mapper del objeto de Datos Empresa DTO a Empresa de Dominio y viceversa.
 * @author Jeison Andrés Vallejo Gómez
 */

@Component("empresa InfraMapper")
public class EmpresaMapper {

    public Empresa empresaDTOPeticionaEmpresa(DTOEmpresaPeticion prmDtoEmpresaPeticion)
    {
        if (prmDtoEmpresaPeticion == null) return null;//Si no llega el tipo DTO, retorna nulo.

        Empresa empresaReturn = new Empresa();
        empresaReturn.setIdNit(prmDtoEmpresaPeticion.getIdNit());
        empresaReturn.setDireccionDomicilio(prmDtoEmpresaPeticion.getDireccionDomicilio());
        empresaReturn.setDepartamentoDomicilio(prmDtoEmpresaPeticion.getDepartamentoDomicilio());
        empresaReturn.setCiudadDomicilio(prmDtoEmpresaPeticion.getCiudadDomicilio());
        empresaReturn.setPais(prmDtoEmpresaPeticion.getPais());
        empresaReturn.setCelular(prmDtoEmpresaPeticion.getCelular());
        empresaReturn.setEmail(prmDtoEmpresaPeticion.getEmail());
        empresaReturn.setNumeroCuenta(prmDtoEmpresaPeticion.getNumeroCuenta());
        empresaReturn.setEmpresaName(prmDtoEmpresaPeticion.getEmpresaName());

        return empresaReturn;
    }

    public DTOEmpresaRespuesta empresaADtoEmpresaRespuesta(Empresa prmEmpresa)
    {
        if(prmEmpresa == null) return null;

        DTOEmpresaRespuesta dtoEmpresaRespuestaReturn = new DTOEmpresaRespuesta();
        dtoEmpresaRespuestaReturn.setIdNit(prmEmpresa.getIdNit());
        dtoEmpresaRespuestaReturn.setDireccionDomicilio(prmEmpresa.getDireccionDomicilio());
        dtoEmpresaRespuestaReturn.setDepartamentoDomicilio(prmEmpresa.getDepartamentoDomicilio());
        dtoEmpresaRespuestaReturn.setCiudadDomicilio(prmEmpresa.getCiudadDomicilio());
        dtoEmpresaRespuestaReturn.setPais(prmEmpresa.getPais());
        dtoEmpresaRespuestaReturn.setCelular(prmEmpresa.getCelular());
        dtoEmpresaRespuestaReturn.setEmail(prmEmpresa.getEmail());
        dtoEmpresaRespuestaReturn.setNumeroCuenta(prmEmpresa.getNumeroCuenta());
        dtoEmpresaRespuestaReturn.setEmpresaName(prmEmpresa.getEmpresaName());

        return dtoEmpresaRespuestaReturn;
    }

}
