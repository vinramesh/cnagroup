package com.mad.singtel.rest.api.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mad.singtel.rest.api.Animal;
import com.mad.singtel.rest.api.miscellaneous.AnimalCount;

@RequestMapping("/animal")
@Controller
public class AnimalController {
   // @RequestMapping(method = RequestMethod.GET, value = "/animal/getFlyingAnimalCount")
    @RequestMapping(value = "/api/getFlyingAnimalCount", method = RequestMethod.GET)
    @ResponseBody
    public int  getFlyingAnimalCount(@RequestBody Animal[] animals) {
        AnimalCount animalCount = new AnimalCount(animals);
        int flyingAnimal = animalCount.getFlyingAnimal();
        return flyingAnimal;
    }
}
