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
 * @author weann
 */
public class WeanController {

    @RequestMapping("/viewbuah")
    public String databuah(Model model) {

        ArrayList<List<String>> BuahBuahan = new ArrayList();

        BuahBuahan.add(Arrays.asList("Durian", "35000"));
        BuahBuahan.add(Arrays.asList("Mangga", "10000"));
        BuahBuahan.add(Arrays.asList("Duku", "15000"));
        BuahBuahan.add(Arrays.asList("Rambutan", "20000"));

        model.addAttribute("listharga", BuahBuahan);

        model.addAttribute("inisial", "TokoBuah");
        return "tampilan";
    }

    @RequestMapping("/penjumlahan")
    @ResponseBody
    public String pertambahan() {
        String Penjumlahan = "";
        int a = 15, b = 20;
        int z;
        z = a + b;

        Penjumlahan = Integer.toString(z);

        return Penjumlahan;
    }
}
