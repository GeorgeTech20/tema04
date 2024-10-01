package com.ciberfarma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.ciberfarma.model.producto;
import com.ciberfarma.model.usuario;

@Controller
public class ProyectoController {
	
	//Para cargar o abrir -> servicio Get
	@GetMapping({"/cargar","/","/inicio"})
	public String cargarPag() {
		return "saludo";
	}
	

	
	@GetMapping({"/producto/cargar"})
	public String cargarProd(Model model) { 
		model.addAttribute("producto",new producto());
		return "crudproductos";

	}
	
	@PostMapping({"/producto/grabar"})
	public String grabarProd(@ModelAttribute producto producto) { 
		System.out.println(producto);
		return "crudproductos";

	}
	
	@GetMapping("/registrar/cargar")
	public String registrarUsu(Model model) {
	    model.addAttribute("usuario", new usuario()); 
	    return "registrar"; 
	}

	
    @PostMapping("/registrar/grabar")
    public String registrarUsu(@ModelAttribute usuario usuario) {
    	System.out.println(usuario);
        return "registrar"; 
    }

    
    
	//Grabar o leer -> Post
	@PostMapping("/login")
	public String leerLogin(
			@RequestParam  String correo,
			@RequestParam  String clave,
			Model model ) {
		
		//System.out.println(correo +  "-" + clave);
		if(correo.equals("chupapi@gmail.com") && clave.equals("123456")) {
			model.addAttribute("mensaje", "Bienvenido");
			model.addAttribute("cssmensaje", "alert alert-success");
		}else{
			model.addAttribute("mensaje", "Usuario o clave incorrecto");
			model.addAttribute("cssmensaje", "alert alert-danger ");
		}
		
		System.out.println(correo + "-" + clave );
		return "saludo";
	}

}
