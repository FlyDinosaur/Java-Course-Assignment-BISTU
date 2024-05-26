package top.flydinosaur.experiments.experiment_2.experiment_2_4;

import java.util.ArrayList;
import java.util.List;

public class Experiment_2_4 {

    public static void main(String[] args) {
        try {
            //正常情况下的测试代码：

            Student s1 = new Student("1", "张三", 20, "M");
            Student s2 = new Student("2", "李四", 19, "F");
            Teacher t1 = new Teacher("101", "刘老师", 50, "F");
            Course c1 = new Course("面向对象技术");
            Course c2 = new Course("Java程序设计");
            Course c3 = new Course("C语言程序设计");

            s1.enrollCourse(c1);
            s1.enrollCourse(c2);
            s2.enrollCourse(c1);
            t1.addCourse(c1);
            t1.addCourse(c2);
            t1.addCourse(c3);

            c1.viewCourseDetails();
            System.out.println();
            s1.viewEnrolledCourses();
            System.out.println();
            t1.viewTeachingCourses();
            System.out.println();
            c1.viewEnrolledStudents();
            System.out.println();
            s1.dropCourse(c1);
            System.out.println();
            c1.viewCourseDetails();
            System.out.println();
            s1.viewEnrolledCourses();


            //选课人数超过60人情况下的测试类代码（需要使用时把其他情况的代码注释掉，并取消下列代码的注释）：

//            Course c1 = new Course("高等数学");
//            Student[] students = new Student[60];
//            for (int i = 0; i < students.length; i++) {
//                students[i] = new Student("test" + i, "test" + (i+1), i, "test");
//                students[i].enrollCourse(c1);
//            }
//            Student errorStudent = new Student("test60", "test61", 11, "test");
//            errorStudent.enrollCourse(c1);
//            c1.viewCourseDetails();

            //教师教授课程数量超过3门情况下的测试类代码（需要使用时把其他情况的代码注释掉，并取消下列代码的注释）：

//            Course c1 = new Course("高等数学");
//            Course c2 = new Course("离散数学");
//            Course c3 = new Course("面向对象技术java");
//            Course c4 = new Course("程序设计基础C语言");
//            Teacher[] teachers = new Teacher[3];
//            Teacher errorTeacher = new Teacher("Test", "Test", 20, "unKnow");
//            errorTeacher.addCourse(c1);
//            errorTeacher.addCourse(c2);
//            errorTeacher.addCourse(c3);
//            errorTeacher.addCourse(c4);
//            c1.viewCourseDetails();

            //学生重复选一门课情况下的测试类代码（需要使用时把其他情况的代码注释掉，并取消下列代码的注释）：

//            Course c1 = new Course("高等数学");
//            Student student = new Student("test", "test", 18, "unKnow");
//            student.enrollCourse(c1);
//            student.enrollCourse(c1);



        } catch (CourseLimitException e) {
            e.printStackTrace();
        } catch (DuplicateCourseException e) {
            e.printStackTrace();
        }
    }

}


class CourseLimitException extends Exception {
    public CourseLimitException(String message) {
        super(message);
    }
}

class DuplicateCourseException extends Exception {
    public DuplicateCourseException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class Student extends Person {
    private String id;
    private List<Course> courses;

    public Student(String id, String name, int age, String gender) {
        super(name, age, gender);
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enrollCourse(Course course) throws CourseLimitException, DuplicateCourseException {
        if (course.getStudents().size() >= 60) {
            throw new CourseLimitException("课程已满60人，无法继续选择");
        }
        if (courses.contains(course)) {
            throw new DuplicateCourseException("你已经选了这门课，不能重复选课");
        }
        courses.add(course);
        course.addStudent(this);
    }

    public void dropCourse(Course course) {
        System.out.println(getName() + "同学取消了《" + course.getCourseName() + "》课程！");
        courses.remove(course);
        course.removeStudent(this);
    }

    public void viewEnrolledCourses() {
        System.out.println(getName() + "同学的基本信息：\n学号：" + getId() + "\n姓名：" + getName() + ", 年龄：" + getAge() + ", 性别:" + getGender());
        System.out.print("选修的课程有：");
        for (Course course : courses) {
            System.out.print(course.getCourseName() + "\t");
        }
        System.out.println();
    }
}

class Teacher extends Person {
    private String id;
    private List<Course> courses;

    public Teacher(String id, String name, int age, String gender) {
        super(name, age, gender);
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getTeacherId() {
        return id;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) throws CourseLimitException, DuplicateCourseException {
        if (courses.size() >= 3) {
            throw new CourseLimitException("一个教师不能授课超过3门");
        }
        if (courses.contains(course)) {
            throw new DuplicateCourseException("该老师已教授这门课，不能重复教授");
        }
        courses.add(course);
        course.setTeacher(this);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
        course.setTeacher(null);
    }

    public void viewTeachingCourses() {
        System.out.println(getName() + "的基本信息:\n工号:" + getTeacherId() + "\n姓名：" + getName() + ", 年龄：" + getAge() + "， 性别：" + getGender());
        System.out.print("教授的课程：");
        for (Course course : courses) {
            System.out.print(course.getCourseName() + "\t");
        }
        System.out.println();
    }
}

class Course {
    private String courseName;
    private Teacher teacher;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) throws DuplicateCourseException {
        if (students.contains(student)) {
            throw new DuplicateCourseException("学生已选了这门课");
        }
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void viewCourseDetails() {
        System.out.println("《" + courseName + "》课程的基本信息\n课程名称：" + courseName);
        if (teacher != null) {
            System.out.println("授课教师: " + teacher.getName());
        } else {
            System.out.println("该课程暂时无人授课！");
        }
        System.out.print("选课学生：");
        for (Student student : students) {
            System.out.print(student.getName() + "\t");
        }
        System.out.println();
    }

    public void viewEnrolledStudents() {
        System.out.print("《" + courseName + "》课程的学生名单：");
        for (Student student : students) {
            System.out.print(student.getName() + "\t");
        }
        System.out.println();
    }
}
