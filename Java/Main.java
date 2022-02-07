class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ123",new Account("Juan Carlos", "XABC"),"Kia","Sportage");
        uberX.passenger = 4;
        uberX.printDataCar();

        User user = new User(5,"Juan","DNI","juan.castro.socla@gmial.com","Pequeno");
        user.id = 10;
        user.printDataUser();
        //System.out.println("Car License: " + car.license+ " \n" + "Car driver : "+ car.driver);
    }
}