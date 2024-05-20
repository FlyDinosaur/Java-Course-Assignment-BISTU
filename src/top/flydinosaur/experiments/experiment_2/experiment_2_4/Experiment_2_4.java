package top.flydinosaur.experiments.experiment_2.experiment_2_4;

import java.util.ArrayList;
import java.util.List;

public class Experiment_2_4 {

    public static void main(String[] args) {

        try {
            Student s1 = new Student("1", "张三", 18, "男");
            Student s2 = new Student("2", "李四", 19, "女");

            Teacher t1 = new Teacher("111", "王五", 45, "男");

            Course c1 = new Course("高等数学");
            Course c2 = new Course("面向对象技术");

            t1.addCourse(c1);
            t1.addCourse(c2);

            s1.enrollCourse(c1);
            s2.enrollCourse(c1);
            s1.enrollCourse(c2);

            s1.viewEnrolledCourses();
            System.out.println("-----------------------------------");
            s2.viewEnrolledCourses();
            System.out.println("-----------------------------------");
            t1.viewTeachingCourses();
            System.out.println("-----------------------------------");
            c1.viewCourseDetails();
            System.out.println("-----------------------------------");
            c2.viewCourseDetails();
            System.out.println("-----------------------------------");

        } catch (CourseLimitException e) {
            System.out.println(e.getMessage());
        } catch (DuplicateCourseException e) {
            System.out.println(e.getMessage());
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
        courses.remove(course);
        course.removeStudent(this);
    }

    public void viewEnrolledCourses() {
        System.out.println(getName() + "选的课程有:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
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

    public void addCourse(Course course) throws CourseLimitException {
        if (courses.size() >= 3) {
            throw new CourseLimitException("一个老师不能授课超过三门！");
        }
        courses.add(course);
        course.setTeacher(this);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
        course.setTeacher(null);
    }

    public void viewTeachingCourses() {
        System.out.println(getName() + "教授的课为:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
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
        System.out.println("课程名: " + courseName);
        if (teacher != null) {
            System.out.println("授课教师: " + teacher.getName());
        } else {
            System.out.println("该课程暂时无人授课！");
        }
        System.out.println("选了这门课的同学有:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
