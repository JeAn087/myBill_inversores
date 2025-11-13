package com.unicauca.edu.mybill.inversores.Infraestructura.Input.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicauca.edu.mybill.inversores.Aplicacion.Input.InfraGestionEmpresas;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Empresa;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Factura;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTORespuesta.DTOEmpresaRespuesta;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTORespuesta.DTOFacturaRespuesta;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.InfraDomiMapper.EmpresaMapper;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.InfraDomiMapper.FacturaMapper;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    private final InfraGestionEmpresas gestionEmpresasService;
    private final EmpresaMapper mapeadorEmpresas;
    private final FacturaMapper mapeadorFacturas;

    public EmpresaController(InfraGestionEmpresas gestionEmpresasService, EmpresaMapper mapeadorEmpresas, FacturaMapper mapeadorFacturas) {
        this.gestionEmpresasService = gestionEmpresasService;
        this.mapeadorEmpresas = mapeadorEmpresas;
        this.mapeadorFacturas = mapeadorFacturas;
    }

    /**
     * Listar todas las empresas cuyo nombre comience con un patrón.
     */
    @GetMapping("/buscar")
    public ResponseEntity<List<DTOEmpresaRespuesta>> listarEmpresasPorNombre(@RequestParam("nombre") String nombre) {
        List<Empresa> empresasEncontradas = gestionEmpresasService.listarEmpresasConNombre(nombre);
        List<DTOEmpresaRespuesta> empresasResponse = empresasEncontradas.stream()
                .map(mapeadorEmpresas::empresaADtoEmpresaRespuesta)
                .toList();

        return new ResponseEntity<>(empresasResponse, HttpStatus.OK);
    }

    /**
     * Obtener una empresa por su NIT
     */
    @GetMapping("/getEmpresa/{nit}")
    public ResponseEntity<DTOEmpresaRespuesta> getEmpresaById(@PathVariable Long nit) {
        Empresa empresaEncontrada = gestionEmpresasService.getEmpresaById(nit);
        DTOEmpresaRespuesta empresaResponse = mapeadorEmpresas.empresaADtoEmpresaRespuesta(empresaEncontrada);

        return new ResponseEntity<>(empresaResponse, HttpStatus.OK);
    }

    /**
     * Listar todas las facturas emitidas por una empresa
     */
    @GetMapping("/{nit}/facturasEmitidas")
    public ResponseEntity<List<DTOFacturaRespuesta>> listarFacturasEmitidas(@PathVariable Long nit) {
        List<Factura> facturasEmitidas = gestionEmpresasService.listarFacturasEmitidas(nit);
        List<DTOFacturaRespuesta> facturasResponse = facturasEmitidas.stream()
                .map(mapeadorFacturas::FacturaADTOFacturaRespuesta)
                .toList();

        return new ResponseEntity<>(facturasResponse, HttpStatus.OK);
    }

    /**
     * Listar todas las facturas por pagar de una empresa
     */
    @GetMapping("/{nit}/facturasPorPagar")
    public ResponseEntity<List<DTOFacturaRespuesta>> listarFacturasPorPagar(@PathVariable Long nit) {
        List<Factura> facturasPorPagar = gestionEmpresasService.listarFacturasPorPagar(nit);
        List<DTOFacturaRespuesta> facturasResponse = facturasPorPagar.stream()
                .map(mapeadorFacturas::FacturaADTOFacturaRespuesta)
                .toList();

        return new ResponseEntity<>(facturasResponse, HttpStatus.OK);
    }
}
