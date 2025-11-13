package com.unicauca.edu.mybill.inversores.Aplicacion.Output;

import java.util.List;

import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Empresa;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Factura;

public interface DomGestionEmpresas {
    List<Empresa> listarEmpresasConNombre(String prmEmpresaName);

    Empresa getEmpresaById(Long id);

    List<Factura> listarFacturasEmitidas(Long prmEmpresaNit);

    List<Factura> listarFacturasPorPagar(Long prmEmpresaNit);
}
