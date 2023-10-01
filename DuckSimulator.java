/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author amall
 */
public class DuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = ()-> System.out.println("squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        DecoyDuck decoy = new DecoyDuck();
        
        Duck model = new ModelDuck();
        
        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();
        
        model.performFly();
        model.setFlyBehavior(new FlyRockerPowered());
        model.performFly();
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih bebek yang ingin Anda ketahui perilakunya:");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Rubber Duck");
            System.out.println("3. Decoy Duck");
            System.out.println("4. Model Duck");
            System.out.println("0. Keluar");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline
            
            Duck duck = null;

            switch (choice) {
                case 1:
                    duck = new MallardDuck();
                    break;
                case 2:
                    duck = new RubberDuck(new FlyNoWay(), new Squeak());
                    break;
                case 3:
                    duck = new DecoyDuck();
                    break;
                case 4:
                    duck = new ModelDuck();
                    break;
                case 0:
                    System.out.println("Terima kasih! Program berakhir.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            if (duck != null) {
                duck.display();
                duck.performQuack();
                duck.performFly();


    }
    
    
        }
    }
}
        
