package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ModelMapper;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Mapeador entre aplicación y dominio
 * Mapea de Entity a clases del dominio y viceversa
 */


@Configuration
public class modelMapper {
    @Bean
    public ModelMapper crearMapper() {
        ModelMapper modelMapper = new ModelMapper();

        //No sobrescribir valores con null
        modelMapper.getConfiguration()
                .setSkipNullEnabled(true)
                .setPropertyCondition(Conditions.isNotNull());

        //Evitar reemplazar objetos anidados existentes
        modelMapper.getConfiguration()
                .setAmbiguityIgnored(true);

        return modelMapper;
    }
}
