import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Klass klass=new Klass();
//        klass.setName("Baiysh");
//        klass.setAge(22);
//        System.out.println(klass.getName());
//        System.out.println(klass.getAge());
        Apartment apartment = new Apartment();
        apartment.setTitle("ihlas");
        apartment.setPrice(12000);
        apartment.setAddress("bishkek");

        Apartment apartment2 = new Apartment();
        apartment2.setTitle("vostok");
        apartment2.setPrice(10000);
        apartment2.setAddress("chuy");


        Student student = new Student();
        student.setFullName("Baiysh Orozaliev");
        student.setFhonNum(1000000000);
        student.setAdress("bishkek");
        student.setBankChet(60000);

        Student student2 = new Student();
        student2.setFullName("Kurstan Erkinbaev");
        student2.setFhonNum(2000000000);
        student2.setAdress("bishkek");
        student2.setBankChet(15000);

        Student student3 = new Student();
        student3.setFullName("Shakirov Altynbek");
        student3.setFhonNum(300000000);
        student3.setAdress("bishkek");
        student3.setBankChet(20000);

        Student student4 = new Student();
        student4.setFullName("Syimyk Jumabek uulu");
        student4.setFhonNum(400000000);
        student4.setAdress("chuy");
        student4.setBankChet(10000);

        Student student5 = new Student();
        student5.setFullName("Davran Joldoshbaev");
        student5.setFhonNum(500000000);
        student5.setAdress("chuy");
        student5.setBankChet(8000);

        Student student6 = new Student();
        student6.setFullName("Sadirov Nurseyit");
        student6.setFhonNum(600000000);
        student6.setAdress("chuy");
        student6.setBankChet(8000);


        Apartment[] apartments = {apartment, apartment2};

        Student[] students = {student, student2, student3, student4, student5, student6};


//        method(scanner.nextLine(), apartments, students);
//        double paypermenth = apartment.peypermonth(method(apartment.getTitle(), apartments,students));
//        System.out.println("_____________________________");

//        double pay = apartment2.peypermonth(3);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String str = scanner.nextLine().toLowerCase();
            System.out.println("________________________________");
            switch (str) {
                case "ihlas":

                    int paypermenth = apartment.peypermonth(method(apartment.getTitle(), apartments, students));

                    break;
                case "vostok":
                    int paypermenth2 = apartment2.peypermonth(method(apartment2.getTitle(), apartments, students));
                    int count = 0;
                  //  while (true)
                        count++;
                        
                        System.out.println("________________________________");
                        break;
                  //  }
            }
        }

    }

    static public int method(String title, Apartment[] apartments, Student[] students) {
        int counter = 0;
        for (Apartment apartment : apartments) {
            boolean treuOrFalse = title.toUpperCase().equals(apartment.getTitle().toUpperCase());
            if (treuOrFalse) {
                apartment.getInfo();

                System.out.println();
                for (Student student : students) {
                    if (apartment.getAddress().toLowerCase().equals(student.getAdress().toLowerCase(Locale.ROOT))) {
                        student.getinf();
                        counter++;
                    }
                }
            }

        }
        return counter;
    }
}