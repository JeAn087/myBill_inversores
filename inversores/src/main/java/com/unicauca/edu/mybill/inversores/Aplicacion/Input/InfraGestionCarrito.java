package com.unicauca.edu.mybill.inversores.Aplicacion.Input;

import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.*;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Repositorios.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InfraGestionCarrito {
    private final CarritoTemporalRepository carritoRepo;
    private final FacturasRepository facturaRepo;

    public InfraGestionCarrito(CarritoTemporalRepository carritoRepo,
                               FacturasRepository facturaRepo) {
        this.carritoRepo = carritoRepo;
        this.facturaRepo = facturaRepo;
    }

    // ✅ Agregar factura sin inversor (modo de prueba)
    public void agregarFactura(Long idFactura) {
        FacturaEntity factura = facturaRepo.findById(idFactura)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Factura no encontrada"));

        // Evitar duplicados
        boolean yaExiste = carritoRepo.findAll().stream()
                .anyMatch(c -> c.getFactura().getIdFactura().equals(idFactura));

        if (yaExiste) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "La factura ya está en el carrito");
        }

        CarritoTemporalEntity nuevo = new CarritoTemporalEntity();
        nuevo.setFactura(factura);
        nuevo.setFechaAgregado(LocalDateTime.now());
        carritoRepo.save(nuevo);
    }

    // ✅ Obtener todas las facturas del carrito
    public List<CarritoTemporalEntity> obtenerCarrito() {
        return carritoRepo.findAll();
    }

    // ✅ Eliminar una factura del carrito
    public void eliminarFactura(Long idFactura) {
        List<CarritoTemporalEntity> actuales = carritoRepo.findAll();

        actuales.stream()
                .filter(c -> c.getFactura().getIdFactura().equals(idFactura))
                .findFirst()
                .ifPresent(c -> carritoRepo.deleteById(c.getIdCarrito()));
    }

    // ✅ Vaciar carrito completo
    public void vaciarCarrito() {
        carritoRepo.deleteAll();
    }
}
