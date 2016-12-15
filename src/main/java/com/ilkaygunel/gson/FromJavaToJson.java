package com.ilkaygunel.gson;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FromJavaToJson {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();

		Person person = new Person();
		person.setId("1");
		person.setName("Eyüp");
		person.setSurname("Bağdaş");

		Person person2 = new Person();
		person2.setId("2");
		person2.setName("Perihan");
		person2.setSurname("İmamoğlu");

		Person person3 = new Person();
		person3.setId("3");
		person3.setName("Toker");
		person3.setSurname("Turgut");

		personList.add(person);
		personList.add(person2);
		personList.add(person3);

		//Gson gson = new Gson();
		Gson gsonBuilder = new GsonBuilder().create();
		String json = gsonBuilder.toJson(personList);
		System.out.println(json);
	}
}
