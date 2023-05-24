package com.example.shoppingnotes.presentation.domain

import androidx.lifecycle.LiveData

class GetShopListUseCase (private val shopListRepositopy: ShopListRepositopy)  {

    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepositopy.getShopList()
    }
}