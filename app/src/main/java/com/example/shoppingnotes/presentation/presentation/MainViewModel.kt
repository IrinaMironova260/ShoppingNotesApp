package com.example.shoppingnotes.presentation.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppingnotes.presentation.data.ShopListRepositoryIMPL
import com.example.shoppingnotes.presentation.domain.DeleteShopItemUseCase
import com.example.shoppingnotes.presentation.domain.EditShopItemUseCase
import com.example.shoppingnotes.presentation.domain.GetShopListUseCase
import com.example.shoppingnotes.presentation.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repositopy = ShopListRepositoryIMPL

    private val getShopListUseCase = GetShopListUseCase(repositopy)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repositopy)
    private val editShopItemUseCase = EditShopItemUseCase(repositopy)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }
    fun changeEnableState(shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }


}