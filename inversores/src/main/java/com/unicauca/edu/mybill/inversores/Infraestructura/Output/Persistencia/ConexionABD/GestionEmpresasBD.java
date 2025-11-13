    package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ConexionABD;

    import java.util.List;

    import org.modelmapper.ModelMapper;
    import org.modelmapper.TypeToken;
    import org.springframework.beans.factory.annotation.Qualifier;
    import org.springframework.stereotype.Service;

    import com.unicauca.edu.mybill.inversores.Aplicacion.Output.DomGestionEmpresas;
    import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Empresa;
    import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Factura;
    import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Repositorios.EmpresaRepository;
    import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.EmpresaEntity;
    import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.FacturaEntity;

    @Service
    public class GestionEmpresasBD implements DomGestionEmpresas {

        private final EmpresaRepository empresaRepository;
        private final ModelMapper empresaMapper;
        private final ModelMapper facturaMapper;

        public GestionEmpresasBD(EmpresaRepository empresaRepository, @Qualifier("empresaModelMapper") ModelMapper empresaMapper, @Qualifier("facturaModelMapper") ModelMapper facturaMapper) {
            this.empresaRepository = empresaRepository;
            this.empresaMapper = empresaMapper;
            this.facturaMapper = facturaMapper;
        }

        /**
         * Lista todas las empresas cuyo nombre comience con el patrón dado.
         */
        @Override
        public List<Empresa> listarEmpresasConNombre(String prmEmpresaName) {
            if (prmEmpresaName == null || prmEmpresaName.isBlank()) {
                throw new IllegalArgumentException("El patrón de búsqueda no puede ser nulo o vacío");
            }

            List<EmpresaEntity> empresasOnDB = this.empresaRepository.buscarEmpresasPorPatron(prmEmpresaName);
            return this.empresaMapper.map(empresasOnDB, new TypeToken<List<Empresa>>() {}.getType());
        }

        /**
         * Obtiene una empresa por su ID (NIT)
         */
        @Override
        public Empresa getEmpresaById(Long id) {
            if (id == null) throw new IllegalArgumentException("El ID (NIT) de la empresa no puede ser nulo");

            EmpresaEntity empresaOnDB = this.empresaRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("No se encontró la empresa con NIT: " + id));

            return this.empresaMapper.map(empresaOnDB, Empresa.class);
        }

        /**
         * Lista todas las facturas emitidas por una empresa según su NIT.
         */
        @Override
        public List<Factura> listarFacturasEmitidas(Long prmEmpresaNit) {
            if (prmEmpresaNit == null) throw new IllegalArgumentException("El NIT de la empresa no puede ser nulo");

            List<FacturaEntity> facturasOnDB = this.empresaRepository.findFacturasEmitidasByEmpresaNit(prmEmpresaNit);
            return this.facturaMapper.map(facturasOnDB, new TypeToken<List<Factura>>() {}.getType());
        }

        /**
         * Lista todas las facturas por pagar de una empresa según su NIT.
         */
        @Override
        public List<Factura> listarFacturasPorPagar(Long prmEmpresaNit) {
            if (prmEmpresaNit == null) throw new IllegalArgumentException("El NIT de la empresa no puede ser nulo");

            List<FacturaEntity> facturasOnDB = this.empresaRepository.findFacturasPorPagarByEmpresaNit(prmEmpresaNit);
            return this.facturaMapper.map(facturasOnDB, new TypeToken<List<Factura>>() {}.getType());
        }
    }
