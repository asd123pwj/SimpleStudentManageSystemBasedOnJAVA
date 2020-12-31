package school;

public class Course{
	public String courseName;
	public String courseNum;
	public double courseGrade;
	public boolean isFinish = false;
	
	//未考试的课程
	public Course(String courseName, String courseNum){					
		this.courseName = courseName;
		this.courseNum = courseNum;
	}
	
	//考完试的课程，构造方法重载
	public Course(String courseName, String courseNum, double grade){	
		this.courseName = courseName;
		this.courseNum = courseNum;
		this.courseGrade = grade;
		this.isFinish = true;
	}
	
	//为未考试的课程输入课程成绩
	public void inputGrade(double grade) {								
		courseGrade = grade;
		isFinish = true;
	}
}


