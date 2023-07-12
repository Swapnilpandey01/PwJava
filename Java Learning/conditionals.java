public class conditionals {
    public static void main(String[] args) {
        // int age = 18;
        
        // if(age >=18)
        // {
        //     System.out.println("you are a men bro");
        // }
        // else
        // {
        //     System.out.println("you are child");
        // }

        // int age = 15;

        // if (age >=18 && age <60)
        // {
        //     System.out.println("you are a men");
        // }
        // else if(age >=60)
        // {
        //     System.out.println("you are old");
        // }
        // else
        // {
        //     System.out.println("you are a child");
        // }

        int age =40;
        if(age >=18 && age <=60)
        {
            
            if(age >20 && age <30)
            {
                System.out.println("you are in 20's");
            }
            else if(age >30 && age <40)
            {
                System.out.println("you are in 30's");
            }
            else
            {
                System.out.println("you are neithe rin 30's or 20's");
            }

        }
        else if(age>60)
        {
            System.out.println("you are a old men");
        }
        else if(age>=16 && age <18)
        {
            System.out.println("you are young");
        }
        else
        {
            System.out.println("you are a child");
        }
         

    }
}
