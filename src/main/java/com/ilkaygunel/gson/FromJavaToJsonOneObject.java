package com.ilkaygunel.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FromJavaToJsonOneObject {
	public static void main(String[] args) {
		Person person = new Person();
		person.setId("1");
		person.setName("Eyüp");
		person.setSurname("Bağdaş");

		Gson gsonBuilder = new GsonBuilder().create();
		System.out.println(gsonBuilder.toJson(person));
	}
}
