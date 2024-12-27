package com.j2htmx.inline;

import com.j2htmx.inline.nodes.canvas.Webpage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.UUID;

@RestController
public class WebpageController {

    Webpage webpage = new Webpage();

    @GetMapping("/home")
    public Flux<String> home() {
        return webpage.createHome(UUID.randomUUID().toString());
    }

    @GetMapping("/dairy")
    public Flux<String> dairy() {
        return webpage.createDairy();
    }

    @GetMapping("/vegetable")
    public Flux<String> vegetable() {
        return webpage.createVegetable();
    }

    @GetMapping("/snack")
    public Flux<String> snack() {
        return webpage.createSnacks();
    }

}
