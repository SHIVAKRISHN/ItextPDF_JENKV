/**
 * 
 */
package com.shiva.wwh;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author shiva
 *
 */
public class TablesExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, DocumentException {
		
		  Document document = new Document(PageSize.A4, 36, 36, 90, 36);
	        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("table1_wwe.pdf"));

	        document.open();
		PdfPTable table= new PdfPTable(3);
		PdfPCell pcell;
		
		pcell= new PdfPCell(new Phrase("Cell with colspan of 3"));
		pcell.setColspan(3);
		
		table.addCell(pcell);
		pcell= new PdfPCell(new Phrase("Cell with colspan of 2") );
		pcell.setColspan(2);
		table.addCell(pcell);
		
		table.addCell("row1,cell1");
		table.addCell("row1,cell2");
		table.addCell("row2,cell1");
		//table.addCell("row2,cell2");
		table.completeRow();
		
		table.setSpacingBefore(5);
		table.setSpacingAfter(5);
		document.add(table);
		
		
		// format two
		
		
		PdfPTable table2= new PdfPTable(3);
		
		table2.setWidthPercentage(288/5.23f);
		table2.setWidths(new int[] {2,1,1});
		
		pcell= new PdfPCell(new Phrase("Cell with colspan of 3"));
		pcell.setColspan(3);
		
		table2.addCell(pcell);
		pcell= new PdfPCell(new Phrase("Cell with colspan of 2") );
		pcell.setColspan(2);
		table2.addCell(pcell);
		
		table2.addCell("row1,cell1");
		table2.addCell("row1,cell2");
		table2.addCell("row2,cell1");
		//table.addCell("row2,cell2");
		table2.completeRow();
		
		table2.setSpacingBefore(5);
		table2.setSpacingAfter(5);
		
		table2.setHorizontalAlignment(Element.ALIGN_LEFT);
		
		
		document.add(table2);
		
		// format three
		
		

		PdfPTable table3= new PdfPTable(3);
		
		table3.setTotalWidth(288);
		table3.setLockedWidth(true);
		table3.setWidths(new int[] {2,1,1});
		
		pcell= new PdfPCell(new Phrase("Cell with colspan of 3"));
		pcell.setColspan(3);
		
		table3.addCell(pcell);
		pcell= new PdfPCell(new Phrase("Cell with colspan of 2") );
		pcell.setColspan(2);
		table3.addCell(pcell);
		
		table3.addCell("row1,cell1");
		table3.addCell("row1,cell2");
		table3.addCell("row2,cell1");
		//table.addCell("row2,cell2");
		table3.completeRow();
		

		table3.setSpacingBefore(5);
		table3.setSpacingAfter(5);
		
		table3.setHorizontalAlignment(Element.ALIGN_CENTER);
		document.add(table3);
		
		
		
		// format four
		
		

				PdfPTable table4= new PdfPTable(3);
				
				table4.setWidthPercentage(55.067f);
				//table3.setLockedWidth(true);
				table4.setWidths(new int[] {2,1,1});
				
				pcell= new PdfPCell(new Phrase("Cell with colspan of 3"));
				pcell.setColspan(3);
				
				table4.addCell(pcell);
				pcell= new PdfPCell(new Phrase("Cell with colspan of 2") );
				pcell.setColspan(2);
				table4.addCell(pcell);
				
				table4.addCell("row1,cell1");
				table4.addCell("row1,cell2");
				table4.addCell("row2,cell1");
				//table.addCell("row2,cell2");
				table4.completeRow();
				
				table4.setSpacingBefore(5);
				table4.setSpacingAfter(5);
				table4.setHorizontalAlignment(Element.ALIGN_RIGHT);
				document.add(table4);
		
		document.close();
		// TODO Auto-generated method stub

	}

}
