package com.crodriguezt.dev.privpasarelaapi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {

		System.out.println("Ini main");
		BigDecimal bigDecInternal = null;
		BigDecimal bigDecConsec = null;
		BigDecimal bgUno = new BigDecimal("1");
		String internalId = null;
		String consecutive = null;
		// try {
		String fn1 = "internalId.txt";
		String fn2 = "consecutive.txt";
		int i = 0;
//		while (i < 10) {
			internalId = leerArchivo(fn1);
			consecutive = leerArchivo(fn2);
			bigDecInternal = new BigDecimal(internalId).add(bgUno);
			bigDecConsec = new BigDecimal(consecutive).add(bgUno);
			System.out.println(bigDecInternal);
			System.out.println(bigDecConsec);
			guardarArchivo(fn1, bigDecInternal.toString());
			guardarArchivo(fn2, bigDecConsec.toString());
			i++;
//		}
	}
	//
	private static String leerArchivo(String fileName) {

		String respuesta = null;
		try {
			FileReader fr1 = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fr1);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				respuesta = line;
				System.out.println("Read: " + respuesta);
			}
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

	private static void guardarArchivo(String fileName, String texto) {

		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write(texto);
			bufferedWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
