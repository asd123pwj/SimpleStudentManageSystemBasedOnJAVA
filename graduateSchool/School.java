package graduateSchool;

import java.util.*;

public class School {
	public static void main(String args[]) {
		boolean showMenu = true;
		Scanner reader = new Scanner(System.in);
		GraduateStudentGroup studentGroup = new GraduateStudentGroup();
		while(true) {
			if(showMenu) {
				System.out.println("\n研究生管理菜单：");
				System.out.println("1.研究生信息一览。");
				System.out.println("2.新增研究生。");
				System.out.println("3.研究生选课。");
				System.out.println("4.研究生成绩录入。");
				System.out.println("5.特定研究生信息查询。");
				System.out.println("6.特定研究生课程查询。");
				System.out.println("7.显示/隐藏研究生管理菜单。");
				System.out.println("8.退出。");
				System.out.print("输入序号进入管理：");
			}
			else {
				System.out.print("输入序号进入管理(7:显示菜单)：");
			}
			switch(reader.nextInt()) {
			case 1:
				studentGroup.showStudentGroup();
				break;
			case 2:
				studentGroup.addStudent(reader);
				break;
			case 3:
				studentGroup.addStudentCourse(reader);
				break;
			case 4:
				studentGroup.inputStudentCourseGrade(reader);
				break;
			case 5:
				studentGroup.showStudentInfo(reader);
				break;
			case 6:
				studentGroup.showStudentCourseInfo(reader);
				break;
			case 7:
				showMenu = !showMenu;
				break;
			case 8:
				reader.close();
				return ;
			}
		}
	}
}
