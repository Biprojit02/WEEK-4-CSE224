package com.littlelemon.menu

class SortHelper {

    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()
            SortType.PriceAsc -> productsList.priceAsc()
            SortType.PriceDesc -> productsList.priceDesc()
        }
    }

    private fun List<ProductItem>.sortAlphabetically(): List<ProductItem> {
        return sortedBy { it.title }
    }

    private fun List<ProductItem>.priceAsc():List<ProductItem>{
        return sortedBy { it.price }
    }

    private fun List<ProductItem>.priceDesc():List<ProductItem>{
        return sortedByDescending { it.price }
    }

}