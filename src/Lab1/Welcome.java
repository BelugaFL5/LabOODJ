    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
     */
    package Lab1;

    /**
     *
     * @author 
     */


    public class Welcome {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            System.out.println("KJ");
            /*
            data type
            int
            float
            double

            non numeric data type
            char
            string
            boolean
            */
            int age;
            String name;
            String hobby;
            boolean ageStatus = false;


            age = 80;
            name = "KJ";
            hobby = "play piano";

            System.out.println("Name:"+name + "\n Age:"+age +"\nHobby:"+hobby);

            if(age>=40)

            {
               ageStatus = true;
                System.out.println(name+" Old as Trump," + ageStatus);
            }else{
                        System.out.println(name+" Young oh!!!!"+ ageStatus);
                        }    
            }
        }


