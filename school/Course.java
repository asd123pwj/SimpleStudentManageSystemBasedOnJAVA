package school;

public class Course{
	public String courseName;
	public String courseNum;
	public double courseGrade;
	public boolean isFinish = false;
	
	//δ���ԵĿγ�
	public Course(String courseName, String courseNum){					
		this.courseName = courseName;
		this.courseNum = courseNum;
	}
	
	//�����ԵĿγ̣����췽������
	public Course(String courseName, String courseNum, double grade){	
		this.courseName = courseName;
		this.courseNum = courseNum;
		this.courseGrade = grade;
		this.isFinish = true;
	}
	
	//Ϊδ���ԵĿγ�����γ̳ɼ�
	public void inputGrade(double grade) {								
		courseGrade = grade;
		isFinish = true;
	}
}


