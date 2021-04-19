import {Component, OnInit} from '@angular/core';
import { ChartOptions, ChartType} from 'chart.js';
import {MultiDataSet, Label, Color} from 'ng2-charts';

/**
 * legge til verdi fra db der det nå er strenger
 */
const NavnParti1 = 'Frp';
const NavnParti2 = 'Venstre';
const NavnParti3 = 'Høyre';
const NavnParti4 = 'SV';
const NavnParti5 = 'MDG';
const NavnParti6 = 'RV';
const NavnParti7 = 'SP';
const NavnParti8 = 'AP';
const NavnParti9 = 'parti 9';
const NavnParti10 = 'parti 10';
/**
 * parti poeng kobles kobles til data fra Database.
 */
const PoengParti1 = 90;
const PoengParti2 = 50;
const PoengParti3 = 60;
const PoengParti4 = 70;
const PoengParti5 = 80;
const PoengParti6 = 40;
const PoengParti7 = 5;
const PoengParti8 = 30;
const PoengParti9 = 10;
const PoengParti10 = 100;
/**
 * Farge på stolpene
 */
const colorParti1 = 'red';
const colorParti2 = 'green';
const colorParti3 = 'blue';
const colorParti4 = 'green';
const colorParti5 = 'green';
const colorParti6 = 'red';
const colorParti7 = 'green';
const colorParti8 = 'red';
const colorParti9 = 'blue';
const colorParti10 = 'blue';

@Component({
  selector: 'app-bar',
  templateUrl: './bar.component.html',
  styleUrls: ['./bar.component.css']
})

export class BarComponent implements OnInit {
      barChartType: ChartType = 'bar';
      barChartPlugins = [];
      barChartOptions: ChartOptions = {
      responsive: true,
      };
      barChartLabels: Label[] = [
        'parti poeng',
        NavnParti1,
        NavnParti2,
        NavnParti3,
        NavnParti4,
        NavnParti5,
        NavnParti6,
        NavnParti7,
        NavnParti8,
        NavnParti9,
        NavnParti10
      ];
      barChartData: MultiDataSet = [
      [0,
        PoengParti1,
        PoengParti2,
        PoengParti3,
        PoengParti4,
        PoengParti5,
        PoengParti6,
        PoengParti7,
        PoengParti8,
        PoengParti9,
        PoengParti10,
      ],
      ];
  barChartColors: Color[] = [
    { backgroundColor:
        ['black',
          colorParti1,
          colorParti2,
          colorParti3,
          colorParti4,
          colorParti5,
          colorParti6,
          colorParti7,
          colorParti8,
          colorParti9,
          colorParti10,
        ]
    },
  ];

  constructor() {}
  ngOnInit() {}

}


