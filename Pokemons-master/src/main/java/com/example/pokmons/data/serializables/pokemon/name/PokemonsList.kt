package com.example.pokmons.data.serializables.pokemon.name

import kotlinx.serialization.Serializable

@Serializable
data class PokemonsList(
    val results: List<Results>
)