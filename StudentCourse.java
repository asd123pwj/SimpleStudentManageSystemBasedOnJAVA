package school;


public class StudentCourse {
	Course courseGroup[];				//�洢ѧ��ѡ����Ϣ
	int failCourseNum = 0;				//ѧ���ҿ���
	int finishCourseNum = 0;			//ѧ�������
	
	//��ʾѧ��ѡ�ογ���Ϣ
	public void showCourseInfo() {		
		if(courseGroup == null) return;
		for(Course course : courseGroup) {
			System.out.print("�γ����ƣ�"+course.courseName);
			System.out.print("\t�γ̺ţ�"+course.courseNum);
			if(course.isFinish) {
				System.out.print("\t�ɼ���" + course.courseGrade);
			}
			System.out.println("");
		}
	}
	
	//����ѧ���γ�
	public void addStudentCourse(String courseName, String courseNum) {
		addStudentCourse(new Course(courseName, courseNum));
	}

	//����ѧ���γ�
	public void addStudentCourse(String courseName, String courseNum, double courseGrade) {
		addStudentCourse(new Course(courseName, courseNum, courseGrade));
	}
	
	//����ѧ���γ�
	private void addStudentCourse(Course course) {	
		if(course.courseGrade<60 && course.isFinish) failCourseNum+=1;
		if(course.isFinish)	finishCourseNum += 1;		
		Course[] tempCourse = {course};
		if(courseGroup != null) {
			Course[] newCourse = new Course[courseGroup.length + 1];
			System.arraycopy(courseGroup, 0, newCourse, 0, courseGroup.length);
			System.arraycopy(tempCourse, 0, newCourse, newCourse.length-1, 1);
			courseGroup = newCourse;
		}
		else {
			courseGroup = tempCourse;
		}
	}
	
	//ѧ���ɼ�¼��
	public void inputStudentGrade(String courseNum, double grade) {
		boolean hasInput = false;
		for(Course course: courseGroup) {
			if(course.courseNum.contentEquals(courseNum)) {
				course.inputGrade(grade);
				finishCourseNum += 1;	
				course.isFinish = true;	
				if(course.courseGrade<60) failCourseNum+=1;
				hasInput = true;
			}
		}
		if(!hasInput)
			System.out.println("δ�ҵ��ÿγ̡�");
	}
	
	//����γ�ƽ����
	public double getAverageGrade() {		
		double sum = 0;
		for(Course course:courseGroup) {
			sum += course.courseGrade;
		}
		return sum/(finishCourseNum);
	}
	
	//����γ���ͷ�
	public double getMinGrade() {			
		double min = 100;
		for(Course course:courseGroup) {
			if(course.isFinish)
				min = min<course.courseGrade ? min : course.courseGrade;
		}
		return min;
	}
	
	//����γ���߷�
	public double getMaxGrade() {			
		double max = 0;
		for(Course course:courseGroup) {
			if(course.isFinish)
				max = max>course.courseGrade ? max : course.courseGrade;
		}
		return max;
	}
	
}

