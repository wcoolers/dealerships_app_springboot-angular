import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { DealershipsComponent } from './dealerships/dealerships.component';
import { CarsComponent } from './cars/cars.component';
import { HomeComponent } from './home/home.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, HomeComponent, DealershipsComponent, CarsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  
}
