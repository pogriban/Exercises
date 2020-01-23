import java.util.Random;

public class RandomOne {

    public static void main(String[] args) {
        //Initialize the random object
        int max = 49; 
        int min = 39; 
        int range = max - min + 1; 
  
        // generate random numbers within 1 to 10 
       
            int rand = (int)(Math.random()*range)+min ; 
  
            // Output is different everytime this code is executed 
            System.out.println(rand); 
        int max1=100-max-rand;
         System.out.println("max "+max +" "+max1); 
        Random random = new Random();

        //Generate numbers between 0 and 100
        int fo = random.nextInt(7);
        int secondRandomValue = random.nextInt(7);
        int f=(int)(Math.random());
        
        int r=(int)(Math.random() * range) + 1;
        System.out.println("1 1 " + f);
        double f1=100-f;
        System.out.println("1 2 " + f1);
        double f2=1-Math.random();
        double f3=1-Math.random();
       // double z=f;
       // double z1=f1;
       // double z2=f2;
       // double z3=f3;
       // if (f<f1){f=z1;f1=z;}
        double g=Math.max(f, f1);
                double g1=Math.max(f1, f2);
        //Print the generated random values
        System.out.println("1 22 " + g);
        System.out.println("2 22 " + g1);
        
        System.out.println("1 " + f);
        System.out.println("2 " + f1);
        System.out.println("3 " + f2);
        System.out.println("4 " + f3);
        System.out.println("First int: " + fo);
        /*
        System.out.println("Second int: " + secondRandomValue);

        //Generate double random values (values are between 0 (inclusive) and 1.0 (exclusive))
        double firstRandomDouble = random.nextDouble();
        double secondRandomDouble = random.nextDouble();

        //Print the generated random values
        System.out.println("First double: " + firstRandomDouble);
        System.out.println("Second double: " + secondRandomDouble);*/
    }
}