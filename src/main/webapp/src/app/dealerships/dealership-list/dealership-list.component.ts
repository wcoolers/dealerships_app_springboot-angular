import { Component } from '@angular/core';
import { Dealership } from '../dealership';
import { DealershipService } from '../dealership.service';
import { RouterOutlet } from '@angular/router';


@Component({
  selector: 'app-dealership-list',
  imports: [RouterOutlet],
  templateUrl: './dealership-list.component.html',
  styleUrl: './dealership-list.component.css'
})
export class DealershipListComponent {
  dealerships: Dealership[] = [];

  constructor(private dealershipService: DealershipService) { }

  getDealerships() : void {
    this.dealershipService.getAllDealerships().subscribe({
      next: (data) => {
        this.dealerships = data;
      }
    });
  }

  ngOnInit() :void {
    this.getDealerships();
    this.dealershipService.onDealershipAdded.subscribe(
      (dealership: Dealership) => {
        this.dealerships.push(dealership);
      }
    );
  }
}