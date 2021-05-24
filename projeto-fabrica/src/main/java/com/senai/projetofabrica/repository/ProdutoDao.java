package com.senai.projetofabrica.repository;

import com.senai.projetofabrica.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoDao extends JpaRepository<Produto, Long> {

    Produto findProdutoByCodigoBarra(String codigoBarra);
}
