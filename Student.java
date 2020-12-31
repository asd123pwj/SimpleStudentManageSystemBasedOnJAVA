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
	
	//���ѧ���γ�
	
	//��ʾѧ����Ϣ��
	public void showStudentInfo() {	
		System.out.println("ѧ�ţ�" + studentNum);
		System.out.println("������" + studentName);
		System.out.println("�Ա�" + studentSex);
		System.out.println("��Դ�أ�" + studentAddr);
		System.out.println("ѧУ��" + studentSchool);
		System.out.println("ѧԺ��" + studentAcademy);
		System.out.println("רҵ��" + studentMajor);
//		showStudentCourseInfo();
	}
	
	public void showStudentCourseInfo() {
		studentCourse.showCourseInfo();
		if(studentCourse.courseGroup == null || studentCourse.finishCourseNum==0) return;
		getAverageGrade();
		System.out.println("��ͷ֣�"+getMinGrade()+"����߷֣�"+getMaxGrade());
		if(studentCourse.failCourseNum>=3) {
			System.out.println("�����棡��ǰѧ���ҿ������࣬�ҿ�����" + studentCourse.failCourseNum);
		}
	}
	
	//����γ�ƽ����
	public void getAverageGrade() {			
		System.out.println("���γ�ƽ����Ϊ��" + studentCourse.getAverageGrade());
	}
	
	//����γ���ͷ�
	public double getMinGrade() {			
		return studentCourse.getMinGrade();
	}
	
	//����γ���߷�
	public double getMaxGrade() {			
		return studentCourse.getMaxGrade();
	}
	
	public void addCourse(Scanner reader) {
		System.out.print("����γ����ơ��γ̺ţ�");
		String courseName = reader.next();
		String courseNum = reader.next();
		System.out.print("�γ��ѽ�Σ�y/n��");
		String hasGrade = reader.next();
		if(hasGrade.contentEquals("y")) {
			System.out.print("����γ̳ɼ���");
			double courseGrade = reader.nextDouble();
			studentCourse.addStudentCourse(courseName, courseNum, courseGrade);
		}
		else if(hasGrade.contentEquals("n")) {
			studentCourse.addStudentCourse(courseName, courseNum);
		}
	}
	
	public void addCourseGrade(Scanner reader) {
		System.out.print("��������޸ĳɼ��γ̵Ŀγ̺ţ�");
		String courseNum = reader.next();
		System.out.print("������ɼ���");
		double grade = reader.nextDouble();
		studentCourse.inputStudentGrade(courseNum, grade);
	}
	
}
