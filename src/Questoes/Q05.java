package Questoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q05 {
	public static void main(String[] args) {		
		Set<Integer> valores = new HashSet<Integer>();
		
		valores.add(100);
		valores.add(200);
		valores.add(400);
		valores.add(500);
		valores.add(600);
		valores.add(100);
		valores.add(350);
		valores.add(200);
		
		System.out.println(valores);
		
	}
}
