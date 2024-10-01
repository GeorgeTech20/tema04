package com.ciberfarma.model;

import lombok.Data;

@Data
public class producto {
	private String id_prod ;
	private String des_prod;
	private int stk_prod;
	private double pre_prod;
	private int idcategoria;	
	private int est_prod;
	private int idproveedor;
}

