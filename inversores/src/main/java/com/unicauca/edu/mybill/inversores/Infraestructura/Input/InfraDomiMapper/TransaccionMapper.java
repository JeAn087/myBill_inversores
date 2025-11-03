package com.unicauca.edu.mybill.inversores.Infraestructura.Input.InfraDomiMapper;

import java.sql.Date;

import com.unicauca.edu.mybill.inversores.Common.EstadoTransaccionesEnum;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Transaccion;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOTransaccionPeticion;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTORespuesta.DTOTransaccionRespuesta;

public class TransaccionMapper {
    public Transaccion deDTOTransaccionATransaccion(DTOTransaccionPeticion prmDtoTransaccionPeticion)
    {
        if (prmDtoTransaccionPeticion == null) return null;

        Transaccion transaccionReturn = new Transaccion();
        transaccionReturn.setId(prmDtoTransaccionPeticion.getId());
        prmDtoTransaccionPeticion.setOrigen(prmDtoTransaccionPeticion.getOrigen());
        transaccionReturn.setDestino(prmDtoTransaccionPeticion.getDestino());
        transaccionReturn.setFechaTransaccion(Date.valueOf(prmDtoTransaccionPeticion.getFechaTransaccion()));
        transaccionReturn.setMonto(prmDtoTransaccionPeticion.getMonto());
        transaccionReturn.setEstado(EstadoTransaccionesEnum.valueOf(prmDtoTransaccionPeticion.getEstado().toUpperCase()));

        return transaccionReturn;
    }

    public DTOTransaccionRespuesta deTransaccionADtoTransaccion(Transaccion prmTransaccion)
    {
        if (prmTransaccion == null) return null;

        DTOTransaccionRespuesta dtoTransaccionReturn = new DTOTransaccionRespuesta();
        dtoTransaccionReturn.setId(prmTransaccion.getId());
        prmTransaccion.setOrigen(prmTransaccion.getOrigen());
        dtoTransaccionReturn.setDestino(prmTransaccion.getDestino());
        dtoTransaccionReturn.setFechaTransaccion(prmTransaccion.getFechaTransaccion().toString());
        dtoTransaccionReturn.setMonto(prmTransaccion.getMonto());
        dtoTransaccionReturn.setEstado(prmTransaccion.getEstado().toString());

        return dtoTransaccionReturn;
    }
}
