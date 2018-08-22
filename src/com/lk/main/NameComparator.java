package com.lk.main;

import java.util.Comparator;

import com.lk.pojo.StudentInfo;

/**
 * @author 李凯
 * @Date 2018年8月22日 下午7:13:14
 * @ClassName NameComparator
 * @Description 排序方式
 *
 */
public class NameComparator implements Comparator<StudentInfo> {

	@Override
	public int compare(StudentInfo o1, StudentInfo o2) {
//		if (Double.doubleToLongBits(o1.getMoney()) > Double.doubleToLongBits(o2.getMoney())) {
//			return 1;
//		} else if (Double.doubleToLongBits(o1.getMoney()) < Double.doubleToLongBits(o2.getMoney())) {
//			return -1;
//		} else {
//			return 0;
//		}
//		if (o1.getAge() > o2.getAge()) {
//			return 1;
//		} else if (o1.getAge() < o2.getAge()) {
//			return -1;
//		} else {
//			return 0;
//		}
		return Double.compare(o2.getMoney(), o1.getMoney());
	}

}
