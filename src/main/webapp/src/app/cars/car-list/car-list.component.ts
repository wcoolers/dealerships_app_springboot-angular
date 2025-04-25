import { Component } from '@angular/core';
import { Car } from '../car';
import { CarService } from '../car.service';

@Component({
  selector: 'app-car-list',
  imports: [],
  templateUrl: './car-list.component.html',
  styleUrl: './car-list.component.css'
})
export class CarListComponent {
  cars: Car[] = [];

  constructor(private carService: CarService) { }

  getCars(): void {
    this.carService.getAllCars().subscribe({
      next: (data) => {
        this.cars = data;
      }
    });
  }



  ngOnInit(): void {
    this.getCars();
    this.carService.onCarAdded.subscribe(
      (car: Car) => {
        this.cars.push(car);
      }
    );
  }
  deleteCar(car: Car): void {
    this.carService.deleteCar(car).subscribe(() => {
      this.cars = this.cars.filter(c => c.id !== car.id);
    });
  }
  getCarById(id: number): void {
    this.carService.getCarById(id).subscribe((car: Car) => {
      console.log(car);
    });
  }
}
