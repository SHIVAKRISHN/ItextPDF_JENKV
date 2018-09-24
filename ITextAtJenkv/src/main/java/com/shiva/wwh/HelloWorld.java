/**
 * 
 */
package com.shiva.wwh;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author shiva
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Document document = new Document(PageSize.A4);
//ByteArrayOutputStream baos= new ByteArrayOutputStream();
       try {
    	   
    	 	// in web applications with out storing the pdf in server machine
       	//we can create the baos and give the i/p parameter to pdfwriter
       	// after completion just return baos.toByteArray()
    	   
  //          PdfWriter.getInstance(document,baos); 

       
        	PdfWriter.getInstance(document,
                    new FileOutputStream("HelloWorld.pdf"));

            document.open();
            document.add(new Paragraph("A Hello World PDF document."));
            document.close(); // no need to close PDFwriter?

        } catch (DocumentException e) {
            e.printStackTrace();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

	}

	//source : http://what-when-how.com/itext-5/creating-a-pdf-document-in-five-steps-with-itext/
	
}
