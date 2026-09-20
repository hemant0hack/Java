class cars{
    public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford","Mazda","ex","next"};

    // Access the Elemnts of an Array.
    System.out.println(cars[0]);
    
    //Change an Array Elemnts.
    cars[0] = "Opel" ;
    System.out.println(cars[0]);

    // Array length
    System.out.println(cars.length);
        
    // Using new Keyword
    String[] car = new String[4];        // size is 4
    car[0] = "Volvo";
    car[1] = "BMW";
    car[2] = "Ford";
    car[3] = "Mazda";

    System.out.println(car[0]);

    // Loop through an Array
    for (int i = 0; i <  cars.length; i++){
        System.out.println(cars[i]);
    }

    int [] numbers = {10, 20, 30, 40};

     for(int i = 0; i<numbers.length; i++){
       System.out.println(numbers[i]);
        }
    }
}