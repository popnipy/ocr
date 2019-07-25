package com.ocr.ocr.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OCRService {

    public List<String> getDetils(String img);
}
