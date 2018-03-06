package br.com.renanbrando.pets.controller

import br.com.renanbrando.pets.model.Pet
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import br.com.renanbrando.pets.service.PetService

@RestController
@CrossOrigin
@RequestMapping(value = "/pet")
class PetController{

    @Autowired
    lateinit var petService : PetService

    @GetMapping
    fun findAll(): List<Pet>
    {
        return petService.findAll()
    }

    @PostMapping
    fun save(pet: Pet){
        petService.savePet(pet)
    }
}