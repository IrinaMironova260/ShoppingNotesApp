package com.example.shoppingnotes.presentation.domain

class EditShopItemUseCase (private val shopListRepositopy: ShopListRepositopy)  {

    fun editShopItem(shopItem: ShopItem){
        shopListRepositopy.editShopItem(shopItem)

    }
}