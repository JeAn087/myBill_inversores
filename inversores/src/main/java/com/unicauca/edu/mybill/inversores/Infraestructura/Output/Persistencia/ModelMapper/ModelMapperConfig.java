package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ModelMapper;

import org.modelmapper.Conditions;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.unicauca.edu.mybill.inversores.Dominio.Modelos.Factura;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.FacturaEntity;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.Tablas.EmpresaEntity;

/**
 * Configuración central de ModelMapper.
 * Define mapeos específicos entre entidades y modelos del dominio.
 */
@Configuration
public class ModelMapperConfig {

    /**
     * Mapper para la entidad Empresa ↔ modelo Empresa.
     */
    @Bean(name = "empresaModelMapper")
    public ModelMapper empresaMapper() {
        ModelMapper mapper = new ModelMapper();

        mapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setSkipNullEnabled(true)
                .setPropertyCondition(Conditions.isNotNull());

        return mapper;
    }

    /**
     * Mapper para la entidad Factura ↔ modelo Factura.
     * Mapea únicamente los nombres de las empresas emisora y pagadora.
     * Evita problemas de null y relaciones circulares.
     */
    @Bean(name = "facturaModelMapper")
    public ModelMapper facturaMapper() {
        ModelMapper mapper = new ModelMapper();

        mapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setSkipNullEnabled(true)
                .setPropertyCondition(Conditions.isNotNull());

        // Converter seguro: EmpresaEntity -> String (empresaName)
        Converter<EmpresaEntity, String> empresaToName = ctx ->
                ctx.getSource() != null ? ctx.getSource().getEmpresaName() : null;

        // FACTURA ENTITY → FACTURA (solo nombres de empresas) usando el converter
        mapper.typeMap(FacturaEntity.class, Factura.class).addMappings(m -> {
            m.using(empresaToName).map(src -> src.getEmpresaEmisora(), Factura::setEmpresaEmisoraName);
            m.using(empresaToName).map(src -> src.getEmpresaPagadora(), Factura::setEmpresaPagadoraName);
        });

        // FACTURA → FACTURA ENTITY (evita recursión)
        mapper.addMappings(new PropertyMap<Factura, FacturaEntity>() {
            @Override
            protected void configure() {
                skip(destination.getEmpresaEmisora());
                skip(destination.getEmpresaPagadora());
            }
        });

        return mapper;
    }
}