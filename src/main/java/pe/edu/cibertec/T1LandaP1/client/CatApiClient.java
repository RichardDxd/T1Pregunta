package pe.edu.cibertec.T1LandaP1.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@FeignClient(name = "cat-api", url = "https://api.thecatapi.com/v1")
public interface CatApiClient {
    @GetMapping("/breeds")
    List<Cat> getAllBreeds();
}

