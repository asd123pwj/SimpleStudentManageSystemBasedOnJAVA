package graduateSchool;

import java.util.*;

public class School {
	public static void main(String args[]) {
		boolean showMenu = true;
		Scanner reader = new Scanner(System.in);
		GraduateStudentGroup studentGroup = new GraduateStudentGroup();
		while(true) {
			if(showMenu) {
				System.out.println("\n�о�������˵���");
				System.out.println("1.�о�����Ϣһ����");
				System.out.println("2.�����о�����");
				System.out.println("3.�о���ѡ�Ρ�");
				System.out.println("4.�о����ɼ�¼�롣");
				System.out.println("5.�ض��о�����Ϣ��ѯ��");
				System.out.println("6.�ض��о����γ̲�ѯ��");
				System.out.println("7.��ʾ/�����о�������˵���");
				System.out.println("8.�˳���");
				System.out.print("������Ž������");
			}
			else {
				System.out.print("������Ž������(7:��ʾ�˵�)��");
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
