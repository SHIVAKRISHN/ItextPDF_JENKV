package com.shiva.jenkvExamples;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class TableExample {
    public static void main(String[] args) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                new FileOutputStream("HelloWorld-Table.pdf"));

            document.open();

            document.add(new Phrase("pdf document"));
            
            PdfPTable table = new PdfPTable(3); // 3 columns.
            //table.setWidthPercentage(100);
            table.setSpacingBefore(105f);

            table.setSpacingAfter(10f);
            //
            float[] columnWidths = {2f, 1f, 1f};

            table.setWidths(columnWidths);
            
            PdfPCell cell1 = new PdfPCell(new Paragraph("Cell 111111111111111111111111111111111111111111111111111111111111"));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Cell 2"));
            PdfPCell cell3 = new PdfPCell(new Paragraph("Cell 3"));
            PdfPCell cell11 = new PdfPCell(new Paragraph("Cell 11"));
            PdfPCell cell21 = new PdfPCell(new Paragraph("Cell 21"));
            PdfPCell cell31 = new PdfPCell(new Paragraph("Cell 31"));
            
            PdfPCell textModeCell = new PdfPCell(new Paragraph("Text Mode"));

            PdfPCell compositeModeCell = new PdfPCell();
            compositeModeCell.addElement(new Paragraph("Composite Mode"));

          //  table.addCell(new Paragraph("Text Mode"));
            
            cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setHorizontalAlignment(Element.ALIGN_RIGHT);

            cell11.setVerticalAlignment(Element.ALIGN_TOP);
            cell21.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell31.setVerticalAlignment(Element.ALIGN_BOTTOM);
            cell2.setPadding(5);

            cell2.setPaddingLeft(8);
            cell2.setPaddingRight(8);
            cell2.setPaddingTop(8);
            cell2.setPaddingBottom(8);
            
            cell2.setBackgroundColor(BaseColor.YELLOW);   //sets BG color to yellow.

            cell2.setBorder(Rectangle.NO_BORDER);   // removes border

            cell2.setBorderWidth      (3f);         // sets border width to 3 units
            cell2.setBorderWidthLeft  (1f);
            cell2.setBorderWidthRight (1f);
            cell2.setBorderWidthTop   (1f);
            cell2.setBorderWidthBottom(1f);

            cell2.setBorderColor      (BaseColor.BLUE);  // sets blue border
            cell2.setBorderColorLeft  (BaseColor.GREEN);
            cell2.setBorderColorRight (BaseColor.GREEN);
            cell2.setBorderColorTop   (BaseColor.GREEN);
            cell2.setBorderColorBottom(BaseColor.GREEN);
            
            //cell1.setColspan(2);
            
            cell1.setBorder(Rectangle.NO_BORDER); // removes the border 
            
            cell11.setRotation(90);
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.addCell(cell11);
            table.addCell(cell21);
            table.addCell(cell31);
            table.addCell(cell31);
            table.addCell(cell31);
            table.addCell(cell31);
            document.add(table);
// Resource http://tutorials.jenkov.com/java-itext/table.html
            document.close();
        } catch(Exception e){

        }
    }
}