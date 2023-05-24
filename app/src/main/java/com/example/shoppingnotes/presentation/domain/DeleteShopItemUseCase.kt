package com.example.shoppingnotes.presentation.domain

class DeleteShopItemUseCase (private val shopListRepositopy: ShopListRepositopy) {

    fun deleteShopItem(shopItem: ShopItem){
        shopListRepositopy.deleteShopItem(shopItem)
    }
}