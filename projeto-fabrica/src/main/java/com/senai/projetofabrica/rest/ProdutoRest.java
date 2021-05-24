package com.senai.projetofabrica.rest;

import com.senai.projetofabrica.entity.Produto;
import com.senai.projetofabrica.repository.ProdutoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/produto")
public class ProdutoRest {

    @Autowired
    private ProdutoDao produtoDao;


    @GetMapping
    public List<Produto> get() {
        return produtoDao.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Produto> getById(@PathVariable Long id) {
        return produtoDao.findById(id);
    }

    @PostMapping
    public ResponseEntity<Produto> post(@RequestBody Produto produtoTeste) {
        return ResponseEntity.ok(produtoDao.save(produtoTeste));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        produtoDao.deleteById(id);
    }
    @GetMapping("/codigo/{cod}")
    public Produto getByCodigo(@PathVariable String cod) {
        return produtoDao.findProdutoByCodigoBarra(cod);
    }



}