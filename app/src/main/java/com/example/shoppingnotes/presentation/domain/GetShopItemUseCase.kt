package com.example.shoppingnotes.presentation.domain

class GetShopItemUseCase (private val shopListRepositopy: ShopListRepositopy) {

    fun getShopItem(shopItem: Int): ShopItem {
      return  shopListRepositopy.getShopItem(shopItem)
    }
}