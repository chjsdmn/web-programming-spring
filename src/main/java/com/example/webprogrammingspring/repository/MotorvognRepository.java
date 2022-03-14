package com.example.webprogrammingspring.repository;

import com.example.webprogrammingspring.model.Car;
import com.example.webprogrammingspring.model.Motorvogn;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MotorvognRepository {

    private List<Motorvogn> list = new ArrayList<>();
    private List<Car> carList = new ArrayList<>();

    public MotorvognRepository(){
        Car car1 = new Car("Xpeng", "V90");
        Car car2 = new Car("Xpeng", "V80");
        Car car3 = new Car("Xpeng", "V70");
        Car car4 = new Car("Honda", "G7");
        Car car5 = new Car("Honda", "G8");
        Car car6 = new Car("Honda", "G9");
        Car car7 = new Car("Toyota", "C33");
        Car car8 = new Car("Toyota", "H690");

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
    }

    public List<Car> henteAlleCar(){
        return carList;
    }

    public void lagreMotor(Motorvogn motorvogn){
        list.add(motorvogn);
    }

    public List<Motorvogn> henteMotor(){
        return list;
    }

    public void slettMotor(){
        list.clear();
    }

}
