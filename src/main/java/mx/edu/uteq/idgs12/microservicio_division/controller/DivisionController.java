package mx.edu.uteq.idgs12.microservicio_division.controller;

import mx.edu.uteq.idgs12.microservicio_division.dto.DivisionDTO;
import mx.edu.uteq.idgs12.microservicio_division.entity.Division;

import org.springframework.http.ResponseEntity;
import mx.edu.uteq.idgs12.microservicio_division.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/divisiones")
public class DivisionController {

    @Autowired
    private DivisionService divisionService;

    @GetMapping("/{id}")
    public ResponseEntity<Division> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(divisionService.buscarPorId(id));
    }
    
}
