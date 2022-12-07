package com.ittg.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {
	// http://localhost:8080/controladores
	
	private final EmpleadoRepository repository;

	EmpleadoController(EmpleadoRepository repository) {
		this.repository = repository;
	}

	@PostMapping("/empleados")
	Empleado crear(@RequestBody Empleado nuevoEmpleado) {
		return repository.save(nuevoEmpleado);
	}

	@GetMapping("/empleados")
	List<Empleado> obtenerTodos() {
		return repository.findAll();
	}

}
