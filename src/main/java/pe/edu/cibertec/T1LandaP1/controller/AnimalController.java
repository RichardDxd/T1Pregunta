package pe.edu.cibertec.T1LandaP1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.T1LandaP1.client.Cat;
import pe.edu.cibertec.T1LandaP1.client.CatApiClient;
import pe.edu.cibertec.T1LandaP1.client.Dog;
import pe.edu.cibertec.T1LandaP1.client.DogApiClient;

import java.util.List;

@RestController
public class AnimalController {
    @Autowired
    private DogApiClient dogApiClient;

    @Autowired
    private CatApiClient catApiClient;

    @GetMapping("/dogs")
    public List<Dog> getAllDogs() {
        return dogApiClient.getAllBreeds();
    }

    @GetMapping("/cats")
    public List<Cat> getAllCats() {
        return catApiClient.getAllBreeds();
    }
}
