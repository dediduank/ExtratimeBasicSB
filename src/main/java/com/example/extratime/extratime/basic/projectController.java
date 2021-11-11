package com.example.extratime.extratime.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class projectController {
    
    @RequestMapping("/pembagian")
    @ResponseBody
    public String getBagi(){
        String rslt = "";

        int mamat = 30; int puji = 10;
        
        int hitung = mamat/puji;

        rslt = Integer.toString(hitung);

        return rslt;
    }

    @RequestMapping("/viewMinuman")
    public String lihatData(){

        return "viewData"; //didalam tanda petik adalah nama file html tujuan
    }


}
