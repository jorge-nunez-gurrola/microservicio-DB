package com.example.Microservice_OAD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Microservice_OAD.model.entidadDB;
import com.example.Microservice_OAD.service.entidadDBService;

@SpringBootApplication
@RestController
public class MicroserviceOadApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOadApplication.class, args);
	}

	@Autowired
	private entidadDBService service;

	@PostMapping("/addEmpleado")
	public entidadDB addEmpleado(@RequestBody entidadDB empleado){
		return service.saveEmpleado(empleado);
	}

	@PostMapping("/addEmpleados")
	public java.util.List<entidadDB> addEmpleados(@RequestBody java.util.List<entidadDB> empleados){
		return service.saveEmpleados(empleados);
	}

	@GetMapping("/empleados")
	public java.util.List<entidadDB> findEmpleados() {
		return service.getEmpleados();
	}

	@GetMapping("/empleadoPorId/{id}")
	public entidadDB findEmpleadoPorId(@PathVariable int empId){
		return service.getEmpleadoId(empId);
	}

	@PutMapping("/update")
	public entidadDB updateEmpleado(@RequestBody entidadDB empleado){
		return service.updateEmpleado(empleado);
	}


}
