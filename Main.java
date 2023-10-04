public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Yusuf", "555","TRH");
        Teacher t2 = new Teacher("Ahmet", "000", "FZK");
        Teacher t3 = new Teacher("Veli", "123456", "MAT");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik" , "102", "FZK");
        fizik.addTeacher(t2);
        Course matematik = new Course("Matematik", "103", "MAT");
        matematik.addTeacher(t3);

        Student s1 = new Student("Bilal Can", "123", "4", tarih,fizik,matematik);
        s1.addBulkExamNote(100,99,50);
        s1.sozluNotu(100,50,60);
        s1.isPass();


        Student s2 = new Student("Can Demir", "321", "3", tarih, fizik, matematik);
        s2.addBulkExamNote(20,10,5);
        s2.sozluNotu(60,70,80);
        s2.isPass();


    }
}