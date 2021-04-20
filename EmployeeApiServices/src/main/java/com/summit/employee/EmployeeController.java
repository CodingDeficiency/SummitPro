package com.summit.employee;

import java.util.List;
import java.util.NoSuchElementException;

import javax.net.ssl.SSLEngineResult.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4900")
@RequestMapping(path = "/EmployeeApi")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/Employee")
	public List<Employee> list() {
		return service.listAll();
	}

	@GetMapping("/Employee/{id}")
	public ResponseEntity<Employee> get(@PathVariable Integer id) {
		try {
			Employee employee = service.get(id);
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping(path = "/Employee/save")
	public void add(@RequestBody Employee employee) {
		service.save(employee);
	}

	@PostMapping(path = "/Employee/edit/{id}")
	public ResponseEntity<?> update(@RequestBody Employee employee, @PathVariable Integer id) {
		try {
			Employee existEmployee = service.get(id);
			service.save(employee);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping(path = "/Employee/delete/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}
