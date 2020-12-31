package graduateSchool;

import java.util.Scanner;
import school.*;

public class GraduateStudentGroup extends StudentGroup {
	Student[] studentGroup;
	
	public void addStudent(Scanner reader) {
		System.out.print("请输入研究生学号、姓名、性别、生源地、所在学校、学院、专业、导师名、课题名称：");
		String studentNum = reader.next();
		String studentName = reader.next();
		String studentSex = reader.next();
		String studentAddr = reader.next();
		String studentSchool = reader.next();
		String studentAcademy = reader.next();
		String studentMajor = reader.next();
		String tutorName = reader.next();
		String researchName = reader.next();
		if(studentGroup == null) {
			studentGroup = new GraduateStudent[1];
			studentGroup[0] = new GraduateStudent(studentNum, studentName, studentSex, studentAddr, studentSchool, studentAcademy, studentMajor, tutorName, researchName);
		}
		else {
			Student[] temp = new GraduateStudent[1];
			temp[0] = new GraduateStudent(studentNum, studentName, studentSex, studentAddr, studentSchool, studentAcademy, studentMajor, tutorName, researchName);

			Student[] newGroup = new GraduateStudent[studentGroup.length + 1];
			System.arraycopy(studentGroup, 0, newGroup, 0, studentGroup.length);
			System.arraycopy(temp, 0, newGroup, newGroup.length-1, 1);
			studentGroup = newGroup;
		}
	}
	
	public void showStudentGroup() {
		if(studentGroup == null) {
			System.out.println("无任何学生信息。");
			return;
		}
		System.out.println("学生学号列表：");
		for(Student student:studentGroup) {
			System.out.print(student.studentNum+" ");
		}
		System.out.println("");
	}
	
	public Student findStudent(Scanner reader) {
		System.out.print("输入学生学号：");
		String studentNum = reader.next();
		if(studentGroup == null) {
			System.out.println("无此学生。");
			return null;
		}
		for(Student student:studentGroup) {
			if(studentNum.contentEquals(student.studentNum)) {
				return student;
			}
		}
		System.out.println("无此学生。");
		return null;
	}
	
}
