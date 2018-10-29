package com.test.code;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.test.Item;
import com.test.SortAlgos;

public class AlgoTest {

	/* Bubble Sort case */
	@Test(expected = java.lang.NullPointerException.class)
	public void testBubbleEmptyItem() {
		Item[] emptyArr = null;
		SortAlgos.bubbleSort(emptyArr);
	}

	/* Bubble Sort test */
	@Test
	public void bubbleUnsortedTest() {
		int[] dataList = { 1, 3, 2, 5, 4, 0 };
		Item[] items = new Item[6];
		for (int i = 0; i < dataList.length; i++)
			items[i] = new Item(dataList[i]);

		int[] sortedDataList = { 0, 1, 2, 3, 4, 5 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedDataList.length; i++)
			sorted[i] = new Item(sortedDataList[i]);

		SortAlgos.bubbleSort(items);
		for (int j = 0; j < items.length; j++)
			assertTrue(items[j].key == sorted[j].key);
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testSelectionSortEmptyItem() {
		Item[] emptyArr = null;
		SortAlgos.selectionSort(emptyArr);
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testInsertionSortEmptyItem() {
		Item[] emptyArr = null;
		SortAlgos.insertionSort(emptyArr);
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testMergeSortEmptyItem() {
		Item[] emptyArr = null;
		SortAlgos.mergeSort(emptyArr);
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testQuickSortEmptyItem() {
		Item[] emptyArr = null;
		SortAlgos.quickSort(emptyArr);
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void testHeapSortEmptyItem() {
		Item[] emptyArr = null;
		SortAlgos.heapSort(emptyArr);
	}

	@Test
	public void testSelectionUnsorted() {
		int[] dataList = { 1, 5, 2, 3, 0, 4 };
		Item[] items = new Item[6];
		for (int i = 0; i < dataList.length; i++)
			items[i] = new Item(dataList[i]);

		int[] sortedDataList = { 0, 1, 2, 3, 4, 5 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedDataList.length; i++)
			sorted[i] = new Item(sortedDataList[i]);

		SortAlgos.selectionSort(items);
		for (int j = 0; j < items.length; j++)
			assertTrue(items[j].key == sorted[j].key);
	}

	@Test
	public void testInsertionUnsorted() {
		int[] dataList = { 1, 5, 2, 3, 0, 4 };
		Item[] items = new Item[6];
		for (int i = 0; i < dataList.length; i++)
			items[i] = new Item(dataList[i]);

		int[] sortedDataList = { 0, 1, 2, 3, 4, 5 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedDataList.length; i++)
			sorted[i] = new Item(sortedDataList[i]);

		SortAlgos.insertionSort(items);
		for (int j = 0; j < items.length; j++)
			assertTrue(items[j].key == sorted[j].key);
	}

	@Test
	public void testMergeUnsorted() {
		int[] dataList = { 1, 5, 2, 3, 0, 4 };
		Item[] items = new Item[6];
		for (int i = 0; i < dataList.length; i++)
			items[i] = new Item(dataList[i]);

		int[] sortedDataList = { 0, 1, 2, 3, 4, 5 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedDataList.length; i++)
			sorted[i] = new Item(sortedDataList[i]);

		SortAlgos.mergeSort(items);
		for (int j = 0; j < items.length; j++)
			assertTrue(items[j].key == sorted[j].key);
	}

	@Test
	public void testQuickUnsorted() {
		int[] dataList = { 1, 5, 2, 3, 0, 4 };
		Item[] items = new Item[6];
		for (int i = 0; i < dataList.length; i++)
			items[i] = new Item(dataList[i]);

		int[] sortedDataList = { 0, 1, 2, 3, 4, 5 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedDataList.length; i++)
			sorted[i] = new Item(sortedDataList[i]);

		SortAlgos.quickSort(items);
		for (int j = 0; j < items.length; j++)
			assertTrue(items[j].key == sorted[j].key);
	}

	@Test
	public void testHeapUnsorted() {
		int[] dataList = { 1, 5, 2, 3, 0, 4 };
		Item[] items = new Item[6];
		for (int i = 0; i < dataList.length; i++)
			items[i] = new Item(dataList[i]);

		int[] sortedDataList = { 0, 1, 2, 3, 4, 5 };
		Item[] sorted = new Item[6];
		for (int i = 0; i < sortedDataList.length; i++)
			sorted[i] = new Item(sortedDataList[i]);

		SortAlgos.heapSort(items);
		for (int j = 0; j < items.length; j++)
			assertTrue(items[j].key == sorted[j].key);
	}
}
