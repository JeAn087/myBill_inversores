package com.unicauca.edu.mybill.inversores.Infraestructura.Input.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicauca.edu.mybill.inversores.Aplicacion.Input.InfraGestionFacturas;
import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Factura;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.DTORespuesta.DTOFacturaRespuesta;
import com.unicauca.edu.mybill.inversores.Infraestructura.Input.InfraDomiMapper.FacturaMapper;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/facturas")
public class FacturasController {

    private final InfraGestionFacturas gestionFacturasService;
    private final FacturaMapper mapeadorFacturas;

    public FacturasController(InfraGestionFacturas gestionFacturasService, FacturaMapper mapeadorFacturas) {
        this.gestionFacturasService = gestionFacturasService;
        this.mapeadorFacturas = mapeadorFacturas;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<DTOFacturaRespuesta>> getAllFacturas() {
        List<Factura> listaFacturasEncontradas = gestionFacturasService.getAllFacturas();
        List<DTOFacturaRespuesta> facturasResponse = mapeadorFacturas.listaFacturaADtoFacturaRespuesta(listaFacturasEncontradas);
        ResponseEntity<List<DTOFacturaRespuesta>> response = new ResponseEntity<>(facturasResponse, HttpStatus.OK);
        return response;
    }

    @GetMapping("/getFactura/{id}")
    public ResponseEntity<DTOFacturaRespuesta> getFacturaById(@PathVariable Long id) {
        Factura facturaEncontrada = gestionFacturasService.getFacturaById(id);
        DTOFacturaRespuesta facturaReturn = mapeadorFacturas.FacturaADTOFacturaRespuesta(facturaEncontrada);
        ResponseEntity<DTOFacturaRespuesta> response = new ResponseEntity<>(facturaReturn, HttpStatus.OK);
        return response;
    }
    
    

}
