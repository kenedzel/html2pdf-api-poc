package com.converter.html2pdf.controller;

import com.converter.html2pdf.dto.ValueDTO;
import com.converter.html2pdf.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    @Autowired
    private ConverterService converterService;

    /**
     * Convert HTML to PDF API
     *
     * Sample Request:
     * {
     *     "name": "John Doe",
     *     "emailAddress": "john@doe.com",
     *     "extra":  "extra"
     * }
     * @param valueDTO
     * @return
     */
    @PostMapping(value = "/convert")
    public ResponseEntity<String> convertHTMLToPDF(@RequestBody ValueDTO valueDTO) {
        converterService.convertHTMLToPdf(valueDTO);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
