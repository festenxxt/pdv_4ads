package com.senai.projetofabrica.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String codigoBarra;
	private String nomeProduto;
	private double valor;


}
