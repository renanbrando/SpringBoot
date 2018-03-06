package service

import br.com.renanbrando.pets.model.Pet
import br.com.renanbrando.pets.repository.PetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PetService {

    @Autowired
    lateinit var petRepository: PetRepository

    fun findAll(): List<Pet> {
        return petRepository.findAll()
    }

    fun savePet(pet: Pet){
        petRepository.save(pet)
    }
}