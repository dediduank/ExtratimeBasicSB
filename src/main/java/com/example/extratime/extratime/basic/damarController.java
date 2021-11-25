/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.extratime.extratime.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author PAVILON GAMING
 */

public class damarController {
    @RequestMapping("/lihatsayur")
    @ResponseBody
    public String viewsayuran() {
        String NamaSayuran = "";

        NamaSayuran = "Bayem";

        return NamaSayuran;
    }

    @RequestMapping("/perkalian")
    @ResponseBody
    public String viewperkalian() {
        String Perkalian = "";
        int a = 20, b = 2;
        int z;
        z = a * b;

        Perkalian = Integer.toString(z);

        return Perkalian;

    }

    @RequestMapping("/lihatharga")

    public String viewharga(Model model) {

        ArrayList<List<String>> daftarsayuran = new ArrayList<>();

        daftarsayuran.add(Arrays.asList("Bayem", "2500"));
        daftarsayuran.add(Arrays.asList("Tomat", "5000"));
        daftarsayuran.add(Arrays.asList("Wortel", "3000"));
        daftarsayuran.add(Arrays.asList("Kangkung", "2500"));

        model.addAttribute("listsayuran", daftarsayuran);

        model.addAttribute("pasar", "Toko Sayuran");
        
        return "tampilan";
    }

}
