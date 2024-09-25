package com.example.antoproject.models

class Donation {
    var name:String = ""
    var age:String = ""
    var weight:String = ""
    var date:String = ""
    var phone:String = ""
    var state:String = ""
    var druguse:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, age: String, weight: String, date: String, phone: String, state: String, druguse: String, imageUrl: String, id: String) {
        this.name = name
        this.age = age
        this.weight = weight
        this.date = date
        this.phone = phone
        this.imageUrl = imageUrl
        this.state = state
        this.druguse = druguse
        this.id = id
    }

    constructor()
}