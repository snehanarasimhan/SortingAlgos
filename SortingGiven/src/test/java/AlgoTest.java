package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

import jdk.nashorn.internal.ir.annotations.Ignore;

import main.java.RandomNumber;


public class AlgoTest {

	//public static SortAlgos SortAlgos1 = new SortAlgos();
	//Node Coverage with Descending Order Input - Node --> Node 5/ Edge 5

	@Test
	public void NodeCoverage1() {
		int [] array= {10,9,8,7,6,5,4,3,2,1};
		Item[] items= new Item[array.length];
		Item[] items1 = new Item[array.length];
		for (int i=0;i<array.length;i++) {
			items[i]= new Item(array[i]);
			items1[i] = new Item(array[i]);
		}
		SortAlgos.bubbleSort(items);
		
		SortAlgos.mergeSort(items1);
		
		for (int i=0;i<array.length;i++) {
			assert(items[i].key == items1[i].key); 
		}
	}

	
	@Test
	public void NodeCoverage2() {
		int [] array= {10,9,8,7,6,5,4,3,2,1};
		Item[] items= new Item[array.length];
		Item[] items1 = new Item[array.length];
		for (int i=0;i<array.length;i++) {
			items[i]= new Item(array[i]);
			items1[i] = new Item(array[i]);
		}
		SortAlgos.bubbleSort(items);	
		
		SortAlgos.quickSort(items1);
	
		for (int i=0;i<array.length;i++) {
			assert(items[i].key == items1[i].key); 
		}
	}

	
	@Test
	public void NodeCoverage3() {
		int [] array= {10};
		Item[] items= new Item[array.length];
		Item[] items1 = new Item[array.length];
		for (int i=0;i<array.length;i++) {
			items[i]= new Item(array[i]);
			items1[i] = new Item(array[i]);
		}
		SortAlgos.bubbleSort(items);			
		
		SortAlgos.selectionSort(items1);
		
		for (int i=0;i<array.length;i++) {
			assert(items[i].key == items1[i].key); 
		}
	}

	@Test
	public void NodeCoverage4() {
		int [] array= {10,9,8,7,6,5,4,3,2,1};
		Item[] items= new Item[array.length];
		Item[] items1 = new Item[array.length];
		for (int i=0;i<array.length;i++) {
			items[i]= new Item(array[i]);
			items1[i] = new Item(array[i]);
		}
		SortAlgos.bubbleSort(items);	
		
		SortAlgos.insertionSort(items1);
		
		for (int i=0;i<array.length;i++) {
			assert(items[i].key == items1[i].key); 
		}
	}
	
	@Test
	public void NodeCoverage5() {
		int [] array= {10,9,8,7,6,5,4,3,2,1};
		Item[] items= new Item[array.length];
		Item[] items1 = new Item[array.length];
		for (int i=0;i<array.length;i++) {
			items[i]= new Item(array[i]);
			items1[i] = new Item(array[i]);
		}
		SortAlgos.bubbleSort(items);	
		
		SortAlgos.heapSort(items1);
		
		for (int i=0;i<array.length;i++) {
			assert(items[i].key == items1[i].key); 
		}
	}
	
	public void NodeCoverage6() {
		int [] array= {10,9,8,7,6,5,4,3,2,1};
		Item[] items= new Item[array.length];
		Item[] items1 = new Item[array.length];
		for (int i=0;i<array.length;i++) {
			items[i]= new Item(array[i]);
			items1[i] = new Item(array[i]);
		}
		SortAlgos.bubbleSort(items);	
		
		SortAlgos.heapSort(items1);
		
		for (int i=0;i<array.length;i++) {
			assert(items[i].key == items1[i].key); 
		}
	}
	
	private int print(Item[] array) {
		for (int i =0 ; i<array.length;i++) {
			System.out.println(array[i].key);
		}
		return 0;
	}
	
	private void printtext(String text) {
		System.out.println(text);
	}
	
	private Item[] getInputItems(int size) {
		Item[] items = null;
		if (size > 0) {
			items =  new Item[size];
			RandomNumber randomGenerator = new RandomNumber();
			for (int i = 0; i< size; i++) {
				items[i] = new Item(randomGenerator.nextIntRand(0, size));
			}
		}
		return items;
	}
	
private int size = 100;
	
	@Test
	public void BubbleSortAgainstHeapSort() {
		
		Item[] items = getInputItems(size);
		Item[] items1 = items;
		
		SortAlgos.bubbleSort(items);
		SortAlgos.heapSort(items1);
		
		for (int i =0;i<size;i++) {
			assert(items[i].key == items1[i].key);
		}
	}
	
	@Test (expected = NullPointerException.class) 
	public void TestingbubbleSortForNullPointerExceptionIfInputIsNull() {
		SortAlgos.bubbleSort(getInputItems(0));
	}
	
	@Test (expected = NullPointerException.class) 
	public void TestingselectionSortForNullPointerExceptionIfInputIsNull() {
		SortAlgos.selectionSort(getInputItems(0));
	}

	@Test
	public void BubbleSortAgainstSelectionSort() {
		
		Item[] items = getInputItems(size);
		Item[] items1 = items;
		
		SortAlgos.bubbleSort(items);
		SortAlgos.selectionSort(items1);
		
		for (int i =0;i<size;i++) {
			assert(items[i].key == items1[i].key);
		}
	}
}
