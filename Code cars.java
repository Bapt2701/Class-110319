var car = {
  
  model : "A3",
  brand : "Audi",
  year : 2016,
drive : function()
  { 
  console.log("driving")
}, 
  printModel()  {
    console.log(car.model)
  },
  getMakeYear(){
    return this.yearMake
  }

}



function Car(_model, _brand, _year)
{
  this.model = _model
  this.brand = _brand
  this.year = _year
}


var toyota = new Car("Toyota", "Carina", 1994)
var Volvo = new Car("Volvo", "S60", 2009)


function Mobile(_company, _model, _color, _weight, _price)
{
  this.company = _company
  this.model = _model
  this.color = _color
  this.weight = _weight
  this.price = _price
  this.shutdown = function()
{
    console.log(this.company + " " + this.model + " " + "is shutting down")
  }
}
var apple = new Mobile ("Apple", "8", "Black", "360gr","1299$")
var samsung = new Mobile("Samsung", "S10", "Blue", "390gr","1199$")
