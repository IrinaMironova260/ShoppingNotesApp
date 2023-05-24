package com.example.shoppingnotes.presentation.domain

import androidx.lifecycle.LiveData

interface ShopListRepositopy {

    fun addShopItem(shopItem: ShopItem) //добавление элемента

    fun getShopItem(shopItem: Int): ShopItem //получение элемента по его id
    fun getShopList(): LiveData<List<ShopItem>> //получение списка элементов

    fun editShopItem(shopItem: ShopItem) //редактирование элемента

    fun deleteShopItem(shopItem: ShopItem) //удаление элемента
}