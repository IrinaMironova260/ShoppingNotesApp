package com.example.shoppingnotes.presentation.domain

class AddShopItemUseCase (private val shopListRepositopy: ShopListRepositopy) {

    fun addShopItem(shopItem: ShopItem){
        shopListRepositopy.addShopItem(shopItem)
    }
}