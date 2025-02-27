package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model,
                            @RequestParam(required = false, defaultValue = "5") int count) {
        List<Car> cars = new CarService().getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
