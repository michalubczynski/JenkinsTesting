package com.example.autentykacja;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CytatyApi {
    private List<Cytat> cytaty;


    public CytatyApi() {
    this.cytaty = new ArrayList<Cytat>();
    this.cytaty.add(new Cytat("Ja","Pierwszy cytat"));
    this.cytaty.add(new Cytat("Ty","Drugi cytat"));
    this.cytaty.add(new Cytat("My","Trzeci cytat"));
    }
    @GetMapping("/api")
    public List<Cytat> getCytaty(){
        return cytaty;
    }
    @PostMapping("/api")
    public boolean addCytat(@RequestBody Cytat cytat){
        return cytaty.add(cytat);
    }
    @DeleteMapping("/api")
    public void deleteCytat(@RequestBody int index){
        cytaty.remove(index);
    }
}
