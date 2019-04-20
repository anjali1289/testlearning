package com.java.util;

import java.util.ArrayList;

import com.java.dao.StudentInfoDao;
import com.java.entity.StudentInfo;

public class Test {

	public static void main(String[] args) {
		StudentInfoDao d = new StudentInfoDao();
		ArrayList<StudentInfo> s=d.FindAdd();
		for(StudentInfo f:s) {
			System.out.println(f);
		}

	}

}
