package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ConexionABD;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import com.unicauca.edu.mybill.inversores.Aplicacion.Output.DomGestionFacturas;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Factura;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Repositorios.FacturasRepository;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.FacturaEntity;

@Service
public class GestionFacturasBD implements DomGestionFacturas {

    private final FacturasRepository atrFacturaRespository;
    private final ModelMapper facturaMapper;

    public GestionFacturasBD(FacturasRepository atrFacturaRespository, ModelMapper facturaMapper) {
        this.atrFacturaRespository = atrFacturaRespository;
        this.facturaMapper = facturaMapper;
    }

    @Override
    public Factura getFacturaById(Long id) {
        FacturaEntity objFacturaOnDB = this.atrFacturaRespository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se ha encontrado la factura con el ID: "+id));
        Factura facturaReturn = this.facturaMapper.map(objFacturaOnDB, Factura.class);
        return facturaReturn;
    }

    @Override
    public List<Factura> getAllFacturas() {
        Iterable<FacturaEntity> facturasOnBD = this.atrFacturaRespository.findAll();
        List<Factura> facturasReturn = this.facturaMapper.map(facturasOnBD, new TypeToken<List<Factura>>(){}.getType());
        return facturasReturn;
    }

}
