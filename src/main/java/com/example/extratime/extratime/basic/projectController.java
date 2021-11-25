package com.example.extratime.extratime.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class projectController {

    @RequestMapping("/pembagian")
    @ResponseBody
    public String getBagi() {
        String rslt = "";

        int mamat = 30;
        int puji = 10;
        String cek = "Hasil : ";

        int hitung = mamat / puji;

        rslt = Integer.toString(hitung);

        return cek + rslt;
    }

    @RequestMapping("/viewMinuman") // untuk mengirim 1 data
    public String lihatData(Model model) {

        ArrayList<List<String>> minumanjadul = new ArrayList<>();// declare arraylist

        minumanjadul.add(Arrays.asList("Frutang", "1000"));
        minumanjadul.add(Arrays.asList("Jasjus", "500"));
        minumanjadul.add(Arrays.asList("Okky Jeli Drink", "2000"));

        model.addAttribute("listminuman", minumanjadul); // untuk mengirim data ke halaman tujuan tempatnya tabel
        
        model.addAttribute("inisial", "Spirtus"); // untuk mengirim data ke halaman tujuan tempatnya H1
       
        return "viewData"; // didalam tanda petik adalah nama file html tujuan
    }


}
