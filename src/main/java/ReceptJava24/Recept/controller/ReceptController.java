package ReceptJava24.Recept.controller;


import ReceptJava24.Recept.models.Recept;
import ReceptJava24.Recept.repositories.ReceptRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/recept")
public class ReceptController {

   /* @Autowired
    private ReceptRepository receptRepository;*/

    private final ReceptRepository receptRepository;

    public ReceptController(ReceptRepository receptRepository) {
        this.receptRepository = receptRepository;
    }

    @PostMapping
    public ResponseEntity<Recept> createRecept(@Valid @RequestBody Recept recept) {
        Recept newRecept = receptRepository.save(recept);
        return ResponseEntity.ok(newRecept);
    }
    @GetMapping
    public ResponseEntity<List<Recept>> getAllRecepts() {
        List<Recept> recepts = receptRepository.findAll();
        return ResponseEntity.ok(recepts);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Recept> getRecept(@PathVariable String id) {
        Recept recept = receptRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Recept not found"));
        return ResponseEntity.ok(recept);
    }
}
