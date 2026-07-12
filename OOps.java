import java.util.Arrays;

public class OOps {
    public  void main(String[] args) {
        Student[] students = new Student[3];

        System.out.println(Arrays.toString(students));//since we have not created any obj so it will give null
        //Compile time  ---- Runtime  this is how memory will be allocated
        Student student1 = new Student();//student() is constructor wer calling it define wht happens when obj is created
        System.out.println(student1);//it is giving some random values
        System.out.println(student1.rno);//since we have taken reference from the class so default value will be 0
        System.out.println(student1.name);//null
        System.out.println(student1.score);//0.0

        //we can access it directly via dot

        //like
        student1.name="Aryan";
        student1.score=90.0f;
        student1.rno=30;
        System.out.println(student1.rno);//now it is change and if we print will get 30

        //like js and python we cannot add or define anything that is not in object
        //we cannot do student1.salary since it is not there in the class bcz secuity reason


    }
//making a data type for student that accepts int string and float
    //class basically means creating a reference of type student
     class Student{
        int rno;//these are the properties of class
        String name;
        float score;
    }
}
