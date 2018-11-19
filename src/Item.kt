package com.gildedrose

data class Item(var name: String, var sellIn: Int, var quality: Int) {
    override fun toString(): String {
        return "$name, $sellIn, $quality"
    }
}