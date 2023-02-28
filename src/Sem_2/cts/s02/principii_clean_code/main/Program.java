package Sem_2.cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import Sem_2.cts.s02.principii_clean_code.clase.Angajat;
import Sem_2.cts.s02.principii_clean_code.clase.Utils;
//Comm ptr. commit

public class Program {

	public static void main(String[] args) {
		List<Angajat> listaAngajati;
		try {
			listaAngajati = Utils.readAngajati("angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}