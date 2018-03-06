package br.com.renanbrando.pets.repository

import br.com.renanbrando.pets.model.Pet
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PetRepository : MongoRepository<Pet, String>