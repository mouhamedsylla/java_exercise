/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsvente;

/**
 *
 * @author sylla
 */
/*
 * Documentation iText
 * https://api.itextpdf.com/iText7/java/7.0.2/
 */
import com.itextpdf.io.IOException;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;

public class Facture {
	//Definir mes Font
	public final String FranklinGothicHeavy = "C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\appsVente\\src\\main\\java\\com\\mycompany\\appsvente\\framd.ttf";
	public final String Calibri = "C:\\Users\\sylla\\OneDrive\\Documents\\NetBeansProjects\\appsVente\\src\\main\\java\\com\\mycompany\\appsvente\\calibri.ttf";

	public void makeFacture(String p, String n, String ntel, String e, int[] CI, int[] CP, int[] CE1, int[] CE2, int[] CM1, int[] CM2, String apayer) throws java.io.IOException{
		String Path = "facture.pdf";
		PdfWriter pdfwriter = new PdfWriter(Path);
		PdfDocument pdfdocument = new PdfDocument(pdfwriter);
		pdfdocument.setDefaultPageSize(PageSize.A4);
		pdfdocument.addNewPage();
		
		PdfFont font1 = PdfFontFactory.createFont(FranklinGothicHeavy);
		Text titre = new Text("Facture")
				.setFont(font1)
				.setBold()
				.setFontSize(26f);
		
		Paragraph paragraph1 = new Paragraph().add(titre);
		paragraph1.setTextAlignment(TextAlignment.CENTER);
		paragraph1.setMarginBottom(-5f);
		
		Text description = new Text("Projet d’amélioration de la qualité de l’apprentissage de la langue arabe \r\ndans les écoles franco-arabe")
				.setFont(font1)
				.setBold()
				.setFontSize(12f);
		Paragraph paragraph2 = new Paragraph().add(description);
		paragraph2.setTextAlignment(TextAlignment.CENTER);

		Text text1 = null;
		Text text2 = null;
		Text text2_1 = null;
		String Stext1 = "De : Fournisseur/ Expéditeur ;";
		String Stext2 = "Adresse : ";
		String Stext2_1 = "Cité Darou Salam 2 Keur Massar";
		
		Paragraph paragraph3 = new Paragraph().add(setTextBold(Stext1, text1));
		paragraph3.setMarginLeft(75f);
		
		Paragraph paragraph4 = new Paragraph()
				.add(setTextBold(Stext2, text2))
				.add(setTextNoBold(Stext2_1, text2_1));
		paragraph4.setMarginLeft(75F);
		
		Text text3 = null;
		Text text3_1 = null;
		String Stext3 = "Prénom & Nom : ";
		String Stext3_1 = "Mouhamed Sylla";
		Paragraph paragraph5 = new Paragraph()
				.add(setTextBold(Stext3, text3))
				.add(setTextNoBold(Stext3_1, text3_1));
		paragraph5.setMarginLeft(75F);
		paragraph5.setMarginTop(-5);
		
		Text text4 = null;
		Text text4_1 = null;
		String Stext4 = "N° Tel : ";
		String Stext4_1 = "+221 77 526 05 72 / +221 78 145 79 43";
		Paragraph paragraph6 = new Paragraph()
				.add(setTextBold(Stext4, text4))
				.add(setTextNoBold(Stext4_1, text4_1));
		paragraph6.setMarginLeft(75F);
		paragraph6.setMarginTop(-5);
		
		Text text7 = null;
		String Stext7 = "A : Client/ Destinataire ;";
		
		Paragraph paragraph7 = new Paragraph().add(setTextBold(Stext7, text7));
		paragraph7.setMarginLeft(285f);
		
		Text text8 = null;
		String Stext8 = "Prénom & Nom : ";
		Text text8_1 = null;
		String Stext8_1 = p+" "+n;
		
		Paragraph paragraph8 = new Paragraph()
				.add(setTextBold(Stext8, text8))
				.add(setTextNoBold(Stext8_1, text8_1));
		paragraph8.setMarginLeft(285f);
		
		Text text9 = null;
		String Stext9 = "N° Tel : ";
		Text text9_1 = null;
		String Stext9_1 = ntel;
		
		Paragraph paragraph9 = new Paragraph()
				.add(setTextBold(Stext9, text9))
				.add(setTextNoBold(Stext9_1, text9_1));
		paragraph9.setMarginLeft(285f);
		paragraph9.setMarginTop(-5);
		
		Text text10 = null;
		String Stext10 = "Nom de l'école : ";
		Text text10_1 = null;
		String Stext10_1 = e;
		
		Paragraph paragraph10 = new Paragraph()
				.add(setTextBold(Stext10, text10))
				.add(setTextNoBold(Stext10_1, text10_1));
		paragraph10.setMarginLeft(285f);
		paragraph10.setMarginTop(-5);
		
		//creation du tableau
		
		float columnWidth[] = {50, 70, 70, 70, 70, 70, 80};
		Table InfoCommande = new Table(columnWidth);
		
		InfoCommande.addCell(new Cell().add("Niveau"));
		InfoCommande.addCell(new Cell().add("Q. Prod écrite"));
		InfoCommande.addCell(new Cell().add("Q. Transition"));
		InfoCommande.addCell(new Cell().add("Q. Lecture"));
		InfoCommande.addCell(new Cell().add("Q. Ecriture"));
		InfoCommande.addCell(new Cell().add("Q. Revision"));
		InfoCommande.addCell(new Cell().add("Total A Payer"));
		
		InfoCommande.addCell(new Cell().add("CI"));
                for(int i=0;i<CI.length;i++) {
                    InfoCommande.addCell(new Cell().add(String.valueOf(CI[i])));
                }
		InfoCommande.addCell(new Cell().add(""));
		
		InfoCommande.addCell(new Cell().add("CP"));
                for(int i=0;i<CP.length;i++) {
                    InfoCommande.addCell(new Cell().add(String.valueOf(CP[i])));
                }
		InfoCommande.addCell(new Cell().add(""));
		
		InfoCommande.addCell(new Cell().add("CE1"));
                for(int i=0;i<CE1.length;i++) {
                    InfoCommande.addCell(new Cell().add(String.valueOf(CE1[i])));
                }
		InfoCommande.addCell(new Cell().add(""));
		
		InfoCommande.addCell(new Cell().add("CE2"));
                for(int i=0;i<CE2.length;i++) {
                    InfoCommande.addCell(new Cell().add(String.valueOf(CE2[i])));
                }
		InfoCommande.addCell(new Cell().add(""));
		
		InfoCommande.addCell(new Cell().add("CM1"));
                for(int i=0;i<CM1.length;i++) {
                    InfoCommande.addCell(new Cell().add(String.valueOf(CM1[i])));
                }
		InfoCommande.addCell(new Cell().add(""));
		
		InfoCommande.addCell(new Cell().add("CM2"));
                for(int i=0;i<CM2.length;i++) {
                    InfoCommande.addCell(new Cell().add(String.valueOf(CM2[i])));
                }
		InfoCommande.addCell(new Cell().add(""));
		InfoCommande.setFontSize(10f);
		InfoCommande.setMarginLeft(20f);
		
		Text text11 = null;
		String Stext11 = "MONTANT NET A PAYER : ";
		Text text11_1 = null;
		String Stext11_1 = apayer;
		
		Paragraph paragraph11 = new Paragraph()
				.add(setTextBold(Stext11, text11))
				.add(setTextNoBold(Stext11_1, text11_1));
		paragraph11.setMarginLeft(285f);
		
                java.util.Date date = new java.util.Date();
		Text text12 = null;
		String Stext12 = "DATE : ";
		Text text12_1 = null;
		String Stext12_1 = date.toString();
		
		Paragraph paragraph12 = new Paragraph()
				.add(setTextBold(Stext12, text12))
				.add(setTextNoBold(Stext12_1, text12_1));
		paragraph12.setMarginLeft(285f);
		
		
		
		Document document = new Document(pdfdocument);
		document.add(paragraph1);
		document.add(paragraph2);
		document.add(paragraph3);
		document.add(paragraph4);
		document.add(paragraph5);
		document.add(paragraph6);
		document.add(paragraph7);
		document.add(paragraph8);
		document.add(paragraph9);
		document.add(paragraph10);
		document.add(InfoCommande);
		document.add(paragraph11);
		document.add(paragraph12);

		document.close();
		System.out.println("PDF is created");
		
		
		
		
	}
	
	public Text setTextBold(String text, Text myText) throws java.io.IOException{
		PdfFont font = PdfFontFactory.createFont(FranklinGothicHeavy);
		myText =  new Text(text)
				.setFont(font)
				.setBold()
				.setFontSize(11);
		return myText;
	}
	
	public Text setTextNoBold(String text, Text myText) throws java.io.IOException {
		PdfFont font = PdfFontFactory.createFont(Calibri);
		myText = new Text(text)
				.setFont(font)
				.setFontSize(11);
		return myText;
	}

}
