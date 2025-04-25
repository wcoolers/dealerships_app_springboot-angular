import { Component } from '@angular/core';
import { DealershipAddComponent } from './dealership-add/dealership-add.component';
import { DealershipListComponent } from './dealership-list/dealership-list.component';
import { RouterOutlet, RouterLink } from '@angular/router';

@Component({
  selector: 'app-dealerships',
  imports: [DealershipAddComponent, DealershipListComponent, RouterOutlet, RouterLink],
  templateUrl: './dealerships.component.html',
  styleUrl: './dealerships.component.css'
})
export class DealershipsComponent {

}
