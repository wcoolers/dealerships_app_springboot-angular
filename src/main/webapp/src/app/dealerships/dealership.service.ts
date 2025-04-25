import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { EventEmitter } from '@angular/core';
import { Dealership } from './dealership';

const restUrl = '/api/dealerships';

@Injectable({
  providedIn: 'root'
})
export class DealershipService {

  constructor(private http: HttpClient) { }

  onDealershipAdded = new EventEmitter<Dealership>();

  getAllDealerships(): Observable<Dealership[]> {
    return this.http.get<Dealership[]>(restUrl);
  }
  getDealershipById(id: number): Observable<Dealership> {
    return this.http.get<Dealership>(`${restUrl}/${id}`);
  }

  createDealership(dealership: Dealership): Observable<Dealership> {
    return this.http.post<Dealership>(restUrl, dealership);
  }
}
