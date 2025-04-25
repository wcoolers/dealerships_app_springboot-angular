import { Component } from '@angular/core';
import { Dealership } from '../dealership';
import { DealershipService } from '../dealership.service';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-dealership-add',
  imports: [FormsModule],
  templateUrl: './dealership-add.component.html',
  styleUrl: './dealership-add.component.css'
})
export class DealershipAddComponent {

  dealership: Dealership = {id: 0, name: ''};


  constructor(private dealershipService: DealershipService) { }

  saveDealership(): void {
    const data = {
      name: this.dealership.name
    };
    this.dealershipService.createDealership(data).subscribe(
      (data: Dealership) => {
        this.dealershipService.onDealershipAdded.emit(data);
        this.dealership.name = '';
      }
    );
  }
}
