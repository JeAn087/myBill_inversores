package com.unicauca.edu.mybill.inversores.Infraestructura.Input.Controllers;

import com.unicauca.edu.mybill.inversores.Aplicacion.Input.InfraGestionCarrito;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.CarritoTemporalEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/carrito")
@CrossOrigin(origins = "http://localhost:5173")
public class CarritoController {

    private final InfraGestionCarrito carritoService;

    public CarritoController(InfraGestionCarrito carritoService) {
        this.carritoService = carritoService;
    }

    @PostMapping("/agregar/{idFactura}")
    public void agregarFactura(@PathVariable Long idFactura) {
        carritoService.agregarFactura(idFactura);
    }

    @GetMapping
    public List<CarritoTemporalEntity> obtenerCarrito() {
        return carritoService.obtenerCarrito();
    }

    @DeleteMapping("/{idFactura}")
    public void eliminarFactura(@PathVariable Long idFactura) {
        carritoService.eliminarFactura(idFactura);
    }

    @DeleteMapping("/vaciar")
    public void vaciarCarrito() {
        carritoService.vaciarCarrito();
    }
}
