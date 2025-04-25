import { Routes } from '@angular/router';
import { DealershipsComponent } from './dealerships/dealerships.component';
import { CarsComponent } from './cars/cars.component';
import { DealershipListComponent } from './dealerships/dealership-list/dealership-list.component';
import { DealershipAddComponent } from './dealerships/dealership-add/dealership-add.component';
import { CarListComponent } from './cars/car-list/car-list.component';
import { CarAddComponent } from './cars/car-add/car-add.component';
import { AppComponent } from './app.component';

export const routes: Routes = [
    
    {'path': 'dealerships', component: DealershipsComponent, children: [
        {'path': 'list', component: DealershipListComponent},
        {'path': 'add', component: DealershipAddComponent},

    ]},
        
    {'path': 'cars', component: CarsComponent, children: [
        {'path': 'list', component: CarListComponent},
        {'path': 'add', component: CarAddComponent},

    ]},
        
];
