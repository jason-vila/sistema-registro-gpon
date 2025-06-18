package com.sistema.gpon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sistema.gpon.service.SectorService;

@Controller
@RequestMapping("/sectores")
public class SectorController {

    @Autowired
    private SectorService sectorService;
}
