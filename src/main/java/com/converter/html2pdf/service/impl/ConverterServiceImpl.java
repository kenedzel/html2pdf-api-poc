package com.converter.html2pdf.service.impl;

import com.converter.html2pdf.dto.ValueDTO;
import com.converter.html2pdf.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

@Service
public class ConverterServiceImpl implements ConverterService {

    @Autowired
    private TemplateEngine templateEngine;

    @Override
    public void convertHTMLToPdf(ValueDTO valueDTO) {
        Context context = new Context(); //TODO: flexible context
        context.setVariable("name", valueDTO.getName());
        context.setVariable("emailAddress", valueDTO.getEmailAddress());
        context.setVariable("extra", valueDTO.getExtra());

        String processedHtml = templateEngine.process("template2", context); //"template2"  = template file name

        OutputStream outputStream;
        try {
            outputStream = new FileOutputStream("C:/Users/uu/Desktop/output.pdf");//output path
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocumentFromString(processedHtml);
        renderer.layout();
        renderer.createPDF(outputStream);
    }
}
