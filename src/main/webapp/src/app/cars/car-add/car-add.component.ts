import { Component } from '@angular/core';
import { Car } from '../car';
import { CarService } from '../car.service';
import { FormsModule } from '@angular/forms';
import { Dealership } from '../../dealerships/dealership';
import { DealershipService } from '../../dealerships/dealership.service';

@Component({
  selector: 'app-car-add',
  imports: [FormsModule],
  templateUrl: './car-add.component.html',
  styleUrl: './car-add.component.css'
})
export class CarAddComponent {
  car: Car = { id: 0, name: '', price: 0, quantity: 0, dealershipName: '' };

  dealerships: Dealership[] = [];
  

  constructor(private carService: CarService, private dealershipService: DealershipService) { }

  ngOnInit(): void {
    this.dealershipService.getAllDealerships().subscribe(
      (data: Dealership[]) => {
        this.dealerships = data;

      }
    );
  }

  saveCar(): void {
    const data = {
      name: this.car.name,
      price: this.car.price,
      quantity: this.car.quantity,
      dealershipName: this.car.dealershipName
    };
    this.carService.createCar(data).subscribe(
      (data: Car) => {
        this.carService.onCarAdded.emit(data);
        this.car.name = '';
        this.car.price = 0;
        this.car.quantity = 0;
        this.car.dealershipName = '';
      }
    );
  }

}


