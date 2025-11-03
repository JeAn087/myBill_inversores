package com.unicauca.edu.mybill.inversores.Infraestructura.Input.InfraDomiMapper;

import com.unicauca.edu.mybill.inversores.Common.TipoPersonaEnum;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Pagador;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTOPeticion.DTOPagadorPeticion;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTORespuesta.DTOPagadorRespuesta;

public class PagadorMapper {

    public Pagador DTOPagadorAPagador(DTOPagadorPeticion prmPagadorPeticion)
    {
        if(prmPagadorPeticion == null) return null;

        Pagador pagadorReturn = new Pagador();
        pagadorReturn.setIdPagador(prmPagadorPeticion.getIdPagador());
        pagadorReturn.setNombrePagador(prmPagadorPeticion.getNombrePagador());
        pagadorReturn.setCedulaPagador(prmPagadorPeticion.getCedulaPagador());
        pagadorReturn.setTipoPersona(TipoPersonaEnum.valueOf(prmPagadorPeticion.getTipoPersona()));
        
        return pagadorReturn;
    }

    public DTOPagadorRespuesta DTPPagadorAPagador(Pagador prmPagador)
    {
        if (prmPagador == null) {
            return null;
        }

        DTOPagadorRespuesta pagadorDTOReturn = new DTOPagadorRespuesta();
        pagadorDTOReturn.setIdPagador(prmPagador.getIdPagador());
        pagadorDTOReturn.setNombrePagador(prmPagador.getNombrePagador());
        pagadorDTOReturn.setCedulaPagador(prmPagador.getCedulaPagador());
        pagadorDTOReturn.setTipoPersona(prmPagador.getTipoPersona().toString());

        return pagadorDTOReturn;
    }

}
