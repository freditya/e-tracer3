/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etracer.com.projectetracer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Relion31
 */
@Controller
public class AdminController {
    
    @RequestMapping(value = {"/admin"}, method = RequestMethod.GET)
    public String index(){
        return "dashboard";
    }
}