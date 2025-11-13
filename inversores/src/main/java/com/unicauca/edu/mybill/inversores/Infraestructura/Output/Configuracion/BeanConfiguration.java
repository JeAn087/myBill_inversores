package com.unicauca.edu.mybill.inversores.Infraestructura.Output.Configuracion;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.unicauca.edu.mybill.inversores.Dominio.CasosDeUso.GestionCuposDom;
import com.unicauca.edu.mybill.inversores.Dominio.CasosDeUso.GestionEmpresasDom;
import com.unicauca.edu.mybill.inversores.Dominio.CasosDeUso.GestionFacturasDom;
import com.unicauca.edu.mybill.inversores.Dominio.CasosDeUso.GestionTransaccionesDom;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ConexionABD.GestionCuposBD;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ConexionABD.GestionEmpresasBD;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ConexionABD.GestionFacturasBD;
import com.unicauca.edu.mybill.inversores.Infraestructura.Output.Persistencia.ConexionABD.GestionTransaccionesBD;

/**
 * Clase encargada de la configuración de beans del dominio (output) en la aplicación
 */

@Configuration
public class BeanConfiguration {

    @Bean
    @Qualifier("gestionCuposDom")
    public GestionCuposDom gestionCuposDom(GestionCuposBD prmGestionCuposBD)
    {
        return new GestionCuposDom(prmGestionCuposBD);
    }

    @Bean
    @Qualifier("gestionFacturasDom")
    public GestionFacturasDom gestionFacturasDom(GestionFacturasBD prmFacturaBD)
    {
        return new GestionFacturasDom(prmFacturaBD);
    }


    @Bean
    @Qualifier("gestionTransaccionesDom")
    public GestionTransaccionesDom gestionTransaccionesDom(GestionTransaccionesBD prmTransaccionBD)
    {
        return new GestionTransaccionesDom(prmTransaccionBD);
    }

    @Bean
    @Qualifier("gestionEmpresasDom")
    public GestionEmpresasDom gestionEmpresasDom(GestionEmpresasBD prmEmpresaBD)
    {
        return new GestionEmpresasDom(prmEmpresaBD);
    }
}
