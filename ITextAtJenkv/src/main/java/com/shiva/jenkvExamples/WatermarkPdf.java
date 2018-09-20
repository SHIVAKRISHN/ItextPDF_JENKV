package com.shiva.jenkvExamples;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class WatermarkPdf {

    public static void main(String... args) throws IOException, DocumentException {

        // create document
        Document document = new Document(PageSize.A4, 36, 36, 90, 36);
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("watermark.pdf"));

        // add header and footer
        writer.setPageEvent(new WatermarkPageEvent());

        // write to document
        document.open();
        document.add(new Paragraph("Testing."));
        document.newPage();
        document.add(new Paragraph("Testing."));
        document.newPage();
        document.close();

        //Resource : https://memorynotfound.com/add-watermark-to-pdf-document-using-itext-and-java/
        
    }
}