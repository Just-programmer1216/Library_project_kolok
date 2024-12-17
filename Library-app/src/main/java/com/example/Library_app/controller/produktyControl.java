package com.example.Library_app.controller;

        import com.example.Library_app.model.Produkty;
        import com.example.Library_app.repository.ProduktyRep;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/produkty")
public class produktyControl {

    private final ProduktyRep produktyRep;

    @Autowired
    public produktyControl(ProduktyRep produktyRep) {
        this.produktyRep = produktyRep;
    }
    /*@GetMapping("/{id}")
    public ResponseEntity<Produkty> getProdukty(@PathVariable("id") Long id) {
        Optional<Produkty> produkty = produktyRep.findById(id);
        if (produkty.isPresent()) {
            return ResponseEntity.ok(produkty.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/

    @GetMapping("/all")
    public ResponseEntity<List<Produkty>> getAllProdukty() {
        List<Produkty> produktyList = produktyRep.findAll();
        if (!produktyList.isEmpty()) {
            return ResponseEntity.ok(produktyList);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

}
