public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void printTeacher(){
        System.out.println("Öğretmen Adı: " + this.name);
        System.out.println("Telefon No: " + this.mpno);
        System.out.println("Alan: " + this.branch);
    }
}
