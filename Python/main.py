from account import Account
from car import Car

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car("AMS3214",  Account("Juan Castro","45ABC5777"))
    print(vars(car))
    print(vars(car.driver))
    # car = Car()
    # car.license = "AMS321"
    # car.drive = "Pequeño Califa"
    # print(vars(car))
    