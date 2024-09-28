package pe.edu.cibertec.T1LandaP1.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@FeignClient(name = "dog-api", url = "https://api.thedogapi.com/v1")
public interface DogApiClient {
    @GetMapping("/breeds")
    List<Dog> getAllBreeds();
}

