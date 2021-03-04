package com.papsign.ktor.openapigen

data class SerializationSettings(
    val skipEmptyMap: Boolean = false,
    val skipEmptyList: Boolean = false,
    val skipEmptyValue: Boolean = false
)
