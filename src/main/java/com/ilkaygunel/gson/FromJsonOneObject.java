package com.ilkaygunel.gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class FromJsonOneObject {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("src/main/resources/jsonFile2.json");
			Gson gson = new Gson();
			Person person = gson.fromJson(fileReader, Person.class);
			System.out.println(person.getId() + " " + person.getName() + " " + person.getSurname());
		} catch (FileNotFoundException e) {
			System.out.println("Bir Hata Meydana Geldi! Hata:" + e);
		}
	}
}
