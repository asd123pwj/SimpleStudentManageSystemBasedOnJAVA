package graduateSchool;

import school.Student;


public class GraduateStudent extends Student {
	public String tutorName;
	public String researchName;
	
	//��������ʹ�ø��๹�췽��
	GraduateStudent(String num, String name, String sex, String addr, String school, String academy, String major, String tutorName, String researchName){
		super(num, name, sex, addr, school, academy, major);
		this.tutorName = tutorName;
		this.researchName = researchName;
	}
	
	//����γ�ƽ���֣����Ǹ��෽����
	public void getAverageGrade() {		
		System.out.println(this.studentName + "Ϊ�о�������ƽ���ɼ�Ϊ��" + studentCourse.getAverageGrade());
	}
	
	//�о�����Ϣչʾ�����Ǹ��෽���������ñ����ǵĸ��෽����
	public void showStudentInfo() {		
		System.out.println("\n"+super.studentName+"Ϊ�о�����");
		super.showStudentInfo();
		System.out.println("��ʦ��"+ tutorName);
		System.out.println("�������ƣ�"+ researchName);
	}
	
}
