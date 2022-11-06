public class Klass {
    private String name;
    private int age;

    void setName(String name){
        this.name=name;
    }
    void setAge( int age){
        if (age>0){
            this.age=age;
        }else {
            System.out.println("jash ters san bolo albayt");
        }
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
