package com.remoteTiger.exercise_java8;

import java.util.function.BiConsumer;

public class ExceptionHandling {
	public static void main(String[] args) {
		int [] array = {1,2,3,5};
		int key =0;
		process(array, key , wrapperLmbda((v,k) -> System.out.println(v/k)));
		
	}

	

	private static void process(int[] array, int key, BiConsumer<Integer,Integer> consumer) {
		
		for(int i:array) {
			System.out.println( i + key);
			
			consumer.accept(i,key);
			
		} 
	}
		private static BiConsumer<Integer, Integer> wrapperLmbda(BiConsumer<Integer,Integer>consumer) {
			// TODO Auto-generated method stub
			return (v,k) -> {
				try {
				
				consumer.accept(v, k);
				}
				catch (ArithmeticException e ) {
					System.out.println(" Exeption couht in wrapper lambda");
				}
			};
		}
		
	}

