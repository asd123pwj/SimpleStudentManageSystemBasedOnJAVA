package graduateSchool;

import school.Student;


public class GraduateStudent extends Student {
	public String tutorName;
	public String researchName;
	
	//在子类中使用父类构造方法
	GraduateStudent(String num, String name, String sex, String addr, String school, String academy, String major, String tutorName, String researchName){
		super(num, name, sex, addr, school, academy, major);
		this.tutorName = tutorName;
		this.researchName = researchName;
	}
	
	//计算课程平均分，覆盖父类方法。
	public void getAverageGrade() {		
		System.out.println(this.studentName + "为研究生，其平均成绩为：" + studentCourse.getAverageGrade());
	}
	
	//研究生信息展示，覆盖父类方法，并调用被覆盖的父类方法。
	public void showStudentInfo() {		
		System.out.println("\n"+super.studentName+"为研究生。");
		super.showStudentInfo();
		System.out.println("导师："+ tutorName);
		System.out.println("课题名称："+ researchName);
	}
	
}
