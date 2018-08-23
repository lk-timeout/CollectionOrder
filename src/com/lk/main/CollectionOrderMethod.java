package com.lk.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.lk.pojo.StudentInfo;

/**
 * @author 李凯
 * @Date 2018年8月22日 下午7:15:32
 * @ClassName CollectionOrderMethod
 * @Description 集中排序的方法，参考https://blog.csdn.net/QQ578473688/article/details/79734070
 *
 */
public class CollectionOrderMethod {

	/**
	 * 数据（整数）存储在ArrayList中
	 *
	 * @Date 2018年8月22日 下午6:14:09
	 */
	public static void sortNumbersInArrayList() {
		List<Integer> integers = new ArrayList<>();
		integers.add(5);
		integers.add(10);
		integers.add(0);
		integers.add(-1);
		System.out.println("Original list: " + integers);
		Collections.sort(integers);
		System.out.println("Sorted list: " + integers);
		Collections.sort(integers, Collections.reverseOrder());
		System.out.println("Reversed List: " + integers);
	}

	/**
	 * 数据（整数）存储在HashSet中
	 *
	 * @Date 2018年8月22日 下午6:14:24
	 */
	public static void sortNumbersInHashSet() {
		Set<Integer> integers = new HashSet<>();
		integers.add(5);
		integers.add(10);
		integers.add(0);
		integers.add(-1);
		System.out.println("Original set: " + integers);
		// Collections.sort(integers); This throws error since sort method accepts list not collection
		List<Integer> list = new ArrayList<>(integers);
		Collections.sort(list);
		System.out.println("Sorted set: " + list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reversed set: " + list);
	}

	/**
	 * 数据（整数）存储在TreeSet中
	 *
	 * @Date 2018年8月22日 下午6:20:20
	 */
	public static void sortNumbersInTreeSet() {
		Set<Integer> integers = new TreeSet<>();
		integers.add(5);
		integers.add(10);
		integers.add(0);
		integers.add(-1);
		System.out.println("Original set: " + integers);
		System.out.println("Sorted set: " + integers);
		Set<Integer> reversedIntegers = new TreeSet<Integer>(Collections.reverseOrder());
		reversedIntegers.add(5);
		reversedIntegers.add(10);
		reversedIntegers.add(0);
		reversedIntegers.add(-1);
		System.out.println("Reversed set: " + reversedIntegers);
	}

	/**
	 * 数据（Student对象）存储在ArrayList中
	 *
	 * @param type 采用Comparable比较
	 *            采用Comparator比较
	 * @Date 2018年8月22日 下午7:03:16
	 */
	public static void sortStudentInArrayList(String type) {
		List<StudentInfo> students = new ArrayList<>();
		StudentInfo student1 = new StudentInfo("Biplab", 3, 1.1, new BigDecimal("1.34"));
		students.add(student1);
		StudentInfo student2 = new StudentInfo("John", 5, 0.2, new BigDecimal("1.34"));
		students.add(student2);
		StudentInfo student3 = new StudentInfo("Pal", 0, 2.3, new BigDecimal("1.34"));
		students.add(student3);
		StudentInfo student4 = new StudentInfo("Biplab", 8, 1.5, new BigDecimal("1.34"));
		students.add(student4);
		System.out.println("Original students list: " + students.toString());
		if ("Comparator".equals(type)) {
			// 采用Comparator比较，
			Collections.sort(students, new NameComparator());
		} else {
			// 采用Comparable比较，在student重写了方法
			Collections.sort(students);// Error here
		}
		System.out.println("Sorted students list: " + students.toString());
		Collections.sort(students, Collections.reverseOrder());
		System.out.println("Reversed students list: " + students.toString());
	}

}
