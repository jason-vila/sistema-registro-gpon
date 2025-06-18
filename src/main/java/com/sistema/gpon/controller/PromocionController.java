package com.sistema.gpon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sistema.gpon.service.PromocionService;

@Controller
@RequestMapping("/promociones")
public class PromocionController {

    @Autowired
    private PromocionService promocionService;
}
