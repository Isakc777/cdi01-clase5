
package com.programacion.config;

import com.programacion.servicios.ServicioLog;
import com.programacion.servicios.ServicioLogImpl;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

    @ApplicationScoped
    public class AppConfig {


        // public class ServicioLogProducer {// este componente sirve como un factori para crear instancias de servicio log

        @Produces//si queremos que esto sea productor
        @ApplicationScoped
        public ServicioLog createLog(){
            System.out.println("PRODUCTOR ServicioLogProducer");
            return new ServicioLogImpl(); //retorna una instancia del componente q vamos a crear
        }
    }


