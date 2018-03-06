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
    fun save(@RequestBody pet: Pet){
        petService.savePet(pet)
    }

    @GetMapping(value = "/name/{name}")
    fun searchBy(@PathVariable(value = "name") name: String) : List<Pet>{
        return petService.findBy(name = name)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable("id") id: String){

    }
}