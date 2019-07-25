package com.ocr.ocr.service;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OCRServiceImpl implements OCRService
{
    @Override
    public List<String> getDetils(String img) {

      List<String> ocrModelList  = new ArrayList<String>();
        File image = new File("/home/nifras/Downloads/ocr/src/main/resources/test1.jpg");

        Tesseract tessInst = new Tesseract();
        tessInst.setDatapath("/home/nifras/Downloads/ocr/src/main/resources/tessDt");
        tessInst.setLanguage("eng");

        try {
            String result= tessInst.doOCR(image);
            System.out.println(result);
            ocrModelList = Arrays.asList(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }





        return ocrModelList;
    }
}
