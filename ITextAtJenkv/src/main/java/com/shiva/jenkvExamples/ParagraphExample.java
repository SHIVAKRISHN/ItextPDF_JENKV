package com.shiva.jenkvExamples;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**

 */
public class ParagraphExample {

    public static void main(String[] args) {

        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                new FileOutputStream("Paragraph2.pdf"));

            document.open();
            Paragraph paragraph1 = new Paragraph(20);// line spacing of 20 
            
                Paragraph paragraph2 = new Paragraph();

                paragraph1.setSpacingAfter(50);
               // paragraph2.setSpacingBefore(25);
                paragraph2.setAlignment(Element.ALIGN_CENTER);
                paragraph2.setIndentationLeft(50);
                paragraph2.setIndentationRight(50);
            

            for(int i=0; i<10; i++){
                Chunk chunk = new Chunk(
                    "This is a sentence which is long " + i + ". ");
                paragraph1.add(chunk);
                paragraph2.add(chunk);
            }

            document.add(paragraph1);
            document.add(paragraph2);
            document.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}