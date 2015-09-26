package br.com.testes;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		String input = "ricardo|ferreira|rocha";
		String token = "\\|";
		
		String[] parse = toSplit(input, token);
		for(String item : parse){
			System.out.println("valor:" + item);
		}
		
		StringTokenizer sk = new StringTokenizer("ademir ,é o ,cara",",");
		
		while(sk.hasMoreTokens()){
			System.out.println(sk.nextToken());
		}

	}
	
	
	private static String[] toSplit(String input, String token){
		
		if(input != null && !"".equals(input)){
			return input.split(token);
		}
		return new String[0];
	}

}
