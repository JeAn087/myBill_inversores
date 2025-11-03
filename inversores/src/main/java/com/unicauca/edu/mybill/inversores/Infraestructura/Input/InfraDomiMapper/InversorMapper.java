package com.unicauca.edu.mybill.inversores.Infraestructura.Input.InfraDomiMapper;

import java.util.ArrayList;
import java.util.List;

import com.unicauca.edu.mybill.inversores.Common.TipoPersonaEnum;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Inversor;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOInversorPeticion;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTORespuesta.DTOInversorRespuesta;

public class InversorMapper {


    /**
     * Mapea un objeto DTO petición a uno del modelo del dominio
     * @param prmDTOInversorPeticion
     * @return
     */
    public Inversor DTOInversorPeticionaInversor(DTOInversorPeticion prmDTOInversorPeticion)
    {
        if(prmDTOInversorPeticion == null) return null;

        Inversor inversorReturn = new Inversor();
        inversorReturn.setIdInversor(prmDTOInversorPeticion.getIdInversor());
        inversorReturn.setNombreInversor(prmDTOInversorPeticion.getNombreInversor());
        inversorReturn.setCedulaInversor(prmDTOInversorPeticion.getCedulaInversor());
        inversorReturn.setTipoPersona(TipoPersonaEnum.valueOf(prmDTOInversorPeticion.getTipoPersona()));

        return inversorReturn;
    }

    public DTOInversorRespuesta InversoraDTOInversorRespuesta(Inversor prmInversor)
    {
        if(prmInversor == null) return null;

        DTOInversorRespuesta dtoInversorRespuesta = new DTOInversorRespuesta();
        dtoInversorRespuesta.setIdInversor(prmInversor.getIdInversor());
        dtoInversorRespuesta.setNombreInversor(prmInversor.getNombreInversor());
        dtoInversorRespuesta.setCedulaInversor(prmInversor.getCedulaInversor());
        dtoInversorRespuesta.setTipoPersona(prmInversor.getTipoPersona().toString());

        return dtoInversorRespuesta;
    }

    public List<DTOInversorRespuesta> listInversorADTORespuesta(List<Inversor> prmListInversor)
    {
        if(prmListInversor == null) return null;

        List<DTOInversorRespuesta> listDTOInversorRespuesta = new ArrayList<>();

        for (Inversor objInversor : prmListInversor) {
            listDTOInversorRespuesta.add(this.InversoraDTOInversorRespuesta(objInversor));
        }

        return listDTOInversorRespuesta;
    }

}
