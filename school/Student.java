package school;

import java.util.*;


public class Student {
	public String studentNum;
	public String studentName;
	public String studentSex;
	public String studentAddr;
	public String studentSchool;
	public String studentAcademy;
	public String studentMajor;
	public StudentCourse studentCourse = new StudentCourse();
	
	public Student() {
		;
	}
	
	public Student(String num, String name, String sex, String addr, String school, String academy, String major){
		studentNum = num;
		studentName = name;
		studentSex = sex;
		studentAddr = addr;
		studentSchool = school;
		studentAcademy = academy;
		studentMajor = major;
	}
	
	//添加学生课程
	
	//显示学生信息。
	public void showStudentInfo() {	
		System.out.println("学号：" + studentNum);
		System.out.println("姓名：" + studentName);
		System.out.println("性别：" + studentSex);
		System.out.println("生源地：" + studentAddr);
		System.out.println("学校：" + studentSchool);
		System.out.println("学院：" + studentAcademy);
		System.out.println("专业：" + studentMajor);
//		showStudentCourseInfo();
	}
	
	public void showStudentCourseInfo() {
		studentCourse.showCourseInfo();
		if(studentCourse.courseGroup == null || studentCourse.finishCourseNum==0) return;
		getAverageGrade();
		System.out.println("最低分："+getMinGrade()+"，最高分："+getMaxGrade());
		if(studentCourse.failCourseNum>=3) {
			System.out.println("！警告！当前学生挂科数过多，挂科数：" + studentCourse.failCourseNum);
		}
	}
	
	//计算课程平均分
	public void getAverageGrade() {			
		System.out.println("各课程平均分为：" + studentCourse.getAverageGrade());
	}
	
	//计算课程最低分
	public double getMinGrade() {			
		return studentCourse.getMinGrade();
	}
	
	//计算课程最高分
	public double getMaxGrade() {			
		return studentCourse.getMaxGrade();
	}
	
	public void addCourse(Scanner reader) {
		System.out.print("输入课程名称、课程号：");
		String courseName = reader.next();
		String courseNum = reader.next();
		System.out.print("课程已结课？y/n：");
		String hasGrade = reader.next();
		if(hasGrade.contentEquals("y")) {
			System.out.print("输入课程成绩：");
			double courseGrade = reader.nextDouble();
			studentCourse.addStudentCourse(courseName, courseNum, courseGrade);
		}
		else if(hasGrade.contentEquals("n")) {
			studentCourse.addStudentCourse(courseName, courseNum);
		}
	}
	
	public void addCourseGrade(Scanner reader) {
		System.out.print("请输入待修改成绩课程的课程号：");
		String courseNum = reader.next();
		System.out.print("请输入成绩：");
		double grade = reader.nextDouble();
		studentCourse.inputStudentGrade(courseNum, grade);
	}
	
}
