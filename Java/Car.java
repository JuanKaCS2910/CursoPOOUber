class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    void  printDataCar(){
        System.out.println("License: " + license + "\n" + "Name Driver: " + driver.name + "\n" + "Pasajero: " + passenger);
    }

    public Car(String license, Account driver ) {
        this.license = license;
        this.driver = driver;
    }
}
