public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    int sozlu;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code= code;
        this.prefix = prefix;
        int note = 0;
        int sozlu = 0;
    }

    void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.teacher=teacher;
        }else{
            System.out.printf("Bölümler Uyuşmuyor");
        }
    }

    void printTeacherInfo(){
        this.teacher.printTeacher();
    }
}
