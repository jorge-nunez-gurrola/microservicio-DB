package com.example.Microservice_OAD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Microservice_OAD.model.entidadDB;
import com.example.Microservice_OAD.repository.entidadDBRepository;

@Service
public class entidadDBService {
    @Autowired
    private entidadDBRepository repository;

    public entidadDB saveEmpleado(entidadDB empleado) {
        return repository.save(empleado);
    }    

    public List<entidadDB> saveEmpleados(List<entidadDB> empleados) {
        return repository.saveAll(empleados);
    }

    public List<entidadDB> getEmpleados() {
        return repository.findAll();
    }

    public entidadDB getEmpleadoId(int empId) {
        return repository.findById(empId).orElse(null);
    }

    public entidadDB updateEmpleado(entidadDB empleado){
        entidadDB existeEmpleado = repository.findById(empleado.getEmpId()).orElse(null);
        existeEmpleado.setNombre(empleado.getNombre());
        existeEmpleado.setApellido(empleado.getApellido());
        existeEmpleado.setCorreo(empleado.getCorreo());
        return repository.save(existeEmpleado);
    }

}
