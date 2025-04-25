import { Component } from '@angular/core';
import { CarAddComponent } from './car-add/car-add.component';
import { CarListComponent } from './car-list/car-list.component';
import { RouterOutlet, RouterLink } from '@angular/router';

@Component({
  selector: 'app-cars',
  imports: [CarAddComponent, CarListComponent, RouterOutlet, RouterLink],
  templateUrl: './cars.component.html',
  styleUrl: './cars.component.css'
})
export class CarsComponent {

}
