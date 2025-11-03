package com.unicauca.edu.mybill.inversores.Infraestructura.Input.InfraDomiMapper;

import org.springframework.stereotype.Component;

import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Cupo;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOCupoPeticion;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTORespuesta.DTOCupoRespuesta;

/**
 * Mapper del objeto de Datos Cupo DTO a Cupo de Dominio y viceversa.
 * @author Jeison Andrés Vallejo Gómez
 */

@Component
public class CupoMapper {

    public Cupo cupoDTOPeticionaCupo(DTOCupoPeticion prmCupoPeticion)
    {
        if (prmCupoPeticion == null) return null; //Si no llega un tipo DTO, retorna nulo.
        
        Cupo cupoReturn = new Cupo();

        cupoReturn.setIdCupo(prmCupoPeticion.getIdCupo());
        cupoReturn.setTipoCupo(prmCupoPeticion.getTipoCupo());
        cupoReturn.setValorCupo(prmCupoPeticion.getValorCupo());
        
        return cupoReturn;
    }

    public DTOCupoRespuesta cupoaDTORespuesta(Cupo prmCupo)
    {
        if(prmCupo == null) return null; //Si no llega un tipo Dominio, retorna nulo.

        //Pasar los cupos a 
        DTOCupoRespuesta cupoRespuestaReturn = new DTOCupoRespuesta();
        cupoRespuestaReturn.setIdCupo(prmCupo.getIdCupo());
        cupoRespuestaReturn.setTipoCupo(prmCupo.getTipoCupo().toString());
        cupoRespuestaReturn.setValorCupo(prmCupo.getValorCupo());

        return cupoRespuestaReturn;
    }


}
