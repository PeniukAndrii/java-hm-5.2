package com.example.java6.contollers;

import com.example.java6.dao.CarDAO;
import com.example.java6.models.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@AllArgsConstructor
public class MainControllers {
    private CarDAO carDAO;


    @PostMapping("/save")
    public String save(@RequestParam String carModel, Model model){
        carDAO.save(new Car(carModel));
        model.addAttribute("cars",carDAO.findAll());
        return "cars.html";
    }

    @GetMapping("/cars/{id}")
    public String cars(@PathVariable int id, Model model){
        Car one = carDAO.getOne(id);
        model.addAttribute("car", one);
        return "car.html";
    }

}
