package com.lk.pojo;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author timeout
 * @Date 2018年8月22日 下午6:10:33
 * @ClassName StudentInfo
 * @Description 学生信息实体类
 *
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class StudentInfo implements Comparable<StudentInfo> {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * double金额
	 */
	private double money;
	/**
	 * BigDecimal金额
	 */
	private BigDecimal trueMoney;

	@Override
	public int compareTo(StudentInfo o) {
//		if (this.age > o.getAge()) {
//			return 1;
//		} else if (this.age < o.getAge()) {
//			return -1;
//		} else {
//			return 0;
//		}
		return Double.compare(this.money, o.getMoney());
	}

}
