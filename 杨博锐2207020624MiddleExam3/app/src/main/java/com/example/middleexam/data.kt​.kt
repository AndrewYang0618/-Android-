package com.example.middleexam
data class Commodity(
    val id: Int,
    val name: String,
    val price: Double,
    val description: String,
    val category: String
)

data class Equipment(
    val id: Int,
    val type: String,
    val model: String,
    val manufacturer: String,
    val cost: Double
)
val commodities = listOf(
    Commodity(1, "Apple", 1.5, "Fresh Apple", "Fruit"),
    Commodity(2, "Basketball", 25.0, "Standard size", "Sport"),
    Commodity(3, "Notebook", 2.0, "200 pages notebook", "Stationery")
)

val equipments = listOf(
    Equipment(1, "Printer", "LaserJet 1000", "HP", 150.0),
    Equipment(2, "Scanner", "ScanJet 200", "HP", 120.0),
    Equipment(3, "Monitor", "Monitor 24 inches", "Dell", 180.0)
)
git remote add origin https://github.com/AndrewYang0618/-Android-.git
git branch -M main
git push -u origin main