import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import { Chart } from 'chart.js';


@Component({
  selector: 'app-bar',
  templateUrl: './bar.component.html',
  styleUrls: ['./bar.component.css']
})

export class BarComponent implements OnInit {
  @ViewChild('barCanvas') private barCanvas: ElementRef;
  barChart: any;

  constructor() { }

  ngOnInit(): void {
    this.barChartMethod();
  }

  barChartMethod() {
    /**
     * parti navn kan hentes fra db
     */
    const NavnParti1 = 'Parti1';
    const NavnParti2 = 'Pariti2';
    const NavnParti3 = 'Pariti3';
    const NavnParti4 = 'Pariti4';
    const NavnParti5 = 'Pariti5';
    const NavnParti6 = 'Pariti6';
    const NavnParti7 = 'Pariti7';
    const NavnParti8 = 'Pariti8';
    const NavnParti9 = 'Pariti9';
    const NavnParti10 = 'Pariti10';
    /**
     * partiScor kan hentes fra db
     */
    const partiScor1 = 8;
    const partiScor2 = 2;
    const partiScor3 = 3;
    const partiScor4 = 4;
    const partiScor5 = 5;
    const partiScor6 = 6;
    const partiScor7 = 7;
    const partiScor8 = 8;
    const partiScor9 = 9;
    const partiScor10 = 10;
    this.barChart = new Chart(this.barCanvas.nativeElement, {
      type: 'bar',
      data: {
        labels: [NavnParti1, NavnParti2, NavnParti3, NavnParti4, NavnParti5, NavnParti6, NavnParti7, NavnParti8, NavnParti9, NavnParti10],
        datasets: [{
          label: 'Hvilke parti du er mest ening med',
          data: [partiScor1, partiScor2, partiScor3, partiScor4, partiScor5, partiScor6, partiScor7, partiScor8, partiScor9, partiScor10],
          backgroundColor: [
            'rgba(255, 99, 132, 0.2)',
            'rgba(54, 162, 235, 0.2)',
            'rgba(255, 206, 86, 0.2)',
            'rgba(75, 192, 192, 0.2)',
            'rgba(153, 102, 255, 0.2)',
            'rgb(198,255,1)',
            'rgb(0,119,255)',
            'rgba(10,10,10,0.2)',
            'rgba(245,134,0,0.2)',
            'rgba(222,13,13,0.2)'
          ],
          borderColor: [
            'rgba(255, 99, 132, 1)',
            'rgba(54, 162, 235, 1)',
            'rgba(255, 206, 86, 1)',
            'rgba(75, 192, 192, 1)',
            'rgba(153, 102, 255, 1)',
            'rgba(255, 159, 64, 1)',
            'rgba(255, 159, 64, 1)',
            'rgba(255, 159, 64, 1)',
            'rgba(255, 159, 64, 1)',
            'rgba(255, 159, 64, 1)'
          ],
          borderWidth: 4
        }]
      },
      options: {
        scales: {
          y: {
            beginAtZero: true
          }
        }
      }
    });
  }

}


