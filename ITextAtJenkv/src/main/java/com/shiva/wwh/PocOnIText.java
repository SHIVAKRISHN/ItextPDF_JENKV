/**
 * 
 */
package com.shiva.wwh;

import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

/**
 * @author shiva
 *
 */
public class PocOnIText {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, DocumentException {
		// TODO Auto-generated method stub
		
		  Document document = new Document(PageSize.A4, 36, 36, 90, 36);
	        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("poctable1_wwe.pdf"));

			HeaderFooterPageEvent event = new HeaderFooterPageEvent();
			writer.setPageEvent(event);
	        document.open();
	        
	        LineSeparator objectName = new LineSeparator();              
	        
	        
	        objectName.setLineColor(BaseColor.DARK_GRAY);
	        document.add(objectName);
	        //document.add(new LineSeparator(lineDrawer));
	        	        
	        PdfPTable table= new PdfPTable(3);
			PdfPCell pcell;
	        
	        
	        document.close();

	}

}
