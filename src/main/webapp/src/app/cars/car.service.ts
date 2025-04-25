import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { EventEmitter } from '@angular/core';
import { Car } from './car';

const restUrl = '/api/cars';

@Injectable({
  providedIn: 'root'
})
export class CarService {

  constructor(private http: HttpClient) { }

  onCarAdded = new EventEmitter<Car>();

  getAllCars(): Observable<Car[]> {
    return this.http.get<Car[]>(restUrl);
  }
  getCarById(id: number): Observable<Car> {
    return this.http.get<Car>(`${restUrl}/${id}`);
  }

  createCar(car: Car): Observable<Car> {
    return this.http.post<Car>(restUrl, car);
  }
  deleteCar(car: Car): Observable<Car> {
    return this.http.delete<Car>(`${restUrl}/${car.id}`);
  }
  
}

