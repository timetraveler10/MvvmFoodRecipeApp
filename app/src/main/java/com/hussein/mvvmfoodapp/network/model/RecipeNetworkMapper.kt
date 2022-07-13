package com.hussein.food2fork.network.model

import com.hussein.food2fork.domain.model.Recipe
import com.hussein.food2fork.domain.model.util.EntityMapper

class RecipeNetworkMapper : EntityMapper<RecipeNetworkEntity, Recipe> {
    override fun mapFromEntity(entity: RecipeNetworkEntity): Recipe {
        return Recipe(
            id = entity.pk,
            dateAdded = entity.longDateAdded,
            dateUpdated = entity.longDateUpdated,
            featuredImage = entity.featuredImage,
            ingredients = entity.ingredients,
            publisher = entity.publisher,
            rating = entity.rating,
            sourceUrl = entity.sourceUrl,
            title = entity.title
        )
    }

    override fun mapToEntity(domainModel: Recipe): RecipeNetworkEntity {
        return RecipeNetworkEntity(
            pk = domainModel.id,
            longDateAdded = domainModel.dateAdded,
            longDateUpdated = domainModel.dateUpdated,
            featuredImage = domainModel.featuredImage,
            ingredients = domainModel.ingredients,
            publisher = domainModel.publisher,
            rating = domainModel.rating,
            sourceUrl = domainModel.sourceUrl,
            title = domainModel.title
        )

    }


    fun fromEntityList(initial: List<RecipeNetworkEntity>): List<Recipe> {
        return initial.map {
            mapFromEntity(it)
        }
    }

    fun toEntityRecipe(initial: List<Recipe>): List<RecipeNetworkEntity> {
        return initial.map {
            mapToEntity(it)
        }
    }
}