package com.ocr.ocr.controller;

import com.ocr.ocr.service.OCRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OCRController {

 @Autowired
 OCRService ocrService;
    @GetMapping("/getText")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);

        ocrService.getDetils("World");

        return "greeting";
    }

    @PostMapping
    public List<String> getResults(String imageString)  {




        return null;
    }


}
