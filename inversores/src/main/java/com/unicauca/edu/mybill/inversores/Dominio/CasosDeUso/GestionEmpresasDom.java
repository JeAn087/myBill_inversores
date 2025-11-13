package com.unicauca.edu.mybill.inversores.Dominio.CasosDeUso;

import java.util.List;

import com.unicauca.edu.mybill.inversores.Aplicacion.Input.InfraGestionEmpresas;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Empresa;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Factura;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ConexionABD.GestionEmpresasBD;

public class GestionEmpresasDom implements InfraGestionEmpresas{

    private final GestionEmpresasBD gestionEmpresasBD;
    
    public GestionEmpresasDom(GestionEmpresasBD gestionEmpresasBD) {
        this.gestionEmpresasBD = gestionEmpresasBD;
    }

    @Override
    public List<Empresa> listarEmpresasConNombre(String prmEmpresaName) {
        return this.gestionEmpresasBD.listarEmpresasConNombre(prmEmpresaName);
    }

    @Override
    public Empresa getEmpresaById(Long id) {
        return this.gestionEmpresasBD.getEmpresaById(id);
    }

    @Override
    public List<Factura> listarFacturasEmitidas(Long prmEmpresaNit) {
        return this.gestionEmpresasBD.listarFacturasEmitidas(prmEmpresaNit);
    }

    @Override
    public List<Factura> listarFacturasPorPagar(Long prmEmpresaNit) {
        return this.gestionEmpresasBD.listarFacturasPorPagar(prmEmpresaNit);
    }

}
