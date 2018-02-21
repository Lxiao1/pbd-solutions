public class VariablesandNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, carsNotDriven, carsDriven; //declare these variables as integers
        double spaceInCar, carpoolCapacity, averagePassengersPerCar; //declare the other variables as a double

        cars = 100;
        spaceInCar = 4; //doesn't matter if there is a decimal or not since this variable is declared as a double
        drivers = 30;
        passengers = 90;
        carsNotDriven = cars - drivers;
        carsDriven = drivers;
        carpoolCapacity = carsDriven * spaceInCar;
        averagePassengersPerCar = passengers / carsDriven; //assign the variables


        System.out.println("There are " + cars + " cars available."); //print lines
        System.out.println("There are only " + drivers + " drivers available."); //more print
        System.out.println("There will be " + carsNotDriven + " empty cars today."); //more print
        System.out.println("We can transport " + carpoolCapacity + " people today."); //more print
        System.out.println("We have " + passengers + " to carpool today."); //more print
        System.out.println("We need to put about " + averagePassengersPerCar + " in each car."); //more print
    }
}
