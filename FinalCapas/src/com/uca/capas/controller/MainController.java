package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Cliente;
import com.uca.capas.domain.Producto;
import com.uca.capas.service.ClienteService;
import com.uca.capas.service.ProductoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class MainController {
	
	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	ProductoService productoService;
	
	@RequestMapping("/")
	private ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		List<Cliente> clientes = null;
		clientes = clienteService.findAll();
		//get all clientes
		mav.addObject("clientes", clientes);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/verComprasCliente")
	private ModelAndView compras(@RequestParam(name="cCliente") Integer cCliente) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("compras");
		return mav;
	}
	
	@RequestMapping("/crearCompra")
	private ModelAndView crearCompra() {
		ModelAndView mav = new ModelAndView();
		List<Cliente> clientes = null;
		List<Producto> producto = null;
		producto = productoService.findAll();
		clientes = clienteService.findAll();
		mav.addObject("clientes", clientes);
		mav.addObject("productos", producto);
		mav.setViewName("compras");
		return mav;
	}
	
	@RequestMapping(value = "/saveCompra", method= RequestMethod.POST)
	private ModelAndView saveCompra(@RequestParam(name="producto") Integer p, @RequestParam(name="cliente") Integer c) {
		ModelAndView mav = new ModelAndView();
		Cliente cliente = clienteService.findOne(c);
		Producto producto = productoService.findOne(p);
		mav.addObject("producto", producto);
		mav.addObject("cliente", cliente);
		mav.setViewName("realizarcompra");
		return mav; 
	}
}
