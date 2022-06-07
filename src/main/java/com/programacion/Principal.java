package com.programacion;

import com.programacion.servicios.Operaciones;
import com.programacion.servicios.ServicioLog;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class Principal {

    public static void main(String[] args) {
        //crear el contenedor
        SeContainer container = SeContainerInitializer
                .newInstance()
                .initialize();

        Instance<Operaciones> obj = container.select(Operaciones.class);
        Operaciones servicio = obj.get();
        
        //invocar el metodo

        int ret = servicio.sumar(2, 9);

        System.out.printf("El resultado es : %d\n", ret);



    }

}
