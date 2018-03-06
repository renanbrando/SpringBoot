package br.com.renanbrando.pets.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Pet( @Id val id: String,
                var name: String,
                var urlImage: String,
                var age: Integer)