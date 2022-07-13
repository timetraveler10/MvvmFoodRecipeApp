package com.hussein.food2fork.domain.model.util

interface EntityMapper <Entity , DomainModel> {
    fun mapFromEntity(entity:Entity):DomainModel
    fun mapToEntity(domainModel: DomainModel):Entity
}