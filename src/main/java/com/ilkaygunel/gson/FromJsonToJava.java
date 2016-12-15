package com.ilkaygunel.gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class FromJsonToJava {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		try {
			FileReader fileReader = new FileReader("src/main/resources/jsonFile.json");
			Gson gson = new Gson();
			JsonParser parser = new JsonParser();
			JsonArray jsonArray = parser.parse(fileReader).getAsJsonArray();
			for (int i = 0; i < jsonArray.size(); i++) {
				Person person = gson.fromJson(jsonArray.get(i), Person.class);
				personList.add(person);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Bir Hata Meydana Geldi! Hata:"+e);
		}
		
		for (Person p:personList) {
			System.out.println(p.getId()+" "+p.getName()+" "+p.getSurname());
		}
	}
}
