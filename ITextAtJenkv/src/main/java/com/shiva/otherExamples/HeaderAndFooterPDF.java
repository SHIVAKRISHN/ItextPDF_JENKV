/**
 * 
 */
package com.shiva.otherExamples;

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
public class HeaderAndFooterPDF {

	/**
	 * @param args
	 * @throws DocumentException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws DocumentException, FileNotFoundException {
	    Document document = new Document(PageSize.A4, 36, 36, 90, 36);
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("page.pdf"));
      
		HeaderFooterPageEvent event = new HeaderFooterPageEvent();
		writer.setPageEvent(event);
		   document.open();
	        document.add(new Paragraph("Testing."));
	        document.newPage();
	        document.add(new Paragraph("Testing."));
	        document.newPage();
	        document.close();
	}

}
