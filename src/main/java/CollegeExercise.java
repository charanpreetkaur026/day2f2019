public class CollegeExercise
{
    public static void main(String[] args)
    {
        /*int a;
        int b;

      Arithmetic arithmetic= new Arithmetic();
      System.out.println("sum:" + arithmetic.add(a=20, b=30));
        System.out.println("sub:" + arithmetic.sub(a=20, b=3));
        System.out.println("mul:" + arithmetic.mul(a=20, b=3));
        System.out.println("div:" + arithmetic.div(a=20, b=3));*/

     Student s1=new Student();
        s1.setFirstName("Charan");
        s1.setLastName("Kaur");
        s1.setMarksSub1(30);
        s1.setMarksSub2(50);
        s1.setMarksSub3(60);
        s1.setMarksSub4(35);
        s1.setMarksSub5(80);

        System.out.println(s1.getfullName());
       s1.generateResult();


    }

}
