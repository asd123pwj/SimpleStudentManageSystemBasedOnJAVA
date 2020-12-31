package school;


public class StudentCourse {
	Course courseGroup[];				//存储学生选课信息
	int failCourseNum = 0;				//学生挂科数
	int finishCourseNum = 0;			//学生结课数
	
	//显示学生选课课程信息
	public void showCourseInfo() {		
		if(courseGroup == null) return;
		for(Course course : courseGroup) {
			System.out.print("课程名称："+course.courseName);
			System.out.print("\t课程号："+course.courseNum);
			if(course.isFinish) {
				System.out.print("\t成绩：" + course.courseGrade);
			}
			System.out.println("");
		}
	}
	
	//增加学生课程
	public void addStudentCourse(String courseName, String courseNum) {
		addStudentCourse(new Course(courseName, courseNum));
	}

	//增加学生课程
	public void addStudentCourse(String courseName, String courseNum, double courseGrade) {
		addStudentCourse(new Course(courseName, courseNum, courseGrade));
	}
	
	//增加学生课程
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
	
	//学生成绩录入
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
			System.out.println("未找到该课程。");
	}
	
	//计算课程平均分
	public double getAverageGrade() {		
		double sum = 0;
		for(Course course:courseGroup) {
			sum += course.courseGrade;
		}
		return sum/(finishCourseNum);
	}
	
	//计算课程最低分
	public double getMinGrade() {			
		double min = 100;
		for(Course course:courseGroup) {
			if(course.isFinish)
				min = min<course.courseGrade ? min : course.courseGrade;
		}
		return min;
	}
	
	//计算课程最高分
	public double getMaxGrade() {			
		double max = 0;
		for(Course course:courseGroup) {
			if(course.isFinish)
				max = max>course.courseGrade ? max : course.courseGrade;
		}
		return max;
	}
	
}

